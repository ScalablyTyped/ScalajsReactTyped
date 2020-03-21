package typingsJapgolly.workboxGoogleAnalytics.initializeMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.std.Record
import typingsJapgolly.std.URLSearchParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitializeOptions extends js.Object {
  var cacheName: js.UndefOr[String] = js.undefined
  var hitFilter: js.UndefOr[js.Function1[/* params */ URLSearchParams, Unit]] = js.undefined
  var parameterOverrides: js.UndefOr[Record[String, String]] = js.undefined
}

object InitializeOptions {
  @scala.inline
  def apply(
    cacheName: String = null,
    hitFilter: /* params */ URLSearchParams => Callback = null,
    parameterOverrides: Record[String, String] = null
  ): InitializeOptions = {
    val __obj = js.Dynamic.literal()
    if (cacheName != null) __obj.updateDynamic("cacheName")(cacheName.asInstanceOf[js.Any])
    if (hitFilter != null) __obj.updateDynamic("hitFilter")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.std.URLSearchParams) => hitFilter(t0).runNow()))
    if (parameterOverrides != null) __obj.updateDynamic("parameterOverrides")(parameterOverrides.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitializeOptions]
  }
}

