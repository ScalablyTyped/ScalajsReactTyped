package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`hide-children`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.hide
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.show
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebTileLayerProperties
  extends LayerProperties
     with ScaleRangeLayerProperties
     with RefreshableLayerProperties
     with PortalLayerProperties {
  /**
    * The attribution information for the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WebTileLayer.html#copyright)
    */
  var copyright: js.UndefOr[String] = js.undefined
  /**
    * A string of subDomain names where tiles are served to speed up tile retrieval. If subDomains are specified, the [urlTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WebTileLayer.html#urlTemplate) should include a `{subDomain}` place holder.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WebTileLayer.html#subDomains)
    */
  var subDomains: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The tiling scheme information for the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WebTileLayer.html#tileInfo)
    */
  var tileInfo: js.UndefOr[TileInfoProperties] = js.undefined
  /**
    * URL template for the hosted tiles. The `urlTemplate` should contain a `{subDomain}` place holder if [subDomains](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WebTileLayer.html#subDomains) are specified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WebTileLayer.html#urlTemplate)
    */
  var urlTemplate: js.UndefOr[String] = js.undefined
}

object WebTileLayerProperties {
  @scala.inline
  def apply(
    copyright: String = null,
    fullExtent: ExtentProperties = null,
    id: String = null,
    listMode: show | hide | `hide-children` = null,
    maxScale: Int | Double = null,
    minScale: Int | Double = null,
    opacity: Int | Double = null,
    portalItem: PortalItemProperties = null,
    refreshInterval: Int | Double = null,
    subDomains: js.Array[String] = null,
    tileInfo: TileInfoProperties = null,
    title: String = null,
    urlTemplate: String = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): WebTileLayerProperties = {
    val __obj = js.Dynamic.literal()
    if (copyright != null) __obj.updateDynamic("copyright")(copyright.asInstanceOf[js.Any])
    if (fullExtent != null) __obj.updateDynamic("fullExtent")(fullExtent.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (listMode != null) __obj.updateDynamic("listMode")(listMode.asInstanceOf[js.Any])
    if (maxScale != null) __obj.updateDynamic("maxScale")(maxScale.asInstanceOf[js.Any])
    if (minScale != null) __obj.updateDynamic("minScale")(minScale.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (portalItem != null) __obj.updateDynamic("portalItem")(portalItem.asInstanceOf[js.Any])
    if (refreshInterval != null) __obj.updateDynamic("refreshInterval")(refreshInterval.asInstanceOf[js.Any])
    if (subDomains != null) __obj.updateDynamic("subDomains")(subDomains.asInstanceOf[js.Any])
    if (tileInfo != null) __obj.updateDynamic("tileInfo")(tileInfo.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (urlTemplate != null) __obj.updateDynamic("urlTemplate")(urlTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebTileLayerProperties]
  }
}

