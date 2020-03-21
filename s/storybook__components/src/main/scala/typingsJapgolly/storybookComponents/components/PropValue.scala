package typingsJapgolly.storybookComponents.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.storybookComponents.propDefMod.PropSummaryValue
import typingsJapgolly.storybookComponents.propValueMod.PropValueProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PropValue {
  def apply(
    value: PropSummaryValue = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    PropValueProps, 
    MountedWithRawType[PropValueProps, js.Object, RawMounted[PropValueProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.storybookComponents.propValueMod.PropValueProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.storybookComponents.propValueMod.PropValueProps])(children: _*)
  }
  @JSImport("@storybook/components/dist/blocks/PropsTable/PropValue", "PropValue")
  @js.native
  object componentImport extends js.Object
  
}

