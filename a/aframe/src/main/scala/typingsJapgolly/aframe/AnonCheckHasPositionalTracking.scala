package typingsJapgolly.aframe

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.VRDisplay
import typingsJapgolly.three.mod.Object3D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCheckHasPositionalTracking extends js.Object {
  var isWebXRAvailable: Boolean
  def PolyfillControls(object3D: Object3D): Unit
  def checkHasPositionalTracking(): Boolean
  def checkHeadsetConnected(): Boolean
  def getVRDisplay(): js.Array[VRDisplay]
  def isBrowserEnvironment(): Boolean
  def isGearVR(): Boolean
  def isIOS(): Boolean
  def isLandscape(): Boolean
  def isMobile(): Boolean
  def isNodeEnvironment(): Boolean
  def isOculusGo(): Boolean
  def isR7(): Boolean
  def isTablet(): Boolean
}

object AnonCheckHasPositionalTracking {
  @scala.inline
  def apply(
    PolyfillControls: Object3D => Callback,
    checkHasPositionalTracking: CallbackTo[Boolean],
    checkHeadsetConnected: CallbackTo[Boolean],
    getVRDisplay: CallbackTo[js.Array[VRDisplay]],
    isBrowserEnvironment: CallbackTo[Boolean],
    isGearVR: CallbackTo[Boolean],
    isIOS: CallbackTo[Boolean],
    isLandscape: CallbackTo[Boolean],
    isMobile: CallbackTo[Boolean],
    isNodeEnvironment: CallbackTo[Boolean],
    isOculusGo: CallbackTo[Boolean],
    isR7: CallbackTo[Boolean],
    isTablet: CallbackTo[Boolean],
    isWebXRAvailable: Boolean
  ): AnonCheckHasPositionalTracking = {
    val __obj = js.Dynamic.literal(isWebXRAvailable = isWebXRAvailable.asInstanceOf[js.Any])
    __obj.updateDynamic("PolyfillControls")(js.Any.fromFunction1((t0: typingsJapgolly.three.mod.Object3D) => PolyfillControls(t0).runNow()))
    __obj.updateDynamic("checkHasPositionalTracking")(checkHasPositionalTracking.toJsFn)
    __obj.updateDynamic("checkHeadsetConnected")(checkHeadsetConnected.toJsFn)
    __obj.updateDynamic("getVRDisplay")(getVRDisplay.toJsFn)
    __obj.updateDynamic("isBrowserEnvironment")(isBrowserEnvironment.toJsFn)
    __obj.updateDynamic("isGearVR")(isGearVR.toJsFn)
    __obj.updateDynamic("isIOS")(isIOS.toJsFn)
    __obj.updateDynamic("isLandscape")(isLandscape.toJsFn)
    __obj.updateDynamic("isMobile")(isMobile.toJsFn)
    __obj.updateDynamic("isNodeEnvironment")(isNodeEnvironment.toJsFn)
    __obj.updateDynamic("isOculusGo")(isOculusGo.toJsFn)
    __obj.updateDynamic("isR7")(isR7.toJsFn)
    __obj.updateDynamic("isTablet")(isTablet.toJsFn)
    __obj.asInstanceOf[AnonCheckHasPositionalTracking]
  }
}

