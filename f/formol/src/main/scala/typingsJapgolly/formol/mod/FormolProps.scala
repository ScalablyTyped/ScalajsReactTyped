package typingsJapgolly.formol.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormolProps[V] extends js.Object {
  var allowUnmodifiedSubmit: js.UndefOr[js.Any] = js.undefined
  var cancelText: js.UndefOr[js.Any] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var classes: js.UndefOr[js.Any] = js.undefined
  var extra: js.UndefOr[Node] = js.undefined
  var i18n: js.UndefOr[js.Any] = js.undefined
  var item: js.UndefOr[V] = js.undefined
  var noCancel: js.UndefOr[js.Any] = js.undefined
  var onSubmit: js.UndefOr[js.Function1[/* e */ Event_, Unit]] = js.undefined
  var readOnly: js.UndefOr[Boolean] = js.undefined
  var submitText: js.UndefOr[js.Any] = js.undefined
  var types: js.UndefOr[js.Array[String]] = js.undefined
  var validator: js.UndefOr[
    js.Function1[
      /* v */ V, 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof V ]:? string | null}
    */ typingsJapgolly.formol.formolStrings.FormolProps with js.Any
    ]
  ] = js.undefined
}

object FormolProps {
  @scala.inline
  def apply[V](
    allowUnmodifiedSubmit: js.Any = null,
    cancelText: js.Any = null,
    className: String = null,
    classes: js.Any = null,
    extra: VdomNode = null,
    i18n: js.Any = null,
    item: V = null,
    noCancel: js.Any = null,
    onSubmit: /* e */ Event_ => Callback = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    submitText: js.Any = null,
    types: js.Array[String] = null,
    validator: /* v */ V => CallbackTo[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof V ]:? string | null}
    */ typingsJapgolly.formol.formolStrings.FormolProps with js.Any
    ] = null
  ): FormolProps[V] = {
    val __obj = js.Dynamic.literal()
    if (allowUnmodifiedSubmit != null) __obj.updateDynamic("allowUnmodifiedSubmit")(allowUnmodifiedSubmit.asInstanceOf[js.Any])
    if (cancelText != null) __obj.updateDynamic("cancelText")(cancelText.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.rawNode.asInstanceOf[js.Any])
    if (i18n != null) __obj.updateDynamic("i18n")(i18n.asInstanceOf[js.Any])
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    if (noCancel != null) __obj.updateDynamic("noCancel")(noCancel.asInstanceOf[js.Any])
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.std.Event_) => onSubmit(t0).runNow()))
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (submitText != null) __obj.updateDynamic("submitText")(submitText.asInstanceOf[js.Any])
    if (types != null) __obj.updateDynamic("types")(types.asInstanceOf[js.Any])
    if (validator != null) __obj.updateDynamic("validator")(js.Any.fromFunction1((t0: /* v */ V) => validator(t0).runNow()))
    __obj.asInstanceOf[FormolProps[V]]
  }
}

