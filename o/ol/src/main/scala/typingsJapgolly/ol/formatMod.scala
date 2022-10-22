package typingsJapgolly.ol

import typingsJapgolly.ol.formatEsriJSONMod.Options
import typingsJapgolly.ol.formatEsriJSONMod.default
import typingsJapgolly.ol.formatIiifinfoMod.ImageInformationResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatMod {
  
  @JSImport("ol/format", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ol/format", "EsriJSON")
  @js.native
  open class EsriJSON () extends default {
    def this(opt_options: Options) = this()
  }
  
  inline def GML(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("GML")().asInstanceOf[Unit]
  inline def GML(opt_options: typingsJapgolly.ol.formatGmlbaseMod.Options): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("GML")(opt_options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("ol/format", "GPX")
  @js.native
  open class GPX ()
    extends typingsJapgolly.ol.formatGpxMod.default {
    def this(opt_options: typingsJapgolly.ol.formatGpxMod.Options) = this()
  }
  
  @JSImport("ol/format", "GeoJSON")
  @js.native
  open class GeoJSON ()
    extends typingsJapgolly.ol.formatGeoJSONMod.default {
    def this(opt_options: typingsJapgolly.ol.formatGeoJSONMod.Options) = this()
  }
  
  @JSImport("ol/format", "IGC")
  @js.native
  open class IGC ()
    extends typingsJapgolly.ol.formatIgcMod.default {
    def this(opt_options: typingsJapgolly.ol.formatIgcMod.Options) = this()
  }
  
  @JSImport("ol/format", "IIIFInfo")
  @js.native
  open class IIIFInfo protected ()
    extends typingsJapgolly.ol.formatIiifinfoMod.default {
    def this(imageInfo: String) = this()
    def this(imageInfo: ImageInformationResponse) = this()
  }
  
  @JSImport("ol/format", "KML")
  @js.native
  open class KML ()
    extends typingsJapgolly.ol.formatKmlMod.default {
    def this(opt_options: typingsJapgolly.ol.formatKmlMod.Options) = this()
  }
  
  @JSImport("ol/format", "MVT")
  @js.native
  open class MVT ()
    extends typingsJapgolly.ol.formatMvtMod.default {
    def this(opt_options: typingsJapgolly.ol.formatMvtMod.Options) = this()
  }
  
  @JSImport("ol/format", "OWS")
  @js.native
  open class OWS ()
    extends typingsJapgolly.ol.formatOwsMod.default
  
  @JSImport("ol/format", "Polyline")
  @js.native
  open class Polyline ()
    extends typingsJapgolly.ol.formatPolylineMod.default {
    def this(opt_options: typingsJapgolly.ol.formatPolylineMod.Options) = this()
  }
  
  @JSImport("ol/format", "TopoJSON")
  @js.native
  open class TopoJSON ()
    extends typingsJapgolly.ol.formatTopoJSONMod.default {
    def this(opt_options: typingsJapgolly.ol.formatTopoJSONMod.Options) = this()
  }
  
  @JSImport("ol/format", "WFS")
  @js.native
  open class WFS ()
    extends typingsJapgolly.ol.formatWfsMod.default {
    def this(opt_options: typingsJapgolly.ol.formatWfsMod.Options) = this()
  }
  
  @JSImport("ol/format", "WKT")
  @js.native
  open class WKT ()
    extends typingsJapgolly.ol.formatWktMod.default {
    def this(opt_options: typingsJapgolly.ol.formatWktMod.Options) = this()
  }
  
  @JSImport("ol/format", "WMSCapabilities")
  @js.native
  open class WMSCapabilities ()
    extends typingsJapgolly.ol.formatWmscapabilitiesMod.default
  
  @JSImport("ol/format", "WMSGetFeatureInfo")
  @js.native
  open class WMSGetFeatureInfo ()
    extends typingsJapgolly.ol.formatWmsgetfeatureinfoMod.default {
    def this(opt_options: typingsJapgolly.ol.formatWmsgetfeatureinfoMod.Options) = this()
  }
  
  @JSImport("ol/format", "WMTSCapabilities")
  @js.native
  open class WMTSCapabilities ()
    extends typingsJapgolly.ol.formatWmtscapabilitiesMod.default
}
