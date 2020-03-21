package typingsJapgolly.ckeditor.CKEDITOR.dom

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.CSSStyleSheet
import typingsJapgolly.ckeditor.AnonAttributes
import typingsJapgolly.std.Document_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.dom.document")
@js.native
class document protected () extends domObject {
  def this(domDocument: StringDictionary[js.Any]) = this()
  @JSName("$")
  val $_document: Document_ = js.native
  val `type`: Double = js.native
  def appendStyleSheet(cssFileUrl: String): Unit = js.native
  def appendStyleText(cssStyleText: String): CSSStyleSheet = js.native
  def createElement(name: String): element = js.native
  def createElement(name: String, attribsAndStyles: AnonAttributes): element = js.native
  def createText(text: String): element = js.native
  def find(selector: String): nodeList = js.native
  def findOne(selector: String): element = js.native
  def focus(): Unit = js.native
  def getActive(): element = js.native
  def getBody(): element = js.native
  def getByAddress(address: js.Array[_]): node = js.native
  def getByAddress(address: js.Array[_], normalized: Boolean): node = js.native
  def getById(elementId: String): element = js.native
  def getDocumentElement(): element = js.native
  def getElementsByTag(tagName: String): nodeList = js.native
  def getHead(): element = js.native
  def getSelection(): selection = js.native
  def getWindow(): window = js.native
  def write(html: String): Unit = js.native
}

