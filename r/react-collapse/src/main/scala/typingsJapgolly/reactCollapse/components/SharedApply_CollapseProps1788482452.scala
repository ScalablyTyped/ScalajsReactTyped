package typingsJapgolly.reactCollapse.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.reactCollapse.AnonCollapse
import typingsJapgolly.reactCollapse.AnonHeight
import typingsJapgolly.reactCollapse.mod.CollapseCallbackArgs
import typingsJapgolly.reactCollapse.mod.CollapseProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_CollapseProps1788482452[ComponentRef] () {
  val componentImport: js.Any
  def apply(
    isOpened: Boolean,
    AllHTMLAttributes: AllHTMLAttributes[typingsJapgolly.reactCollapse.mod.Collapse] = null,
    ClassAttributes: ClassAttributes[typingsJapgolly.reactCollapse.mod.Collapse] = null,
    checkTimeout: Int | Double = null,
    initialStyle: AnonHeight = null,
    onRest: /* args */ CollapseCallbackArgs => Callback = null,
    onWork: /* args */ CollapseCallbackArgs => Callback = null,
    theme: AnonCollapse = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[CollapseProps, ComponentRef, Unit, CollapseProps] = {
    val __obj = js.Dynamic.literal(isOpened = isOpened.asInstanceOf[js.Any])
  
      if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (checkTimeout != null) __obj.updateDynamic("checkTimeout")(checkTimeout.asInstanceOf[js.Any])
    if (initialStyle != null) __obj.updateDynamic("initialStyle")(initialStyle.asInstanceOf[js.Any])
    if (onRest != null) __obj.updateDynamic("onRest")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.reactCollapse.mod.CollapseCallbackArgs) => onRest(t0).runNow()))
    if (onWork != null) __obj.updateDynamic("onWork")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.reactCollapse.mod.CollapseCallbackArgs) => onWork(t0).runNow()))
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactCollapse.mod.CollapseProps, 
  japgolly.scalajs.react.Children.Varargs, 
  ComponentRef](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactCollapse.mod.CollapseProps])(children: _*)
  }
}

