package typingsJapgolly.ol.iconImageCacheMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.ol.colorMod.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconImageCache extends js.Object {
  def canExpireCache(): Boolean
  def clear(): Unit
  def expire(): Unit
  def get(src: String, crossOrigin: String, color: Color): typingsJapgolly.ol.iconImageMod.default
  def set(src: String, crossOrigin: String, color: Color, iconImage: typingsJapgolly.ol.iconImageMod.default): Unit
  def setSize(maxCacheSize: Double): Unit
}

object IconImageCache {
  @scala.inline
  def apply(
    canExpireCache: CallbackTo[Boolean],
    clear: Callback,
    expire: Callback,
    get: (String, String, Color) => CallbackTo[typingsJapgolly.ol.iconImageMod.default],
    set: (String, String, Color, typingsJapgolly.ol.iconImageMod.default) => Callback,
    setSize: Double => Callback
  ): IconImageCache = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("canExpireCache")(canExpireCache.toJsFn)
    __obj.updateDynamic("clear")(clear.toJsFn)
    __obj.updateDynamic("expire")(expire.toJsFn)
    __obj.updateDynamic("get")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: typingsJapgolly.ol.colorMod.Color) => get(t0, t1, t2).runNow()))
    __obj.updateDynamic("set")(js.Any.fromFunction4((t0: java.lang.String, t1: java.lang.String, t2: typingsJapgolly.ol.colorMod.Color, t3: typingsJapgolly.ol.iconImageMod.default) => set(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("setSize")(js.Any.fromFunction1((t0: scala.Double) => setSize(t0).runNow()))
    __obj.asInstanceOf[IconImageCache]
  }
}

