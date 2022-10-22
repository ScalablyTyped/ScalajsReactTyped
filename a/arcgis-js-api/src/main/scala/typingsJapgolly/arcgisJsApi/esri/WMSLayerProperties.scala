package typingsJapgolly.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WMSLayerProperties
  extends StObject
     with LayerProperties
     with BlendLayerProperties
     with PortalLayerProperties
     with ScaleRangeLayerProperties
     with RefreshableLayerProperties {
  
  /**
    * A flattened collection of all [WMSSublayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMSSublayer.html)s based on the [`sublayers`](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#sublayers) property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#allSublayers)
    */
  var allSublayers: js.UndefOr[CollectionProperties[WMSSublayerProperties]] = js.undefined
  
  /**
    * Copyright information for the WMS service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#copyright)
    */
  var copyright: js.UndefOr[String] = js.undefined
  
  /**
    * Use this to append different custom parameters to the WMS map requests.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#customLayerParameters)
    */
  var customLayerParameters: js.UndefOr[Any] = js.undefined
  
  /**
    * Use this to append custom parameters to all WMS requests.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#customParameters)
    */
  var customParameters: js.UndefOr[Any] = js.undefined
  
  /**
    * Description for the WMS layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#description)
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Return format of feature information (MIME type).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#featureInfoFormat)
    */
  var featureInfoFormat: js.UndefOr[String] = js.undefined
  
  /**
    * The URL for the WMS GetFeatureInfo call.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#featureInfoUrl)
    */
  var featureInfoUrl: js.UndefOr[String] = js.undefined
  
  /**
    * All bounding boxes defined for the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#fullExtents)
    */
  var fullExtents: js.UndefOr[js.Array[ExtentProperties]] = js.undefined
  
  /**
    * The map image format (MIME type) to request.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#imageFormat)
    */
  var imageFormat: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates the maximum height of the image exported by the service.
    *
    * @default 2048
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#imageMaxHeight)
    */
  var imageMaxHeight: js.UndefOr[Double] = js.undefined
  
  /**
    * Indicates the maximum width of the image exported by the service.
    *
    * @default 2048
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#imageMaxWidth)
    */
  var imageMaxWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * Indicates whether the background of the image exported by the service is transparent.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#imageTransparency)
    */
  var imageTransparency: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether the layer will be included in the legend.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#legendEnabled)
    */
  var legendEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The spatial reference of the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#spatialReference)
    */
  var spatialReference: js.UndefOr[SpatialReferenceProperties] = js.undefined
  
  /**
    * List of spatialReference well known ids derived from the CRS elements of the first layer in the GetCapabilities request.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#spatialReferences)
    */
  var spatialReferences: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * A subset of the layer's [WMSSublayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMSSublayer.html)s that will be displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#sublayers)
    */
  var sublayers: js.UndefOr[CollectionProperties[WMSSublayerProperties]] = js.undefined
  
  /**
    * The layer's time extent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#timeExtent)
    */
  var timeExtent: js.UndefOr[TimeExtentProperties] = js.undefined
  
  /**
    * TimeInfo provides information such as date fields that store [start](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#startField) and [end](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#endField) time for each feature and the [fullTimeExtent](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#fullTimeExtent) for the layer.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#timeInfo)
    */
  var timeInfo: js.UndefOr[TimeInfoProperties] = js.undefined
  
  /**
    * A temporary offset of the time data based on a certain [TimeInterval](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeInterval.html).
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#timeOffset)
    */
  var timeOffset: js.UndefOr[TimeIntervalProperties] = js.undefined
  
  /**
    * The URL of the WMS service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#url)
    */
  var url: js.UndefOr[String] = js.undefined
  
  /**
    * Determines if the layer will update its temporal data based on the view's [timeExtent](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#timeExtent).
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#useViewTime)
    */
  var useViewTime: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Version of the [WMS specification](http://www.opengeospatial.org/standards/wms) to use.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#version)
    */
  var version: js.UndefOr[String] = js.undefined
}
object WMSLayerProperties {
  
  inline def apply(): WMSLayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WMSLayerProperties]
  }
  
  extension [Self <: WMSLayerProperties](x: Self) {
    
    inline def setAllSublayers(value: CollectionProperties[WMSSublayerProperties]): Self = StObject.set(x, "allSublayers", value.asInstanceOf[js.Any])
    
    inline def setAllSublayersUndefined: Self = StObject.set(x, "allSublayers", js.undefined)
    
    inline def setAllSublayersVarargs(value: WMSSublayerProperties*): Self = StObject.set(x, "allSublayers", js.Array(value*))
    
    inline def setCopyright(value: String): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
    
    inline def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
    
    inline def setCustomLayerParameters(value: Any): Self = StObject.set(x, "customLayerParameters", value.asInstanceOf[js.Any])
    
    inline def setCustomLayerParametersUndefined: Self = StObject.set(x, "customLayerParameters", js.undefined)
    
    inline def setCustomParameters(value: Any): Self = StObject.set(x, "customParameters", value.asInstanceOf[js.Any])
    
    inline def setCustomParametersUndefined: Self = StObject.set(x, "customParameters", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFeatureInfoFormat(value: String): Self = StObject.set(x, "featureInfoFormat", value.asInstanceOf[js.Any])
    
    inline def setFeatureInfoFormatUndefined: Self = StObject.set(x, "featureInfoFormat", js.undefined)
    
    inline def setFeatureInfoUrl(value: String): Self = StObject.set(x, "featureInfoUrl", value.asInstanceOf[js.Any])
    
    inline def setFeatureInfoUrlUndefined: Self = StObject.set(x, "featureInfoUrl", js.undefined)
    
    inline def setFullExtents(value: js.Array[ExtentProperties]): Self = StObject.set(x, "fullExtents", value.asInstanceOf[js.Any])
    
    inline def setFullExtentsUndefined: Self = StObject.set(x, "fullExtents", js.undefined)
    
    inline def setFullExtentsVarargs(value: ExtentProperties*): Self = StObject.set(x, "fullExtents", js.Array(value*))
    
    inline def setImageFormat(value: String): Self = StObject.set(x, "imageFormat", value.asInstanceOf[js.Any])
    
    inline def setImageFormatUndefined: Self = StObject.set(x, "imageFormat", js.undefined)
    
    inline def setImageMaxHeight(value: Double): Self = StObject.set(x, "imageMaxHeight", value.asInstanceOf[js.Any])
    
    inline def setImageMaxHeightUndefined: Self = StObject.set(x, "imageMaxHeight", js.undefined)
    
    inline def setImageMaxWidth(value: Double): Self = StObject.set(x, "imageMaxWidth", value.asInstanceOf[js.Any])
    
    inline def setImageMaxWidthUndefined: Self = StObject.set(x, "imageMaxWidth", js.undefined)
    
    inline def setImageTransparency(value: Boolean): Self = StObject.set(x, "imageTransparency", value.asInstanceOf[js.Any])
    
    inline def setImageTransparencyUndefined: Self = StObject.set(x, "imageTransparency", js.undefined)
    
    inline def setLegendEnabled(value: Boolean): Self = StObject.set(x, "legendEnabled", value.asInstanceOf[js.Any])
    
    inline def setLegendEnabledUndefined: Self = StObject.set(x, "legendEnabled", js.undefined)
    
    inline def setSpatialReference(value: SpatialReferenceProperties): Self = StObject.set(x, "spatialReference", value.asInstanceOf[js.Any])
    
    inline def setSpatialReferenceUndefined: Self = StObject.set(x, "spatialReference", js.undefined)
    
    inline def setSpatialReferences(value: js.Array[Double]): Self = StObject.set(x, "spatialReferences", value.asInstanceOf[js.Any])
    
    inline def setSpatialReferencesUndefined: Self = StObject.set(x, "spatialReferences", js.undefined)
    
    inline def setSpatialReferencesVarargs(value: Double*): Self = StObject.set(x, "spatialReferences", js.Array(value*))
    
    inline def setSublayers(value: CollectionProperties[WMSSublayerProperties]): Self = StObject.set(x, "sublayers", value.asInstanceOf[js.Any])
    
    inline def setSublayersUndefined: Self = StObject.set(x, "sublayers", js.undefined)
    
    inline def setSublayersVarargs(value: WMSSublayerProperties*): Self = StObject.set(x, "sublayers", js.Array(value*))
    
    inline def setTimeExtent(value: TimeExtentProperties): Self = StObject.set(x, "timeExtent", value.asInstanceOf[js.Any])
    
    inline def setTimeExtentUndefined: Self = StObject.set(x, "timeExtent", js.undefined)
    
    inline def setTimeInfo(value: TimeInfoProperties): Self = StObject.set(x, "timeInfo", value.asInstanceOf[js.Any])
    
    inline def setTimeInfoUndefined: Self = StObject.set(x, "timeInfo", js.undefined)
    
    inline def setTimeOffset(value: TimeIntervalProperties): Self = StObject.set(x, "timeOffset", value.asInstanceOf[js.Any])
    
    inline def setTimeOffsetUndefined: Self = StObject.set(x, "timeOffset", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setUseViewTime(value: Boolean): Self = StObject.set(x, "useViewTime", value.asInstanceOf[js.Any])
    
    inline def setUseViewTimeUndefined: Self = StObject.set(x, "useViewTime", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
