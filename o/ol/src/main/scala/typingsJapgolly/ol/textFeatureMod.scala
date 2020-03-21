package typingsJapgolly.ol

import typingsJapgolly.ol.featureMod.ReadOptions
import typingsJapgolly.ol.featureMod.WriteOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/format/TextFeature", JSImport.Namespace)
@js.native
object textFeatureMod extends js.Object {
  @js.native
  trait TextFeature
    extends typingsJapgolly.ol.featureMod.default {
    /* protected */ def readFeatureFromText(text: String): typingsJapgolly.ol.olFeatureMod.default[typingsJapgolly.ol.geometryMod.default] = js.native
    /* protected */ def readFeatureFromText(text: String, opt_options: ReadOptions): typingsJapgolly.ol.olFeatureMod.default[typingsJapgolly.ol.geometryMod.default] = js.native
    /* protected */ def readFeaturesFromText(text: String): js.Array[typingsJapgolly.ol.olFeatureMod.default[typingsJapgolly.ol.geometryMod.default]] = js.native
    /* protected */ def readFeaturesFromText(text: String, opt_options: ReadOptions): js.Array[typingsJapgolly.ol.olFeatureMod.default[typingsJapgolly.ol.geometryMod.default]] = js.native
    /* protected */ def readGeometryFromText(text: String): typingsJapgolly.ol.geometryMod.default = js.native
    /* protected */ def readGeometryFromText(text: String, opt_options: ReadOptions): typingsJapgolly.ol.geometryMod.default = js.native
    /* protected */ def readProjectionFromText(text: String): typingsJapgolly.ol.projectionMod.default = js.native
    /* protected */ def writeFeatureText(feature: typingsJapgolly.ol.olFeatureMod.default[typingsJapgolly.ol.geometryMod.default]): String = js.native
    /* protected */ def writeFeatureText(
      feature: typingsJapgolly.ol.olFeatureMod.default[typingsJapgolly.ol.geometryMod.default],
      opt_options: WriteOptions
    ): String = js.native
    /* protected */ def writeFeaturesText(
      features: js.Array[typingsJapgolly.ol.olFeatureMod.default[typingsJapgolly.ol.geometryMod.default]]
    ): String = js.native
    /* protected */ def writeFeaturesText(
      features: js.Array[typingsJapgolly.ol.olFeatureMod.default[typingsJapgolly.ol.geometryMod.default]],
      opt_options: WriteOptions
    ): String = js.native
    /* protected */ def writeGeometryText(geometry: typingsJapgolly.ol.geometryMod.default): String = js.native
    /* protected */ def writeGeometryText(geometry: typingsJapgolly.ol.geometryMod.default, opt_options: WriteOptions): String = js.native
  }
  
  @js.native
  abstract class default () extends TextFeature
  
}

