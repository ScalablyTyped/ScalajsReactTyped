package typingsJapgolly.ckeditorCkeditor5Engine.anon

import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.text
import typingsJapgolly.ckeditorCkeditor5Engine.srcViewTextproxyMod.default
import typingsJapgolly.ckeditorCkeditor5Engine.srcViewTreewalkerMod.TreeWalkerValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemLength
  extends StObject
     with TreeWalkerValue {
  
  var item: default
  
  var length: Double
  
  var nextPosition: typingsJapgolly.ckeditorCkeditor5Engine.srcViewPositionMod.default
  
  var previousPosition: typingsJapgolly.ckeditorCkeditor5Engine.srcViewPositionMod.default
  
  var `type`: text
}
object ItemLength {
  
  inline def apply(
    item: default,
    length: Double,
    nextPosition: typingsJapgolly.ckeditorCkeditor5Engine.srcViewPositionMod.default,
    previousPosition: typingsJapgolly.ckeditorCkeditor5Engine.srcViewPositionMod.default
  ): ItemLength = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], nextPosition = nextPosition.asInstanceOf[js.Any], previousPosition = previousPosition.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("text")
    __obj.asInstanceOf[ItemLength]
  }
  
  extension [Self <: ItemLength](x: Self) {
    
    inline def setItem(value: default): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setNextPosition(value: typingsJapgolly.ckeditorCkeditor5Engine.srcViewPositionMod.default): Self = StObject.set(x, "nextPosition", value.asInstanceOf[js.Any])
    
    inline def setPreviousPosition(value: typingsJapgolly.ckeditorCkeditor5Engine.srcViewPositionMod.default): Self = StObject.set(x, "previousPosition", value.asInstanceOf[js.Any])
    
    inline def setType(value: text): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
