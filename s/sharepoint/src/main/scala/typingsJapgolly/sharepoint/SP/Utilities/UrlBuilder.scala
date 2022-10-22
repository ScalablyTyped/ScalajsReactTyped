package typingsJapgolly.sharepoint.SP.Utilities

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UrlBuilder extends StObject {
  
  def addKeyValueQueryString(key: String, value: String): Unit
  
  def combinePath(path: String): Unit
  
  /** Returns the resulting url */
  def get_url(): String
}
object UrlBuilder {
  
  inline def apply(
    addKeyValueQueryString: (String, String) => Callback,
    combinePath: String => Callback,
    get_url: CallbackTo[String]
  ): UrlBuilder = {
    val __obj = js.Dynamic.literal(addKeyValueQueryString = js.Any.fromFunction2((t0: String, t1: String) => (addKeyValueQueryString(t0, t1)).runNow()), combinePath = js.Any.fromFunction1((t0: String) => combinePath(t0).runNow()), get_url = get_url.toJsFn)
    __obj.asInstanceOf[UrlBuilder]
  }
  
  extension [Self <: UrlBuilder](x: Self) {
    
    inline def setAddKeyValueQueryString(value: (String, String) => Callback): Self = StObject.set(x, "addKeyValueQueryString", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setCombinePath(value: String => Callback): Self = StObject.set(x, "combinePath", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setGet_url(value: CallbackTo[String]): Self = StObject.set(x, "get_url", value.toJsFn)
  }
}
