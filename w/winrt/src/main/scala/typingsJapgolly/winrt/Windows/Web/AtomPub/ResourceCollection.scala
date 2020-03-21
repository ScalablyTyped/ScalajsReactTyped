package typingsJapgolly.winrt.Windows.Web.AtomPub

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

@JSGlobal("Windows.Web.AtomPub.ResourceCollection")
@js.native
class ResourceCollection () extends IResourceCollection {
  /* CompleteClass */
  override var accepts: IVectorView[String] = js.native
  /* CompleteClass */
  override var attributeExtensions: IVector[SyndicationAttribute] = js.native
  /* CompleteClass */
  override var baseUri: Uri = js.native
  /* CompleteClass */
  override var categories: IVectorView[SyndicationCategory] = js.native
  /* CompleteClass */
  override var elementExtensions: IVector[ISyndicationNode] = js.native
  /* CompleteClass */
  override var language: String = js.native
  /* CompleteClass */
  override var nodeName: String = js.native
  /* CompleteClass */
  override var nodeNamespace: String = js.native
  /* CompleteClass */
  override var nodeValue: String = js.native
  /* CompleteClass */
  override var title: ISyndicationText = js.native
  /* CompleteClass */
  override var uri: Uri = js.native
  /* CompleteClass */
  override def getXmlDocument(format: SyndicationFormat): XmlDocument = js.native
}

