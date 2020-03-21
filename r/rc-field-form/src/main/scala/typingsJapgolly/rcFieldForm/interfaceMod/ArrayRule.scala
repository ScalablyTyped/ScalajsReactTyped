package typingsJapgolly.rcFieldForm.interfaceMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.rcFieldForm.rcFieldFormStrings.array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Omit<rc-field-form.rc-field-form/lib/interface.BaseRule, 'type'> */
trait ArrayRule extends RuleObject {
  var defaultField: js.UndefOr[RuleObject] = js.undefined
  var enum: js.UndefOr[js.Array[StoreValue]] = js.undefined
  var len: js.UndefOr[Double] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var message: js.UndefOr[String | Element] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var pattern: js.UndefOr[js.RegExp] = js.undefined
  var required: js.UndefOr[Boolean] = js.undefined
  var transform: js.UndefOr[js.Function1[/* value */ StoreValue, StoreValue]] = js.undefined
  var `type`: array
  var validateTrigger: js.UndefOr[String | js.Array[String]] = js.undefined
  var validator: js.UndefOr[Validator] = js.undefined
  var whitespace: js.UndefOr[Boolean] = js.undefined
}

object ArrayRule {
  @scala.inline
  def apply(
    `type`: array,
    defaultField: RuleObject = null,
    enum: js.Array[StoreValue] = null,
    len: Int | Double = null,
    max: Int | Double = null,
    message: String | Element = null,
    min: Int | Double = null,
    pattern: js.RegExp = null,
    required: js.UndefOr[Boolean] = js.undefined,
    transform: /* value */ StoreValue => CallbackTo[StoreValue] = null,
    validateTrigger: String | js.Array[String] = null,
    validator: (/* rule */ RuleObject, /* value */ StoreValue, /* callback */ js.Function1[/* error */ js.UndefOr[String], Unit]) => CallbackTo[js.Promise[Unit] | Unit] = null,
    whitespace: js.UndefOr[Boolean] = js.undefined
  ): ArrayRule = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (defaultField != null) __obj.updateDynamic("defaultField")(defaultField.asInstanceOf[js.Any])
    if (enum != null) __obj.updateDynamic("enum")(enum.asInstanceOf[js.Any])
    if (len != null) __obj.updateDynamic("len")(len.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(js.Any.fromFunction1((t0: /* value */ typingsJapgolly.rcFieldForm.interfaceMod.StoreValue) => transform(t0).runNow()))
    if (validateTrigger != null) __obj.updateDynamic("validateTrigger")(validateTrigger.asInstanceOf[js.Any])
    if (validator != null) __obj.updateDynamic("validator")(js.Any.fromFunction3((t0: /* rule */ typingsJapgolly.rcFieldForm.interfaceMod.RuleObject, t1: /* value */ typingsJapgolly.rcFieldForm.interfaceMod.StoreValue, t2: /* callback */ js.Function1[/* error */ js.UndefOr[java.lang.String], scala.Unit]) => validator(t0, t1, t2).runNow()))
    if (!js.isUndefined(whitespace)) __obj.updateDynamic("whitespace")(whitespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayRule]
  }
}

