package typingsJapgolly.ckeditorCkeditor5Engine.anon

import typingsJapgolly.ckeditorCkeditor5Engine.srcModelElementMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Item extends StObject {
  
  var item: default | typingsJapgolly.ckeditorCkeditor5Engine.srcModelTextproxyMod.default
  
  var range: typingsJapgolly.ckeditorCkeditor5Engine.srcModelRangeMod.default
}
object Item {
  
  inline def apply(
    item: default | typingsJapgolly.ckeditorCkeditor5Engine.srcModelTextproxyMod.default,
    range: typingsJapgolly.ckeditorCkeditor5Engine.srcModelRangeMod.default
  ): Item = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Item]
  }
  
  extension [Self <: Item](x: Self) {
    
    inline def setItem(value: default | typingsJapgolly.ckeditorCkeditor5Engine.srcModelTextproxyMod.default): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setRange(value: typingsJapgolly.ckeditorCkeditor5Engine.srcModelRangeMod.default): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
  }
}
