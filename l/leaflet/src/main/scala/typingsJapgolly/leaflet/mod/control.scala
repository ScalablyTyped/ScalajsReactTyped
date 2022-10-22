package typingsJapgolly.leaflet.mod

import typingsJapgolly.leaflet.mod.Control_.Attribution
import typingsJapgolly.leaflet.mod.Control_.AttributionOptions
import typingsJapgolly.leaflet.mod.Control_.Layers
import typingsJapgolly.leaflet.mod.Control_.LayersObject
import typingsJapgolly.leaflet.mod.Control_.LayersOptions
import typingsJapgolly.leaflet.mod.Control_.Scale
import typingsJapgolly.leaflet.mod.Control_.ScaleOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object control {
  
  @JSImport("leaflet", "control")
  @js.native
  val ^ : js.Any = js.native
  
  inline def attribution(): Attribution = ^.asInstanceOf[js.Dynamic].applyDynamic("attribution")().asInstanceOf[Attribution]
  inline def attribution(options: AttributionOptions): Attribution = ^.asInstanceOf[js.Dynamic].applyDynamic("attribution")(options.asInstanceOf[js.Any]).asInstanceOf[Attribution]
  
  inline def layers(): Layers = ^.asInstanceOf[js.Dynamic].applyDynamic("layers")().asInstanceOf[Layers]
  inline def layers(baseLayers: Unit, overlays: Unit, options: LayersOptions): Layers = (^.asInstanceOf[js.Dynamic].applyDynamic("layers")(baseLayers.asInstanceOf[js.Any], overlays.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Layers]
  inline def layers(baseLayers: Unit, overlays: LayersObject): Layers = (^.asInstanceOf[js.Dynamic].applyDynamic("layers")(baseLayers.asInstanceOf[js.Any], overlays.asInstanceOf[js.Any])).asInstanceOf[Layers]
  inline def layers(baseLayers: Unit, overlays: LayersObject, options: LayersOptions): Layers = (^.asInstanceOf[js.Dynamic].applyDynamic("layers")(baseLayers.asInstanceOf[js.Any], overlays.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Layers]
  inline def layers(baseLayers: LayersObject): Layers = ^.asInstanceOf[js.Dynamic].applyDynamic("layers")(baseLayers.asInstanceOf[js.Any]).asInstanceOf[Layers]
  inline def layers(baseLayers: LayersObject, overlays: Unit, options: LayersOptions): Layers = (^.asInstanceOf[js.Dynamic].applyDynamic("layers")(baseLayers.asInstanceOf[js.Any], overlays.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Layers]
  inline def layers(baseLayers: LayersObject, overlays: LayersObject): Layers = (^.asInstanceOf[js.Dynamic].applyDynamic("layers")(baseLayers.asInstanceOf[js.Any], overlays.asInstanceOf[js.Any])).asInstanceOf[Layers]
  inline def layers(baseLayers: LayersObject, overlays: LayersObject, options: LayersOptions): Layers = (^.asInstanceOf[js.Dynamic].applyDynamic("layers")(baseLayers.asInstanceOf[js.Any], overlays.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Layers]
  
  inline def scale(): Scale = ^.asInstanceOf[js.Dynamic].applyDynamic("scale")().asInstanceOf[Scale]
  inline def scale(options: ScaleOptions): Scale = ^.asInstanceOf[js.Dynamic].applyDynamic("scale")(options.asInstanceOf[js.Any]).asInstanceOf[Scale]
  
  inline def zoom(): typingsJapgolly.leaflet.mod.Control_.Zoom = ^.asInstanceOf[js.Dynamic].applyDynamic("zoom")().asInstanceOf[typingsJapgolly.leaflet.mod.Control_.Zoom]
  inline def zoom(options: typingsJapgolly.leaflet.mod.Control_.ZoomOptions): typingsJapgolly.leaflet.mod.Control_.Zoom = ^.asInstanceOf[js.Dynamic].applyDynamic("zoom")(options.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.leaflet.mod.Control_.Zoom]
}
