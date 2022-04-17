package com.juniorgonzalez.spring.dao;

import com.juniorgonzalez.spring.model.SocialMedia;
import com.juniorgonzalez.spring.model.TeacherSocialMedia;

import java.util.List;

public class SocialMediaDaoImpl extends AbstractSession implements SocialMediaDao{


    @Override
    public void saveSocialMedia(SocialMedia socialMedia) {

         getSession().persist(socialMedia);
    }

    @Override
    public void deleteSocialMediaById(Long id) {

        SocialMedia socialMedia = findById(id);

        if ( socialMedia != null) {
            getSession().delete(socialMedia);
        }

    }

    @Override
    public void updateSocialMedia(SocialMedia socialMedia) {

        getSession().update(socialMedia);

    }

    @Override
    public List<SocialMedia> findAllSocialMedias() {

        return getSession().createQuery("from SocialMedia ").list();
    }

    @Override
    public SocialMedia findById(Long idSocialMedia) {

        return (SocialMedia) getSession().get(SocialMedia.class, idSocialMedia);
    }

    @Override
    public SocialMedia findByName(String name) {
        return null;
    }

    @Override
    public TeacherSocialMedia findSocialMediaByIdAndName(Long idSocialMedia, String nickname) {
        return null;
    }
}
