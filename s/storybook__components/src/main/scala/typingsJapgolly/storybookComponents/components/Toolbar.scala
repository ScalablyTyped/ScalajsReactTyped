package typingsJapgolly.storybookComponents.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.storybookComponents.toolbarMod.ToolbarProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Toolbar {
  def apply(
    resetZoom: Callback,
    zoom: Double => Callback,
    baseUrl: String = null,
    border: js.UndefOr[Boolean] = js.undefined,
    storyId: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    ToolbarProps, 
    MountedWithRawType[ToolbarProps, js.Object, RawMounted[ToolbarProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("resetZoom")(resetZoom.toJsFn)
    __obj.updateDynamic("zoom")(js.Any.fromFunction1((t0: scala.Double) => zoom(t0).runNow()))
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(border)) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (storyId != null) __obj.updateDynamic("storyId")(storyId.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.storybookComponents.toolbarMod.ToolbarProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.storybookComponents.toolbarMod.ToolbarProps])(children: _*)
  }
  @JSImport("@storybook/components/dist/blocks/Toolbar", "Toolbar")
  @js.native
  object componentImport extends js.Object
  
}

