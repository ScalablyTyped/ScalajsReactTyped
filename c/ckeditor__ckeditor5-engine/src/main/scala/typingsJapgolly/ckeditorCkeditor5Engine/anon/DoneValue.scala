package typingsJapgolly.ckeditorCkeditor5Engine.anon

import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DoneValue extends StObject {
  
  var done: `true`
  
  var value: scala.Unit
}
object DoneValue {
  
  inline def apply(value: scala.Unit): DoneValue = {
    val __obj = js.Dynamic.literal(done = true, value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DoneValue]
  }
  
  extension [Self <: DoneValue](x: Self) {
    
    inline def setDone(value: `true`): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
    
    inline def setValue(value: scala.Unit): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
