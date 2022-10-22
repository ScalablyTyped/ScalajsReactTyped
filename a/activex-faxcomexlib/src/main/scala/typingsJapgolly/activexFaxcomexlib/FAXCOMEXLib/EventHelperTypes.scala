package typingsJapgolly.activexFaxcomexlib.FAXCOMEXLib

import typingsJapgolly.activexFaxcomexlib.activexFaxcomexlibStrings.bPoweredOff
import typingsJapgolly.activexFaxcomexlib.activexFaxcomexlibStrings.bReceiving
import typingsJapgolly.activexFaxcomexlib.activexFaxcomexlibStrings.bRinging
import typingsJapgolly.activexFaxcomexlib.activexFaxcomexlibStrings.bSending
import typingsJapgolly.activexFaxcomexlib.activexFaxcomexlibStrings.dispidMember
import typingsJapgolly.activexFaxcomexlib.activexFaxcomexlibStrings.lDeviceId
import typingsJapgolly.activexFaxcomexlib.activexFaxcomexlibStrings.lcid
import typingsJapgolly.activexFaxcomexlib.activexFaxcomexlibStrings.pFaxServer
import typingsJapgolly.activexFaxcomexlib.activexFaxcomexlibStrings.pdispparams
import typingsJapgolly.activexFaxcomexlib.activexFaxcomexlibStrings.pexcepinfo
import typingsJapgolly.activexFaxcomexlib.activexFaxcomexlibStrings.puArgErr
import typingsJapgolly.activexFaxcomexlib.activexFaxcomexlibStrings.pvarResult
import typingsJapgolly.activexFaxcomexlib.activexFaxcomexlibStrings.riid
import typingsJapgolly.activexFaxcomexlib.activexFaxcomexlibStrings.wFlags
import typingsJapgolly.activexStdole.stdole.DISPPARAMS
import typingsJapgolly.activexStdole.stdole.EXCEPINFO
import typingsJapgolly.activexStdole.stdole.GUID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object EventHelperTypes {
  
  type FaxAccountInvokeArgNames = js.Tuple8[dispidMember, riid, lcid, wFlags, pdispparams, pvarResult, pexcepinfo, puArgErr]
  
  trait FaxAccountInvokeParameter extends StObject {
    
    val dispidMember: Double
    
    val lcid: Double
    
    val pdispparams: DISPPARAMS
    
    var pexcepinfo: EXCEPINFO
    
    var puArgErr: Double
    
    var pvarResult: Any
    
    val riid: GUID
    
    val wFlags: Double
  }
  object FaxAccountInvokeParameter {
    
    inline def apply(
      dispidMember: Double,
      lcid: Double,
      pdispparams: DISPPARAMS,
      pexcepinfo: EXCEPINFO,
      puArgErr: Double,
      pvarResult: Any,
      riid: GUID,
      wFlags: Double
    ): FaxAccountInvokeParameter = {
      val __obj = js.Dynamic.literal(dispidMember = dispidMember.asInstanceOf[js.Any], lcid = lcid.asInstanceOf[js.Any], pdispparams = pdispparams.asInstanceOf[js.Any], pexcepinfo = pexcepinfo.asInstanceOf[js.Any], puArgErr = puArgErr.asInstanceOf[js.Any], pvarResult = pvarResult.asInstanceOf[js.Any], riid = riid.asInstanceOf[js.Any], wFlags = wFlags.asInstanceOf[js.Any])
      __obj.asInstanceOf[FaxAccountInvokeParameter]
    }
    
    extension [Self <: FaxAccountInvokeParameter](x: Self) {
      
      inline def setDispidMember(value: Double): Self = StObject.set(x, "dispidMember", value.asInstanceOf[js.Any])
      
      inline def setLcid(value: Double): Self = StObject.set(x, "lcid", value.asInstanceOf[js.Any])
      
      inline def setPdispparams(value: DISPPARAMS): Self = StObject.set(x, "pdispparams", value.asInstanceOf[js.Any])
      
      inline def setPexcepinfo(value: EXCEPINFO): Self = StObject.set(x, "pexcepinfo", value.asInstanceOf[js.Any])
      
      inline def setPuArgErr(value: Double): Self = StObject.set(x, "puArgErr", value.asInstanceOf[js.Any])
      
      inline def setPvarResult(value: Any): Self = StObject.set(x, "pvarResult", value.asInstanceOf[js.Any])
      
      inline def setRiid(value: GUID): Self = StObject.set(x, "riid", value.asInstanceOf[js.Any])
      
      inline def setWFlags(value: Double): Self = StObject.set(x, "wFlags", value.asInstanceOf[js.Any])
    }
  }
  
  type FaxServerInvokeArgNames = js.Tuple8[dispidMember, riid, lcid, wFlags, pdispparams, pvarResult, pexcepinfo, puArgErr]
  
  trait FaxServerInvokeParameter extends StObject {
    
    val dispidMember: Double
    
    val lcid: Double
    
    val pdispparams: DISPPARAMS
    
    var pexcepinfo: EXCEPINFO
    
    var puArgErr: Double
    
    var pvarResult: Any
    
    val riid: GUID
    
    val wFlags: Double
  }
  object FaxServerInvokeParameter {
    
    inline def apply(
      dispidMember: Double,
      lcid: Double,
      pdispparams: DISPPARAMS,
      pexcepinfo: EXCEPINFO,
      puArgErr: Double,
      pvarResult: Any,
      riid: GUID,
      wFlags: Double
    ): FaxServerInvokeParameter = {
      val __obj = js.Dynamic.literal(dispidMember = dispidMember.asInstanceOf[js.Any], lcid = lcid.asInstanceOf[js.Any], pdispparams = pdispparams.asInstanceOf[js.Any], pexcepinfo = pexcepinfo.asInstanceOf[js.Any], puArgErr = puArgErr.asInstanceOf[js.Any], pvarResult = pvarResult.asInstanceOf[js.Any], riid = riid.asInstanceOf[js.Any], wFlags = wFlags.asInstanceOf[js.Any])
      __obj.asInstanceOf[FaxServerInvokeParameter]
    }
    
    extension [Self <: FaxServerInvokeParameter](x: Self) {
      
      inline def setDispidMember(value: Double): Self = StObject.set(x, "dispidMember", value.asInstanceOf[js.Any])
      
      inline def setLcid(value: Double): Self = StObject.set(x, "lcid", value.asInstanceOf[js.Any])
      
      inline def setPdispparams(value: DISPPARAMS): Self = StObject.set(x, "pdispparams", value.asInstanceOf[js.Any])
      
      inline def setPexcepinfo(value: EXCEPINFO): Self = StObject.set(x, "pexcepinfo", value.asInstanceOf[js.Any])
      
      inline def setPuArgErr(value: Double): Self = StObject.set(x, "puArgErr", value.asInstanceOf[js.Any])
      
      inline def setPvarResult(value: Any): Self = StObject.set(x, "pvarResult", value.asInstanceOf[js.Any])
      
      inline def setRiid(value: GUID): Self = StObject.set(x, "riid", value.asInstanceOf[js.Any])
      
      inline def setWFlags(value: Double): Self = StObject.set(x, "wFlags", value.asInstanceOf[js.Any])
    }
  }
  
  type FaxServerOnDeviceStatusChangeArgNames = js.Tuple6[pFaxServer, lDeviceId, bPoweredOff, bSending, bReceiving, bRinging]
  
  trait FaxServerOnDeviceStatusChangeParameter extends StObject {
    
    val bPoweredOff: Boolean
    
    val bReceiving: Boolean
    
    val bRinging: Boolean
    
    val bSending: Boolean
    
    val lDeviceId: Double
    
    val pFaxServer: FaxServer
  }
  object FaxServerOnDeviceStatusChangeParameter {
    
    inline def apply(
      bPoweredOff: Boolean,
      bReceiving: Boolean,
      bRinging: Boolean,
      bSending: Boolean,
      lDeviceId: Double,
      pFaxServer: FaxServer
    ): FaxServerOnDeviceStatusChangeParameter = {
      val __obj = js.Dynamic.literal(bPoweredOff = bPoweredOff.asInstanceOf[js.Any], bReceiving = bReceiving.asInstanceOf[js.Any], bRinging = bRinging.asInstanceOf[js.Any], bSending = bSending.asInstanceOf[js.Any], lDeviceId = lDeviceId.asInstanceOf[js.Any], pFaxServer = pFaxServer.asInstanceOf[js.Any])
      __obj.asInstanceOf[FaxServerOnDeviceStatusChangeParameter]
    }
    
    extension [Self <: FaxServerOnDeviceStatusChangeParameter](x: Self) {
      
      inline def setBPoweredOff(value: Boolean): Self = StObject.set(x, "bPoweredOff", value.asInstanceOf[js.Any])
      
      inline def setBReceiving(value: Boolean): Self = StObject.set(x, "bReceiving", value.asInstanceOf[js.Any])
      
      inline def setBRinging(value: Boolean): Self = StObject.set(x, "bRinging", value.asInstanceOf[js.Any])
      
      inline def setBSending(value: Boolean): Self = StObject.set(x, "bSending", value.asInstanceOf[js.Any])
      
      inline def setLDeviceId(value: Double): Self = StObject.set(x, "lDeviceId", value.asInstanceOf[js.Any])
      
      inline def setPFaxServer(value: FaxServer): Self = StObject.set(x, "pFaxServer", value.asInstanceOf[js.Any])
    }
  }
}
