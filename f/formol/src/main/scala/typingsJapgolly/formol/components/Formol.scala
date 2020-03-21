package typingsJapgolly.formol.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.formol.formolStrings.FormolProps
import typingsJapgolly.formol.mod.default
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Formol {
  def apply(
    allowUnmodifiedSubmit: js.Any = null,
    cancelText: js.Any = null,
    className: String = null,
    classes: js.Any = null,
    extra: VdomNode = null,
    i18n: js.Any = null,
    item: js.Any = null,
    noCancel: js.Any = null,
    onSubmit: /* e */ Event_ => Callback = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    submitText: js.Any = null,
    types: js.Array[String] = null,
    validator: js.Any => CallbackTo[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof V ]:? string | null}
    */ FormolProps with js.Any
    ] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    typingsJapgolly.formol.mod.FormolProps[js.Any], 
    default, 
    Unit, 
    typingsJapgolly.formol.mod.FormolProps[js.Any]
  ] = {
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
    if (validator != null) __obj.updateDynamic("validator")(js.Any.fromFunction1((t0: js.Any) => validator(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.formol.mod.FormolProps[js.Any], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.formol.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.formol.mod.FormolProps[js.Any]])(children: _*)
  }
  @JSImport("formol", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

