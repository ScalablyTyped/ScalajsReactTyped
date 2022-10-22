package typingsJapgolly.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A ScreenComponent enables the Entity to render child {@link ElementComponent}s using anchors and
  * positions in the ScreenComponent's space.
  *
  * @augments Component
  */
@JSGlobal("pc.ScreenComponent")
@js.native
open class ScreenComponent protected ()
  extends typingsJapgolly.playcanvas.mod.ScreenComponent {
  /**
    * Create a new ScreenComponent.
    *
    * @param {ScreenComponentSystem} system - The ComponentSystem that created this Component.
    * @param {Entity} entity - The Entity that this Component is attached to.
    */
  def this(
    system: typingsJapgolly.playcanvas.mod.ScreenComponentSystem,
    entity: typingsJapgolly.playcanvas.mod.Entity
  ) = this()
}
