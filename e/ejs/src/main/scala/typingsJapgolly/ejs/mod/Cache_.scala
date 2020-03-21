package typingsJapgolly.ejs.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cache_ extends js.Object {
  /**
  	 * Get the cached intermediate JavaScript function for a template.
  	 *
  	 * @param key key for caching
  	 */
  def get(key: String): js.UndefOr[TemplateFunction]
  /**
  	 * Clear the entire cache.
  	 */
  def reset(): Unit
  /**
  	 * Cache the intermediate JavaScript function for a template.
  	 *
  	 * @param key key for caching
  	 * @param val cached function
  	 */
  def set(key: String, `val`: TemplateFunction): Unit
}

object Cache_ {
  @scala.inline
  def apply(
    get: String => CallbackTo[js.UndefOr[TemplateFunction]],
    reset: Callback,
    set: (String, TemplateFunction) => Callback
  ): Cache_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: java.lang.String) => get(t0).runNow()))
    __obj.updateDynamic("reset")(reset.toJsFn)
    __obj.updateDynamic("set")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.ejs.mod.TemplateFunction) => set(t0, t1).runNow()))
    __obj.asInstanceOf[Cache_]
  }
}

