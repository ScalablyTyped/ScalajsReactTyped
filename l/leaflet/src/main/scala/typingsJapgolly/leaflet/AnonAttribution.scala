package typingsJapgolly.leaflet

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable3
import typingsJapgolly.leaflet.mod.ControlOptions
import typingsJapgolly.leaflet.mod.Control_
import typingsJapgolly.leaflet.mod.Control_.AttributionOptions
import typingsJapgolly.leaflet.mod.Control_.LayersObject
import typingsJapgolly.leaflet.mod.Control_.LayersOptions
import typingsJapgolly.leaflet.mod.Control_.ScaleOptions
import typingsJapgolly.leaflet.mod.Control_.ZoomOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAttribution
  extends Instantiable0[Control_]
     with Instantiable1[/* options */ ControlOptions, Control_] {
  var Attribution: Instantiable1[
    js.UndefOr[/* options */ AttributionOptions], 
    typingsJapgolly.leaflet.mod.Control_.Attribution
  ] = js.native
  var Layers: Instantiable3[
    js.UndefOr[/* baseLayers */ LayersObject], 
    js.UndefOr[/* overlays */ LayersObject], 
    js.UndefOr[/* options */ LayersOptions], 
    typingsJapgolly.leaflet.mod.Control_.Layers
  ] = js.native
  var Scale: Instantiable1[js.UndefOr[/* options */ ScaleOptions], typingsJapgolly.leaflet.mod.Control_.Scale] = js.native
  var Zoom: Instantiable1[js.UndefOr[/* options */ ZoomOptions], typingsJapgolly.leaflet.mod.Control_.Zoom] = js.native
  def extend[T /* <: js.Object */](props: T): AnonInstantiableT[T] with (/* import warning: importer.ImportType#apply Failed type conversion: typeof Control */ js.Any) = js.native
}

