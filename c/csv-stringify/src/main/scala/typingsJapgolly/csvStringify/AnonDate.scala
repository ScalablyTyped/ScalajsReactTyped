package typingsJapgolly.csvStringify

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.csvStringify.mod.Cast
import typingsJapgolly.csvStringify.mod.CastingContext
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDate extends js.Object {
  var boolean: js.UndefOr[Cast[Boolean]] = js.undefined
  var date: js.UndefOr[Cast[js.Date]] = js.undefined
  var number: js.UndefOr[Cast[Double]] = js.undefined
  /**
    * Custom formatter for generic object values
    */
  var `object`: js.UndefOr[Cast[Record[String, _]]] = js.undefined
  var string: js.UndefOr[Cast[String]] = js.undefined
}

object AnonDate {
  @scala.inline
  def apply(
    boolean: (Boolean, /* context */ CastingContext) => CallbackTo[String] = null,
    date: (js.Date, /* context */ CastingContext) => CallbackTo[String] = null,
    number: (Double, /* context */ CastingContext) => CallbackTo[String] = null,
    `object`: (Record[String, js.Any], /* context */ CastingContext) => CallbackTo[String] = null,
    string: (String, /* context */ CastingContext) => CallbackTo[String] = null
  ): AnonDate = {
    val __obj = js.Dynamic.literal()
    if (boolean != null) __obj.updateDynamic("boolean")(js.Any.fromFunction2((t0: scala.Boolean, t1: /* context */ typingsJapgolly.csvStringify.mod.CastingContext) => boolean(t0, t1).runNow()))
    if (date != null) __obj.updateDynamic("date")(js.Any.fromFunction2((t0: js.Date, t1: /* context */ typingsJapgolly.csvStringify.mod.CastingContext) => date(t0, t1).runNow()))
    if (number != null) __obj.updateDynamic("number")(js.Any.fromFunction2((t0: scala.Double, t1: /* context */ typingsJapgolly.csvStringify.mod.CastingContext) => number(t0, t1).runNow()))
    if (`object` != null) __obj.updateDynamic("object")(js.Any.fromFunction2((t0: typingsJapgolly.std.Record[java.lang.String, js.Any], t1: /* context */ typingsJapgolly.csvStringify.mod.CastingContext) => `object`(t0, t1).runNow()))
    if (string != null) __obj.updateDynamic("string")(js.Any.fromFunction2((t0: java.lang.String, t1: /* context */ typingsJapgolly.csvStringify.mod.CastingContext) => string(t0, t1).runNow()))
    __obj.asInstanceOf[AnonDate]
  }
}

