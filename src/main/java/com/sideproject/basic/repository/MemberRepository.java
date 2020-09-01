package com.sideproject.basic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sideproject.basic.model.MemberModel;


@Repository
public interface MemberRepository extends JpaRepository<MemberModel,Integer> {

}
