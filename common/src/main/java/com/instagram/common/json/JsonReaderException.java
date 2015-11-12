package com.instagram.common.json;

import com.fasterxml.jackson.core.JsonLocation;

import java.io.IOException;

/**
 * Created by kang on 11/11/15.
 */
public class JsonReaderException extends IOException {

  public JsonReaderException(String msg) {
    super(msg);
  }

  public JsonReaderException(String message, Throwable cause) {
    super(message, cause);
  }
}
