package typingsJapgolly.playcanvas.pc

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
@JSGlobal("pc.AudioListenerComponentSystem")
@js.native
class AudioListenerComponentSystem protected () extends ComponentSystem {
  def this(app: Application, manager: SoundManager) = this()
}

