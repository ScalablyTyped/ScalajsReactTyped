package typingsJapgolly.activexMsxml2.MSXML2

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** IXMLHTTPRequest2Callback Interface */
trait IXMLHTTPRequest2Callback extends StObject {
  
  /* private */ @JSName("MSXML2.IXMLHTTPRequest2Callback_typekey")
  var MSXML2DotIXMLHTTPRequest2Callback_typekey: IXMLHTTPRequest2Callback
  
  def OnError(pXHR: FreeThreadedXMLHTTP60, hrError: Unit): Unit
  
  def OnHeadersAvailable(pXHR: FreeThreadedXMLHTTP60, dwStatus: Double, pwszStatus: String): Unit
  
  def OnRedirect(pXHR: FreeThreadedXMLHTTP60, pwszRedirectUrl: String): Unit
  
  def OnResponseReceived(pXHR: FreeThreadedXMLHTTP60, pResponseStream: ISequentialStream): Unit
  
  def ondataavailable(pXHR: FreeThreadedXMLHTTP60, pResponseStream: ISequentialStream): Unit
}
object IXMLHTTPRequest2Callback {
  
  inline def apply(
    MSXML2DotIXMLHTTPRequest2Callback_typekey: IXMLHTTPRequest2Callback,
    OnError: (FreeThreadedXMLHTTP60, Unit) => Callback,
    OnHeadersAvailable: (FreeThreadedXMLHTTP60, Double, String) => Callback,
    OnRedirect: (FreeThreadedXMLHTTP60, String) => Callback,
    OnResponseReceived: (FreeThreadedXMLHTTP60, ISequentialStream) => Callback,
    ondataavailable: (FreeThreadedXMLHTTP60, ISequentialStream) => Callback
  ): IXMLHTTPRequest2Callback = {
    val __obj = js.Dynamic.literal(OnError = js.Any.fromFunction2((t0: FreeThreadedXMLHTTP60, t1: Unit) => (OnError(t0, t1)).runNow()), OnHeadersAvailable = js.Any.fromFunction3((t0: FreeThreadedXMLHTTP60, t1: Double, t2: String) => (OnHeadersAvailable(t0, t1, t2)).runNow()), OnRedirect = js.Any.fromFunction2((t0: FreeThreadedXMLHTTP60, t1: String) => (OnRedirect(t0, t1)).runNow()), OnResponseReceived = js.Any.fromFunction2((t0: FreeThreadedXMLHTTP60, t1: ISequentialStream) => (OnResponseReceived(t0, t1)).runNow()), ondataavailable = js.Any.fromFunction2((t0: FreeThreadedXMLHTTP60, t1: ISequentialStream) => (ondataavailable(t0, t1)).runNow()))
    __obj.updateDynamic("MSXML2.IXMLHTTPRequest2Callback_typekey")(MSXML2DotIXMLHTTPRequest2Callback_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IXMLHTTPRequest2Callback]
  }
  
  extension [Self <: IXMLHTTPRequest2Callback](x: Self) {
    
    inline def setMSXML2DotIXMLHTTPRequest2Callback_typekey(value: IXMLHTTPRequest2Callback): Self = StObject.set(x, "MSXML2.IXMLHTTPRequest2Callback_typekey", value.asInstanceOf[js.Any])
    
    inline def setOnError(value: (FreeThreadedXMLHTTP60, Unit) => Callback): Self = StObject.set(x, "OnError", js.Any.fromFunction2((t0: FreeThreadedXMLHTTP60, t1: Unit) => (value(t0, t1)).runNow()))
    
    inline def setOnHeadersAvailable(value: (FreeThreadedXMLHTTP60, Double, String) => Callback): Self = StObject.set(x, "OnHeadersAvailable", js.Any.fromFunction3((t0: FreeThreadedXMLHTTP60, t1: Double, t2: String) => (value(t0, t1, t2)).runNow()))
    
    inline def setOnRedirect(value: (FreeThreadedXMLHTTP60, String) => Callback): Self = StObject.set(x, "OnRedirect", js.Any.fromFunction2((t0: FreeThreadedXMLHTTP60, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setOnResponseReceived(value: (FreeThreadedXMLHTTP60, ISequentialStream) => Callback): Self = StObject.set(x, "OnResponseReceived", js.Any.fromFunction2((t0: FreeThreadedXMLHTTP60, t1: ISequentialStream) => (value(t0, t1)).runNow()))
    
    inline def setOndataavailable(value: (FreeThreadedXMLHTTP60, ISequentialStream) => Callback): Self = StObject.set(x, "ondataavailable", js.Any.fromFunction2((t0: FreeThreadedXMLHTTP60, t1: ISequentialStream) => (value(t0, t1)).runNow()))
  }
}
