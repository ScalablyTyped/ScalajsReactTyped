package typingsJapgolly.oracleOraclejet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.oracleOraclejet.ojmodelMod.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInitialize
  extends /* propName */ StringDictionary[js.Any] {
  var initialize: js.UndefOr[js.Function2[/* models */ js.Array[Model], /* options */ js.Object, Unit]] = js.undefined
  var parse: js.UndefOr[js.Function1[/* data */ js.Any, _]] = js.undefined
  var parseSave: js.UndefOr[js.Function1[/* data */ js.Any, _]] = js.undefined
  var urlRoot: js.UndefOr[String] = js.undefined
  var validate: js.UndefOr[
    Null | js.Object | String | (js.Function2[/* attributes */ js.Object, /* options */ js.UndefOr[this.type], Double])
  ] = js.undefined
}

object AnonInitialize {
  @scala.inline
  def apply(
    StringDictionary: /* propName */ StringDictionary[js.Any] = null,
    initialize: (/* models */ js.Array[Model], /* options */ js.Object) => Callback = null,
    parse: /* data */ js.Any => CallbackTo[js.Any] = null,
    parseSave: /* data */ js.Any => CallbackTo[js.Any] = null,
    urlRoot: String = null,
    validate: js.Object | String | (js.Function2[/* attributes */ js.Object, /* options */ js.UndefOr[AnonInitialize], Double]) = null
  ): AnonInitialize = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (initialize != null) __obj.updateDynamic("initialize")(js.Any.fromFunction2((t0: /* models */ js.Array[typingsJapgolly.oracleOraclejet.ojmodelMod.Model], t1: /* options */ js.Object) => initialize(t0, t1).runNow()))
    if (parse != null) __obj.updateDynamic("parse")(js.Any.fromFunction1((t0: /* data */ js.Any) => parse(t0).runNow()))
    if (parseSave != null) __obj.updateDynamic("parseSave")(js.Any.fromFunction1((t0: /* data */ js.Any) => parseSave(t0).runNow()))
    if (urlRoot != null) __obj.updateDynamic("urlRoot")(urlRoot.asInstanceOf[js.Any])
    if (validate != null) __obj.updateDynamic("validate")(validate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInitialize]
  }
}

