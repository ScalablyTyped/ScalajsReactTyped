package typingsJapgolly.sharepoint.SP.Publishing.Navigation

import typingsJapgolly.sharepoint.SP.ClientContext
import typingsJapgolly.sharepoint.SP.Guid
import typingsJapgolly.sharepoint.SP.Taxonomy.TaxonomySession
import typingsJapgolly.sharepoint.SP.Taxonomy.TermSet
import typingsJapgolly.sharepoint.SP.Web
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Publishing.Navigation.NavigationTermSet")
@js.native
class NavigationTermSet () extends NavigationTermSetItem {
  def findTermForUrl(url: String): NavigationTerm = js.native
  def getAllTerms(): NavigationTermCollection = js.native
  def getAsEditable(taxonomySession: TaxonomySession): NavigationTermSet = js.native
  def getTaxonomyTermSet(): TermSet = js.native
  def getWithNewView(newView: NavigationTermSetView): NavigationTermSet = js.native
  def get_isNavigationTermSet(): Boolean = js.native
  def get_lcid(): Double = js.native
  def get_loadedFromPersistedData(): Boolean = js.native
  def get_termGroupId(): Guid = js.native
  def get_termStoreId(): Guid = js.native
  def set_isNavigationTermSet(value: Boolean): Boolean = js.native
}

/* static members */
@JSGlobal("SP.Publishing.Navigation.NavigationTermSet")
@js.native
object NavigationTermSet extends js.Object {
  def getAsResolvedByView(context: ClientContext, termSet: TermSet, view: NavigationTermSetView): NavigationTermSet = js.native
  def getAsResolvedByWeb(context: ClientContext, termSet: TermSet, web: Web, siteMapProviderName: String): NavigationTermSet = js.native
}

