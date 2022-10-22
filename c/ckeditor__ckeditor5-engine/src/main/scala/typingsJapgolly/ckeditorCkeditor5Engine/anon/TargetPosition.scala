package typingsJapgolly.ckeditorCkeditor5Engine.anon

import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.move
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.reinsert
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.remove
import typingsJapgolly.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetPosition extends StObject {
  
  var howMany: Double
  
  var sourcePosition: ReturnType[js.Function0[Path]]
  
  var targetPosition: ReturnType[js.Function0[Path]]
  
  var `type`: remove | reinsert | move
}
object TargetPosition {
  
  inline def apply(
    howMany: Double,
    sourcePosition: ReturnType[js.Function0[Path]],
    targetPosition: ReturnType[js.Function0[Path]],
    `type`: remove | reinsert | move
  ): TargetPosition = {
    val __obj = js.Dynamic.literal(howMany = howMany.asInstanceOf[js.Any], sourcePosition = sourcePosition.asInstanceOf[js.Any], targetPosition = targetPosition.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetPosition]
  }
  
  extension [Self <: TargetPosition](x: Self) {
    
    inline def setHowMany(value: Double): Self = StObject.set(x, "howMany", value.asInstanceOf[js.Any])
    
    inline def setSourcePosition(value: ReturnType[js.Function0[Path]]): Self = StObject.set(x, "sourcePosition", value.asInstanceOf[js.Any])
    
    inline def setTargetPosition(value: ReturnType[js.Function0[Path]]): Self = StObject.set(x, "targetPosition", value.asInstanceOf[js.Any])
    
    inline def setType(value: remove | reinsert | move): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
