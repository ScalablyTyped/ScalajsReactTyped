package typingsJapgolly.oracleOraclejet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.oracleOraclejet.ojmodelMod.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonComparator
  extends /* propName */ StringDictionary[js.Any] {
  var comparator: js.UndefOr[
    Null | String | (js.Function2[/* model1 */ Model, /* model2 */ js.UndefOr[Model], Double])
  ] = js.undefined
  var fetchSize: js.UndefOr[Double] = js.undefined
  var initialize: js.UndefOr[js.Function2[/* models */ js.Array[Model], /* options */ js.Object, Unit]] = js.undefined
  var model: js.UndefOr[Model] = js.undefined
  var modelLimit: js.UndefOr[Double] = js.undefined
  var parse: js.UndefOr[js.Function1[/* data */ js.Any, _]] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object AnonComparator {
  @scala.inline
  def apply(
    StringDictionary: /* propName */ StringDictionary[js.Any] = null,
    comparator: String | (js.Function2[/* model1 */ Model, /* model2 */ js.UndefOr[Model], Double]) = null,
    fetchSize: Int | Double = null,
    initialize: (/* models */ js.Array[Model], /* options */ js.Object) => Callback = null,
    model: Model = null,
    modelLimit: Int | Double = null,
    parse: /* data */ js.Any => CallbackTo[js.Any] = null,
    url: String = null
  ): AnonComparator = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (comparator != null) __obj.updateDynamic("comparator")(comparator.asInstanceOf[js.Any])
    if (fetchSize != null) __obj.updateDynamic("fetchSize")(fetchSize.asInstanceOf[js.Any])
    if (initialize != null) __obj.updateDynamic("initialize")(js.Any.fromFunction2((t0: /* models */ js.Array[typingsJapgolly.oracleOraclejet.ojmodelMod.Model], t1: /* options */ js.Object) => initialize(t0, t1).runNow()))
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (modelLimit != null) __obj.updateDynamic("modelLimit")(modelLimit.asInstanceOf[js.Any])
    if (parse != null) __obj.updateDynamic("parse")(js.Any.fromFunction1((t0: /* data */ js.Any) => parse(t0).runNow()))
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonComparator]
  }
}

