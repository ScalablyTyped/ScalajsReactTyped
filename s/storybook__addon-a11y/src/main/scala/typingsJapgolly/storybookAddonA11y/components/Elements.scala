package typingsJapgolly.storybookAddonA11y.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.axeCore.mod.NodeResult
import typingsJapgolly.storybookAddonA11y.a11YPanelMod.RuleType
import typingsJapgolly.storybookAddonA11y.elementsMod.ElementsProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Elements {
  def apply(
    elements: js.Array[NodeResult],
    `type`: RuleType,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    ElementsProps, 
    MountedWithRawType[ElementsProps, js.Object, RawMounted[ElementsProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
  
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.storybookAddonA11y.elementsMod.ElementsProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.storybookAddonA11y.elementsMod.ElementsProps])(children: _*)
  }
  @JSImport("@storybook/addon-a11y/dist/components/Report/Elements", "Elements")
  @js.native
  object componentImport extends js.Object
  
}

