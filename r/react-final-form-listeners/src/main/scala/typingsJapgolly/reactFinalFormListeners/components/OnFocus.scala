package typingsJapgolly.reactFinalFormListeners.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactFinalFormListeners.mod.OnFocusProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object OnFocus {
  def apply(
    name: String,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: Callback
  ): UnmountedSimple[
    OnFocusProps, 
    MountedWithRawType[OnFocusProps, js.Object, RawMounted[OnFocusProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
  
      __obj.updateDynamic("children")(children.toJsFn)
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.reactFinalFormListeners.mod.OnFocusProps, 
  japgolly.scalajs.react.Children.None, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactFinalFormListeners.mod.OnFocusProps])
  }
  @JSImport("react-final-form-listeners", "OnFocus")
  @js.native
  object componentImport extends js.Object
  
}

