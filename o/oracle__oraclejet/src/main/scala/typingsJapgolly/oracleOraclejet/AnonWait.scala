package typingsJapgolly.oracleOraclejet

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.oracleOraclejet.ojmodelMod.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonWait
  extends /* propName */ StringDictionary[js.Any] {
  var error: js.UndefOr[js.Function3[/* model */ Model, /* xhr */ js.Any, /* options */ js.Object, Unit]] = js.undefined
  var success: js.UndefOr[
    js.Function3[/* model */ Model, /* response */ js.Any, /* options */ js.Object, Unit]
  ] = js.undefined
  @JSName("wait")
  var wait_FAnonWait: js.UndefOr[Boolean] = js.undefined
}

object AnonWait {
  @scala.inline
  def apply(
    StringDictionary: /* propName */ StringDictionary[js.Any] = null,
    error: (/* model */ Model, /* xhr */ js.Any, /* options */ js.Object) => Callback = null,
    success: (/* model */ Model, /* response */ js.Any, /* options */ js.Object) => Callback = null,
    wait: js.UndefOr[Boolean] = js.undefined
  ): AnonWait = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction3((t0: /* model */ typingsJapgolly.oracleOraclejet.ojmodelMod.Model, t1: /* xhr */ js.Any, t2: /* options */ js.Object) => error(t0, t1, t2).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction3((t0: /* model */ typingsJapgolly.oracleOraclejet.ojmodelMod.Model, t1: /* response */ js.Any, t2: /* options */ js.Object) => success(t0, t1, t2).runNow()))
    if (!js.isUndefined(wait)) __obj.updateDynamic("wait")(wait.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonWait]
  }
}

