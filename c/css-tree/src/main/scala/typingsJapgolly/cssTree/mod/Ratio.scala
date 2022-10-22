package typingsJapgolly.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ratio
  extends StObject
     with CssNodeCommon
     with CssNode
     with CssNodePlain {
  
  var left: String
  
  var right: String
  
  @JSName("type")
  var type_Ratio: typingsJapgolly.cssTree.cssTreeStrings.Ratio
}
object Ratio {
  
  inline def apply(left: String, right: String): Ratio = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Ratio")
    __obj.asInstanceOf[Ratio]
  }
  
  extension [Self <: Ratio](x: Self) {
    
    inline def setLeft(value: String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setRight(value: String): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setType(value: typingsJapgolly.cssTree.cssTreeStrings.Ratio): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
