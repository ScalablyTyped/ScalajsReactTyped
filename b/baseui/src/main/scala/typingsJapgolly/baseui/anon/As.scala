package typingsJapgolly.baseui.anon

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait As[C /* <: ElementType */] extends StObject {
  
  @JSName("$as")
  var $as: js.UndefOr[C] = js.undefined
}
object As {
  
  inline def apply[C /* <: ElementType */](): As[C] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[As[C]]
  }
  
  extension [Self <: As[?], C /* <: ElementType */](x: Self & As[C]) {
    
    inline def set$as(value: C): Self = StObject.set(x, "$as", value.asInstanceOf[js.Any])
    
    inline def set$asUndefined: Self = StObject.set(x, "$as", js.undefined)
  }
}
