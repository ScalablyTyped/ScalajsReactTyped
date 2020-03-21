package typingsJapgolly.reactLoaderSpinner.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactLoaderSpinner.mod.LoaderProps
import typingsJapgolly.reactLoaderSpinner.mod.Types
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactLoaderSpinner {
  def apply(
    color: String = null,
    height: Int | Double = null,
    timeout: Int | Double = null,
    `type`: Types = null,
    visible: Boolean | String = null,
    width: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    LoaderProps, 
    MountedWithRawType[LoaderProps, js.Object, RawMounted[LoaderProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (visible != null) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.reactLoaderSpinner.mod.LoaderProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactLoaderSpinner.mod.LoaderProps])(children: _*)
  }
  @JSImport("react-loader-spinner", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

