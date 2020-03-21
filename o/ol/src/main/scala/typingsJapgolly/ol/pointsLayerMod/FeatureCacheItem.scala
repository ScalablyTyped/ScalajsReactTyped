package typingsJapgolly.ol.pointsLayerMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureCacheItem extends js.Object {
  var feature: typingsJapgolly.ol.olFeatureMod.default[typingsJapgolly.ol.geometryMod.default]
  var geometry: typingsJapgolly.ol.geometryMod.default
  var properties: StringDictionary[js.Any]
}

object FeatureCacheItem {
  @scala.inline
  def apply(
    feature: typingsJapgolly.ol.olFeatureMod.default[typingsJapgolly.ol.geometryMod.default],
    geometry: typingsJapgolly.ol.geometryMod.default,
    properties: StringDictionary[js.Any]
  ): FeatureCacheItem = {
    val __obj = js.Dynamic.literal(feature = feature.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FeatureCacheItem]
  }
}

