package typingsJapgolly.fingerprintjs.FingerprintJs

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fingerprint extends js.Object {
  /**
    * Generate fingerprint number.
    */
  def get(): Double
  /**
    * Get canvas data url string.
    */
  def getCanvasFingerprint(): String
  /**
    * Get plugins string from ActiveXObject.
    */
  def getIEPluginsString(): String
  /**
    * Get plugins string.
    */
  def getPluginsString(): String
  /**
    * Get plugins string from navigator plugins.
    */
  def getRegularPluginsString(): String
  /**
    * Get screen height and width.
    */
  def getScreenResolution(): js.Array[Double]
  /**
    * Check whether or not the browser has local storage.
    */
  def hasLocalStorage(): Boolean
  /**
    * Check whether or not the browser has session storage.
    */
  def hasSessionStorage(): Boolean
  /**
    * Check whether or not the browser supports canvas.
    */
  def isCanvasSupported(): Boolean
  /**
    * Check whether or not the browser is IE.
    */
  def isIE(): Boolean
  /**
    * Generate fingerprint number using Murmur hashing.
    * @param key ASCII only
    * @param seed Positive integer only
    */
  def murmurhash3_32_gc(key: String, seed: Double): Double
}

object Fingerprint {
  @scala.inline
  def apply(
    get: CallbackTo[Double],
    getCanvasFingerprint: CallbackTo[String],
    getIEPluginsString: CallbackTo[String],
    getPluginsString: CallbackTo[String],
    getRegularPluginsString: CallbackTo[String],
    getScreenResolution: CallbackTo[js.Array[Double]],
    hasLocalStorage: CallbackTo[Boolean],
    hasSessionStorage: CallbackTo[Boolean],
    isCanvasSupported: CallbackTo[Boolean],
    isIE: CallbackTo[Boolean],
    murmurhash3_32_gc: (String, Double) => CallbackTo[Double]
  ): Fingerprint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(get.toJsFn)
    __obj.updateDynamic("getCanvasFingerprint")(getCanvasFingerprint.toJsFn)
    __obj.updateDynamic("getIEPluginsString")(getIEPluginsString.toJsFn)
    __obj.updateDynamic("getPluginsString")(getPluginsString.toJsFn)
    __obj.updateDynamic("getRegularPluginsString")(getRegularPluginsString.toJsFn)
    __obj.updateDynamic("getScreenResolution")(getScreenResolution.toJsFn)
    __obj.updateDynamic("hasLocalStorage")(hasLocalStorage.toJsFn)
    __obj.updateDynamic("hasSessionStorage")(hasSessionStorage.toJsFn)
    __obj.updateDynamic("isCanvasSupported")(isCanvasSupported.toJsFn)
    __obj.updateDynamic("isIE")(isIE.toJsFn)
    __obj.updateDynamic("murmurhash3_32_gc")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Double) => murmurhash3_32_gc(t0, t1).runNow()))
    __obj.asInstanceOf[Fingerprint]
  }
}

