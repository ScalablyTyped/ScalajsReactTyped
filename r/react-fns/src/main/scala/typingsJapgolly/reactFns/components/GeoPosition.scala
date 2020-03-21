package typingsJapgolly.reactFns.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactFns.geoPositionGeoPositionMod.GeoPositionProps
import typingsJapgolly.reactFns.typesMod.SharedRenderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object GeoPosition {
  def apply(
    component: ComponentType[GeoPositionProps | Unit] = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    render: GeoPositionProps => CallbackTo[Node] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: (js.Function1[GeoPositionProps, Node]) | Node = null
  ): UnmountedWithRoot[
    SharedRenderProps[GeoPositionProps], 
    typingsJapgolly.reactFns.mod.GeoPosition, 
    Unit, 
    SharedRenderProps[GeoPositionProps]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1((t0: typingsJapgolly.reactFns.geoPositionGeoPositionMod.GeoPositionProps) => render(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactFns.typesMod.SharedRenderProps[typingsJapgolly.reactFns.geoPositionGeoPositionMod.GeoPositionProps], 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.reactFns.mod.GeoPosition](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactFns.typesMod.SharedRenderProps[typingsJapgolly.reactFns.geoPositionGeoPositionMod.GeoPositionProps]])
  }
  @JSImport("react-fns", "GeoPosition")
  @js.native
  object componentImport extends js.Object
  
}

