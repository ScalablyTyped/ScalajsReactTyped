package typingsJapgolly.materialUiCore.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Ref
import japgolly.scalajs.react.raw.React.RefHandle
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.materialUiCore.PartialClassNameMapListItRoot
import typingsJapgolly.materialUiCore.listItemSecondaryActionListItemSecondaryActionMod.ListItemSecondaryActionProps
import typingsJapgolly.materialUiCore.listItemSecondaryActionMod.default
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ListItemSecondaryAction {
  def apply(
    className: String = null,
    classes: PartialClassNameMapListItRoot = null,
    innerRef: Ref | RefHandle[_] = null,
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ListItemSecondaryActionProps, default, Unit, ListItemSecondaryActionProps] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.materialUiCore.listItemSecondaryActionListItemSecondaryActionMod.ListItemSecondaryActionProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.materialUiCore.listItemSecondaryActionMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.materialUiCore.listItemSecondaryActionListItemSecondaryActionMod.ListItemSecondaryActionProps])(children: _*)
  }
  @JSImport("@material-ui/core/ListItemSecondaryAction", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

