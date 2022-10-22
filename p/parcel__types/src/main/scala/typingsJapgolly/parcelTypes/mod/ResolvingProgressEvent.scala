package typingsJapgolly.parcelTypes.mod

import typingsJapgolly.parcelTypes.parcelTypesStrings.buildProgress
import typingsJapgolly.parcelTypes.parcelTypesStrings.resolving
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolvingProgressEvent
  extends StObject
     with BuildProgressEvent {
  
  val dependency: Dependency
  
  val phase: resolving
  
  val `type`: buildProgress
}
object ResolvingProgressEvent {
  
  inline def apply(dependency: Dependency): ResolvingProgressEvent = {
    val __obj = js.Dynamic.literal(dependency = dependency.asInstanceOf[js.Any], phase = "resolving")
    __obj.updateDynamic("type")("buildProgress")
    __obj.asInstanceOf[ResolvingProgressEvent]
  }
  
  extension [Self <: ResolvingProgressEvent](x: Self) {
    
    inline def setDependency(value: Dependency): Self = StObject.set(x, "dependency", value.asInstanceOf[js.Any])
    
    inline def setPhase(value: resolving): Self = StObject.set(x, "phase", value.asInstanceOf[js.Any])
    
    inline def setType(value: buildProgress): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
