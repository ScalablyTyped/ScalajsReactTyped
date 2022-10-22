package typingsJapgolly.ckeditorCkeditor5Engine.anon

import typingsJapgolly.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourcePosition extends StObject {
  
  var baseVersion: Double | Null
  
  var howMany: Double
  
  var sourcePosition: ReturnType[js.Function0[Path]]
  
  var targetPosition: ReturnType[js.Function0[Path]]
}
object SourcePosition {
  
  inline def apply(
    howMany: Double,
    sourcePosition: ReturnType[js.Function0[Path]],
    targetPosition: ReturnType[js.Function0[Path]]
  ): SourcePosition = {
    val __obj = js.Dynamic.literal(howMany = howMany.asInstanceOf[js.Any], sourcePosition = sourcePosition.asInstanceOf[js.Any], targetPosition = targetPosition.asInstanceOf[js.Any], baseVersion = null)
    __obj.asInstanceOf[SourcePosition]
  }
  
  extension [Self <: SourcePosition](x: Self) {
    
    inline def setBaseVersion(value: Double): Self = StObject.set(x, "baseVersion", value.asInstanceOf[js.Any])
    
    inline def setBaseVersionNull: Self = StObject.set(x, "baseVersion", null)
    
    inline def setHowMany(value: Double): Self = StObject.set(x, "howMany", value.asInstanceOf[js.Any])
    
    inline def setSourcePosition(value: ReturnType[js.Function0[Path]]): Self = StObject.set(x, "sourcePosition", value.asInstanceOf[js.Any])
    
    inline def setTargetPosition(value: ReturnType[js.Function0[Path]]): Self = StObject.set(x, "targetPosition", value.asInstanceOf[js.Any])
  }
}
