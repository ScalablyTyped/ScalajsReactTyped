package typingsJapgolly.reactFinalFormListeners.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactFinalFormListeners.mod.OnChangeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object OnChange {
  def apply(
    name: String,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: (js.Any, js.Any) => Callback
  ): UnmountedSimple[
    OnChangeProps, 
    MountedWithRawType[OnChangeProps, js.Object, RawMounted[OnChangeProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
  
      __obj.updateDynamic("children")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => children(t0, t1).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.reactFinalFormListeners.mod.OnChangeProps, 
  japgolly.scalajs.react.Children.None, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactFinalFormListeners.mod.OnChangeProps])
  }
  @JSImport("react-final-form-listeners", "OnChange")
  @js.native
  object componentImport extends js.Object
  
}

