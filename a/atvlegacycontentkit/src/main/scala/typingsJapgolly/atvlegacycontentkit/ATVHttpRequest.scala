package typingsJapgolly.atvlegacycontentkit

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request recieved in onGenerateRequest.
  */
// tslint:disable-next-line:strict-export-declare-modifiers
trait ATVHttpRequest extends StObject {
  
  /**
    * Set a request header.
    * @param key The key of the header to set.
    * @param value The value of the header.
    */
  def setRequestHeader(key: String, value: String): Unit
  
  /**
    * The URL of the request.
    */
  var url: String
}
object ATVHttpRequest {
  
  inline def apply(setRequestHeader: (String, String) => Callback, url: String): ATVHttpRequest = {
    val __obj = js.Dynamic.literal(setRequestHeader = js.Any.fromFunction2((t0: String, t1: String) => (setRequestHeader(t0, t1)).runNow()), url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ATVHttpRequest]
  }
  
  extension [Self <: ATVHttpRequest](x: Self) {
    
    inline def setSetRequestHeader(value: (String, String) => Callback): Self = StObject.set(x, "setRequestHeader", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
