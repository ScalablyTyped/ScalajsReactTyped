package typingsJapgolly.winrtUwp.Windows.Web.Syndication

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Data.Xml.Dom.XmlDocument
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVector
import typingsJapgolly.winrtUwp.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents text, HTML, or XHTML content. This interface encapsulates elements in RSS 2.0 or Atom 1.0 that can have either text, HTML, or XHTML content. In Atom 1.0 this interface maps to an atomTextConstruct in the schema, which can be element atom:title, atom:subtitle, atom:rights or atom:summary. */
trait ISyndicationText extends ISyndicationNode {
  /** Gets or sets the content of a text content construct like atom:title. */
  var text: String
  /** Gets or sets the type of the content. */
  var `type`: String
  /** Gets or sets the XML content. */
  var xml: XmlDocument
}

object ISyndicationText {
  @scala.inline
  def apply(
    attributeExtensions: IVector[SyndicationAttribute],
    baseUri: Uri,
    elementExtensions: IVector[ISyndicationNode],
    getXmlDocument: SyndicationFormat => CallbackTo[XmlDocument],
    language: String,
    nodeName: String,
    nodeNamespace: String,
    nodeValue: String,
    text: String,
    `type`: String,
    xml: XmlDocument
  ): ISyndicationText = {
    val __obj = js.Dynamic.literal(attributeExtensions = attributeExtensions.asInstanceOf[js.Any], baseUri = baseUri.asInstanceOf[js.Any], elementExtensions = elementExtensions.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], nodeNamespace = nodeNamespace.asInstanceOf[js.Any], nodeValue = nodeValue.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], xml = xml.asInstanceOf[js.Any])
    __obj.updateDynamic("getXmlDocument")(js.Any.fromFunction1((t0: typingsJapgolly.winrtUwp.Windows.Web.Syndication.SyndicationFormat) => getXmlDocument(t0).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISyndicationText]
  }
}

