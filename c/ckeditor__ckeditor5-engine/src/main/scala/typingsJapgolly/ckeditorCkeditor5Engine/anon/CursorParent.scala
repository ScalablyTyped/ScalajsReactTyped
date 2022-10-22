package typingsJapgolly.ckeditorCkeditor5Engine.anon

import typingsJapgolly.ckeditorCkeditor5Engine.srcModelElementMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CursorParent extends StObject {
  
  var cursorParent: default
  
  var position: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default
}
object CursorParent {
  
  inline def apply(
    cursorParent: default,
    position: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default
  ): CursorParent = {
    val __obj = js.Dynamic.literal(cursorParent = cursorParent.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[CursorParent]
  }
  
  extension [Self <: CursorParent](x: Self) {
    
    inline def setCursorParent(value: default): Self = StObject.set(x, "cursorParent", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
