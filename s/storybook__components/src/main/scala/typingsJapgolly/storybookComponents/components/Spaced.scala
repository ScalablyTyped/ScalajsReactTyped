package typingsJapgolly.storybookComponents.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.storybookComponents.spacedMod.SpacedProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Spaced {
  def apply(
    col: Int | Double = null,
    outer: Double | Boolean = null,
    row: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    SpacedProps, 
    MountedWithRawType[SpacedProps, js.Object, RawMounted[SpacedProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (col != null) __obj.updateDynamic("col")(col.asInstanceOf[js.Any])
    if (outer != null) __obj.updateDynamic("outer")(outer.asInstanceOf[js.Any])
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.storybookComponents.spacedMod.SpacedProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.storybookComponents.spacedMod.SpacedProps])(children: _*)
  }
  @JSImport("@storybook/components", "Spaced")
  @js.native
  object componentImport extends js.Object
  
}

