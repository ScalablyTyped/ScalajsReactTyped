package typingsJapgolly.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Enables an Entity to render a simple static sprite or sprite animations.
  *
  * @augments Component
  */
@JSGlobal("pc.SpriteComponent")
@js.native
open class SpriteComponent protected ()
  extends typingsJapgolly.playcanvas.mod.SpriteComponent {
  /**
    * Create a new SpriteComponent instance.
    *
    * @param {SpriteComponentSystem} system - The ComponentSystem that created this Component.
    * @param {Entity} entity - The Entity that this Component is attached to.
    */
  def this(
    system: typingsJapgolly.playcanvas.mod.SpriteComponentSystem,
    entity: typingsJapgolly.playcanvas.mod.Entity
  ) = this()
}
