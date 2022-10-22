package typingsJapgolly.ckeditorCkeditor5Engine.anon

import typingsJapgolly.ckeditorCkeditor5Engine.srcModelElementMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributeKey extends StObject {
  
  var attributeKey: String
  
  var attributeNewValue: Any
  
  var attributeOldValue: Any
  
  var item: default
  
  var range: typingsJapgolly.ckeditorCkeditor5Engine.srcModelRangeMod.default
}
object AttributeKey {
  
  inline def apply(
    attributeKey: String,
    attributeNewValue: Any,
    attributeOldValue: Any,
    item: default,
    range: typingsJapgolly.ckeditorCkeditor5Engine.srcModelRangeMod.default
  ): AttributeKey = {
    val __obj = js.Dynamic.literal(attributeKey = attributeKey.asInstanceOf[js.Any], attributeNewValue = attributeNewValue.asInstanceOf[js.Any], attributeOldValue = attributeOldValue.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeKey]
  }
  
  extension [Self <: AttributeKey](x: Self) {
    
    inline def setAttributeKey(value: String): Self = StObject.set(x, "attributeKey", value.asInstanceOf[js.Any])
    
    inline def setAttributeNewValue(value: Any): Self = StObject.set(x, "attributeNewValue", value.asInstanceOf[js.Any])
    
    inline def setAttributeOldValue(value: Any): Self = StObject.set(x, "attributeOldValue", value.asInstanceOf[js.Any])
    
    inline def setItem(value: default): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setRange(value: typingsJapgolly.ckeditorCkeditor5Engine.srcModelRangeMod.default): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
  }
}
