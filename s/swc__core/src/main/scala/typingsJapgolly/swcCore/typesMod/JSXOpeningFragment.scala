package typingsJapgolly.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSXOpeningFragment
  extends StObject
     with Node
     with HasSpan {
  
  @JSName("type")
  var type_JSXOpeningFragment: typingsJapgolly.swcCore.swcCoreStrings.JSXOpeningFragment
}
object JSXOpeningFragment {
  
  inline def apply(span: Span): JSXOpeningFragment = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXOpeningFragment")
    __obj.asInstanceOf[JSXOpeningFragment]
  }
  
  extension [Self <: JSXOpeningFragment](x: Self) {
    
    inline def setType(value: typingsJapgolly.swcCore.swcCoreStrings.JSXOpeningFragment): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
