package typingsJapgolly.reactFinalFormListeners.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactFinalFormListeners.mod.ExternallyChangedProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ExternallyChanged {
  def apply(
    name: String,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: Boolean => CallbackTo[Node]
  ): UnmountedSimple[
    ExternallyChangedProps, 
    MountedWithRawType[ExternallyChangedProps, js.Object, RawMounted[ExternallyChangedProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
  
      __obj.updateDynamic("children")(js.Any.fromFunction1((t0: scala.Boolean) => children(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.reactFinalFormListeners.mod.ExternallyChangedProps, 
  japgolly.scalajs.react.Children.None, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactFinalFormListeners.mod.ExternallyChangedProps])
  }
  @JSImport("react-final-form-listeners", "ExternallyChanged")
  @js.native
  object componentImport extends js.Object
  
}

