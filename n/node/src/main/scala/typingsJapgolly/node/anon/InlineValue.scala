package typingsJapgolly.node.anon

import typingsJapgolly.node.nodeStrings.option
import typingsJapgolly.node.utilMod.OptionToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InlineValue
  extends StObject
     with OptionToken {
  
  var index: Double
  
  var inlineValue: Unit
  
  var kind: option
  
  var name: String
  
  var rawName: String
  
  var value: Unit
}
object InlineValue {
  
  inline def apply(index: Double, inlineValue: Unit, name: String, rawName: String, value: Unit): InlineValue = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], inlineValue = inlineValue.asInstanceOf[js.Any], kind = "option", name = name.asInstanceOf[js.Any], rawName = rawName.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineValue]
  }
  
  extension [Self <: InlineValue](x: Self) {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setInlineValue(value: Unit): Self = StObject.set(x, "inlineValue", value.asInstanceOf[js.Any])
    
    inline def setKind(value: option): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRawName(value: String): Self = StObject.set(x, "rawName", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Unit): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
