package typingsJapgolly.leafletGeosearch

import typingsJapgolly.leafletGeosearch.distProvidersAlgoliaProviderMod.default
import typingsJapgolly.leafletGeosearch.distProvidersGeoApiFrProviderMod.GeoApiFrProviderOptions
import typingsJapgolly.leafletGeosearch.distProvidersGoogleProviderMod.GoogleProviderOptions
import typingsJapgolly.leafletGeosearch.distProvidersMapBoxProviderMod.MapBoxProviderOptions
import typingsJapgolly.leafletGeosearch.distProvidersOpenStreetMapProviderMod.OpenStreetMapProviderOptions
import typingsJapgolly.leafletGeosearch.distProvidersPeliasProviderMod.PeliasProviderOptions
import typingsJapgolly.leafletGeosearch.distProvidersProviderMod.ProviderOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distProvidersMod {
  
  @JSImport("leaflet-geosearch/dist/providers", "AlgoliaProvider")
  @js.native
  open class AlgoliaProvider () extends default
  
  @JSImport("leaflet-geosearch/dist/providers", "BingProvider")
  @js.native
  open class BingProvider ()
    extends typingsJapgolly.leafletGeosearch.distProvidersBingProviderMod.default
  
  @JSImport("leaflet-geosearch/dist/providers", "EsriProvider")
  @js.native
  open class EsriProvider ()
    extends typingsJapgolly.leafletGeosearch.distProvidersEsriProviderMod.default
  
  @JSImport("leaflet-geosearch/dist/providers", "GeoApiFrProvider")
  @js.native
  open class GeoApiFrProvider ()
    extends typingsJapgolly.leafletGeosearch.distProvidersGeoApiFrProviderMod.default {
    def this(options: GeoApiFrProviderOptions) = this()
  }
  
  @JSImport("leaflet-geosearch/dist/providers", "GeocodeEarthProvider")
  @js.native
  open class GeocodeEarthProvider ()
    extends typingsJapgolly.leafletGeosearch.distProvidersGeocodeEarthProviderMod.default {
    def this(options: PeliasProviderOptions) = this()
  }
  
  @JSImport("leaflet-geosearch/dist/providers", "GoogleProvider")
  @js.native
  open class GoogleProvider protected ()
    extends typingsJapgolly.leafletGeosearch.distProvidersGoogleProviderMod.default {
    def this(options: GoogleProviderOptions) = this()
  }
  
  @JSImport("leaflet-geosearch/dist/providers", "LegacyGoogleProvider")
  @js.native
  open class LegacyGoogleProvider ()
    extends typingsJapgolly.leafletGeosearch.distProvidersLegacyGoogleProviderMod.default
  
  @JSImport("leaflet-geosearch/dist/providers", "LocationIQProvider")
  @js.native
  open class LocationIQProvider protected ()
    extends typingsJapgolly.leafletGeosearch.distProvidersLocationIQProviderMod.default {
    def this(options: OpenStreetMapProviderOptions) = this()
  }
  
  @JSImport("leaflet-geosearch/dist/providers", "MapBoxProvider")
  @js.native
  open class MapBoxProvider ()
    extends typingsJapgolly.leafletGeosearch.distProvidersMapBoxProviderMod.default {
    def this(options: MapBoxProviderOptions) = this()
  }
  
  @JSImport("leaflet-geosearch/dist/providers", "OpenCageProvider")
  @js.native
  open class OpenCageProvider ()
    extends typingsJapgolly.leafletGeosearch.distProvidersOpenCageProviderMod.default
  
  @JSImport("leaflet-geosearch/dist/providers", "OpenStreetMapProvider")
  @js.native
  open class OpenStreetMapProvider ()
    extends typingsJapgolly.leafletGeosearch.distProvidersOpenStreetMapProviderMod.default {
    def this(options: OpenStreetMapProviderOptions) = this()
  }
  
  @JSImport("leaflet-geosearch/dist/providers", "PeliasProvider")
  @js.native
  open class PeliasProvider ()
    extends typingsJapgolly.leafletGeosearch.distProvidersPeliasProviderMod.default {
    def this(options: PeliasProviderOptions) = this()
  }
  
  /* note: abstract class */ @JSImport("leaflet-geosearch/dist/providers", "Provider")
  @js.native
  open class Provider[TRequestResult, TRawResult] ()
    extends typingsJapgolly.leafletGeosearch.distProvidersProviderMod.default[TRequestResult, TRawResult] {
    def this(options: ProviderOptions) = this()
  }
}
