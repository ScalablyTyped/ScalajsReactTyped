package typingsJapgolly.leafletGeosearch

import typingsJapgolly.leaflet.mod.Control_
import typingsJapgolly.leafletGeosearch.distProvidersAlgoliaProviderMod.default
import typingsJapgolly.leafletGeosearch.distProvidersGeoApiFrProviderMod.GeoApiFrProviderOptions
import typingsJapgolly.leafletGeosearch.distProvidersGoogleProviderMod.GoogleProviderOptions
import typingsJapgolly.leafletGeosearch.distProvidersMapBoxProviderMod.MapBoxProviderOptions
import typingsJapgolly.leafletGeosearch.distProvidersOpenStreetMapProviderMod.OpenStreetMapProviderOptions
import typingsJapgolly.leafletGeosearch.distProvidersPeliasProviderMod.PeliasProviderOptions
import typingsJapgolly.leafletGeosearch.distProvidersProviderMod.ProviderOptions
import typingsJapgolly.leafletGeosearch.distSearchControlMod.SearchControl
import typingsJapgolly.leafletGeosearch.distSearchElementMod.SearchElementProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("leaflet-geosearch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("leaflet-geosearch", "AlgoliaProvider")
  @js.native
  open class AlgoliaProvider () extends default
  
  @JSImport("leaflet-geosearch", "BingProvider")
  @js.native
  open class BingProvider ()
    extends typingsJapgolly.leafletGeosearch.distProvidersBingProviderMod.default
  
  @JSImport("leaflet-geosearch", "EsriProvider")
  @js.native
  open class EsriProvider ()
    extends typingsJapgolly.leafletGeosearch.distProvidersEsriProviderMod.default
  
  @JSImport("leaflet-geosearch", "GeoApiFrProvider")
  @js.native
  open class GeoApiFrProvider ()
    extends typingsJapgolly.leafletGeosearch.distProvidersGeoApiFrProviderMod.default {
    def this(options: GeoApiFrProviderOptions) = this()
  }
  
  inline def GeoSearchControl(options: Any*): SearchControl & Control_ = ^.asInstanceOf[js.Dynamic].applyDynamic("GeoSearchControl")(options.asInstanceOf[Seq[js.Any]]*).asInstanceOf[SearchControl & Control_]
  
  @JSImport("leaflet-geosearch", "GeocodeEarthProvider")
  @js.native
  open class GeocodeEarthProvider ()
    extends typingsJapgolly.leafletGeosearch.distProvidersGeocodeEarthProviderMod.default {
    def this(options: PeliasProviderOptions) = this()
  }
  
  @JSImport("leaflet-geosearch", "GoogleProvider")
  @js.native
  open class GoogleProvider protected ()
    extends typingsJapgolly.leafletGeosearch.distProvidersGoogleProviderMod.default {
    def this(options: GoogleProviderOptions) = this()
  }
  
  @JSImport("leaflet-geosearch", "HereProvider")
  @js.native
  open class HereProvider ()
    extends typingsJapgolly.leafletGeosearch.distProvidersHereProviderMod.default
  
  /* note: abstract class */ @JSImport("leaflet-geosearch", "JsonProvider")
  @js.native
  open class JsonProvider[TRequestResult, TRawResult] ()
    extends typingsJapgolly.leafletGeosearch.distProvidersProviderMod.default[TRequestResult, TRawResult] {
    def this(options: ProviderOptions) = this()
  }
  
  @JSImport("leaflet-geosearch", "LegacyGoogleProvider")
  @js.native
  open class LegacyGoogleProvider ()
    extends typingsJapgolly.leafletGeosearch.distProvidersLegacyGoogleProviderMod.default
  
  @JSImport("leaflet-geosearch", "LocationIQProvider")
  @js.native
  open class LocationIQProvider protected ()
    extends typingsJapgolly.leafletGeosearch.distProvidersLocationIQProviderMod.default {
    def this(options: OpenStreetMapProviderOptions) = this()
  }
  
  @JSImport("leaflet-geosearch", "MapBoxProvider")
  @js.native
  open class MapBoxProvider ()
    extends typingsJapgolly.leafletGeosearch.distProvidersMapBoxProviderMod.default {
    def this(options: MapBoxProviderOptions) = this()
  }
  
  @JSImport("leaflet-geosearch", "OpenCageProvider")
  @js.native
  open class OpenCageProvider ()
    extends typingsJapgolly.leafletGeosearch.distProvidersOpenCageProviderMod.default
  
  @JSImport("leaflet-geosearch", "OpenStreetMapProvider")
  @js.native
  open class OpenStreetMapProvider ()
    extends typingsJapgolly.leafletGeosearch.distProvidersOpenStreetMapProviderMod.default {
    def this(options: OpenStreetMapProviderOptions) = this()
  }
  
  @JSImport("leaflet-geosearch", "PeliasProvider")
  @js.native
  open class PeliasProvider ()
    extends typingsJapgolly.leafletGeosearch.distProvidersPeliasProviderMod.default {
    def this(options: PeliasProviderOptions) = this()
  }
  
  inline def SearchControl(options: Any*): typingsJapgolly.leafletGeosearch.distSearchControlMod.SearchControl & Control_ = ^.asInstanceOf[js.Dynamic].applyDynamic("SearchControl")(options.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typingsJapgolly.leafletGeosearch.distSearchControlMod.SearchControl & Control_]
  
  @JSImport("leaflet-geosearch", "SearchElement")
  @js.native
  open class SearchElement protected ()
    extends typingsJapgolly.leafletGeosearch.distSearchElementMod.default {
    def this(hasHandleSubmitSearchLabelClassNames: SearchElementProps) = this()
  }
}
