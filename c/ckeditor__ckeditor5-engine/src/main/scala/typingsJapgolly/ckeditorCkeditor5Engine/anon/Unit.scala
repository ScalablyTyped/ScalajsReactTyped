package typingsJapgolly.ckeditorCkeditor5Engine.anon

import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.backward
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.character
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.codePoint
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.forward
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.word
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Unit extends StObject {
  
  var direction: js.UndefOr[forward | backward] = js.undefined
  
  var unit: js.UndefOr[character | codePoint | word] = js.undefined
}
object Unit {
  
  inline def apply(): Unit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Unit]
  }
  
  extension [Self <: Unit](x: Self) {
    
    inline def setDirection(value: forward | backward): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setUnit(value: character | codePoint | word): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
  }
}
