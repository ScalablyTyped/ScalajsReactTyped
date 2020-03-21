package typingsJapgolly.winrt.Windows.Web.AtomPub

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlDocument
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVector
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrt.Windows.Foundation.Uri
import typingsJapgolly.winrt.Windows.Web.Syndication.ISyndicationNode
import typingsJapgolly.winrt.Windows.Web.Syndication.ISyndicationText
import typingsJapgolly.winrt.Windows.Web.Syndication.SyndicationAttribute
import typingsJapgolly.winrt.Windows.Web.Syndication.SyndicationCategory
import typingsJapgolly.winrt.Windows.Web.Syndication.SyndicationFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResourceCollection extends ISyndicationNode {
  var accepts: IVectorView[String]
  var categories: IVectorView[SyndicationCategory]
  var title: ISyndicationText
  var uri: Uri
}

object IResourceCollection {
  @scala.inline
  def apply(
    accepts: IVectorView[String],
    attributeExtensions: IVector[SyndicationAttribute],
    baseUri: Uri,
    categories: IVectorView[SyndicationCategory],
    elementExtensions: IVector[ISyndicationNode],
    getXmlDocument: SyndicationFormat => CallbackTo[XmlDocument],
    language: String,
    nodeName: String,
    nodeNamespace: String,
    nodeValue: String,
    title: ISyndicationText,
    uri: Uri
  ): IResourceCollection = {
    val __obj = js.Dynamic.literal(accepts = accepts.asInstanceOf[js.Any], attributeExtensions = attributeExtensions.asInstanceOf[js.Any], baseUri = baseUri.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any], elementExtensions = elementExtensions.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], nodeNamespace = nodeNamespace.asInstanceOf[js.Any], nodeValue = nodeValue.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("getXmlDocument")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Web.Syndication.SyndicationFormat) => getXmlDocument(t0).runNow()))
    __obj.asInstanceOf[IResourceCollection]
  }
}

