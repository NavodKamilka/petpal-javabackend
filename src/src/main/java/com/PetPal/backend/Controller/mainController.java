package com.PetPal.backend.Controller;

import com.PetPal.backend.Entity.*;
import com.PetPal.backend.Service.commonMethodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/petPal")
public class mainController {

    @Autowired
    private commonMethodService commonMethodService;

    @PostMapping("/addPackage")
    private String addPackage(@RequestBody Packages packages){
        return commonMethodService.addPackage(packages);

    }

    @PostMapping("/addDoctor")
    private String addDoctor(@RequestBody doctors doctors){
        return commonMethodService.addDoctor(doctors);

    }

    @PostMapping("/addAppointment")
    private String addAppointment(@RequestBody Appointment appointment){
        return commonMethodService.addAppointment(appointment);

    }

    @PostMapping("/addNotice")
    private String addNotice(@RequestBody notices notice){
        return commonMethodService.addNotice(notice);

    }

    @PostMapping("/addDiscussion")
    private String addDiscussion(@RequestBody discussion discussion){
        return commonMethodService.addDiscussion(discussion);

    }

    @PostMapping("/addReply")
    private String addReply(@RequestBody discussionReply reply){
        return commonMethodService.addReply(reply);

    }
    @GetMapping("/getNotices")
    private List<notices> getNotices(){
        return commonMethodService.getNotices();
    }

    @GetMapping("/getAppointmentsToday")
    private List<Appointment> getAppointment(){
        return commonMethodService.getAppointmentsToday(1L);
    }

    @GetMapping("/getAppointmentsByDoc/{id}")
    private List<Appointment> getAppointmentbyDoc(@PathVariable Long id){
        return commonMethodService.getByDocId(id);
    }

    @GetMapping("/getAppointmentsOwner/{name}")
    private List<Appointment> getAppointments(@PathVariable String name) {
        return commonMethodService.getAppointmentsByOwner(name);
    }

    @GetMapping("/getDiscussions")
    private List<discussionResBody> getDiscussions() {
        return commonMethodService.getAllDiscussions();
    }

    @GetMapping("/getPresent")
    private List<AppointmentDuplicate> getPresent() {
        return commonMethodService.getPresent();
    }

    @GetMapping("/getPast")
    private List<AppointmentDuplicate> getPast() {
        return commonMethodService.getPast();
    }

    @GetMapping("/getFuture")
    private List<AppointmentDuplicate> getFuture() {
        return commonMethodService.getFuture();
    }
}
