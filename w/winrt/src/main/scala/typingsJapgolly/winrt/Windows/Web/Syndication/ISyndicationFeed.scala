package typingsJapgolly.winrt.Windows.Web.Syndication

import japgolly.scalajs.react.Callback
import typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlDocument
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVector
import typingsJapgolly.winrt.Windows.Foundation.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISyndicationFeed
  extends StObject
     with ISyndicationNode {
  
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
  
  def load(feed: String): Unit
  
  def loadFromXml(feedDocument: XmlDocument): Unit
  
  var nextUri: Uri
  
  var previousUri: Uri
  
  var rights: ISyndicationText
  
  var sourceFormat: SyndicationFormat
  
  var subtitle: ISyndicationText
  
  var title: ISyndicationText
}
object ISyndicationFeed {
  
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
  ): ISyndicationFeed = {
    val __obj = js.Dynamic.literal(attributeExtensions = attributeExtensions.asInstanceOf[js.Any], authors = authors.asInstanceOf[js.Any], baseUri = baseUri.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any], contributors = contributors.asInstanceOf[js.Any], elementExtensions = elementExtensions.asInstanceOf[js.Any], firstUri = firstUri.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], getXmlDocument = js.Any.fromFunction1(getXmlDocument), iconUri = iconUri.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], imageUri = imageUri.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], lastUpdatedTime = lastUpdatedTime.asInstanceOf[js.Any], lastUri = lastUri.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], load = js.Any.fromFunction1((t0: String) => load(t0).runNow()), loadFromXml = js.Any.fromFunction1((t0: XmlDocument) => loadFromXml(t0).runNow()), nextUri = nextUri.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], nodeNamespace = nodeNamespace.asInstanceOf[js.Any], nodeValue = nodeValue.asInstanceOf[js.Any], previousUri = previousUri.asInstanceOf[js.Any], rights = rights.asInstanceOf[js.Any], sourceFormat = sourceFormat.asInstanceOf[js.Any], subtitle = subtitle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISyndicationFeed]
  }
  
  extension [Self <: ISyndicationFeed](x: Self) {
    
    inline def setAuthors(value: IVector[SyndicationPerson]): Self = StObject.set(x, "authors", value.asInstanceOf[js.Any])
    
    inline def setCategories(value: IVector[SyndicationCategory]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    inline def setContributors(value: IVector[SyndicationPerson]): Self = StObject.set(x, "contributors", value.asInstanceOf[js.Any])
    
    inline def setFirstUri(value: Uri): Self = StObject.set(x, "firstUri", value.asInstanceOf[js.Any])
    
    inline def setGenerator(value: SyndicationGenerator): Self = StObject.set(x, "generator", value.asInstanceOf[js.Any])
    
    inline def setIconUri(value: Uri): Self = StObject.set(x, "iconUri", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setImageUri(value: Uri): Self = StObject.set(x, "imageUri", value.asInstanceOf[js.Any])
    
    inline def setItems(value: IVector[SyndicationItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTime(value: js.Date): Self = StObject.set(x, "lastUpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setLastUri(value: Uri): Self = StObject.set(x, "lastUri", value.asInstanceOf[js.Any])
    
    inline def setLinks(value: IVector[SyndicationLink]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setLoad(value: String => Callback): Self = StObject.set(x, "load", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setLoadFromXml(value: XmlDocument => Callback): Self = StObject.set(x, "loadFromXml", js.Any.fromFunction1((t0: XmlDocument) => value(t0).runNow()))
    
    inline def setNextUri(value: Uri): Self = StObject.set(x, "nextUri", value.asInstanceOf[js.Any])
    
    inline def setPreviousUri(value: Uri): Self = StObject.set(x, "previousUri", value.asInstanceOf[js.Any])
    
    inline def setRights(value: ISyndicationText): Self = StObject.set(x, "rights", value.asInstanceOf[js.Any])
    
    inline def setSourceFormat(value: SyndicationFormat): Self = StObject.set(x, "sourceFormat", value.asInstanceOf[js.Any])
    
    inline def setSubtitle(value: ISyndicationText): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: ISyndicationText): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
