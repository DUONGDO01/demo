package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class TBLKhoa {
    @Id
    @Column(name = "MAKHOA")
    private String MaKhoa;

    @Column(name = "TENKHOA")
    private String Tenkhoa;

    @Column(name = "DIENTHOAI")
    private String Dienthoai;
}
/**
 * mở connect
 * String sql = "select * from TblKhoa";
 * PrepareStatement pre = connection.createPrepareStatement(sql)
 * ResultSet rs = pre.executeQuery();
 * while(rs.next()) {
 * String MaKhoa = rs.getString("MaKhoa");
 * String Tenkhoa = rs.getString("Tenkhoa");
 * String Dienthoai = rs.getString("Dienthoai");
 * TBLKhoa khoa = new TBLKhoa(Makhoa, tenkhoa, dienthoai);
 * list.add(khoa);
 * }
 * return list;
 */