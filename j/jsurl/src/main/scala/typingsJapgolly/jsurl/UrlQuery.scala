package typingsJapgolly.jsurl

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UrlQuery extends StObject {
  
  def clear(): Unit
}
object UrlQuery {
  
  inline def apply(clear: Callback): UrlQuery = {
    val __obj = js.Dynamic.literal(clear = clear.toJsFn)
    __obj.asInstanceOf[UrlQuery]
  }
  
  extension [Self <: UrlQuery](x: Self) {
    
    inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
  }
}
