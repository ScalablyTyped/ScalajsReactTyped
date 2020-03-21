package typingsJapgolly.reactFinalFormListeners.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactFinalFormListeners.mod.OnBlurProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object OnBlur {
  def apply(
    name: String,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: Callback
  ): UnmountedSimple[
    OnBlurProps, 
    MountedWithRawType[OnBlurProps, js.Object, RawMounted[OnBlurProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
  
      __obj.updateDynamic("children")(children.toJsFn)
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.reactFinalFormListeners.mod.OnBlurProps, 
  japgolly.scalajs.react.Children.None, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactFinalFormListeners.mod.OnBlurProps])
  }
  @JSImport("react-final-form-listeners", "OnBlur")
  @js.native
  object componentImport extends js.Object
  
}

