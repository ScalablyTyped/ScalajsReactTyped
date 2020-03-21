package typingsJapgolly.storybookComponents.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.storybookComponents.actionBarMod.ActionBarProps
import typingsJapgolly.storybookComponents.actionBarMod.ActionItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ActionBar {
  def apply(
    actionItems: js.Array[ActionItem],
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    ActionBarProps, 
    MountedWithRawType[ActionBarProps, js.Object, RawMounted[ActionBarProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal(actionItems = actionItems.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.storybookComponents.actionBarMod.ActionBarProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.storybookComponents.actionBarMod.ActionBarProps])(children: _*)
  }
  @JSImport("@storybook/components", "ActionBar")
  @js.native
  object componentImport extends js.Object
  
}

