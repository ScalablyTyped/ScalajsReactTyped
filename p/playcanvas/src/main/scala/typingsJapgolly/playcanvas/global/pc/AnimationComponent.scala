package typingsJapgolly.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @typedef {import('../../../animation/animation.js').Animation} Animation */
/** @typedef {import('../../../scene/model.js').Model} Model */
/** @typedef {import('../../entity.js').Entity} Entity */
/** @typedef {import('./system.js').AnimationComponentSystem} AnimationComponentSystem */
/**
  * The Animation Component allows an Entity to playback animations on models.
  *
  * @augments Component
  */
@JSGlobal("pc.AnimationComponent")
@js.native
open class AnimationComponent protected ()
  extends typingsJapgolly.playcanvas.mod.AnimationComponent {
  /**
    * Create a new AnimationComponent instance.
    *
    * @param {AnimationComponentSystem} system - The {@link ComponentSystem} that created this Component.
    * @param {Entity} entity - The Entity that this Component is attached to.
    */
  def this(
    system: typingsJapgolly.playcanvas.mod.AnimationComponentSystem,
    entity: typingsJapgolly.playcanvas.mod.Entity
  ) = this()
}
