package typingsJapgolly.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @typedef {import('./system.js').AnimComponentSystem} AnimComponentSystem */
/**
  * The Anim Component allows an Entity to playback animations on models and entity properties.
  *
  * @augments Component
  */
@JSGlobal("pc.AnimComponent")
@js.native
open class AnimComponent protected ()
  extends typingsJapgolly.playcanvas.mod.AnimComponent {
  /**
    * Create a new AnimComponent instance.
    *
    * @param {AnimComponentSystem} system - The {@link ComponentSystem} that created this
    * Component.
    * @param {Entity} entity - The Entity that this Component is attached to.
    */
  def this(
    system: typingsJapgolly.playcanvas.mod.AnimComponentSystem,
    entity: typingsJapgolly.playcanvas.mod.Entity
  ) = this()
}
