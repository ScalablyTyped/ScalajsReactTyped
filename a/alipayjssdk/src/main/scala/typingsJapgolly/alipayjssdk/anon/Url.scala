package typingsJapgolly.alipayjssdk.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.alipayjssdk.AlipayJSSDK.CompleteCallBack
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Url extends StObject {
  
  var complete: js.UndefOr[CompleteCallBack] = js.undefined
  
  /** url的参数，会以 query string 跟在 url 后面。在打开的新页面里可以用 ap.parseQueryString() 来获取 */
  var data: js.UndefOr[Record[String, String]] = js.undefined
  
  /** 要打开的页面url */
  var url: String
}
object Url {
  
  inline def apply(url: String): Url = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Url]
  }
  
  extension [Self <: Url](x: Self) {
    
    inline def setComplete(value: /* obj */ Any => Callback): Self = StObject.set(x, "complete", js.Any.fromFunction1((t0: /* obj */ Any) => value(t0).runNow()))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setData(value: Record[String, String]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
