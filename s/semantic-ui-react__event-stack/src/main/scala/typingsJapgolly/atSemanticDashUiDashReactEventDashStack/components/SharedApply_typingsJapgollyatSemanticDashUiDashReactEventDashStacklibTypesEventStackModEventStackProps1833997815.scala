package typingsJapgolly.atSemanticDashUiDashReactEventDashStack.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.atSemanticDashUiDashReactEventDashStack.libTypesEventStackMod.EventStackProps
import typingsJapgolly.atSemanticDashUiDashReactEventDashStack.libTypesTypesMod.InputEventListener
import typingsJapgolly.atSemanticDashUiDashReactEventDashStack.libTypesTypesMod.InputTargetElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_typingsJapgollyatSemanticDashUiDashReactEventDashStacklibTypesEventStackModEventStackProps1833997815[ComponentRef] () {
  def __component: js.Any
  def apply(
    name: String,
    on: InputEventListener,
    pool: String = null,
    target: InputTargetElement = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[EventStackProps, ComponentRef, Unit, EventStackProps] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any])
  
      if (pool != null) __obj.updateDynamic("pool")(pool.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.atSemanticDashUiDashReactEventDashStack.libTypesEventStackMod.EventStackProps, 
  japgolly.scalajs.react.Children.Varargs, 
  ComponentRef](__component)
    f(__obj.asInstanceOf[typingsJapgolly.atSemanticDashUiDashReactEventDashStack.libTypesEventStackMod.EventStackProps])(children: _*)
  }
}

