package typingsJapgolly.parcelTypes.mod

import typingsJapgolly.parcelTypes.parcelTypesStrings.buildProgress
import typingsJapgolly.parcelTypes.parcelTypesStrings.transforming
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformingProgressEvent
  extends StObject
     with BuildProgressEvent {
  
  val filePath: FilePath
  
  val phase: transforming
  
  val `type`: buildProgress
}
object TransformingProgressEvent {
  
  inline def apply(filePath: FilePath): TransformingProgressEvent = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], phase = "transforming")
    __obj.updateDynamic("type")("buildProgress")
    __obj.asInstanceOf[TransformingProgressEvent]
  }
  
  extension [Self <: TransformingProgressEvent](x: Self) {
    
    inline def setFilePath(value: FilePath): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setPhase(value: transforming): Self = StObject.set(x, "phase", value.asInstanceOf[js.Any])
    
    inline def setType(value: buildProgress): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
