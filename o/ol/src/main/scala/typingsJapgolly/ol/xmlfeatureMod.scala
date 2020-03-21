package typingsJapgolly.ol

import org.scalajs.dom.raw.Node
import typingsJapgolly.ol.featureMod.ReadOptions
import typingsJapgolly.ol.featureMod.WriteOptions
import typingsJapgolly.std.Document_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/format/XMLFeature", JSImport.Namespace)
@js.native
object xmlfeatureMod extends js.Object {
  @js.native
  trait XMLFeature
    extends typingsJapgolly.ol.featureMod.default {
    def readFeatureFromDocument(doc: Document_): typingsJapgolly.ol.olFeatureMod.default[typingsJapgolly.ol.geometryMod.default] = js.native
    def readFeatureFromDocument(doc: Document_, opt_options: ReadOptions): typingsJapgolly.ol.olFeatureMod.default[typingsJapgolly.ol.geometryMod.default] = js.native
    def readFeatureFromNode(node: Node): typingsJapgolly.ol.olFeatureMod.default[typingsJapgolly.ol.geometryMod.default] = js.native
    def readFeatureFromNode(node: Node, opt_options: ReadOptions): typingsJapgolly.ol.olFeatureMod.default[typingsJapgolly.ol.geometryMod.default] = js.native
    /* protected */ def readFeaturesFromDocument(doc: Document_): js.Array[typingsJapgolly.ol.olFeatureMod.default[typingsJapgolly.ol.geometryMod.default]] = js.native
    /* protected */ def readFeaturesFromDocument(doc: Document_, opt_options: ReadOptions): js.Array[typingsJapgolly.ol.olFeatureMod.default[typingsJapgolly.ol.geometryMod.default]] = js.native
    /* protected */ def readFeaturesFromNode(node: Node): js.Array[typingsJapgolly.ol.olFeatureMod.default[typingsJapgolly.ol.geometryMod.default]] = js.native
    /* protected */ def readFeaturesFromNode(node: Node, opt_options: ReadOptions): js.Array[typingsJapgolly.ol.olFeatureMod.default[typingsJapgolly.ol.geometryMod.default]] = js.native
    /* protected */ def readGeometryFromDocument(doc: Document_): typingsJapgolly.ol.geometryMod.default = js.native
    /* protected */ def readGeometryFromDocument(doc: Document_, opt_options: ReadOptions): typingsJapgolly.ol.geometryMod.default = js.native
    /* protected */ def readGeometryFromNode(node: Node): typingsJapgolly.ol.geometryMod.default = js.native
    /* protected */ def readGeometryFromNode(node: Node, opt_options: ReadOptions): typingsJapgolly.ol.geometryMod.default = js.native
    /* protected */ def readProjectionFromDocument(doc: Document_): typingsJapgolly.ol.projectionMod.default = js.native
    /* protected */ def readProjectionFromNode(node: Node): typingsJapgolly.ol.projectionMod.default = js.native
    /* protected */ def writeFeatureNode(feature: typingsJapgolly.ol.olFeatureMod.default[typingsJapgolly.ol.geometryMod.default]): Node = js.native
    /* protected */ def writeFeatureNode(
      feature: typingsJapgolly.ol.olFeatureMod.default[typingsJapgolly.ol.geometryMod.default],
      opt_options: WriteOptions
    ): Node = js.native
    def writeFeaturesNode(
      features: js.Array[typingsJapgolly.ol.olFeatureMod.default[typingsJapgolly.ol.geometryMod.default]]
    ): Node = js.native
    def writeFeaturesNode(
      features: js.Array[typingsJapgolly.ol.olFeatureMod.default[typingsJapgolly.ol.geometryMod.default]],
      opt_options: WriteOptions
    ): Node = js.native
    def writeGeometryNode(geometry: typingsJapgolly.ol.geometryMod.default): Node = js.native
    def writeGeometryNode(geometry: typingsJapgolly.ol.geometryMod.default, opt_options: WriteOptions): Node = js.native
  }
  
  @js.native
  abstract class default () extends XMLFeature
  
}

