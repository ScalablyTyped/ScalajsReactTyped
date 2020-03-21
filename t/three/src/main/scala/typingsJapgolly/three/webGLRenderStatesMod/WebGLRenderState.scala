package typingsJapgolly.three.webGLRenderStatesMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.three.AnonLights
import typingsJapgolly.three.cameraMod.Camera
import typingsJapgolly.three.lightMod.Light
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebGLRenderState extends js.Object {
  var state: AnonLights
  def init(): Unit
  def pushLight(light: Light): Unit
  def pushShadow(shadowLight: Light): Unit
  def setupLights(camera: Camera): Unit
}

object WebGLRenderState {
  @scala.inline
  def apply(
    init: Callback,
    pushLight: Light => Callback,
    pushShadow: Light => Callback,
    setupLights: Camera => Callback,
    state: AnonLights
  ): WebGLRenderState = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.updateDynamic("init")(init.toJsFn)
    __obj.updateDynamic("pushLight")(js.Any.fromFunction1((t0: typingsJapgolly.three.lightMod.Light) => pushLight(t0).runNow()))
    __obj.updateDynamic("pushShadow")(js.Any.fromFunction1((t0: typingsJapgolly.three.lightMod.Light) => pushShadow(t0).runNow()))
    __obj.updateDynamic("setupLights")(js.Any.fromFunction1((t0: typingsJapgolly.three.cameraMod.Camera) => setupLights(t0).runNow()))
    __obj.asInstanceOf[WebGLRenderState]
  }
}

