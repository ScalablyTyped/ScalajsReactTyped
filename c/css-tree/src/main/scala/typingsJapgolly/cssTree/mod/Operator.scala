package typingsJapgolly.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Operator
  extends StObject
     with CssNodeCommon
     with CssNode
     with CssNodePlain {
  
  @JSName("type")
  var type_Operator: typingsJapgolly.cssTree.cssTreeStrings.Operator
  
  var value: String
}
object Operator {
  
  inline def apply(value: String): Operator = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Operator")
    __obj.asInstanceOf[Operator]
  }
  
  extension [Self <: Operator](x: Self) {
    
    inline def setType(value: typingsJapgolly.cssTree.cssTreeStrings.Operator): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
