package typingsJapgolly.oracleOraclejet

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.oracleOraclejet.ojmodelMod.Collection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonError
  extends /* propName */ StringDictionary[js.Any] {
  var error: js.UndefOr[
    js.Function3[/* collection */ Collection, /* xhr */ js.Any, /* options */ js.Object, Unit]
  ] = js.undefined
  var success: js.UndefOr[
    js.Function3[/* collection */ Collection, /* response */ js.Any, /* options */ js.Object, Unit]
  ] = js.undefined
}

object AnonError {
  @scala.inline
  def apply(
    StringDictionary: /* propName */ StringDictionary[js.Any] = null,
    error: (/* collection */ Collection, /* xhr */ js.Any, /* options */ js.Object) => Callback = null,
    success: (/* collection */ Collection, /* response */ js.Any, /* options */ js.Object) => Callback = null
  ): AnonError = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction3((t0: /* collection */ typingsJapgolly.oracleOraclejet.ojmodelMod.Collection, t1: /* xhr */ js.Any, t2: /* options */ js.Object) => error(t0, t1, t2).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction3((t0: /* collection */ typingsJapgolly.oracleOraclejet.ojmodelMod.Collection, t1: /* response */ js.Any, t2: /* options */ js.Object) => success(t0, t1, t2).runNow()))
    __obj.asInstanceOf[AnonError]
  }
}

