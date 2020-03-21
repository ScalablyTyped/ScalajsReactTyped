package typingsJapgolly.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.PostEffectQueue
  * @classdesc Used to manage multiple post effects for a camera.
  * @description Create a new PostEffectQueue.
  * @param {pc.Application} app - The application.
  * @param {pc.CameraComponent} camera - The camera component.
  */
@JSImport("playcanvas", "PostEffectQueue")
@js.native
class PostEffectQueue protected ()
  extends typingsJapgolly.playcanvas.pc.PostEffectQueue {
  def this(
    app: typingsJapgolly.playcanvas.pc.Application,
    camera: typingsJapgolly.playcanvas.pc.CameraComponent
  ) = this()
}

