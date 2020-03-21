package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFFacetFilterStatusFlags
import typingsJapgolly.mfiles.MFiles.MFFullTextSearchFlags
import typingsJapgolly.mfiles.MFiles.MFPredefinedSearchFilterType
import typingsJapgolly.mfiles.MFiles.MFSearchFlags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISearchCriteria extends js.Object {
  var AdditionalConditions: ISearchConditionExs
  var ExpandUI: Boolean
  var FacetFilterAsJSON: String
  var FacetFilterStatusFlags: MFFacetFilterStatusFlags
  var FirstCondition: ISearchConditionEx
  var FullTextSearchFlags: MFFullTextSearchFlags
  var FullTextSearchString: String
  var ObjectTypeCondition: ISearchConditionEx
  var PredefinedSearchFilter: MFPredefinedSearchFilterType
  var PreviousBaseConditions: ISearchConditions
  var SearchFlags: MFSearchFlags
  var SearchRefinement: ISearchConditions
  var SearchWithinThisFolder: Boolean
  var SecondCondition: ISearchConditionEx
  def Clone(): ISearchCriteria
  def GetAsSearchConditions(
    ForceGettingExpandedConds: Boolean,
    IncludeSearchRefinementConditions: Boolean,
    IncludePreviousBaseConditions: Boolean
  ): ISearchConditions
}

object ISearchCriteria {
  @scala.inline
  def apply(
    AdditionalConditions: ISearchConditionExs,
    Clone: CallbackTo[ISearchCriteria],
    ExpandUI: Boolean,
    FacetFilterAsJSON: String,
    FacetFilterStatusFlags: MFFacetFilterStatusFlags,
    FirstCondition: ISearchConditionEx,
    FullTextSearchFlags: MFFullTextSearchFlags,
    FullTextSearchString: String,
    GetAsSearchConditions: (Boolean, Boolean, Boolean) => CallbackTo[ISearchConditions],
    ObjectTypeCondition: ISearchConditionEx,
    PredefinedSearchFilter: MFPredefinedSearchFilterType,
    PreviousBaseConditions: ISearchConditions,
    SearchFlags: MFSearchFlags,
    SearchRefinement: ISearchConditions,
    SearchWithinThisFolder: Boolean,
    SecondCondition: ISearchConditionEx
  ): ISearchCriteria = {
    val __obj = js.Dynamic.literal(AdditionalConditions = AdditionalConditions.asInstanceOf[js.Any], ExpandUI = ExpandUI.asInstanceOf[js.Any], FacetFilterAsJSON = FacetFilterAsJSON.asInstanceOf[js.Any], FacetFilterStatusFlags = FacetFilterStatusFlags.asInstanceOf[js.Any], FirstCondition = FirstCondition.asInstanceOf[js.Any], FullTextSearchFlags = FullTextSearchFlags.asInstanceOf[js.Any], FullTextSearchString = FullTextSearchString.asInstanceOf[js.Any], ObjectTypeCondition = ObjectTypeCondition.asInstanceOf[js.Any], PredefinedSearchFilter = PredefinedSearchFilter.asInstanceOf[js.Any], PreviousBaseConditions = PreviousBaseConditions.asInstanceOf[js.Any], SearchFlags = SearchFlags.asInstanceOf[js.Any], SearchRefinement = SearchRefinement.asInstanceOf[js.Any], SearchWithinThisFolder = SearchWithinThisFolder.asInstanceOf[js.Any], SecondCondition = SecondCondition.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.updateDynamic("GetAsSearchConditions")(js.Any.fromFunction3((t0: scala.Boolean, t1: scala.Boolean, t2: scala.Boolean) => GetAsSearchConditions(t0, t1, t2).runNow()))
    __obj.asInstanceOf[ISearchCriteria]
  }
}

