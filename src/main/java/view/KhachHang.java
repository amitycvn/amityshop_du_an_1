/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import com.alibaba.excel.EasyExcel;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.UUID;
import java.io.FileOutputStream;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import service.KhachHangService;
import service.SAVENHANVIEN;
import util.MsgHelper;

/**
 *
 * @author Asus
 */
public class KhachHang extends javax.swing.JPanel {

    private DefaultTableModel model;
    private model.KhachHang kh;
    private KhachHangService khs = new KhachHangService();
    private int index = 0;
    public boolean check = false;
    public ArrayList<model.KhachHang> lstKH = new ArrayList<>();

    public KhachHang() throws Exception {
        initComponents();
        model = (DefaultTableModel) tblKhachHang.getModel();
        LoadDataToTable();
        String dateString = "Dec 14, 2023, 11:04:43 AM";

        // Định dạng cho chuỗi ngày tháng
        SimpleDateFormat inputFormat = new SimpleDateFormat("MMM dd, yyyy, hh:mm:ss a");

        try {
            // Chuyển đổi chuỗi ngày tháng thành đối tượng Date
            java.util.Date date = inputFormat.parse(dateString);

            // Định dạng cho JDateChooser
            SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd");

            // Tạo JDateChooser và đặt giá trị
            dateNgaytao.setDate(date);
            dateNgaysua.setDate(date);

            // In ra màn hình giá trị của JDateChooser
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKhachHang = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtTenKH = new javax.swing.JTextField();
        txtSoDienThoai = new javax.swing.JTextField();
        txtNguoiTao = new javax.swing.JTextField();
        dateNgaytao = new com.toedter.calendar.JDateChooser();
        dateNgaysua = new com.toedter.calendar.JDateChooser();
        rdoMoi = new javax.swing.JRadioButton();
        rdoCu = new javax.swing.JRadioButton();
        btnSuaThongTin = new javax.swing.JButton();
        btnTimKiem = new javax.swing.JButton();
        txtTimKiem = new javax.swing.JTextField();
        btnXuatDanhSachKhachHang = new javax.swing.JButton();
        cboLocTrangThai = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDiaChi = new javax.swing.JTextArea();

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Số Điện Thoại : ");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DANH SÁCH KHÁCH HÀNG", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        tblKhachHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Họ tên", "SĐT", "Địa chỉ", "Người tạo", "Ngày tạo", "Ngày sửa", "Trạng thái"
            }
        ));
        tblKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKhachHangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblKhachHang);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Tên : ");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Địa Chỉ : ");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Ngày Tạo  : ");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Ngày Sửa : ");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Người Tạo  : ");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Trạng Thái  : ");

        txtTenKH.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtTenKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenKHActionPerformed(evt);
            }
        });

        txtSoDienThoai.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtSoDienThoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSoDienThoaiActionPerformed(evt);
            }
        });

        txtNguoiTao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtNguoiTao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNguoiTaoActionPerformed(evt);
            }
        });

        dateNgaytao.setDateFormatString("yyyy-MM-dd");

        dateNgaysua.setDateFormatString("yyyy-MM-dd");

        buttonGroup1.add(rdoMoi);
        rdoMoi.setText("Khách hàng mới ");

        buttonGroup1.add(rdoCu);
        rdoCu.setText("Khách hàng cũ ");

        btnSuaThongTin.setBackground(new java.awt.Color(51, 0, 51));
        btnSuaThongTin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSuaThongTin.setForeground(new java.awt.Color(255, 255, 255));
        btnSuaThongTin.setText("Sửa thông tin ");
        btnSuaThongTin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaThongTinActionPerformed(evt);
            }
        });

        btnTimKiem.setBackground(new java.awt.Color(51, 0, 51));
        btnTimKiem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTimKiem.setForeground(new java.awt.Color(255, 255, 255));
        btnTimKiem.setText("Tìm kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        txtTimKiem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtTimKiem.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTimKiemFocusLost(evt);
            }
        });
        txtTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimKiemActionPerformed(evt);
            }
        });

        btnXuatDanhSachKhachHang.setBackground(new java.awt.Color(51, 0, 51));
        btnXuatDanhSachKhachHang.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnXuatDanhSachKhachHang.setForeground(new java.awt.Color(255, 255, 255));
        btnXuatDanhSachKhachHang.setText("Xuất file EXCEL");
        btnXuatDanhSachKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuatDanhSachKhachHangActionPerformed(evt);
            }
        });

        cboLocTrangThai.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cboLocTrangThai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả", "Khách hàng mới", "Khách hàng cũ" }));
        cboLocTrangThai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboLocTrangThaiActionPerformed(evt);
            }
        });

        txtDiaChi.setColumns(20);
        txtDiaChi.setRows(5);
        jScrollPane2.setViewportView(txtDiaChi);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cboLocTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 260, Short.MAX_VALUE)
                        .addComponent(btnXuatDanhSachKhachHang))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(61, 61, 61)
                                .addComponent(dateNgaysua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel8))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(rdoMoi)
                                        .addGap(70, 70, 70)
                                        .addComponent(rdoCu))
                                    .addComponent(txtNguoiTao)
                                    .addComponent(txtSoDienThoai)
                                    .addComponent(txtTenKH)
                                    .addComponent(dateNgaytao, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                                    .addComponent(jScrollPane2)))
                            .addComponent(btnSuaThongTin))
                        .addGap(42, 42, 42))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnTimKiem)
                        .addGap(36, 36, 36))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTimKiem))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtSoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(dateNgaytao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(dateNgaysua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtNguoiTao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(rdoMoi)
                            .addComponent(rdoCu))
                        .addGap(19, 19, 19)
                        .addComponent(btnSuaThongTin)
                        .addGap(0, 81, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXuatDanhSachKhachHang)
                    .addComponent(cboLocTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1135, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(9, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 598, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtTenKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenKHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenKHActionPerformed

    private void txtSoDienThoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSoDienThoaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSoDienThoaiActionPerformed

    private void txtNguoiTaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNguoiTaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNguoiTaoActionPerformed

    private void txtTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimKiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimKiemActionPerformed

    private void tblKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKhachHangMouseClicked
        index = tblKhachHang.getSelectedRow();
        if (index == - 1) {
            JOptionPane.showMessageDialog(this, "Chưa có dòng được chọn  !");
            return;
        } else {
            try {
                ShowDetail();
            } catch (ParseException ex) {
//                Logger.getLogger(KhachHang.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_tblKhachHangMouseClicked

    private void btnSuaThongTinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaThongTinActionPerformed
        try {
            index = tblKhachHang.getSelectedRow();
            if (index < 0) {
                JOptionPane.showMessageDialog(this, "Vui lòng chọn một khách hàng để update !", "Thông báo", JOptionPane.ERROR_MESSAGE);
            } else {
                if (checkEmpty()) {
                    return;
                } else {
                    int chon = JOptionPane.showConfirmDialog(this, "Bạn có muốn update không ? ", "Thông báo ", JOptionPane.YES_NO_OPTION);
                    if (chon != JOptionPane.YES_OPTION) {
                        JOptionPane.showMessageDialog(this, "Hủy cập nhật");
                    } else {
                        CreateKhachHang();
                        if (khs.updateKhachHang(kh)) {
                            JOptionPane.showMessageDialog(this, "Đã cập nhật thông tin khách hàng !");
                        } else {
                            JOptionPane.showMessageDialog(this, "Thông tin chưa được cập nhật ");
                        }
                    }
                }
            }
            LoadDataToTable();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSuaThongTinActionPerformed

    private void txtTimKiemFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTimKiemFocusLost


    }//GEN-LAST:event_txtTimKiemFocusLost

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        try {
            kh = new model.KhachHang();
            kh = khs.timKhachHang(txtTimKiem.getText().trim());
            if (kh != null) {
                int viTri=0;
                for (model.KhachHang khachHang : lstKH) {
//                    System.out.println(kh.getSoDienthoai());
                    if (!kh.getSoDienthoai().equals(khachHang.getSoDienthoai())) {
                        System.out.println(khachHang.getSoDienthoai());
                        viTri++;
                    }else{
                        System.out.println(viTri);
                tblKhachHang.setRowSelectionInterval(viTri, viTri);
                    }
                }
                
                
                txtTenKH.setText(kh.getTenKhachHang());
                txtDiaChi.setText(kh.getDiaChi());
                txtSoDienThoai.setText(kh.getSoDienthoai());
                txtNguoiTao.setText(kh.getNguoiTao());
                dateNgaytao.setDate(kh.getNgayTao());
                dateNgaysua.setDate(kh.getNgaySua());
                if (kh.getTrangThai().equals("Khách hàng mới")) {
                    rdoMoi.setSelected(true);
                } else {
                    rdoCu.setSelected(true);
                }

            }else{
                MsgHelper.alert(this, "Không tồn tại khách hàng này");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btnXuatDanhSachKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatDanhSachKhachHangActionPerformed
        String filePath = "E:\\AMITYC_SHOPV2 (2) (1)\\DanhSachKhachHang.xlsx";
        if (exportToExcel(tblKhachHang, filePath)) {
            JOptionPane.showMessageDialog(this, "Xuất file thành công !");
        } else {
            JOptionPane.showMessageDialog(this, "Xuất file thất bại !");
        }
    }//GEN-LAST:event_btnXuatDanhSachKhachHangActionPerformed

    private void cboLocTrangThaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboLocTrangThaiActionPerformed
        try {
            int chon = cboLocTrangThai.getSelectedIndex();
            if (chon == 0) {
                LoadDataToTable();
            } else if (chon == 1) {
                KhachHangMoi();
            } else if (chon == 2) {
                KhachHangCu();
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_cboLocTrangThaiActionPerformed

    private void KhachHangMoi() throws Exception {
        model.setRowCount(0);
        lstKH = khs.getAllKhachHang();
        for (model.KhachHang khachHang : lstKH) {
            if (!khachHang.getTrangThai().equals("Khách hàng cũ")) {
                model.addRow(new Object[]{
                    khachHang.getIdKH(),
                    khachHang.getTenKhachHang(),
                    khachHang.getSoDienthoai(),
                    khachHang.getDiaChi(),
                    khachHang.getNguoiTao(),
                    khachHang.getNgayTao(),
                    khachHang.getNgaySua(),
                    khachHang.getTrangThai()
                });
            }
            ShowDetail();

        }
    }

    private void KhachHangCu() throws Exception {
        model.setRowCount(0);
        lstKH = khs.getAllKhachHang();
        for (model.KhachHang khachHang : lstKH) {
            if (!khachHang.getTrangThai().equals("Khách hàng mới")) {
                model.addRow(new Object[]{
                    khachHang.getIdKH(),
                    khachHang.getTenKhachHang(),
                    khachHang.getSoDienthoai(),
                    khachHang.getDiaChi(),
                    khachHang.getNguoiTao(),
                    khachHang.getNgayTao(),
                    khachHang.getNgaySua(),
                    khachHang.getTrangThai()
                });
            }
            ShowDetail();

        }
    }

    private boolean exportToExcel(JTable table, String filePath) {
        try {
            TableModel model = table.getModel();
            List<List<Object>> data = new ArrayList<>();

            for (int row = 0; row < model.getRowCount(); row++) {
                List<Object> rowData = new ArrayList<>();
                for (int col = 0; col < model.getColumnCount(); col++) {
                    Object cellValue = model.getValueAt(row, col);
                    rowData.add(cellValue != null ? cellValue.toString() : null);
                }
                data.add(rowData);
            }

            EasyExcel.write(filePath).sheet("Danh Sách Khách Hàng").doWrite(data);

            System.out.println("Excel file exported successfully!");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;

        }
    }

    private void CreateKhachHang() {
        kh = new model.KhachHang();
        String id = tblKhachHang.getValueAt(index, 0).toString();
        System.out.println("" + id);
        kh.setIdKH(UUID.fromString(id));
        kh.setTenKhachHang(txtTenKH.getText().trim());
        kh.setSoDienthoai(txtSoDienThoai.getText().trim());
        kh.setDiaChi(txtDiaChi.getText().trim());
        kh.setNguoiTao(SAVENHANVIEN.luuNguoiDung.getHoTen());
        if (rdoMoi.isSelected()) {
            kh.setTrangThai("Khách hàng mới");
        } else {
            kh.setTrangThai("Khách hàng cũ");
        }
    }

    private boolean checkEmpty() {
        StringBuilder sb = new StringBuilder();
        if (txtTenKH.getText().equals("")) {
            sb.append("Vui lòng nhập tên !\n");
        }
        if (txtSoDienThoai.getText().equals("")) {
            sb.append("Vui lòng nhập số điện thoại !\n");
        } else {
            // Additional validation if needed
            String phoneNumber = txtSoDienThoai.getText();
            if (!isValidPhoneNumber(phoneNumber)) {
                sb.append("Số điện thoại không hợp lệ!\n");
            }
        }
        if (sb.length() > 0) {
            JOptionPane.showMessageDialog(this, sb.toString(), "Thông báo ", JOptionPane.ERROR_MESSAGE);
            return true;
        }
        return false;
    }

    private boolean isValidPhoneNumber(String phoneNumber) {
        return phoneNumber.matches("\\d{10}"); // Example: Check if the phone number has 10 digits
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSuaThongTin;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXuatDanhSachKhachHang;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cboLocTrangThai;
    private com.toedter.calendar.JDateChooser dateNgaysua;
    private com.toedter.calendar.JDateChooser dateNgaytao;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rdoCu;
    private javax.swing.JRadioButton rdoMoi;
    private javax.swing.JTable tblKhachHang;
    private javax.swing.JTextArea txtDiaChi;
    private javax.swing.JTextField txtNguoiTao;
    private javax.swing.JTextField txtSoDienThoai;
    private javax.swing.JTextField txtTenKH;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables

    private void LoadDataToTable() throws Exception {
        model.setRowCount(0);
        lstKH = khs.getAllKhachHang();
        for (model.KhachHang khachHang : lstKH) {
            model.addRow(new Object[]{
                khachHang.getIdKH(),
                khachHang.getTenKhachHang(),
                khachHang.getSoDienthoai(),
                khachHang.getDiaChi(),
                khachHang.getNguoiTao(),
                khachHang.getNgayTao(),
                khachHang.getNgaySua(),
                khachHang.getTrangThai()
            });
        }
    }

    private void ShowDetail() throws ParseException {
        try {
            kh = lstKH.get(index);
            txtTenKH.setText(kh.getTenKhachHang());
            txtSoDienThoai.setText(kh.getSoDienthoai());
            txtDiaChi.setText(kh.getDiaChi());
            txtTimKiem.setText("");
            Date ngaytao = kh.getNgayTao();
            SimpleDateFormat formatDate1 = new SimpleDateFormat("dd-MM-yyyy");
            String formattedDate = formatDate1.format(ngaytao);
            dateNgaytao.setDate(formatDate1.parse(formattedDate));
            Date ngaysua = kh.getNgaySua();
            SimpleDateFormat formatDate2 = new SimpleDateFormat("dd-MM-yyyy");
            String formattedDate2 = formatDate2.format(ngaysua);
            dateNgaysua.setDate(formatDate2.parse(formattedDate2));

            txtNguoiTao.setText(kh.getNguoiTao());
            String tt = kh.getTrangThai();
            if (tt.equals("Khách hàng mới")) {
                rdoMoi.setSelected(true);
            } else if (!tt.equals("Khách hàng mới")) {
                rdoCu.setSelected(true);
            }

        } catch (Exception e) {
//            e.printStackTrace();
        }

    }
}
