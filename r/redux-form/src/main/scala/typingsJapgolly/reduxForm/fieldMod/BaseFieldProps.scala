package typingsJapgolly.reduxForm.fieldMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactDragEventFrom
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import org.scalajs.dom.raw.Element
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reduxForm.reduxFormStrings.input
import typingsJapgolly.reduxForm.reduxFormStrings.select
import typingsJapgolly.reduxForm.reduxFormStrings.textarea
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<redux-form.redux-form/lib/Field.CommonFieldProps> */
trait BaseFieldProps[P] extends js.Object {
  var component: js.UndefOr[(ComponentType[WrappedFieldProps with P]) | input | select | textarea] = js.undefined
  var format: js.UndefOr[Formatter | Null] = js.undefined
  var forwardRef: js.UndefOr[Boolean] = js.undefined
  var immutableProps: js.UndefOr[js.Array[String]] = js.undefined
  var name: String
  var normalize: js.UndefOr[Normalizer] = js.undefined
  var onBlur: js.UndefOr[EventWithDataHandler[ReactFocusEventFrom[Element]]] = js.undefined
  var onChange: js.UndefOr[EventWithDataHandler[ReactEventFrom[Element]]] = js.undefined
  var onDragStart: js.UndefOr[EventHandler[ReactDragEventFrom[Element]]] = js.undefined
  var onDrop: js.UndefOr[EventHandler[ReactDragEventFrom[Element]]] = js.undefined
  var onFocus: js.UndefOr[EventHandler[ReactFocusEventFrom[Element]]] = js.undefined
  var parse: js.UndefOr[Parser] = js.undefined
  var props: js.UndefOr[P] = js.undefined
  var validate: js.UndefOr[Validator | js.Array[Validator]] = js.undefined
  var warn: js.UndefOr[Validator | js.Array[Validator]] = js.undefined
}

object BaseFieldProps {
  @scala.inline
  def apply[P](
    name: String,
    component: (ComponentType[WrappedFieldProps with P]) | input | select | textarea = null,
    format: (/* value */ js.Any, /* name */ String) => CallbackTo[js.Any] = null,
    forwardRef: js.UndefOr[Boolean] = js.undefined,
    immutableProps: js.Array[String] = null,
    normalize: (/* value */ js.Any, /* previousValue */ js.UndefOr[js.Any], /* allValues */ js.UndefOr[js.Any], /* previousAllValues */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    onBlur: (/* event */ js.UndefOr[ReactFocusEventFrom[Element]], /* newValue */ js.UndefOr[js.Any], /* previousValue */ js.UndefOr[js.Any], /* name */ js.UndefOr[String]) => Callback = null,
    onChange: (/* event */ js.UndefOr[ReactEventFrom[Element]], /* newValue */ js.UndefOr[js.Any], /* previousValue */ js.UndefOr[js.Any], /* name */ js.UndefOr[String]) => Callback = null,
    onDragStart: (ReactDragEventFrom[Element], /* name */ js.UndefOr[String]) => Callback = null,
    onDrop: (ReactDragEventFrom[Element], /* name */ js.UndefOr[String]) => Callback = null,
    onFocus: (ReactFocusEventFrom[Element], /* name */ js.UndefOr[String]) => Callback = null,
    parse: (/* value */ js.Any, /* name */ String) => CallbackTo[js.Any] = null,
    props: P = null,
    validate: Validator | js.Array[Validator] = null,
    warn: Validator | js.Array[Validator] = null
  ): BaseFieldProps[P] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(js.Any.fromFunction2((t0: /* value */ js.Any, t1: /* name */ java.lang.String) => format(t0, t1).runNow()))
    if (!js.isUndefined(forwardRef)) __obj.updateDynamic("forwardRef")(forwardRef.asInstanceOf[js.Any])
    if (immutableProps != null) __obj.updateDynamic("immutableProps")(immutableProps.asInstanceOf[js.Any])
    if (normalize != null) __obj.updateDynamic("normalize")(js.Any.fromFunction4((t0: /* value */ js.Any, t1: /* previousValue */ js.UndefOr[js.Any], t2: /* allValues */ js.UndefOr[js.Any], t3: /* previousAllValues */ js.UndefOr[js.Any]) => normalize(t0, t1, t2, t3).runNow()))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction4((t0: /* event */ js.UndefOr[japgolly.scalajs.react.ReactFocusEventFrom[org.scalajs.dom.raw.Element]], t1: /* newValue */ js.UndefOr[js.Any], t2: /* previousValue */ js.UndefOr[js.Any], t3: /* name */ js.UndefOr[java.lang.String]) => onBlur(t0, t1, t2, t3).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction4((t0: /* event */ js.UndefOr[japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.Element]], t1: /* newValue */ js.UndefOr[js.Any], t2: /* previousValue */ js.UndefOr[js.Any], t3: /* name */ js.UndefOr[java.lang.String]) => onChange(t0, t1, t2, t3).runNow()))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction2((t0: japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.Element], t1: /* name */ js.UndefOr[java.lang.String]) => onDragStart(t0, t1).runNow()))
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction2((t0: japgolly.scalajs.react.ReactDragEventFrom[org.scalajs.dom.raw.Element], t1: /* name */ js.UndefOr[java.lang.String]) => onDrop(t0, t1).runNow()))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction2((t0: japgolly.scalajs.react.ReactFocusEventFrom[org.scalajs.dom.raw.Element], t1: /* name */ js.UndefOr[java.lang.String]) => onFocus(t0, t1).runNow()))
    if (parse != null) __obj.updateDynamic("parse")(js.Any.fromFunction2((t0: /* value */ js.Any, t1: /* name */ java.lang.String) => parse(t0, t1).runNow()))
    if (props != null) __obj.updateDynamic("props")(props.asInstanceOf[js.Any])
    if (validate != null) __obj.updateDynamic("validate")(validate.asInstanceOf[js.Any])
    if (warn != null) __obj.updateDynamic("warn")(warn.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseFieldProps[P]]
  }
}

