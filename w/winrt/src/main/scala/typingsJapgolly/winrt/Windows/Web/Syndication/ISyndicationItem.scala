package typingsJapgolly.winrt.Windows.Web.Syndication

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlDocument
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVector
import typingsJapgolly.winrt.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISyndicationItem extends ISyndicationNode {
  var authors: IVector[SyndicationPerson]
  var categories: IVector[SyndicationCategory]
  var commentsUri: Uri
  var content: SyndicationContent
  var contributors: IVector[SyndicationPerson]
  var eTag: String
  var editMediaUri: Uri
  var editUri: Uri
  var id: String
  var itemUri: Uri
  var lastUpdatedTime: js.Date
  var links: IVector[SyndicationLink]
  var publishedDate: js.Date
  var rights: ISyndicationText
  var source: SyndicationFeed
  var summary: ISyndicationText
  var title: ISyndicationText
  def load(item: String): Unit
  def loadFromXml(itemDocument: XmlDocument): Unit
}

object ISyndicationItem {
  @scala.inline
  def apply(
    attributeExtensions: IVector[SyndicationAttribute],
    authors: IVector[SyndicationPerson],
    baseUri: Uri,
    categories: IVector[SyndicationCategory],
    commentsUri: Uri,
    content: SyndicationContent,
    contributors: IVector[SyndicationPerson],
    eTag: String,
    editMediaUri: Uri,
    editUri: Uri,
    elementExtensions: IVector[ISyndicationNode],
    getXmlDocument: SyndicationFormat => CallbackTo[XmlDocument],
    id: String,
    itemUri: Uri,
    language: String,
    lastUpdatedTime: js.Date,
    links: IVector[SyndicationLink],
    load: String => Callback,
    loadFromXml: XmlDocument => Callback,
    nodeName: String,
    nodeNamespace: String,
    nodeValue: String,
    publishedDate: js.Date,
    rights: ISyndicationText,
    source: SyndicationFeed,
    summary: ISyndicationText,
    title: ISyndicationText
  ): ISyndicationItem = {
    val __obj = js.Dynamic.literal(attributeExtensions = attributeExtensions.asInstanceOf[js.Any], authors = authors.asInstanceOf[js.Any], baseUri = baseUri.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any], commentsUri = commentsUri.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], contributors = contributors.asInstanceOf[js.Any], eTag = eTag.asInstanceOf[js.Any], editMediaUri = editMediaUri.asInstanceOf[js.Any], editUri = editUri.asInstanceOf[js.Any], elementExtensions = elementExtensions.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], itemUri = itemUri.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], lastUpdatedTime = lastUpdatedTime.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], nodeNamespace = nodeNamespace.asInstanceOf[js.Any], nodeValue = nodeValue.asInstanceOf[js.Any], publishedDate = publishedDate.asInstanceOf[js.Any], rights = rights.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("getXmlDocument")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Web.Syndication.SyndicationFormat) => getXmlDocument(t0).runNow()))
    __obj.updateDynamic("load")(js.Any.fromFunction1((t0: java.lang.String) => load(t0).runNow()))
    __obj.updateDynamic("loadFromXml")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlDocument) => loadFromXml(t0).runNow()))
    __obj.asInstanceOf[ISyndicationItem]
  }
}

