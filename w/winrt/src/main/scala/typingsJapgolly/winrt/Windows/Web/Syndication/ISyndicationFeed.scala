package typingsJapgolly.winrt.Windows.Web.Syndication

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlDocument
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVector
import typingsJapgolly.winrt.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISyndicationFeed extends ISyndicationNode {
  var authors: IVector[SyndicationPerson]
  var categories: IVector[SyndicationCategory]
  var contributors: IVector[SyndicationPerson]
  var firstUri: Uri
  var generator: SyndicationGenerator
  var iconUri: Uri
  var id: String
  var imageUri: Uri
  var items: IVector[SyndicationItem]
  var lastUpdatedTime: js.Date
  var lastUri: Uri
  var links: IVector[SyndicationLink]
  var nextUri: Uri
  var previousUri: Uri
  var rights: ISyndicationText
  var sourceFormat: SyndicationFormat
  var subtitle: ISyndicationText
  var title: ISyndicationText
  def load(feed: String): Unit
  def loadFromXml(feedDocument: XmlDocument): Unit
}

object ISyndicationFeed {
  @scala.inline
  def apply(
    attributeExtensions: IVector[SyndicationAttribute],
    authors: IVector[SyndicationPerson],
    baseUri: Uri,
    categories: IVector[SyndicationCategory],
    contributors: IVector[SyndicationPerson],
    elementExtensions: IVector[ISyndicationNode],
    firstUri: Uri,
    generator: SyndicationGenerator,
    getXmlDocument: SyndicationFormat => CallbackTo[XmlDocument],
    iconUri: Uri,
    id: String,
    imageUri: Uri,
    items: IVector[SyndicationItem],
    language: String,
    lastUpdatedTime: js.Date,
    lastUri: Uri,
    links: IVector[SyndicationLink],
    load: String => Callback,
    loadFromXml: XmlDocument => Callback,
    nextUri: Uri,
    nodeName: String,
    nodeNamespace: String,
    nodeValue: String,
    previousUri: Uri,
    rights: ISyndicationText,
    sourceFormat: SyndicationFormat,
    subtitle: ISyndicationText,
    title: ISyndicationText
  ): ISyndicationFeed = {
    val __obj = js.Dynamic.literal(attributeExtensions = attributeExtensions.asInstanceOf[js.Any], authors = authors.asInstanceOf[js.Any], baseUri = baseUri.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any], contributors = contributors.asInstanceOf[js.Any], elementExtensions = elementExtensions.asInstanceOf[js.Any], firstUri = firstUri.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], iconUri = iconUri.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], imageUri = imageUri.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], lastUpdatedTime = lastUpdatedTime.asInstanceOf[js.Any], lastUri = lastUri.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], nextUri = nextUri.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], nodeNamespace = nodeNamespace.asInstanceOf[js.Any], nodeValue = nodeValue.asInstanceOf[js.Any], previousUri = previousUri.asInstanceOf[js.Any], rights = rights.asInstanceOf[js.Any], sourceFormat = sourceFormat.asInstanceOf[js.Any], subtitle = subtitle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("getXmlDocument")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Web.Syndication.SyndicationFormat) => getXmlDocument(t0).runNow()))
    __obj.updateDynamic("load")(js.Any.fromFunction1((t0: java.lang.String) => load(t0).runNow()))
    __obj.updateDynamic("loadFromXml")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlDocument) => loadFromXml(t0).runNow()))
    __obj.asInstanceOf[ISyndicationFeed]
  }
}

