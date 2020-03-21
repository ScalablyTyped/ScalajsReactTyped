package typingsJapgolly.storybookComponents.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.storybookComponents.tooltipNoteMod.TooltipNoteProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TooltipNote {
  def apply(
    note: String,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    TooltipNoteProps, 
    MountedWithRawType[TooltipNoteProps, js.Object, RawMounted[TooltipNoteProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal(note = note.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.storybookComponents.tooltipNoteMod.TooltipNoteProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.storybookComponents.tooltipNoteMod.TooltipNoteProps])(children: _*)
  }
  @JSImport("@storybook/components", "TooltipNote")
  @js.native
  object componentImport extends js.Object
  
}

