package typingsJapgolly.ol.featureMod

import typingsJapgolly.ol.formatTypeMod.FormatType
import typingsJapgolly.ol.olFeatureMod.FeatureLike
import typingsJapgolly.std.ArrayBuffer
import typingsJapgolly.std.Document_
import typingsJapgolly.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureFormat extends js.Object {
  var dataProjection: typingsJapgolly.ol.projectionMod.default = js.native
  var defaultFeatureProjection: typingsJapgolly.ol.projectionMod.default = js.native
  /* protected */ def adaptOptions(): WriteOptions | ReadOptions = js.native
  /* protected */ def adaptOptions(options: ReadOptions): WriteOptions | ReadOptions = js.native
  /* protected */ def adaptOptions(options: WriteOptions): WriteOptions | ReadOptions = js.native
  /* protected */ def getReadOptions(source: String): ReadOptions = js.native
  /* protected */ def getReadOptions(source: String, opt_options: ReadOptions): ReadOptions = js.native
  /* protected */ def getReadOptions(source: js.Object): ReadOptions = js.native
  /* protected */ def getReadOptions(source: js.Object, opt_options: ReadOptions): ReadOptions = js.native
  /* protected */ def getReadOptions(source: Document_): ReadOptions = js.native
  /* protected */ def getReadOptions(source: Document_, opt_options: ReadOptions): ReadOptions = js.native
  /* protected */ def getReadOptions(source: Node): ReadOptions = js.native
  /* protected */ def getReadOptions(source: Node, opt_options: ReadOptions): ReadOptions = js.native
  def getType(): FormatType = js.native
  def readFeature(source: String): FeatureLike = js.native
  def readFeature(source: String, opt_options: ReadOptions): FeatureLike = js.native
  def readFeature(source: js.Object): FeatureLike = js.native
  def readFeature(source: js.Object, opt_options: ReadOptions): FeatureLike = js.native
  def readFeature(source: Document_): FeatureLike = js.native
  def readFeature(source: Document_, opt_options: ReadOptions): FeatureLike = js.native
  def readFeature(source: Node): FeatureLike = js.native
  def readFeature(source: Node, opt_options: ReadOptions): FeatureLike = js.native
  def readFeatures(source: String): js.Array[FeatureLike] = js.native
  def readFeatures(source: String, opt_options: ReadOptions): js.Array[FeatureLike] = js.native
  def readFeatures(source: js.Object): js.Array[FeatureLike] = js.native
  def readFeatures(source: js.Object, opt_options: ReadOptions): js.Array[FeatureLike] = js.native
  def readFeatures(source: ArrayBuffer): js.Array[FeatureLike] = js.native
  def readFeatures(source: ArrayBuffer, opt_options: ReadOptions): js.Array[FeatureLike] = js.native
  def readFeatures(source: Document_): js.Array[FeatureLike] = js.native
  def readFeatures(source: Document_, opt_options: ReadOptions): js.Array[FeatureLike] = js.native
  def readFeatures(source: Node): js.Array[FeatureLike] = js.native
  def readFeatures(source: Node, opt_options: ReadOptions): js.Array[FeatureLike] = js.native
  def readGeometry(source: String): typingsJapgolly.ol.geometryMod.default = js.native
  def readGeometry(source: String, opt_options: ReadOptions): typingsJapgolly.ol.geometryMod.default = js.native
  def readGeometry(source: js.Object): typingsJapgolly.ol.geometryMod.default = js.native
  def readGeometry(source: js.Object, opt_options: ReadOptions): typingsJapgolly.ol.geometryMod.default = js.native
  def readGeometry(source: Document_): typingsJapgolly.ol.geometryMod.default = js.native
  def readGeometry(source: Document_, opt_options: ReadOptions): typingsJapgolly.ol.geometryMod.default = js.native
  def readGeometry(source: Node): typingsJapgolly.ol.geometryMod.default = js.native
  def readGeometry(source: Node, opt_options: ReadOptions): typingsJapgolly.ol.geometryMod.default = js.native
  def readProjection(source: String): typingsJapgolly.ol.projectionMod.default = js.native
  def readProjection(source: js.Object): typingsJapgolly.ol.projectionMod.default = js.native
  def readProjection(source: Document_): typingsJapgolly.ol.projectionMod.default = js.native
  def readProjection(source: Node): typingsJapgolly.ol.projectionMod.default = js.native
  def writeFeature(feature: typingsJapgolly.ol.olFeatureMod.default[typingsJapgolly.ol.geometryMod.default]): String = js.native
  def writeFeature(
    feature: typingsJapgolly.ol.olFeatureMod.default[typingsJapgolly.ol.geometryMod.default],
    opt_options: WriteOptions
  ): String = js.native
  def writeFeatures(
    features: js.Array[typingsJapgolly.ol.olFeatureMod.default[typingsJapgolly.ol.geometryMod.default]]
  ): String = js.native
  def writeFeatures(
    features: js.Array[typingsJapgolly.ol.olFeatureMod.default[typingsJapgolly.ol.geometryMod.default]],
    opt_options: WriteOptions
  ): String = js.native
  def writeGeometry(geometry: typingsJapgolly.ol.geometryMod.default): String = js.native
  def writeGeometry(geometry: typingsJapgolly.ol.geometryMod.default, opt_options: WriteOptions): String = js.native
}

