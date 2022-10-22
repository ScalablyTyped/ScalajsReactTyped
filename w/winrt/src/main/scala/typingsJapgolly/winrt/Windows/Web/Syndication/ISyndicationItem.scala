package typingsJapgolly.winrt.Windows.Web.Syndication

import japgolly.scalajs.react.Callback
import typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlDocument
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVector
import typingsJapgolly.winrt.Windows.Foundation.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISyndicationItem
  extends StObject
     with ISyndicationNode {
  
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
  
  def load(item: String): Unit
  
  def loadFromXml(itemDocument: XmlDocument): Unit
  
  var publishedDate: js.Date
  
  var rights: ISyndicationText
  
  var source: SyndicationFeed
  
  var summary: ISyndicationText
  
  var title: ISyndicationText
}
object ISyndicationItem {
  
  inline def apply(
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
    getXmlDocument: SyndicationFormat => XmlDocument,
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
    val __obj = js.Dynamic.literal(attributeExtensions = attributeExtensions.asInstanceOf[js.Any], authors = authors.asInstanceOf[js.Any], baseUri = baseUri.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any], commentsUri = commentsUri.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], contributors = contributors.asInstanceOf[js.Any], eTag = eTag.asInstanceOf[js.Any], editMediaUri = editMediaUri.asInstanceOf[js.Any], editUri = editUri.asInstanceOf[js.Any], elementExtensions = elementExtensions.asInstanceOf[js.Any], getXmlDocument = js.Any.fromFunction1(getXmlDocument), id = id.asInstanceOf[js.Any], itemUri = itemUri.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], lastUpdatedTime = lastUpdatedTime.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], load = js.Any.fromFunction1((t0: String) => load(t0).runNow()), loadFromXml = js.Any.fromFunction1((t0: XmlDocument) => loadFromXml(t0).runNow()), nodeName = nodeName.asInstanceOf[js.Any], nodeNamespace = nodeNamespace.asInstanceOf[js.Any], nodeValue = nodeValue.asInstanceOf[js.Any], publishedDate = publishedDate.asInstanceOf[js.Any], rights = rights.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISyndicationItem]
  }
  
  extension [Self <: ISyndicationItem](x: Self) {
    
    inline def setAuthors(value: IVector[SyndicationPerson]): Self = StObject.set(x, "authors", value.asInstanceOf[js.Any])
    
    inline def setCategories(value: IVector[SyndicationCategory]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    inline def setCommentsUri(value: Uri): Self = StObject.set(x, "commentsUri", value.asInstanceOf[js.Any])
    
    inline def setContent(value: SyndicationContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContributors(value: IVector[SyndicationPerson]): Self = StObject.set(x, "contributors", value.asInstanceOf[js.Any])
    
    inline def setETag(value: String): Self = StObject.set(x, "eTag", value.asInstanceOf[js.Any])
    
    inline def setEditMediaUri(value: Uri): Self = StObject.set(x, "editMediaUri", value.asInstanceOf[js.Any])
    
    inline def setEditUri(value: Uri): Self = StObject.set(x, "editUri", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setItemUri(value: Uri): Self = StObject.set(x, "itemUri", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTime(value: js.Date): Self = StObject.set(x, "lastUpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setLinks(value: IVector[SyndicationLink]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setLoad(value: String => Callback): Self = StObject.set(x, "load", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setLoadFromXml(value: XmlDocument => Callback): Self = StObject.set(x, "loadFromXml", js.Any.fromFunction1((t0: XmlDocument) => value(t0).runNow()))
    
    inline def setPublishedDate(value: js.Date): Self = StObject.set(x, "publishedDate", value.asInstanceOf[js.Any])
    
    inline def setRights(value: ISyndicationText): Self = StObject.set(x, "rights", value.asInstanceOf[js.Any])
    
    inline def setSource(value: SyndicationFeed): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSummary(value: ISyndicationText): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: ISyndicationText): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
