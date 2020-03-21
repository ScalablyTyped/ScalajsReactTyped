package typingsJapgolly.reactGoogleMapsLoader.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactGoogleMapsLoader.mod.ReactGoogleMapsLoader.GoogleMaps
import typingsJapgolly.reactGoogleMapsLoader.mod.ReactGoogleMapsLoader.Params
import typingsJapgolly.reactGoogleMapsLoader.mod.ReactGoogleMapsLoader.Props
import typingsJapgolly.reactGoogleMapsLoader.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactGoogleMapsLoader {
  def apply(
    params: Params,
    render: (GoogleMaps, js.UndefOr[String]) => CallbackTo[Node],
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[Props, default, Unit, Props] = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
  
      __obj.updateDynamic("render")(js.Any.fromFunction2((t0: typingsJapgolly.reactGoogleMapsLoader.mod.ReactGoogleMapsLoader.GoogleMaps, t1: js.UndefOr[java.lang.String]) => render(t0, t1).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactGoogleMapsLoader.mod.ReactGoogleMapsLoader.Props, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactGoogleMapsLoader.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactGoogleMapsLoader.mod.ReactGoogleMapsLoader.Props])(children: _*)
  }
  @JSImport("react-google-maps-loader", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

