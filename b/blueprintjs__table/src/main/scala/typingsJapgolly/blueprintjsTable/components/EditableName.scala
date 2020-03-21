package typingsJapgolly.blueprintjsTable.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.blueprintjsCore.intentMod.Intent
import typingsJapgolly.blueprintjsTable.editableNameMod.IEditableNameProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object EditableName {
  def apply(
    className: String = null,
    index: Int | Double = null,
    intent: Intent = null,
    name: String = null,
    onCancel: (/* value */ String, /* columnIndex */ js.UndefOr[Double]) => Callback = null,
    onChange: (/* value */ String, /* columnIndex */ js.UndefOr[Double]) => Callback = null,
    onConfirm: (/* value */ String, /* columnIndex */ js.UndefOr[Double]) => Callback = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    IEditableNameProps, 
    typingsJapgolly.blueprintjsTable.mod.EditableName, 
    Unit, 
    IEditableNameProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (intent != null) __obj.updateDynamic("intent")(intent.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onCancel != null) __obj.updateDynamic("onCancel")(js.Any.fromFunction2((t0: /* value */ java.lang.String, t1: /* columnIndex */ js.UndefOr[scala.Double]) => onCancel(t0, t1).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2((t0: /* value */ java.lang.String, t1: /* columnIndex */ js.UndefOr[scala.Double]) => onChange(t0, t1).runNow()))
    if (onConfirm != null) __obj.updateDynamic("onConfirm")(js.Any.fromFunction2((t0: /* value */ java.lang.String, t1: /* columnIndex */ js.UndefOr[scala.Double]) => onConfirm(t0, t1).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.blueprintjsTable.editableNameMod.IEditableNameProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.blueprintjsTable.mod.EditableName](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.blueprintjsTable.editableNameMod.IEditableNameProps])(children: _*)
  }
  @JSImport("@blueprintjs/table", "EditableName")
  @js.native
  object componentImport extends js.Object
  
}

