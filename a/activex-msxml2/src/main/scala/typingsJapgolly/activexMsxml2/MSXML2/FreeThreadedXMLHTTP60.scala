package typingsJapgolly.activexMsxml2.MSXML2

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Free Threaded XML HTTP Request class 6.0 */
trait FreeThreadedXMLHTTP60 extends StObject {
  
  def GetCookie(pwszUrl: String, pwszName: String, dwFlags: Double, pcCookies: Double, ppCookies: tagXHRCOOKIE): Unit
  
  /* private */ @JSName("MSXML2.FreeThreadedXMLHTTP60_typekey")
  var MSXML2DotFreeThreadedXMLHTTP60_typekey: FreeThreadedXMLHTTP60
  
  def SetCookie(pCookie: tagXHRCOOKIE, pdwCookieState: Double): Unit
  
  def SetCustomResponseStream(pSequentialStream: ISequentialStream): Unit
  
  def abort(): Unit
  
  def getAllResponseHeaders(ppwszHeaders: String): Unit
  
  def getResponseHeader(pwszHeader: String, ppwszValue: String): Unit
  
  def open(
    pwszMethod: String,
    pwszUrl: String,
    pStatusCallback: IXMLHTTPRequest2Callback,
    pwszUserName: String,
    pwszPassword: String,
    pwszProxyUserName: String,
    pwszProxyPassword: String
  ): Unit
  
  def send(pBody: ISequentialStream, cbBody: Double): Unit
  
  def setProperty(eProperty: XHR_PROPERTY, ullValue: Double): Unit
  
  def setRequestHeader(pwszHeader: String, pwszValue: String): Unit
}
object FreeThreadedXMLHTTP60 {
  
  inline def apply(
    GetCookie: (String, String, Double, Double, tagXHRCOOKIE) => Callback,
    MSXML2DotFreeThreadedXMLHTTP60_typekey: FreeThreadedXMLHTTP60,
    SetCookie: (tagXHRCOOKIE, Double) => Callback,
    SetCustomResponseStream: ISequentialStream => Callback,
    abort: Callback,
    getAllResponseHeaders: String => Callback,
    getResponseHeader: (String, String) => Callback,
    open: (String, String, IXMLHTTPRequest2Callback, String, String, String, String) => Callback,
    send: (ISequentialStream, Double) => Callback,
    setProperty: (XHR_PROPERTY, Double) => Callback,
    setRequestHeader: (String, String) => Callback
  ): FreeThreadedXMLHTTP60 = {
    val __obj = js.Dynamic.literal(GetCookie = js.Any.fromFunction5((t0: String, t1: String, t2: Double, t3: Double, t4: tagXHRCOOKIE) => (GetCookie(t0, t1, t2, t3, t4)).runNow()), SetCookie = js.Any.fromFunction2((t0: tagXHRCOOKIE, t1: Double) => (SetCookie(t0, t1)).runNow()), SetCustomResponseStream = js.Any.fromFunction1((t0: ISequentialStream) => SetCustomResponseStream(t0).runNow()), abort = abort.toJsFn, getAllResponseHeaders = js.Any.fromFunction1((t0: String) => getAllResponseHeaders(t0).runNow()), getResponseHeader = js.Any.fromFunction2((t0: String, t1: String) => (getResponseHeader(t0, t1)).runNow()), open = js.Any.fromFunction7((t0: String, t1: String, t2: IXMLHTTPRequest2Callback, t3: String, t4: String, t5: String, t6: String) => (open(t0, t1, t2, t3, t4, t5, t6)).runNow()), send = js.Any.fromFunction2((t0: ISequentialStream, t1: Double) => (send(t0, t1)).runNow()), setProperty = js.Any.fromFunction2((t0: XHR_PROPERTY, t1: Double) => (setProperty(t0, t1)).runNow()), setRequestHeader = js.Any.fromFunction2((t0: String, t1: String) => (setRequestHeader(t0, t1)).runNow()))
    __obj.updateDynamic("MSXML2.FreeThreadedXMLHTTP60_typekey")(MSXML2DotFreeThreadedXMLHTTP60_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FreeThreadedXMLHTTP60]
  }
  
  extension [Self <: FreeThreadedXMLHTTP60](x: Self) {
    
    inline def setAbort(value: Callback): Self = StObject.set(x, "abort", value.toJsFn)
    
    inline def setGetAllResponseHeaders(value: String => Callback): Self = StObject.set(x, "getAllResponseHeaders", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setGetCookie(value: (String, String, Double, Double, tagXHRCOOKIE) => Callback): Self = StObject.set(x, "GetCookie", js.Any.fromFunction5((t0: String, t1: String, t2: Double, t3: Double, t4: tagXHRCOOKIE) => (value(t0, t1, t2, t3, t4)).runNow()))
    
    inline def setGetResponseHeader(value: (String, String) => Callback): Self = StObject.set(x, "getResponseHeader", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setMSXML2DotFreeThreadedXMLHTTP60_typekey(value: FreeThreadedXMLHTTP60): Self = StObject.set(x, "MSXML2.FreeThreadedXMLHTTP60_typekey", value.asInstanceOf[js.Any])
    
    inline def setOpen(value: (String, String, IXMLHTTPRequest2Callback, String, String, String, String) => Callback): Self = StObject.set(x, "open", js.Any.fromFunction7((t0: String, t1: String, t2: IXMLHTTPRequest2Callback, t3: String, t4: String, t5: String, t6: String) => (value(t0, t1, t2, t3, t4, t5, t6)).runNow()))
    
    inline def setSend(value: (ISequentialStream, Double) => Callback): Self = StObject.set(x, "send", js.Any.fromFunction2((t0: ISequentialStream, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setSetCookie(value: (tagXHRCOOKIE, Double) => Callback): Self = StObject.set(x, "SetCookie", js.Any.fromFunction2((t0: tagXHRCOOKIE, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setSetCustomResponseStream(value: ISequentialStream => Callback): Self = StObject.set(x, "SetCustomResponseStream", js.Any.fromFunction1((t0: ISequentialStream) => value(t0).runNow()))
    
    inline def setSetProperty(value: (XHR_PROPERTY, Double) => Callback): Self = StObject.set(x, "setProperty", js.Any.fromFunction2((t0: XHR_PROPERTY, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setSetRequestHeader(value: (String, String) => Callback): Self = StObject.set(x, "setRequestHeader", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
  }
}
