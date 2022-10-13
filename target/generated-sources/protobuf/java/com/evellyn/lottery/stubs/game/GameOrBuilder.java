// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: game-management-service/game.proto

package com.evellyn.lottery.stubs.game;

public interface GameOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.evellyn.lottery.stubs.game.Game)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>string playerId = 2;</code>
   * @return The playerId.
   */
  java.lang.String getPlayerId();
  /**
   * <code>string playerId = 2;</code>
   * @return The bytes for playerId.
   */
  com.google.protobuf.ByteString
      getPlayerIdBytes();

  /**
   * <code>string numbers = 3;</code>
   * @return The numbers.
   */
  java.lang.String getNumbers();
  /**
   * <code>string numbers = 3;</code>
   * @return The bytes for numbers.
   */
  com.google.protobuf.ByteString
      getNumbersBytes();

  /**
   * <code>.google.protobuf.Timestamp data = 4;</code>
   * @return Whether the data field is set.
   */
  boolean hasData();
  /**
   * <code>.google.protobuf.Timestamp data = 4;</code>
   * @return The data.
   */
  com.google.protobuf.Timestamp getData();
  /**
   * <code>.google.protobuf.Timestamp data = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getDataOrBuilder();
}