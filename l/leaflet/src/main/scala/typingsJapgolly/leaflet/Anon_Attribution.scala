package typingsJapgolly.leaflet

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable3
import typingsJapgolly.leaflet.leafletMod.Control
import typingsJapgolly.leaflet.leafletMod.Control.AttributionOptions
import typingsJapgolly.leaflet.leafletMod.Control.LayersObject
import typingsJapgolly.leaflet.leafletMod.Control.LayersOptions
import typingsJapgolly.leaflet.leafletMod.Control.ScaleOptions
import typingsJapgolly.leaflet.leafletMod.Control.ZoomOptions
import typingsJapgolly.leaflet.leafletMod.ControlOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Attribution
  extends Instantiable0[Control]
     with Instantiable1[/* options */ ControlOptions, Control] {
  var Attribution: Instantiable1[
    js.UndefOr[/* options */ AttributionOptions], 
    typingsJapgolly.leaflet.leafletMod.Control.Attribution
  ] = js.native
  var Layers: Instantiable3[
    js.UndefOr[/* baseLayers */ LayersObject], 
    js.UndefOr[/* overlays */ LayersObject], 
    js.UndefOr[/* options */ LayersOptions], 
    typingsJapgolly.leaflet.leafletMod.Control.Layers
  ] = js.native
  var Scale: Instantiable1[
    js.UndefOr[/* options */ ScaleOptions], 
    typingsJapgolly.leaflet.leafletMod.Control.Scale
  ] = js.native
  var Zoom: Instantiable1[
    js.UndefOr[/* options */ ZoomOptions], 
    typingsJapgolly.leaflet.leafletMod.Control.Zoom
  ] = js.native
  def extend[T /* <: js.Object */](props: T): Anon_ArgsAny[T] with (/* import warning: importer.ImportType#apply Failed type conversion: typeof Control */ js.Any) = js.native
}

