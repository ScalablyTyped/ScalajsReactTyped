package typingsJapgolly.aliApp

import japgolly.scalajs.react.Callback
import typingsJapgolly.aliApp.aliAppNumbers.`0`
import typingsJapgolly.aliApp.aliAppNumbers.`1`
import typingsJapgolly.aliApp.aliAppNumbers.`2`
import typingsJapgolly.aliApp.aliAppNumbers.`3`
import typingsJapgolly.aliApp.my.LocationData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<ali-app.my.GetLocationOptions> */
trait PartialGetLocationOptions extends js.Object {
  var cacheTimeout: js.UndefOr[Double] = js.undefined
  var complete: js.UndefOr[js.Function1[/* res */ js.Any, Unit]] = js.undefined
  var fail: js.UndefOr[js.Function1[/* res */ js.Any, Unit]] = js.undefined
  var success: js.UndefOr[js.Function1[/* res */ LocationData, Unit]] = js.undefined
  var `type`: js.UndefOr[`0` | `1` | `2` | `3`] = js.undefined
}

object PartialGetLocationOptions {
  @scala.inline
  def apply(
    cacheTimeout: Int | Double = null,
    complete: /* res */ js.Any => Callback = null,
    fail: /* res */ js.Any => Callback = null,
    success: /* res */ LocationData => Callback = null,
    `type`: `0` | `1` | `2` | `3` = null
  ): PartialGetLocationOptions = {
    val __obj = js.Dynamic.literal()
    if (cacheTimeout != null) __obj.updateDynamic("cacheTimeout")(cacheTimeout.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* res */ js.Any) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.aliApp.my.LocationData) => success(t0).runNow()))
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialGetLocationOptions]
  }
}

