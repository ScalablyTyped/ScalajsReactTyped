package typingsJapgolly.winrt.Windows.Web.Syndication

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlDocument
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVector
import typingsJapgolly.winrt.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISyndicationLink extends ISyndicationNode {
  var length: Double
  var mediaType: String
  var relationship: String
  var resourceLanguage: String
  var title: String
  var uri: Uri
}

object ISyndicationLink {
  @scala.inline
  def apply(
    attributeExtensions: IVector[SyndicationAttribute],
    baseUri: Uri,
    elementExtensions: IVector[ISyndicationNode],
    getXmlDocument: SyndicationFormat => CallbackTo[XmlDocument],
    language: String,
    length: Double,
    mediaType: String,
    nodeName: String,
    nodeNamespace: String,
    nodeValue: String,
    relationship: String,
    resourceLanguage: String,
    title: String,
    uri: Uri
  ): ISyndicationLink = {
    val __obj = js.Dynamic.literal(attributeExtensions = attributeExtensions.asInstanceOf[js.Any], baseUri = baseUri.asInstanceOf[js.Any], elementExtensions = elementExtensions.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], nodeNamespace = nodeNamespace.asInstanceOf[js.Any], nodeValue = nodeValue.asInstanceOf[js.Any], relationship = relationship.asInstanceOf[js.Any], resourceLanguage = resourceLanguage.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("getXmlDocument")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Web.Syndication.SyndicationFormat) => getXmlDocument(t0).runNow()))
    __obj.asInstanceOf[ISyndicationLink]
  }
}

