package typingsJapgolly.arcgisJsApi.featureLayerMod

import typingsJapgolly.arcgisJsApi.esri.FeatureLayer
import typingsJapgolly.arcgisJsApi.esri.FeatureLayerProperties
import typingsJapgolly.arcgisJsApi.esri.PortalItem
import typingsJapgolly.arcgisJsApi.esri.TimeExtent
import typingsJapgolly.arcgisJsApi.esri.TimeInfo
import typingsJapgolly.arcgisJsApi.esri.TimeInterval
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/layers/FeatureLayer", JSImport.Namespace)
@js.native
/**
  * A FeatureLayer is a single layer that can be created from a [Map Service](http://server.arcgis.com/en/server/latest/publish-services/windows/what-is-a-map-service.htm) or [Feature Service](http://server.arcgis.com/en/server/latest/publish-services/windows/what-is-a-feature-service-.htm); ArcGIS Online or ArcGIS Enterprise portal items; or from an array of client-side features. The layer can be either a spatial (has geographic features) or non-spatial (table).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html)
  */
class Class () extends FeatureLayer {
  def this(properties: FeatureLayerProperties) = this()
  /**
    * The maximum scale (most zoomed in) at which the layer is visible in the view. If the map is zoomed in beyond this scale, the layer will not be visible. A value of `0` means the layer does not have a maximum scale. The maxScale value should always be smaller than the [minScale](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ScaleRangeLayer.html#minScale) value, and greater than or equal to the service specification.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ScaleRangeLayer.html#maxScale)
    *
    * @default 0
    */
  /* CompleteClass */
  override var maxScale: Double = js.native
  /**
    * The minimum scale (most zoomed out) at which the layer is visible in the view. If the map is zoomed out beyond this scale, the layer will not be visible. A value of `0` means the layer does not have a minimum scale. The minScale value should always be larger than the [maxScale](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ScaleRangeLayer.html#maxScale) value, and lesser than or equal to the service specification.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ScaleRangeLayer.html#minScale)
    *
    * @default 0
    */
  /* CompleteClass */
  override var minScale: Double = js.native
  /**
    * The portal item from which the layer is loaded. If the portal item references a Feature Service or Scene Service, then you can specify a single layer to load with the [layerId](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-PortalLayer.html#layerId) property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-PortalLayer.html#portalItem)
    */
  /* CompleteClass */
  override var portalItem: PortalItem = js.native
  /**
    * Refresh interval of the layer in minutes. Value of `0` indicates no refresh.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-RefreshableLayer.html#refreshInterval)
    *
    * @default 0
    */
  /* CompleteClass */
  override var refreshInterval: Double = js.native
  /**
    * The layer's time extent. When the layer's [useViewTime](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-TemporalLayer.html#useViewTime) is `false`, the layer instructs the view to show data from the layer based on this time extent. If the `useViewTime` is `true`, then this property has no effect on the layer, because the layer will show the data within the view's [timeExtent](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#timeExtent) property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-TemporalLayer.html#timeExtent)
    *
    * @default null
    */
  /* CompleteClass */
  override var timeExtent: TimeExtent = js.native
  /**
    * TimeInfo provides information such as date fields that store [start](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#startField) and [end](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#endField) time for each feature and the [fullTimeExtent](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#fullTimeExtent) for the layer. The `timeInfo` property, along with its `startField` and `endField` properties, must be set at the time of layer initialization if it is being set for a [GeoJSONLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html), [CSVLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html) or [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) initialized from [client-side features](esri-layers-FeatureLayer.html#creating-a-featurelayer). The [fullTimeExtent](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#fullTimeExtent) for `timeInfo` is automatically calculated based on its `startField` and `endField` properties. The timeInfo parameters cannot be changed after the layer is [loaded](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#load).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-TemporalLayer.html#timeInfo)
    *
    * @default null
    */
  /* CompleteClass */
  override var timeInfo: TimeInfo = js.native
  /**
    * A temporary offset of the time data based on a certain [TimeInterval](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeInterval.html). This allows users to overlay features from two or more time-aware layers with different time extents. For example, if a layer has data recorded for the year 1970, an offset value of 2 years would temporarily shift the data to 1972. You can then overlay this data with data recorded in 1972. A time offset can be used for display purposes only. The query and selection are not affected by the offset.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-TemporalLayer.html#timeOffset)
    *
    * @default null
    */
  /* CompleteClass */
  override var timeOffset: TimeInterval = js.native
  /**
    * Determines if the layer will update its temporal data based on the view's current [timeExtent](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#timeExtent). When `false`, the layer will display its temporal data based on the layer's [timeExtent](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-TemporalLayer.html#timeExtent), regardless of changes to the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-TemporalLayer.html#useViewTime)
    *
    * @default true
    */
  /* CompleteClass */
  override var useViewTime: Boolean = js.native
  /**
    * Fetches all the data for the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-RefreshableLayer.html#refresh)
    *
    *
    */
  /* CompleteClass */
  override def refresh(): Unit = js.native
}

