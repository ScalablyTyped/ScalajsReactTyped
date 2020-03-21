package typingsJapgolly.ol.kmlMod

import typingsJapgolly.std.Document_
import typingsJapgolly.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KML
  extends typingsJapgolly.ol.xmlfeatureMod.default {
  def readName(source: String): String = js.native
  def readName(source: Document_): String = js.native
  def readName(source: Element): String = js.native
  def readNameFromDocument(doc: Document_): String = js.native
  def readNameFromNode(node: org.scalajs.dom.raw.Element): String = js.native
  def readNetworkLinks(source: String): js.Array[js.Object] = js.native
  def readNetworkLinks(source: Document_): js.Array[js.Object] = js.native
  def readNetworkLinks(source: Element): js.Array[js.Object] = js.native
  def readNetworkLinksFromDocument(doc: Document_): js.Array[js.Object] = js.native
  def readNetworkLinksFromNode(node: org.scalajs.dom.raw.Element): js.Array[js.Object] = js.native
  def readRegion(source: String): js.Array[js.Object] = js.native
  def readRegion(source: Document_): js.Array[js.Object] = js.native
  def readRegion(source: Element): js.Array[js.Object] = js.native
  def readRegionFromDocument(doc: Document_): js.Array[js.Object] = js.native
  def readRegionFromNode(node: org.scalajs.dom.raw.Element): js.Array[js.Object] = js.native
}

