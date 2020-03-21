package typingsJapgolly.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageMediaInfoProperties extends MediaInfoProperties {
  /**
    * Refresh interval of the layer in minutes. Non-zero value indicates automatic layer refresh at the specified interval. Value of `0` indicates auto refresh is not enabled. If the property does not exist, it is equivalent to having a value of `0`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-ImageMediaInfo.html#refreshInterval)
    */
  var refreshInterval: js.UndefOr[Double] = js.undefined
  /**
    * Defines the value format of the image media element and how the images should be retrieved.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-ImageMediaInfo.html#value)
    */
  var value: js.UndefOr[ImageMediaInfoValueProperties] = js.undefined
}

object ImageMediaInfoProperties {
  @scala.inline
  def apply(
    caption: String = null,
    refreshInterval: Int | Double = null,
    title: String = null,
    value: ImageMediaInfoValueProperties = null
  ): ImageMediaInfoProperties = {
    val __obj = js.Dynamic.literal()
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (refreshInterval != null) __obj.updateDynamic("refreshInterval")(refreshInterval.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageMediaInfoProperties]
  }
}

