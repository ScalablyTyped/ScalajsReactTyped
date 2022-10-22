package typingsJapgolly.arcgisJsApi.global.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`color-burn`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`color-dodge`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`destination-atop`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`destination-in`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`destination-out`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`destination-over`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`hard-light`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`soft-light`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`source-atop`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`source-in`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`source-out`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`vivid-light`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.average
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.darken
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.difference
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.exclusion
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.hue
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.invert
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.lighten
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.lighter
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.luminosity
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.minus
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.multiply
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.normal
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.overlay
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.plus
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.reflect
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.saturation
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.screen
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.xor
import typingsJapgolly.arcgisJsApi.esri.Effect
import typingsJapgolly.arcgisJsApi.esri.OGCFeatureLayerProperties
import typingsJapgolly.arcgisJsApi.esri.OrderedLayerOrderBy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("__esri.OGCFeatureLayer")
@js.native
/**
  * The OGCFeatureLayer class is used to create a layer based on individual collections from a [OGC API Features](https://www.opengeospatial.org/standards/ogcapi-features) service.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-OGCFeatureLayer.html)
  */
open class OGCFeatureLayerCls ()
  extends StObject
     with typingsJapgolly.arcgisJsApi.esri.OGCFeatureLayer {
  def this(properties: OGCFeatureLayerProperties) = this()
  
  /**
    * An authorization string used to access a resource or service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-APIKeyMixin.html#apiKey)
    */
  /* CompleteClass */
  var apiKey: String = js.native
  
  /**
    * Blend modes are used to blend layers together to create an interesting effect in a layer, or even to produce what seems like a new layer.
    *
    * @default normal
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-BlendLayer.html#blendMode)
    */
  /* CompleteClass */
  var blendMode: average | `color-burn` | `color-dodge` | typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.color | darken | `destination-atop` | `destination-in` | `destination-out` | `destination-over` | difference | exclusion | `hard-light` | hue | invert | lighten | lighter | luminosity | minus | multiply | normal | overlay | plus | reflect | saturation | screen | `soft-light` | `source-atop` | `source-in` | `source-out` | `vivid-light` | xor = js.native
  
  /**
    * A list of custom parameters appended to the URL of all resources fetched by the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-CustomParametersMixin.html#customParameters)
    */
  /* CompleteClass */
  var customParameters: Any = js.native
  
  /**
    * Effect provides various filter functions that can be performed on the layer to achieve different visual effects similar to how image filters work.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-BlendLayer.html#effect)
    */
  /* CompleteClass */
  var effect: Effect = js.native
  
  /**
    * The featureEffect can be used to draw attention features of interest.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureEffectLayer.html#featureEffect)
    */
  /* CompleteClass */
  var featureEffect: typingsJapgolly.arcgisJsApi.esri.FeatureEffect = js.native
  
  /**
    * The maximum scale (most zoomed in) at which the layer is visible in the view.
    *
    * @default 0
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ScaleRangeLayer.html#maxScale)
    */
  /* CompleteClass */
  var maxScale: Double = js.native
  
  /**
    * The minimum scale (most zoomed out) at which the layer is visible in the view.
    *
    * @default 0
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ScaleRangeLayer.html#minScale)
    */
  /* CompleteClass */
  var minScale: Double = js.native
  
  /**
    * Determines the order in which features are drawn in the view.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-OrderedLayer.html#orderBy)
    */
  /* CompleteClass */
  var orderBy: js.Array[OrderedLayerOrderBy] = js.native
  
  /**
    * The portal item from which the layer is loaded.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-PortalLayer.html#portalItem)
    */
  /* CompleteClass */
  var portalItem: typingsJapgolly.arcgisJsApi.esri.PortalItem = js.native
  
  /**
    * Fetches all the data for the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-RefreshableLayer.html#refresh)
    */
  /* CompleteClass */
  override def refresh(): Unit = js.native
  
  /**
    * Refresh interval of the layer in minutes.
    *
    * @default 0
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-RefreshableLayer.html#refreshInterval)
    */
  /* CompleteClass */
  var refreshInterval: Double = js.native
}
