package typingsJapgolly.storybookComponents.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.storybookComponents.badgeMod.BadgeProps
import typingsJapgolly.storybookComponents.storybookComponentsStrings.critical
import typingsJapgolly.storybookComponents.storybookComponentsStrings.negative
import typingsJapgolly.storybookComponents.storybookComponentsStrings.neutral
import typingsJapgolly.storybookComponents.storybookComponentsStrings.positive
import typingsJapgolly.storybookComponents.storybookComponentsStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Badge {
  def apply(
    status: positive | negative | neutral | warning | critical,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    BadgeProps, 
    MountedWithRawType[BadgeProps, js.Object, RawMounted[BadgeProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.storybookComponents.badgeMod.BadgeProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.storybookComponents.badgeMod.BadgeProps])(children: _*)
  }
  @JSImport("@storybook/components", "Badge")
  @js.native
  object componentImport extends js.Object
  
}

