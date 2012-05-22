/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.wrapper.core.jni;

public class OTPassword {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public OTPassword(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(OTPassword obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        otapiJNI.delete_OTPassword(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public int getM_theBlockSize() {
    return otapiJNI.OTPassword_m_theBlockSize_get(swigCPtr, this);
  }

  public boolean isPassword() {
    return otapiJNI.OTPassword_isPassword(swigCPtr, this);
  }

  public String getPassword() {
    return otapiJNI.OTPassword_getPassword(swigCPtr, this);
  }

  public int setPassword(String szInput, int nInputSize) {
    return otapiJNI.OTPassword_setPassword(swigCPtr, this, szInput, nInputSize);
  }

  public boolean isMemory() {
    return otapiJNI.OTPassword_isMemory(swigCPtr, this);
  }

  public SWIGTYPE_p_void getMemory() {
    long cPtr = otapiJNI.OTPassword_getMemory(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public SWIGTYPE_p_void getMemoryWritable() {
    long cPtr = otapiJNI.OTPassword_getMemoryWritable(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public int setMemory(SWIGTYPE_p_void vInput, int nInputSize) {
    return otapiJNI.OTPassword_setMemory(swigCPtr, this, SWIGTYPE_p_void.getCPtr(vInput), nInputSize);
  }

  public int addMemory(SWIGTYPE_p_void vAppend, int nAppendSize) {
    return otapiJNI.OTPassword_addMemory(swigCPtr, this, SWIGTYPE_p_void.getCPtr(vAppend), nAppendSize);
  }

  public int randomizeMemory(long nNewSize) {
    return otapiJNI.OTPassword_randomizeMemory__SWIG_0(swigCPtr, this, nNewSize);
  }

  public int randomizeMemory() {
    return otapiJNI.OTPassword_randomizeMemory__SWIG_1(swigCPtr, this);
  }

  public static boolean randomizeMemory(String szDestination, long nNewSize) {
    return otapiJNI.OTPassword_randomizeMemory__SWIG_2(szDestination, nNewSize);
  }

  public int getBlockSize() {
    return otapiJNI.OTPassword_getBlockSize(swigCPtr, this);
  }

  public int getPasswordSize() {
    return otapiJNI.OTPassword_getPasswordSize(swigCPtr, this);
  }

  public int getMemorySize() {
    return otapiJNI.OTPassword_getMemorySize(swigCPtr, this);
  }

  public void zeroMemory() {
    otapiJNI.OTPassword_zeroMemory__SWIG_0(swigCPtr, this);
  }

  public static void zeroMemory(String szMemory, long theSize) {
    otapiJNI.OTPassword_zeroMemory__SWIG_1(szMemory, theSize);
  }

  public static void zeroMemory(SWIGTYPE_p_void vMemory, long theSize) {
    otapiJNI.OTPassword_zeroMemory__SWIG_2(SWIGTYPE_p_void.getCPtr(vMemory), theSize);
  }

  public static SWIGTYPE_p_void safe_memcpy(SWIGTYPE_p_void dest, long dest_size, SWIGTYPE_p_void src, long src_length, boolean bZeroSource) {
    long cPtr = otapiJNI.OTPassword_safe_memcpy__SWIG_0(SWIGTYPE_p_void.getCPtr(dest), dest_size, SWIGTYPE_p_void.getCPtr(src), src_length, bZeroSource);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public static SWIGTYPE_p_void safe_memcpy(SWIGTYPE_p_void dest, long dest_size, SWIGTYPE_p_void src, long src_length) {
    long cPtr = otapiJNI.OTPassword_safe_memcpy__SWIG_1(SWIGTYPE_p_void.getCPtr(dest), dest_size, SWIGTYPE_p_void.getCPtr(src), src_length);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public OTPassword(int theBlockSize) {
    this(otapiJNI.new_OTPassword__SWIG_0(theBlockSize), true);
  }

  public OTPassword() {
    this(otapiJNI.new_OTPassword__SWIG_1(), true);
  }

  public OTPassword(String szInput, int nInputSize, int theBlockSize) {
    this(otapiJNI.new_OTPassword__SWIG_2(szInput, nInputSize, theBlockSize), true);
  }

  public OTPassword(String szInput, int nInputSize) {
    this(otapiJNI.new_OTPassword__SWIG_3(szInput, nInputSize), true);
  }

  public OTPassword(SWIGTYPE_p_void vInput, int nInputSize, int theBlockSize) {
    this(otapiJNI.new_OTPassword__SWIG_4(SWIGTYPE_p_void.getCPtr(vInput), nInputSize, theBlockSize), true);
  }

  public OTPassword(SWIGTYPE_p_void vInput, int nInputSize) {
    this(otapiJNI.new_OTPassword__SWIG_5(SWIGTYPE_p_void.getCPtr(vInput), nInputSize), true);
  }

  public final static class BlockSize {
    public final static int DEFAULT_SIZE = otapiJNI.OTPassword_DEFAULT_SIZE_get();
    public final static int LARGER_SIZE = otapiJNI.OTPassword_LARGER_SIZE_get();
  }

}