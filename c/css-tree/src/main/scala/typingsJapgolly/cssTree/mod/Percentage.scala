package typingsJapgolly.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Percentage
  extends StObject
     with CssNodeCommon
     with CssNode
     with CssNodePlain {
  
  @JSName("type")
  var type_Percentage: typingsJapgolly.cssTree.cssTreeStrings.Percentage
  
  var value: String
}
object Percentage {
  
  inline def apply(value: String): Percentage = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Percentage")
    __obj.asInstanceOf[Percentage]
  }
  
  extension [Self <: Percentage](x: Self) {
    
    inline def setType(value: typingsJapgolly.cssTree.cssTreeStrings.Percentage): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
