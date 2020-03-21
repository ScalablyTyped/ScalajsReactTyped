package typingsJapgolly.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.AudioListenerComponentSystem
  * @augments pc.ComponentSystem
  * @classdesc Component System for adding and removing {@link pc.AudioComponent} objects to Entities.
  * @description Create a new AudioListenerComponentSystem.
  * @param {pc.Application} app - The application managing this system.
  * @param {pc.SoundManager} manager - A sound manager instance.
  */
@JSImport("playcanvas", "AudioListenerComponentSystem")
@js.native
class AudioListenerComponentSystem protected ()
  extends typingsJapgolly.playcanvas.pc.AudioListenerComponentSystem {
  def this(
    app: typingsJapgolly.playcanvas.pc.Application,
    manager: typingsJapgolly.playcanvas.pc.SoundManager
  ) = this()
}

