package typingsJapgolly.sphereEngineBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Mixes audio from different sources and allows them all to be controlled as a unit.
  */
trait Mixer extends StObject {
  
  /** The output volume of the mixer. 0.0 is silent, 1.0 is full volume. */
  var volume: Double
}
object Mixer {
  
  inline def apply(volume: Double): Mixer = {
    val __obj = js.Dynamic.literal(volume = volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mixer]
  }
  
  extension [Self <: Mixer](x: Self) {
    
    inline def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
  }
}
