package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`auto-complete-polygon`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`down-arrow`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`left-arrow`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`right-arrow`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`up-arrow`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.arrow
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.circle
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.ellipse
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.freehand
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.line
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.none
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.point
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.polygon
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.rectangle
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.triangle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureTemplateProperties extends js.Object {
  /**
    * Description of the feature template.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureTemplate.html#description)
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * Name of the default drawing tool defined for the template to create a feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureTemplate.html#drawingTool)
    */
  var drawingTool: js.UndefOr[
    `auto-complete-polygon` | circle | ellipse | freehand | line | none | point | polygon | rectangle | arrow | triangle | `left-arrow` | `right-arrow` | `up-arrow` | `down-arrow`
  ] = js.undefined
  /**
    * Name of the feature template.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureTemplate.html#name)
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * An object used to create a thumbnail image that represents a feature type in the feature template.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureTemplate.html#thumbnail)
    */
  var thumbnail: js.UndefOr[FeatureTemplateThumbnail] = js.undefined
}

object FeatureTemplateProperties {
  @scala.inline
  def apply(
    description: String = null,
    drawingTool: `auto-complete-polygon` | circle | ellipse | freehand | line | none | point | polygon | rectangle | arrow | triangle | `left-arrow` | `right-arrow` | `up-arrow` | `down-arrow` = null,
    name: String = null,
    thumbnail: FeatureTemplateThumbnail = null
  ): FeatureTemplateProperties = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (drawingTool != null) __obj.updateDynamic("drawingTool")(drawingTool.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (thumbnail != null) __obj.updateDynamic("thumbnail")(thumbnail.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureTemplateProperties]
  }
}

