package typingsJapgolly.yuka

import typingsJapgolly.yuka.srcMathVector3Mod.Vector3
import typingsJapgolly.yuka.srcTriggerTriggerRegionMod.TriggerRegion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcTriggerRegionsRectangularTriggerRegionMod {
  
  @JSImport("yuka/src/trigger/regions/RectangularTriggerRegion", "RectangularTriggerRegion")
  @js.native
  /**
    * Constructs a new rectangular trigger region with the given values.
    *
    * @param [size=Vector3(0,0,0)] - The size of the region.
    */
  open class RectangularTriggerRegion () extends TriggerRegion {
    def this(size: Vector3) = this()
    
    /**
      * The size of the region.
      * @default new Vector3(0,0,0)
      */
    var size: Vector3 = js.native
  }
}
