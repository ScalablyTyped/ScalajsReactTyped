package typingsJapgolly.ol.wfsMod

import org.scalajs.dom.raw.Node
import typingsJapgolly.std.Document_
import typingsJapgolly.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WFS
  extends typingsJapgolly.ol.xmlfeatureMod.default {
  def getFeatureType(): js.Array[String] | String = js.native
  def readFeatureCollectionMetadata(source: String): FeatureCollectionMetadata = js.native
  def readFeatureCollectionMetadata(source: js.Object): FeatureCollectionMetadata = js.native
  def readFeatureCollectionMetadata(source: Document_): FeatureCollectionMetadata = js.native
  def readFeatureCollectionMetadata(source: Element): FeatureCollectionMetadata = js.native
  def readFeatureCollectionMetadataFromDocument(doc: Document_): FeatureCollectionMetadata = js.native
  def readFeatureCollectionMetadataFromNode(node: org.scalajs.dom.raw.Element): FeatureCollectionMetadata = js.native
  def readTransactionResponse(source: String): TransactionResponse = js.native
  def readTransactionResponse(source: js.Object): TransactionResponse = js.native
  def readTransactionResponse(source: Document_): TransactionResponse = js.native
  def readTransactionResponse(source: Element): TransactionResponse = js.native
  def readTransactionResponseFromDocument(doc: Document_): TransactionResponse = js.native
  def readTransactionResponseFromNode(node: org.scalajs.dom.raw.Element): TransactionResponse = js.native
  def setFeatureType(): Unit = js.native
  def setFeatureType(featureType: String): Unit = js.native
  def setFeatureType(featureType: js.Array[String]): Unit = js.native
  def writeGetFeature(options: WriteGetFeatureOptions): Node = js.native
  def writeTransaction(
    inserts: js.Array[typingsJapgolly.ol.olFeatureMod.default[typingsJapgolly.ol.geometryMod.default]],
    updates: js.Array[typingsJapgolly.ol.olFeatureMod.default[typingsJapgolly.ol.geometryMod.default]],
    deletes: js.Array[typingsJapgolly.ol.olFeatureMod.default[typingsJapgolly.ol.geometryMod.default]],
    options: WriteTransactionOptions
  ): Node = js.native
}

