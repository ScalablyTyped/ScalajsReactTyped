package typingsJapgolly.ol

import typingsJapgolly.ol.esriJSONMod.Options
import typingsJapgolly.ol.esriJSONMod.default
import typingsJapgolly.ol.iiifinfoMod.ImageInformationResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/format", JSImport.Namespace)
@js.native
object formatMod extends js.Object {
  @js.native
  class EsriJSON () extends default {
    def this(opt_options: Options) = this()
  }
  
  @js.native
  class GPX ()
    extends typingsJapgolly.ol.gpxMod.default {
    def this(opt_options: typingsJapgolly.ol.gpxMod.Options) = this()
  }
  
  @js.native
  class GeoJSON ()
    extends typingsJapgolly.ol.geoJSONMod.default {
    def this(opt_options: typingsJapgolly.ol.geoJSONMod.Options) = this()
  }
  
  @js.native
  class IGC ()
    extends typingsJapgolly.ol.igcMod.default {
    def this(opt_options: typingsJapgolly.ol.igcMod.Options) = this()
  }
  
  @js.native
  class IIIFInfo protected ()
    extends typingsJapgolly.ol.iiifinfoMod.default {
    def this(imageInfo: String) = this()
    def this(imageInfo: ImageInformationResponse) = this()
  }
  
  @js.native
  class KML ()
    extends typingsJapgolly.ol.kmlMod.default {
    def this(opt_options: typingsJapgolly.ol.kmlMod.Options) = this()
  }
  
  @js.native
  class MVT ()
    extends typingsJapgolly.ol.mvtMod.default {
    def this(opt_options: typingsJapgolly.ol.mvtMod.Options) = this()
  }
  
  @js.native
  class OWS ()
    extends typingsJapgolly.ol.owsMod.default
  
  @js.native
  class Polyline ()
    extends typingsJapgolly.ol.polylineMod.default {
    def this(opt_options: typingsJapgolly.ol.polylineMod.Options) = this()
  }
  
  @js.native
  class TopoJSON ()
    extends typingsJapgolly.ol.topoJSONMod.default {
    def this(opt_options: typingsJapgolly.ol.topoJSONMod.Options) = this()
  }
  
  @js.native
  class WFS ()
    extends typingsJapgolly.ol.wfsMod.default {
    def this(opt_options: typingsJapgolly.ol.wfsMod.Options) = this()
  }
  
  @js.native
  class WKT ()
    extends typingsJapgolly.ol.wktMod.default {
    def this(opt_options: typingsJapgolly.ol.wktMod.Options) = this()
  }
  
  @js.native
  class WMSCapabilities ()
    extends typingsJapgolly.ol.wmscapabilitiesMod.default
  
  @js.native
  class WMSGetFeatureInfo ()
    extends typingsJapgolly.ol.wmsgetfeatureinfoMod.default {
    def this(opt_options: typingsJapgolly.ol.wmsgetfeatureinfoMod.Options) = this()
  }
  
  @js.native
  class WMTSCapabilities ()
    extends typingsJapgolly.ol.wmtscapabilitiesMod.default
  
  def GML(): Unit = js.native
  def GML(opt_options: typingsJapgolly.ol.gmlbaseMod.Options): Unit = js.native
}

