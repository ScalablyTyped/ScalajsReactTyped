package typingsJapgolly.babylonjs.legacyLegacyMod

import typingsJapgolly.babylonjs.eventsDeviceInputEventsMod.IMouseEvent
import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "PointerInfo")
@js.native
open class PointerInfo protected ()
  extends typingsJapgolly.babylonjs.indexMod.PointerInfo {
  /**
    * Instantiates a PointerInfo to store pointer related info to the onPointerObservable event.
    * @param type Defines the type of event (PointerEventTypes)
    * @param event Defines the related dom event
    * @param pickInfo Defines the picking info associated to the info (if any)\
    */
  def this(
    `type`: Double,
    event: IMouseEvent,
    /**
    * Defines the picking info associated to the info (if any)\
    */
  pickInfo: Nullable[typingsJapgolly.babylonjs.collisionsPickingInfoMod.PickingInfo]
  ) = this()
}
