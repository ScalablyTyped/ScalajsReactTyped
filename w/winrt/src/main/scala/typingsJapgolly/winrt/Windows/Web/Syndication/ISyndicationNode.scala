package typingsJapgolly.winrt.Windows.Web.Syndication

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlDocument
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVector
import typingsJapgolly.winrt.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISyndicationNode extends js.Object {
  var attributeExtensions: IVector[SyndicationAttribute]
  var baseUri: Uri
  var elementExtensions: IVector[ISyndicationNode]
  var language: String
  var nodeName: String
  var nodeNamespace: String
  var nodeValue: String
  def getXmlDocument(format: SyndicationFormat): XmlDocument
}

object ISyndicationNode {
  @scala.inline
  def apply(
    attributeExtensions: IVector[SyndicationAttribute],
    baseUri: Uri,
    elementExtensions: IVector[ISyndicationNode],
    getXmlDocument: SyndicationFormat => CallbackTo[XmlDocument],
    language: String,
    nodeName: String,
    nodeNamespace: String,
    nodeValue: String
  ): ISyndicationNode = {
    val __obj = js.Dynamic.literal(attributeExtensions = attributeExtensions.asInstanceOf[js.Any], baseUri = baseUri.asInstanceOf[js.Any], elementExtensions = elementExtensions.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], nodeNamespace = nodeNamespace.asInstanceOf[js.Any], nodeValue = nodeValue.asInstanceOf[js.Any])
    __obj.updateDynamic("getXmlDocument")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Web.Syndication.SyndicationFormat) => getXmlDocument(t0).runNow()))
    __obj.asInstanceOf[ISyndicationNode]
  }
}

