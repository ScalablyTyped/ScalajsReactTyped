package typingsJapgolly.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnicodeRange
  extends StObject
     with CssNodeCommon
     with CssNode
     with CssNodePlain {
  
  @JSName("type")
  var type_UnicodeRange: typingsJapgolly.cssTree.cssTreeStrings.UnicodeRange
  
  var value: String
}
object UnicodeRange {
  
  inline def apply(value: String): UnicodeRange = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("UnicodeRange")
    __obj.asInstanceOf[UnicodeRange]
  }
  
  extension [Self <: UnicodeRange](x: Self) {
    
    inline def setType(value: typingsJapgolly.cssTree.cssTreeStrings.UnicodeRange): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
