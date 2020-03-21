package typingsJapgolly.jsFixtures

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fixtures_ extends js.Object {
  var containerId: String
  var path: String
  def appendLoad(urls: String*): Unit
  def appendSet(html: String): Unit
  def body(): String
  def cleanUp(): Unit
  def clearCache(): Unit
  def load(urls: String*): Unit
  def preload(urls: String*): Unit
  def read(urls: String*): String
  def set(html: String): Unit
  def window(): Window_
}

object Fixtures_ {
  @scala.inline
  def apply(
    appendLoad: /* repeated */ String => Callback,
    appendSet: String => Callback,
    body: CallbackTo[String],
    cleanUp: Callback,
    clearCache: Callback,
    containerId: String,
    load: /* repeated */ String => Callback,
    path: String,
    preload: /* repeated */ String => Callback,
    read: /* repeated */ String => CallbackTo[String],
    set: String => Callback,
    window: CallbackTo[Window_]
  ): Fixtures_ = {
    val __obj = js.Dynamic.literal(containerId = containerId.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("appendLoad")(js.Any.fromFunction1((t0: /* repeated */ java.lang.String) => appendLoad(t0).runNow()))
    __obj.updateDynamic("appendSet")(js.Any.fromFunction1((t0: java.lang.String) => appendSet(t0).runNow()))
    __obj.updateDynamic("body")(body.toJsFn)
    __obj.updateDynamic("cleanUp")(cleanUp.toJsFn)
    __obj.updateDynamic("clearCache")(clearCache.toJsFn)
    __obj.updateDynamic("load")(js.Any.fromFunction1((t0: /* repeated */ java.lang.String) => load(t0).runNow()))
    __obj.updateDynamic("preload")(js.Any.fromFunction1((t0: /* repeated */ java.lang.String) => preload(t0).runNow()))
    __obj.updateDynamic("read")(js.Any.fromFunction1((t0: /* repeated */ java.lang.String) => read(t0).runNow()))
    __obj.updateDynamic("set")(js.Any.fromFunction1((t0: java.lang.String) => set(t0).runNow()))
    __obj.updateDynamic("window")(window.toJsFn)
    __obj.asInstanceOf[Fixtures_]
  }
}

