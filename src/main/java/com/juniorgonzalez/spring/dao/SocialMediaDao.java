package com.juniorgonzalez.spring.dao;

import com.juniorgonzalez.spring.model.SocialMedia;
import com.juniorgonzalez.spring.model.TeacherSocialMedia;

import java.util.List;

public interface SocialMediaDao {

    void saveSocialMedia(SocialMedia socialMedia);

    void deleteSocialMediaById(Long id);

    void updateSocialMedia(SocialMedia socialMedia);

    List<SocialMedia> findAllSocialMedias();

    SocialMedia findById(Long idSocialMedia);

    SocialMedia findByName(String name);

    TeacherSocialMedia findSocialMediaByIdAndName(Long idSocialMedia, String nickname);
}
