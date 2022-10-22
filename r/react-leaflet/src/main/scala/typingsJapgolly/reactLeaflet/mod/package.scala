package typingsJapgolly.reactLeaflet.mod

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.leaflet.mod.Control_.AttributionOptions
import typingsJapgolly.leaflet.mod.Control_.ScaleOptions
import typingsJapgolly.leaflet.mod.Control_.ZoomOptions
import typingsJapgolly.leaflet.mod.LatLngBounds_
import typingsJapgolly.leaflet.mod.LatLng_
import typingsJapgolly.leaflet.mod.Layer
import typingsJapgolly.leaflet.mod.Point_
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.Consumer
import typingsJapgolly.react.mod.Provider
import typingsJapgolly.reactLeaflet.mod.^
import typingsJapgolly.reactLeaflet.reactLeafletStrings.leaflet
import typingsJapgolly.std.Exclude
import typingsJapgolly.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def LeafletConsumer: Consumer[LeafletContext] = ^.asInstanceOf[js.Dynamic].selectDynamic("LeafletConsumer").asInstanceOf[Consumer[LeafletContext]]

inline def LeafletProvider: Provider[LeafletContext] = ^.asInstanceOf[js.Dynamic].selectDynamic("LeafletProvider").asInstanceOf[Provider[LeafletContext]]

inline def useLeaflet(): LeafletContext = ^.asInstanceOf[js.Dynamic].applyDynamic("useLeaflet")().asInstanceOf[LeafletContext]

inline def withLeaflet[T /* <: ContextProps */](WrappedComponent: ComponentType[T]): ComponentType[Omit[T, leaflet]] = ^.asInstanceOf[js.Dynamic].applyDynamic("withLeaflet")(WrappedComponent.asInstanceOf[js.Any]).asInstanceOf[ComponentType[Omit[T, leaflet]]]

type AddLayerHandler = js.Function3[/* layer */ Layer, /* name */ String, /* checked */ js.UndefOr[Boolean], Unit]

type AttributionControlProps = AttributionOptions & MapControlProps

type Children = Node | js.Array[Node]

type LatLng = LatLng_ | js.Array[Double] | js.Object

type LatLngBounds = LatLngBounds_ | js.Array[LatLng]

type Omit[T, K /* <: /* keyof T */ String */] = Pick[T, Exclude[/* keyof T */ String, K]]

type Point = (js.Tuple2[Double, Double]) | Point_

type RemoveLayerHandler = js.Function1[/* layer */ Layer, Unit]

type ScaleControlProps = ScaleOptions & MapControlProps

type ZoomControlProps = ZoomOptions & MapControlProps
