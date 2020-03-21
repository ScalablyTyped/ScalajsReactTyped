package typingsJapgolly.reduxForm.fieldsMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reduxForm.fieldMod.Formatter
import typingsJapgolly.reduxForm.fieldMod.Parser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseFieldsProps[P] extends js.Object {
  var component: js.UndefOr[ComponentType[_]] = js.undefined
  var format: js.UndefOr[Formatter | Null] = js.undefined
  var forwardRef: js.UndefOr[Boolean] = js.undefined
  var names: js.Array[String]
  var parse: js.UndefOr[Parser] = js.undefined
  var props: js.UndefOr[P] = js.undefined
  var validate: js.UndefOr[FieldsWarnerOrValidator] = js.undefined
  var warn: js.UndefOr[FieldsWarnerOrValidator] = js.undefined
}

object BaseFieldsProps {
  @scala.inline
  def apply[P](
    names: js.Array[String],
    component: ComponentType[_] = null,
    format: (/* value */ js.Any, /* name */ String) => CallbackTo[js.Any] = null,
    forwardRef: js.UndefOr[Boolean] = js.undefined,
    parse: (/* value */ js.Any, /* name */ String) => CallbackTo[js.Any] = null,
    props: P = null,
    validate: FieldsWarnerOrValidator = null,
    warn: FieldsWarnerOrValidator = null
  ): BaseFieldsProps[P] = {
    val __obj = js.Dynamic.literal(names = names.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(js.Any.fromFunction2((t0: /* value */ js.Any, t1: /* name */ java.lang.String) => format(t0, t1).runNow()))
    if (!js.isUndefined(forwardRef)) __obj.updateDynamic("forwardRef")(forwardRef.asInstanceOf[js.Any])
    if (parse != null) __obj.updateDynamic("parse")(js.Any.fromFunction2((t0: /* value */ js.Any, t1: /* name */ java.lang.String) => parse(t0, t1).runNow()))
    if (props != null) __obj.updateDynamic("props")(props.asInstanceOf[js.Any])
    if (validate != null) __obj.updateDynamic("validate")(validate.asInstanceOf[js.Any])
    if (warn != null) __obj.updateDynamic("warn")(warn.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseFieldsProps[P]]
  }
}

