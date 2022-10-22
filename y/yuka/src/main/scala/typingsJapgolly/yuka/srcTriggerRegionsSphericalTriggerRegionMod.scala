package typingsJapgolly.yuka

import typingsJapgolly.yuka.srcTriggerTriggerRegionMod.TriggerRegion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcTriggerRegionsSphericalTriggerRegionMod {
  
  @JSImport("yuka/src/trigger/regions/SphericalTriggerRegion", "SphericalTriggerRegion")
  @js.native
  /**
    * Constructs a new spherical trigger region.
    *
    * @param [radius=0] - The radius of the region.
    */
  open class SphericalTriggerRegion () extends TriggerRegion {
    def this(radius: Double) = this()
    
    /**
      * The radius of the region.
      */
    var radius: Double = js.native
  }
}
