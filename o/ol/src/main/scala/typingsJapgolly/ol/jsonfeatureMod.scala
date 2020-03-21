package typingsJapgolly.ol

import typingsJapgolly.ol.featureMod.ReadOptions
import typingsJapgolly.ol.featureMod.WriteOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/format/JSONFeature", JSImport.Namespace)
@js.native
object jsonfeatureMod extends js.Object {
  @js.native
  trait JSONFeature
    extends typingsJapgolly.ol.featureMod.default {
    def readFeature(source: scala.scalajs.js.typedarray.ArrayBuffer): typingsJapgolly.ol.olFeatureMod.default[typingsJapgolly.ol.geometryMod.default] = js.native
    def readFeature(source: scala.scalajs.js.typedarray.ArrayBuffer, opt_options: ReadOptions): typingsJapgolly.ol.olFeatureMod.default[typingsJapgolly.ol.geometryMod.default] = js.native
    /* protected */ def readFeatureFromObject(`object`: js.Any): typingsJapgolly.ol.olFeatureMod.default[typingsJapgolly.ol.geometryMod.default] = js.native
    /* protected */ def readFeatureFromObject(`object`: js.Any, opt_options: ReadOptions): typingsJapgolly.ol.olFeatureMod.default[typingsJapgolly.ol.geometryMod.default] = js.native
    /* protected */ def readFeaturesFromObject(`object`: js.Any): js.Array[typingsJapgolly.ol.olFeatureMod.default[typingsJapgolly.ol.geometryMod.default]] = js.native
    /* protected */ def readFeaturesFromObject(`object`: js.Any, opt_options: ReadOptions): js.Array[typingsJapgolly.ol.olFeatureMod.default[typingsJapgolly.ol.geometryMod.default]] = js.native
    def readGeometry(source: scala.scalajs.js.typedarray.ArrayBuffer): typingsJapgolly.ol.geometryMod.default = js.native
    def readGeometry(source: scala.scalajs.js.typedarray.ArrayBuffer, opt_options: ReadOptions): typingsJapgolly.ol.geometryMod.default = js.native
    /* protected */ def readGeometryFromObject(`object`: js.Any): typingsJapgolly.ol.geometryMod.default = js.native
    /* protected */ def readGeometryFromObject(`object`: js.Any, opt_options: ReadOptions): typingsJapgolly.ol.geometryMod.default = js.native
    def readProjection(source: scala.scalajs.js.typedarray.ArrayBuffer): typingsJapgolly.ol.projectionMod.default = js.native
    /* protected */ def readProjectionFromObject(`object`: js.Any): typingsJapgolly.ol.projectionMod.default = js.native
    def writeFeatureObject(feature: typingsJapgolly.ol.olFeatureMod.default[typingsJapgolly.ol.geometryMod.default]): js.Any = js.native
    def writeFeatureObject(
      feature: typingsJapgolly.ol.olFeatureMod.default[typingsJapgolly.ol.geometryMod.default],
      opt_options: WriteOptions
    ): js.Any = js.native
    def writeFeaturesObject(
      features: js.Array[typingsJapgolly.ol.olFeatureMod.default[typingsJapgolly.ol.geometryMod.default]]
    ): js.Any = js.native
    def writeFeaturesObject(
      features: js.Array[typingsJapgolly.ol.olFeatureMod.default[typingsJapgolly.ol.geometryMod.default]],
      opt_options: WriteOptions
    ): js.Any = js.native
    def writeGeometryObject(geometry: typingsJapgolly.ol.geometryMod.default): js.Any = js.native
    def writeGeometryObject(geometry: typingsJapgolly.ol.geometryMod.default, opt_options: WriteOptions): js.Any = js.native
  }
  
  @js.native
  abstract class default () extends JSONFeature
  
}

