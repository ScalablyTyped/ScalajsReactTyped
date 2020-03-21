package typingsJapgolly.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.Component
  * @augments pc.EventHandler
  * @classdesc Components are used to attach functionality on a {@link pc.Entity}. Components
  * can receive update events each frame, and expose properties to the PlayCanvas Editor.
  * @description Base constructor for a Component.
  * @param {pc.ComponentSystem} system - The ComponentSystem used to create this Component.
  * @param {pc.Entity} entity - The Entity that this Component is attached to.
  * @property {pc.ComponentSystem} system The ComponentSystem used to create this Component.
  * @property {pc.Entity} entity The Entity that this Component is attached to.
  * @property {boolean} enabled Enables or disables the component.
  */
@JSImport("playcanvas", "Component")
@js.native
class Component protected ()
  extends typingsJapgolly.playcanvas.pc.Component {
  def this(
    system: typingsJapgolly.playcanvas.pc.ComponentSystem,
    entity: typingsJapgolly.playcanvas.pc.Entity
  ) = this()
}

