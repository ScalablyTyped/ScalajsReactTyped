package typingsJapgolly.mustache.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateCache extends js.Object {
  def clear(): Unit
  def get(cacheKey: String): js.UndefOr[String]
  def set(cacheKey: String, value: String): Unit
}

object TemplateCache {
  @scala.inline
  def apply(clear: Callback, get: String => CallbackTo[js.UndefOr[String]], set: (String, String) => Callback): TemplateCache = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clear")(clear.toJsFn)
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: java.lang.String) => get(t0).runNow()))
    __obj.updateDynamic("set")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => set(t0, t1).runNow()))
    __obj.asInstanceOf[TemplateCache]
  }
}

