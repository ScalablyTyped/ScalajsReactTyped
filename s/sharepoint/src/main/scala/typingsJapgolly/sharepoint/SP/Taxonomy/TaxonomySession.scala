package typingsJapgolly.sharepoint.SP.Taxonomy

import typingsJapgolly.sharepoint.SP.ClientContext
import typingsJapgolly.sharepoint.SP.ClientObject
import typingsJapgolly.sharepoint.SP.Guid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Taxonomy.TaxonomySession")
@js.native
class TaxonomySession () extends ClientObject {
  def getDefaultKeywordsTermStore(): TermStore = js.native
  def getDefaultSiteCollectionTermStore(): TermStore = js.native
  def getTerm(guid: Guid): Term = js.native
  def getTermSetsByName(termSetName: String, lcid: Double): TermSetCollection = js.native
  def getTermSetsByTermLabel(requiredTermLabels: js.Array[String], lcid: Double): TermSetCollection = js.native
  def getTerms(labelMatchInformation: LabelMatchInformation): TermCollection = js.native
  def getTermsById(termIds: js.Array[Guid]): TermCollection = js.native
  def getTermsInDefaultLanguage(
    termLabel: String,
    defaultLabelOnly: Boolean,
    stringMatchOption: StringMatchOption,
    resultCollectionSize: Double,
    trimUnavailable: Boolean,
    trimDeprecated: Boolean
  ): TermCollection = js.native
  def getTermsInWorkingLocale(
    termLabel: String,
    defaultLabelOnly: Boolean,
    stringMatchOption: StringMatchOption,
    resultCollectionSize: Double,
    trimUnavailable: Boolean,
    trimDeprecated: Boolean
  ): TermCollection = js.native
  def getTermsWithCustomProperty(customPropertyMatchInformation: CustomPropertyMatchInformation): TermCollection = js.native
  def getTermsWithCustomProperty(customPropertyName: String, trimUnavailable: Boolean): TermCollection = js.native
  def get_offlineTermStoreNames(): js.Array[String] = js.native
  def get_termStores(): TermStoreCollection = js.native
  def updateCache(): Unit = js.native
}

/* static members */
@JSGlobal("SP.Taxonomy.TaxonomySession")
@js.native
object TaxonomySession extends js.Object {
  def getTaxonomySession(context: ClientContext): TaxonomySession = js.native
}

