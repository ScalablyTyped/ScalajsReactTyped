package typingsJapgolly.std

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.std.stdBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An object providing methods which are not dependent on any particular document. Such an object is returned by the Document.implementation property. */
@js.native
trait DOMImplementation extends js.Object {
  def createDocument(): Document_ = js.native
  def createDocument(namespaceURI: java.lang.String): Document_ = js.native
  def createDocument(namespaceURI: java.lang.String, qualifiedName: java.lang.String): Document_ = js.native
  def createDocument(
    namespaceURI: java.lang.String,
    qualifiedName: java.lang.String,
    doctype: org.scalajs.dom.raw.DocumentType
  ): Document_ = js.native
  def createDocument(namespaceURI: java.lang.String, qualifiedName: Null, doctype: org.scalajs.dom.raw.DocumentType): Document_ = js.native
  def createDocument(namespaceURI: Null, qualifiedName: java.lang.String): Document_ = js.native
  def createDocument(namespaceURI: Null, qualifiedName: java.lang.String, doctype: org.scalajs.dom.raw.DocumentType): Document_ = js.native
  def createDocument(namespaceURI: Null, qualifiedName: Null, doctype: org.scalajs.dom.raw.DocumentType): Document_ = js.native
  def createDocumentType(qualifiedName: java.lang.String, publicId: java.lang.String, systemId: java.lang.String): org.scalajs.dom.raw.DocumentType = js.native
  def createHTMLDocument(): Document_ = js.native
  def createHTMLDocument(title: java.lang.String): Document_ = js.native
  /** @deprecated */
  def hasFeature(args: js.Any*): `true` = js.native
}

@JSGlobal("DOMImplementation")
@js.native
object DOMImplementation extends Instantiable0[DOMImplementation]

