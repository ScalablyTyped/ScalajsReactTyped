package typingsJapgolly.mfiles.MFiles

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.mfiles.ISearchConditionEx
import typingsJapgolly.mfiles.ISearchConditionExs
import typingsJapgolly.mfiles.ISearchConditions
import typingsJapgolly.mfiles.ISearchCriteria
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.SearchCriteria")
@js.native
class SearchCriteria () extends ISearchCriteria {
  /* CompleteClass */
  override var AdditionalConditions: ISearchConditionExs = js.native
  /* CompleteClass */
  override var ExpandUI: Boolean = js.native
  /* CompleteClass */
  override var FacetFilterAsJSON: String = js.native
  /* CompleteClass */
  override var FacetFilterStatusFlags: MFFacetFilterStatusFlags = js.native
  /* CompleteClass */
  override var FirstCondition: ISearchConditionEx = js.native
  /* CompleteClass */
  override var FullTextSearchFlags: MFFullTextSearchFlags = js.native
  /* CompleteClass */
  override var FullTextSearchString: String = js.native
  /* CompleteClass */
  override var ObjectTypeCondition: ISearchConditionEx = js.native
  /* CompleteClass */
  override var PredefinedSearchFilter: MFPredefinedSearchFilterType = js.native
  /* CompleteClass */
  override var PreviousBaseConditions: ISearchConditions = js.native
  /* CompleteClass */
  override var SearchFlags: MFSearchFlags = js.native
  /* CompleteClass */
  override var SearchRefinement: ISearchConditions = js.native
  /* CompleteClass */
  override var SearchWithinThisFolder: Boolean = js.native
  /* CompleteClass */
  override var SecondCondition: ISearchConditionEx = js.native
  /* CompleteClass */
  override def Clone(): ISearchCriteria = js.native
  /* CompleteClass */
  override def GetAsSearchConditions(
    ForceGettingExpandedConds: Boolean,
    IncludeSearchRefinementConditions: Boolean,
    IncludePreviousBaseConditions: Boolean
  ): ISearchConditions = js.native
}

@JSGlobal("MFiles.SearchCriteria")
@js.native
object SearchCriteria extends Instantiable0[ISearchCriteria]

