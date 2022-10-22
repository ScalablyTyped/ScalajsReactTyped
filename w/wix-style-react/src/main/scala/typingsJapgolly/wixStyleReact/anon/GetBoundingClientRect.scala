package typingsJapgolly.wixStyleReact.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBoundingClientRect extends StObject {
  
  def getBoundingClientRect(): js.Object
}
object GetBoundingClientRect {
  
  inline def apply(getBoundingClientRect: CallbackTo[js.Object]): GetBoundingClientRect = {
    val __obj = js.Dynamic.literal(getBoundingClientRect = getBoundingClientRect.toJsFn)
    __obj.asInstanceOf[GetBoundingClientRect]
  }
  
  extension [Self <: GetBoundingClientRect](x: Self) {
    
    inline def setGetBoundingClientRect(value: CallbackTo[js.Object]): Self = StObject.set(x, "getBoundingClientRect", value.toJsFn)
  }
}
