package typingsJapgolly.storybookComponents.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.storybookComponents.propDefMod.PropDef
import typingsJapgolly.storybookComponents.propRowMod.PropRowProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PropRow {
  def apply(
    row: PropDef,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    PropRowProps, 
    MountedWithRawType[PropRowProps, js.Object, RawMounted[PropRowProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal(row = row.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.storybookComponents.propRowMod.PropRowProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.storybookComponents.propRowMod.PropRowProps])(children: _*)
  }
  @JSImport("@storybook/components/dist/blocks/PropsTable/PropRow", "PropRow")
  @js.native
  object componentImport extends js.Object
  
}

