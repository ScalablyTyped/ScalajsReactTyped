package typingsJapgolly.three.srcRenderersWebglWebGLRenderStatesMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.three.Anon_Lights
import typingsJapgolly.three.srcCamerasCameraMod.Camera
import typingsJapgolly.three.srcLightsLightMod.Light
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebGLRenderState extends js.Object {
  var state: Anon_Lights
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
    state: Anon_Lights
  ): WebGLRenderState = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.updateDynamic("init")(init.toJsFn)
    __obj.updateDynamic("pushLight")(js.Any.fromFunction1((t0: typingsJapgolly.three.srcLightsLightMod.Light) => pushLight(t0).runNow()))
    __obj.updateDynamic("pushShadow")(js.Any.fromFunction1((t0: typingsJapgolly.three.srcLightsLightMod.Light) => pushShadow(t0).runNow()))
    __obj.updateDynamic("setupLights")(js.Any.fromFunction1((t0: typingsJapgolly.three.srcCamerasCameraMod.Camera) => setupLights(t0).runNow()))
    __obj.asInstanceOf[WebGLRenderState]
  }
}

