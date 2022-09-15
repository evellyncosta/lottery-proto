// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: game-management-service/game.proto

package com.lottery.stubs.game;

public final class GameOuterClass {
  private GameOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_lottery_stubs_game_GameRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_lottery_stubs_game_GameRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_lottery_stubs_game_GameResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_lottery_stubs_game_GameResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_lottery_stubs_game_Game_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_lottery_stubs_game_Game_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"game-management-service/game.proto\022\026co" +
      "m.lottery.stubs.game\032\037google/protobuf/ti" +
      "mestamp.proto\"\037\n\013GameRequest\022\020\n\010playerId" +
      "\030\001 \001(\t\":\n\014GameResponse\022*\n\004game\030\001 \003(\0132\034.c" +
      "om.lottery.stubs.game.Game\"_\n\004Game\022\n\n\002id" +
      "\030\001 \001(\t\022\020\n\010playerId\030\002 \001(\t\022\017\n\007numbers\030\003 \001(" +
      "\t\022(\n\004data\030\004 \001(\0132\032.google.protobuf.Timest" +
      "amp2l\n\013GameService\022]\n\020getGamesByPlayer\022#" +
      ".com.lottery.stubs.game.GameRequest\032$.co" +
      "m.lottery.stubs.game.GameResponseB\032\n\026com" +
      ".lottery.stubs.gameP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_com_lottery_stubs_game_GameRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_lottery_stubs_game_GameRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_lottery_stubs_game_GameRequest_descriptor,
        new java.lang.String[] { "PlayerId", });
    internal_static_com_lottery_stubs_game_GameResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_lottery_stubs_game_GameResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_lottery_stubs_game_GameResponse_descriptor,
        new java.lang.String[] { "Game", });
    internal_static_com_lottery_stubs_game_Game_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_lottery_stubs_game_Game_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_lottery_stubs_game_Game_descriptor,
        new java.lang.String[] { "Id", "PlayerId", "Numbers", "Data", });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}