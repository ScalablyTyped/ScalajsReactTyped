package typingsJapgolly.ckeditorCkeditor5Engine.anon

import typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelCursor extends StObject {
  
  var modelCursor: default
  
  var modelRange: typingsJapgolly.ckeditorCkeditor5Engine.srcModelRangeMod.default
}
object ModelCursor {
  
  inline def apply(modelCursor: default, modelRange: typingsJapgolly.ckeditorCkeditor5Engine.srcModelRangeMod.default): ModelCursor = {
    val __obj = js.Dynamic.literal(modelCursor = modelCursor.asInstanceOf[js.Any], modelRange = modelRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelCursor]
  }
  
  extension [Self <: ModelCursor](x: Self) {
    
    inline def setModelCursor(value: default): Self = StObject.set(x, "modelCursor", value.asInstanceOf[js.Any])
    
    inline def setModelRange(value: typingsJapgolly.ckeditorCkeditor5Engine.srcModelRangeMod.default): Self = StObject.set(x, "modelRange", value.asInstanceOf[js.Any])
  }
}
