package typingsJapgolly.storybookAddonA11y.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.axeCore.mod.CheckResult
import typingsJapgolly.storybookAddonA11y.rulesMod.RulesProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Rules {
  def apply(
    rules: js.Array[CheckResult],
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    RulesProps, 
    MountedWithRawType[RulesProps, js.Object, RawMounted[RulesProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal(rules = rules.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.storybookAddonA11y.rulesMod.RulesProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.storybookAddonA11y.rulesMod.RulesProps])(children: _*)
  }
  @JSImport("@storybook/addon-a11y/dist/components/Report/Rules", "Rules")
  @js.native
  object componentImport extends js.Object
  
}

