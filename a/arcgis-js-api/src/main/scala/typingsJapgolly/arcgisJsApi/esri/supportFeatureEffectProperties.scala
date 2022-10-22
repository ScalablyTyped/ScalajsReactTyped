package typingsJapgolly.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait supportFeatureEffectProperties extends StObject {
  
  /**
    * The [effect](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureEffect.html#Effect) applied to features that do not meet the [filter](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureEffect.html#filter) requirements.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureEffect.html#excludedEffect)
    */
  var excludedEffect: js.UndefOr[js.Array[Any] | String] = js.undefined
  
  /**
    * Indicates if labels for features that are [excluded](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureEffect.html#excludedEffect) from the effect are visible.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureEffect.html#excludedLabelsVisible)
    */
  var excludedLabelsVisible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The filter that drives the effect.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureEffect.html#filter)
    */
  var filter: js.UndefOr[FeatureFilterProperties] = js.undefined
  
  /**
    * The [effect](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureEffect.html#Effect) applied to features that meet the [filter](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureEffect.html#filter) requirements.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureEffect.html#includedEffect)
    */
  var includedEffect: js.UndefOr[js.Array[Any] | String] = js.undefined
}
object supportFeatureEffectProperties {
  
  inline def apply(): supportFeatureEffectProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[supportFeatureEffectProperties]
  }
  
  extension [Self <: supportFeatureEffectProperties](x: Self) {
    
    inline def setExcludedEffect(value: js.Array[Any] | String): Self = StObject.set(x, "excludedEffect", value.asInstanceOf[js.Any])
    
    inline def setExcludedEffectUndefined: Self = StObject.set(x, "excludedEffect", js.undefined)
    
    inline def setExcludedEffectVarargs(value: Any*): Self = StObject.set(x, "excludedEffect", js.Array(value*))
    
    inline def setExcludedLabelsVisible(value: Boolean): Self = StObject.set(x, "excludedLabelsVisible", value.asInstanceOf[js.Any])
    
    inline def setExcludedLabelsVisibleUndefined: Self = StObject.set(x, "excludedLabelsVisible", js.undefined)
    
    inline def setFilter(value: FeatureFilterProperties): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setIncludedEffect(value: js.Array[Any] | String): Self = StObject.set(x, "includedEffect", value.asInstanceOf[js.Any])
    
    inline def setIncludedEffectUndefined: Self = StObject.set(x, "includedEffect", js.undefined)
    
    inline def setIncludedEffectVarargs(value: Any*): Self = StObject.set(x, "includedEffect", js.Array(value*))
  }
}
