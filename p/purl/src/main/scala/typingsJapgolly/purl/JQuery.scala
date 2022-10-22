package typingsJapgolly.purl

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.purl.mod.Url
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQuery extends StObject {
  
  /** 
    * extract the URL from the selected element and parse that - will work on any element with a `src`, `href` or `action` attribute.
    */
  def url(): Url
}
object JQuery {
  
  inline def apply(url: CallbackTo[Url]): JQuery = {
    val __obj = js.Dynamic.literal(url = url.toJsFn)
    __obj.asInstanceOf[JQuery]
  }
  
  extension [Self <: JQuery](x: Self) {
    
    inline def setUrl(value: CallbackTo[Url]): Self = StObject.set(x, "url", value.toJsFn)
  }
}
