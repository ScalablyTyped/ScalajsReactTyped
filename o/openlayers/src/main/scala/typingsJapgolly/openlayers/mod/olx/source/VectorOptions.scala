package typingsJapgolly.openlayers.mod.olx.source

import japgolly.scalajs.react.Callback
import typingsJapgolly.openlayers.mod.Attribution
import typingsJapgolly.openlayers.mod.AttributionLike
import typingsJapgolly.openlayers.mod.Collection
import typingsJapgolly.openlayers.mod.Extent_
import typingsJapgolly.openlayers.mod.Feature
import typingsJapgolly.openlayers.mod.FeatureLoader_
import typingsJapgolly.openlayers.mod.FeatureUrlFunction
import typingsJapgolly.openlayers.mod.LoadingStrategy_
import typingsJapgolly.openlayers.mod.olx.LogoOptions
import typingsJapgolly.openlayers.mod.proj.Projection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VectorOptions extends StObject {
  
  var attributions: js.UndefOr[AttributionLike] = js.undefined
  
  var features: js.UndefOr[js.Array[Feature] | Collection[Feature]] = js.undefined
  
  var format: js.UndefOr[typingsJapgolly.openlayers.mod.format.Feature] = js.undefined
  
  var loader: js.UndefOr[FeatureLoader_] = js.undefined
  
  var logo: js.UndefOr[String | LogoOptions] = js.undefined
  
  var overlaps: js.UndefOr[Boolean] = js.undefined
  
  var strategy: js.UndefOr[LoadingStrategy_] = js.undefined
  
  var url: js.UndefOr[String | FeatureUrlFunction] = js.undefined
  
  var useSpatialIndex: js.UndefOr[Boolean] = js.undefined
  
  var wrapX: js.UndefOr[Boolean] = js.undefined
}
object VectorOptions {
  
  inline def apply(): VectorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VectorOptions]
  }
  
  extension [Self <: VectorOptions](x: Self) {
    
    inline def setAttributions(value: AttributionLike): Self = StObject.set(x, "attributions", value.asInstanceOf[js.Any])
    
    inline def setAttributionsUndefined: Self = StObject.set(x, "attributions", js.undefined)
    
    inline def setAttributionsVarargs(value: (Attribution | String)*): Self = StObject.set(x, "attributions", js.Array(value*))
    
    inline def setFeatures(value: js.Array[Feature] | Collection[Feature]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    inline def setFeaturesVarargs(value: Feature*): Self = StObject.set(x, "features", js.Array(value*))
    
    inline def setFormat(value: typingsJapgolly.openlayers.mod.format.Feature): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setLoader(value: (/* extent */ Extent_, /* resolution */ Double, /* proj */ Projection) => Callback): Self = StObject.set(x, "loader", js.Any.fromFunction3((t0: /* extent */ Extent_, t1: /* resolution */ Double, t2: /* proj */ Projection) => (value(t0, t1, t2)).runNow()))
    
    inline def setLoaderUndefined: Self = StObject.set(x, "loader", js.undefined)
    
    inline def setLogo(value: String | LogoOptions): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
    
    inline def setLogoUndefined: Self = StObject.set(x, "logo", js.undefined)
    
    inline def setOverlaps(value: Boolean): Self = StObject.set(x, "overlaps", value.asInstanceOf[js.Any])
    
    inline def setOverlapsUndefined: Self = StObject.set(x, "overlaps", js.undefined)
    
    inline def setStrategy(value: (/* extent */ Extent_, /* resolution */ Double) => js.Array[Extent_]): Self = StObject.set(x, "strategy", js.Any.fromFunction2(value))
    
    inline def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
    
    inline def setUrl(value: String | FeatureUrlFunction): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlFunction3(value: (/* extent */ Extent_, /* resolution */ Double, /* proj */ Projection) => String): Self = StObject.set(x, "url", js.Any.fromFunction3(value))
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setUseSpatialIndex(value: Boolean): Self = StObject.set(x, "useSpatialIndex", value.asInstanceOf[js.Any])
    
    inline def setUseSpatialIndexUndefined: Self = StObject.set(x, "useSpatialIndex", js.undefined)
    
    inline def setWrapX(value: Boolean): Self = StObject.set(x, "wrapX", value.asInstanceOf[js.Any])
    
    inline def setWrapXUndefined: Self = StObject.set(x, "wrapX", js.undefined)
  }
}
