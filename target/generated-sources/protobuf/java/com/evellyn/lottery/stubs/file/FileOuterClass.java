// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: file/file.proto

package com.evellyn.lottery.stubs.file;

public final class FileOuterClass {
  private FileOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_evellyn_lottery_stubs_file_MetaData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_evellyn_lottery_stubs_file_MetaData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_evellyn_lottery_stubs_file_File_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_evellyn_lottery_stubs_file_File_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_evellyn_lottery_stubs_file_FileUploadRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_evellyn_lottery_stubs_file_FileUploadRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_evellyn_lottery_stubs_file_FileUploadResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_evellyn_lottery_stubs_file_FileUploadResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017file/file.proto\022\036com.evellyn.lottery.s" +
      "tubs.file\"&\n\010MetaData\022\014\n\004name\030\001 \001(\t\022\014\n\004t" +
      "ype\030\002 \001(\t\"\027\n\004File\022\017\n\007content\030\001 \001(\014\"\222\001\n\021F" +
      "ileUploadRequest\022<\n\010metadata\030\001 \001(\0132(.com" +
      ".evellyn.lottery.stubs.file.MetaDataH\000\0224" +
      "\n\004file\030\002 \001(\0132$.com.evellyn.lottery.stubs" +
      ".file.FileH\000B\t\n\007request\"Z\n\022FileUploadRes" +
      "ponse\022\014\n\004name\030\001 \001(\t\0226\n\006status\030\002 \001(\0162&.co" +
      "m.evellyn.lottery.stubs.file.Status*?\n\006S" +
      "tatus\022\013\n\007PENDING\020\000\022\017\n\013IN_PROGRESS\020\001\022\013\n\007S" +
      "UCCESS\020\002\022\n\n\006FAILED\020\0032\r\n\013FileServiceB\"\n\036c" +
      "om.evellyn.lottery.stubs.fileP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_evellyn_lottery_stubs_file_MetaData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_evellyn_lottery_stubs_file_MetaData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_evellyn_lottery_stubs_file_MetaData_descriptor,
        new java.lang.String[] { "Name", "Type", });
    internal_static_com_evellyn_lottery_stubs_file_File_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_evellyn_lottery_stubs_file_File_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_evellyn_lottery_stubs_file_File_descriptor,
        new java.lang.String[] { "Content", });
    internal_static_com_evellyn_lottery_stubs_file_FileUploadRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_evellyn_lottery_stubs_file_FileUploadRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_evellyn_lottery_stubs_file_FileUploadRequest_descriptor,
        new java.lang.String[] { "Metadata", "File", "Request", });
    internal_static_com_evellyn_lottery_stubs_file_FileUploadResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_evellyn_lottery_stubs_file_FileUploadResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_evellyn_lottery_stubs_file_FileUploadResponse_descriptor,
        new java.lang.String[] { "Name", "Status", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}