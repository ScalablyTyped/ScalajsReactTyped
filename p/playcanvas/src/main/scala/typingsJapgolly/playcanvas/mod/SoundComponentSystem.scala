package typingsJapgolly.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.SoundComponentSystem
  * @augments pc.ComponentSystem
  * @classdesc Manages creation of {@link pc.SoundComponent}s.
  * @description Create a SoundComponentSystem.
  * @param {pc.Application} app - The Application.
  * @param {pc.SoundManager} manager - The sound manager.
  * @property {number} volume Sets / gets the volume for the entire Sound system. All sounds will have their volume
  * multiplied by this value. Valid between [0, 1].
  * @property {AudioContext} context Gets the AudioContext currently used by the sound manager. Requires Web Audio API support.
  * @property {pc.SoundManager} manager Gets / sets the sound manager.
  */
@JSImport("playcanvas", "SoundComponentSystem")
@js.native
class SoundComponentSystem protected ()
  extends typingsJapgolly.playcanvas.pc.SoundComponentSystem {
  def this(
    app: typingsJapgolly.playcanvas.pc.Application,
    manager: typingsJapgolly.playcanvas.pc.SoundManager
  ) = this()
}

