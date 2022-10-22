package typingsJapgolly.babylonjs.legacyLegacyMod

import typingsJapgolly.babylonjs.eventsDeviceInputEventsMod.IMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "PointerInfoBase")
@js.native
open class PointerInfoBase protected ()
  extends typingsJapgolly.babylonjs.indexMod.PointerInfoBase {
  /**
    * Instantiates the base class of pointers info.
    * @param type Defines the type of event (PointerEventTypes)
    * @param event Defines the related dom event
    */
  def this(
    /**
    * Defines the type of event (PointerEventTypes)
    */
  `type`: Double,
    /**
    * Defines the related dom event
    */
  event: IMouseEvent
  ) = this()
}
