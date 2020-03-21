package typingsJapgolly.reactLeaflet.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.leaflet.mod.Layer
import typingsJapgolly.reactLeaflet.mod.MapLayerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. */
object MapLayer {
  def apply[P /* <: MapLayerProps */, E /* <: Layer */](
    props: P with js.Object,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    P with js.Object, 
    typingsJapgolly.reactLeaflet.mod.MapLayer[P, E], 
    Unit, 
    P with js.Object
  ] = {
    val __obj = js.Dynamic.literal()
  
      js.Dynamic.global.Object.assign(__obj, props)
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  P with js.Object, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactLeaflet.mod.MapLayer[P, E]](this.componentImport)
    f(__obj.asInstanceOf[P with js.Object])(children: _*)
  }
  @JSImport("react-leaflet", "MapLayer")
  @js.native
  object componentImport extends js.Object
  
}

