package typingsJapgolly.winrt.Windows.Web.Syndication

import japgolly.scalajs.react.Callback
import typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlDocument
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVector
import typingsJapgolly.winrt.Windows.Foundation.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SyndicationFeed
  extends StObject
     with ISyndicationFeed
object SyndicationFeed {
  
  inline def apply(
    attributeExtensions: IVector[SyndicationAttribute],
    authors: IVector[SyndicationPerson],
    baseUri: Uri,
    categories: IVector[SyndicationCategory],
    contributors: IVector[SyndicationPerson],
    elementExtensions: IVector[ISyndicationNode],
    firstUri: Uri,
    generator: SyndicationGenerator,
    getXmlDocument: SyndicationFormat => XmlDocument,
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
  ): SyndicationFeed = {
    val __obj = js.Dynamic.literal(attributeExtensions = attributeExtensions.asInstanceOf[js.Any], authors = authors.asInstanceOf[js.Any], baseUri = baseUri.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any], contributors = contributors.asInstanceOf[js.Any], elementExtensions = elementExtensions.asInstanceOf[js.Any], firstUri = firstUri.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], getXmlDocument = js.Any.fromFunction1(getXmlDocument), iconUri = iconUri.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], imageUri = imageUri.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], lastUpdatedTime = lastUpdatedTime.asInstanceOf[js.Any], lastUri = lastUri.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], load = js.Any.fromFunction1((t0: String) => load(t0).runNow()), loadFromXml = js.Any.fromFunction1((t0: XmlDocument) => loadFromXml(t0).runNow()), nextUri = nextUri.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], nodeNamespace = nodeNamespace.asInstanceOf[js.Any], nodeValue = nodeValue.asInstanceOf[js.Any], previousUri = previousUri.asInstanceOf[js.Any], rights = rights.asInstanceOf[js.Any], sourceFormat = sourceFormat.asInstanceOf[js.Any], subtitle = subtitle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyndicationFeed]
  }
}
