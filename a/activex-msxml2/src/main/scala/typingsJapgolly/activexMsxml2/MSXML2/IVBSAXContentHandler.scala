package typingsJapgolly.activexMsxml2.MSXML2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** IVBSAXContentHandler interface */
@JSGlobal("MSXML2.IVBSAXContentHandler")
@js.native
class IVBSAXContentHandler protected () extends js.Object {
  @JSName("MSXML2.IVBSAXContentHandler_typekey")
  var MSXML2DotIVBSAXContentHandler_typekey: IVBSAXContentHandler = js.native
  /** Receive an object for locating the origin of SAX document events. */
  val documentLocator: IVBSAXLocator = js.native
  /** Receive notification of character data. */
  def characters(strChars: String): Unit = js.native
  /** Receive notification of the end of a document. */
  def endDocument(): Unit = js.native
  /** Receive notification of the end of an element. */
  def endElement(strNamespaceURI: String, strLocalName: String, strQName: String): Unit = js.native
  /** End the scope of a prefix-URI mapping. */
  def endPrefixMapping(strPrefix: String): Unit = js.native
  /** Receive notification of ignorable whitespace in element content. */
  def ignorableWhitespace(strChars: String): Unit = js.native
  /** Receive notification of a processing instruction. */
  def processingInstruction(strTarget: String, strData: String): Unit = js.native
  /** Receive notification of a skipped entity. */
  def skippedEntity(strName: String): Unit = js.native
  /** Receive notification of the beginning of a document. */
  def startDocument(): Unit = js.native
  /** Receive notification of the beginning of an element. */
  def startElement(strNamespaceURI: String, strLocalName: String, strQName: String, oAttributes: IVBSAXAttributes): Unit = js.native
  /** Begin the scope of a prefix-URI Namespace mapping. */
  def startPrefixMapping(strPrefix: String, strURI: String): Unit = js.native
}

