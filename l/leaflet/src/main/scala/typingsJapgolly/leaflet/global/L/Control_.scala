package typingsJapgolly.leaflet.global.L

import typingsJapgolly.leaflet.anon.InstantiableT
import typingsJapgolly.leaflet.mod.ControlOptions
import typingsJapgolly.leaflet.mod.Control_.AttributionOptions
import typingsJapgolly.leaflet.mod.Control_.LayersObject
import typingsJapgolly.leaflet.mod.Control_.LayersOptions
import typingsJapgolly.leaflet.mod.Control_.ScaleOptions
import typingsJapgolly.leaflet.mod.Control_.ZoomOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("L.Control")
@js.native
open class Control_ ()
  extends typingsJapgolly.leaflet.mod.Control_ {
  def this(options: ControlOptions) = this()
}
/* static members */
object Control_ {
  
  @JSGlobal("L.Control")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("L.Control.Attribution")
  @js.native
  open class Attribution ()
    extends typingsJapgolly.leaflet.mod.Control_.Attribution {
    def this(options: AttributionOptions) = this()
  }
  
  @JSGlobal("L.Control.Layers")
  @js.native
  open class Layers ()
    extends typingsJapgolly.leaflet.mod.Control_.Layers {
    def this(baseLayers: LayersObject) = this()
    def this(baseLayers: Unit, overlays: LayersObject) = this()
    def this(baseLayers: LayersObject, overlays: LayersObject) = this()
    def this(baseLayers: Unit, overlays: Unit, options: LayersOptions) = this()
    def this(baseLayers: Unit, overlays: LayersObject, options: LayersOptions) = this()
    def this(baseLayers: LayersObject, overlays: Unit, options: LayersOptions) = this()
    def this(baseLayers: LayersObject, overlays: LayersObject, options: LayersOptions) = this()
  }
  
  @JSGlobal("L.Control.Scale")
  @js.native
  open class Scale ()
    extends typingsJapgolly.leaflet.mod.Control_.Scale {
    def this(options: ScaleOptions) = this()
  }
  
  @JSGlobal("L.Control.Zoom")
  @js.native
  open class Zoom ()
    extends typingsJapgolly.leaflet.mod.Control_.Zoom {
    def this(options: ZoomOptions) = this()
  }
  
  inline def extend[T /* <: js.Object */](props: T): InstantiableT[T] & typingsJapgolly.leaflet.anon.Attribution = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(props.asInstanceOf[js.Any]).asInstanceOf[InstantiableT[T] & typingsJapgolly.leaflet.anon.Attribution]
}
