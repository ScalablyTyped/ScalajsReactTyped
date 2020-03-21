package typingsJapgolly.sharepoint.SP.Publishing.Navigation

import typingsJapgolly.sharepoint.SP.ClientObject
import typingsJapgolly.sharepoint.SP.Guid
import typingsJapgolly.sharepoint.SP.Publishing.CustomizableString
import typingsJapgolly.sharepoint.SP.StringResult
import typingsJapgolly.sharepoint.SP.Taxonomy.Term
import typingsJapgolly.sharepoint.SP.Taxonomy.TermStore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Publishing.Navigation.NavigationTermSetItem")
@js.native
class NavigationTermSetItem () extends ClientObject {
  def createTerm(termName: String, linkType: NavigationLinkType, termId: Guid): Term = js.native
  def getResolvedDisplayUrl(browserQueryString: String): StringResult = js.native
  def getTaxonomyTermStore(): TermStore = js.native
  def get_catalogTargetUrlForChildTerms(): CustomizableString = js.native
  def get_id(): Guid = js.native
  def get_isReadOnly(): Boolean = js.native
  def get_linkType(): NavigationLinkType = js.native
  def get_targetUrlForChildTerms(): CustomizableString = js.native
  def get_taxonomyName(): String = js.native
  def get_terms(): NavigationTermCollection = js.native
  def get_title(): CustomizableString = js.native
  def get_view(): NavigationTermSetView = js.native
  def set_linkType(value: NavigationLinkType): NavigationLinkType = js.native
}

