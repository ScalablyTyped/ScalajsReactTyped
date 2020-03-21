package typingsJapgolly.ol.wfsMod

import typingsJapgolly.ol.extentMod.Extent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteGetFeatureOptions extends js.Object {
  var bbox: js.UndefOr[Extent] = js.undefined
  var count: js.UndefOr[Double] = js.undefined
  var featureNS: String
  var featurePrefix: String
  var featureTypes: js.Array[String]
  var filter: js.UndefOr[typingsJapgolly.ol.filterFilterMod.default] = js.undefined
  var geometryName: js.UndefOr[String] = js.undefined
  var handle: js.UndefOr[String] = js.undefined
  var maxFeatures: js.UndefOr[Double] = js.undefined
  var outputFormat: js.UndefOr[String] = js.undefined
  var propertyNames: js.UndefOr[js.Array[String]] = js.undefined
  var resultType: js.UndefOr[String] = js.undefined
  var srsName: js.UndefOr[String] = js.undefined
  var startIndex: js.UndefOr[Double] = js.undefined
  var viewParams: js.UndefOr[String] = js.undefined
}

object WriteGetFeatureOptions {
  @scala.inline
  def apply(
    featureNS: String,
    featurePrefix: String,
    featureTypes: js.Array[String],
    bbox: Extent = null,
    count: Int | Double = null,
    filter: typingsJapgolly.ol.filterFilterMod.default = null,
    geometryName: String = null,
    handle: String = null,
    maxFeatures: Int | Double = null,
    outputFormat: String = null,
    propertyNames: js.Array[String] = null,
    resultType: String = null,
    srsName: String = null,
    startIndex: Int | Double = null,
    viewParams: String = null
  ): WriteGetFeatureOptions = {
    val __obj = js.Dynamic.literal(featureNS = featureNS.asInstanceOf[js.Any], featurePrefix = featurePrefix.asInstanceOf[js.Any], featureTypes = featureTypes.asInstanceOf[js.Any])
    if (bbox != null) __obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (geometryName != null) __obj.updateDynamic("geometryName")(geometryName.asInstanceOf[js.Any])
    if (handle != null) __obj.updateDynamic("handle")(handle.asInstanceOf[js.Any])
    if (maxFeatures != null) __obj.updateDynamic("maxFeatures")(maxFeatures.asInstanceOf[js.Any])
    if (outputFormat != null) __obj.updateDynamic("outputFormat")(outputFormat.asInstanceOf[js.Any])
    if (propertyNames != null) __obj.updateDynamic("propertyNames")(propertyNames.asInstanceOf[js.Any])
    if (resultType != null) __obj.updateDynamic("resultType")(resultType.asInstanceOf[js.Any])
    if (srsName != null) __obj.updateDynamic("srsName")(srsName.asInstanceOf[js.Any])
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    if (viewParams != null) __obj.updateDynamic("viewParams")(viewParams.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteGetFeatureOptions]
  }
}

