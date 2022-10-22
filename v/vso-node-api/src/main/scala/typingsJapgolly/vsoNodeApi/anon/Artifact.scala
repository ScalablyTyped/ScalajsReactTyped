package typingsJapgolly.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Artifact extends StObject {
  
  var artifact: scala.Double
  
  var environmentState: scala.Double
  
  var event: scala.Double
  
  var undefined: scala.Double
}
object Artifact {
  
  inline def apply(
    artifact: scala.Double,
    environmentState: scala.Double,
    event: scala.Double,
    undefined: scala.Double
  ): Artifact = {
    val __obj = js.Dynamic.literal(artifact = artifact.asInstanceOf[js.Any], environmentState = environmentState.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], undefined = undefined.asInstanceOf[js.Any])
    __obj.asInstanceOf[Artifact]
  }
  
  extension [Self <: Artifact](x: Self) {
    
    inline def setArtifact(value: scala.Double): Self = StObject.set(x, "artifact", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentState(value: scala.Double): Self = StObject.set(x, "environmentState", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: scala.Double): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setUndefined(value: scala.Double): Self = StObject.set(x, "undefined", value.asInstanceOf[js.Any])
  }
}
