package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFFacetSearchFlags
import typingsJapgolly.mfiles.MFiles.MFFullTextSearchFlags
import typingsJapgolly.mfiles.MFiles.MFSearchFlags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVaultObjectSearchOperations extends js.Object {
  def FindFile(RelativePath: String, UpdateFromServer: Boolean): IObjectFileAndVersion
  def FindObjectVersionAndProperties(RelativePath: String, UpdateFromServer: Boolean): IObjectVersionAndProperties
  def GetFacetValues(
    SearchConditions: ISearchConditions,
    Facets: IExpressions,
    FacetValuesMaxCount: Double,
    Flags: MFFacetSearchFlags
  ): IStringData
  def GetFacetValuesByPath(RelativePath: String, Facets: IExpressions, FacetValuesMaxCount: Double, Flags: MFFacetSearchFlags): IStringData
  def GetObjectCountInSearch(SearchConditions: ISearchConditions, SearchFlags: MFSearchFlags): Double
  def GetObjectsInPath(RelativePath: String, SortResults: Boolean, UpdateFromServer: Boolean): IObjectSearchResults
  def GetSearchHits(Input: String, SearchCondition: ISearchCondition): IStrings
  def IsObjectPathInMFiles(RelativePath: String): Boolean
  def SearchForObjectsByCondition(SearchCondition: ISearchCondition, SortResults: Boolean): IObjectSearchResults
  def SearchForObjectsByConditions(SearchConditions: ISearchConditions, SearchFlags: MFSearchFlags, SortResults: Boolean): IObjectSearchResults
  def SearchForObjectsByConditionsEx(
    SearchConditions: ISearchConditions,
    SearchFlags: MFSearchFlags,
    SortResults: Boolean,
    MaxResultCount: Double,
    SearchTimeoutInSeconds: Double
  ): IObjectSearchResults
  def SearchForObjectsByConditionsXML(SearchConditions: ISearchConditions, SortResults: Boolean): IXMLSearchResult
  def SearchForObjectsByExportedSearchConditions(ExportedSearchString: String, SortResults: Boolean): IObjectSearchResults
  def SearchForObjectsByExportedSearchConditionsXML(SearchString: String, SortResults: Boolean): IXMLSearchResult
  def SearchForObjectsByString(SearchString: String, SortResults: Boolean, FullTextSearchFlags: MFFullTextSearchFlags): IObjectSearchResults
}

object IVaultObjectSearchOperations {
  @scala.inline
  def apply(
    FindFile: (String, Boolean) => CallbackTo[IObjectFileAndVersion],
    FindObjectVersionAndProperties: (String, Boolean) => CallbackTo[IObjectVersionAndProperties],
    GetFacetValues: (ISearchConditions, IExpressions, Double, MFFacetSearchFlags) => CallbackTo[IStringData],
    GetFacetValuesByPath: (String, IExpressions, Double, MFFacetSearchFlags) => CallbackTo[IStringData],
    GetObjectCountInSearch: (ISearchConditions, MFSearchFlags) => CallbackTo[Double],
    GetObjectsInPath: (String, Boolean, Boolean) => CallbackTo[IObjectSearchResults],
    GetSearchHits: (String, ISearchCondition) => CallbackTo[IStrings],
    IsObjectPathInMFiles: String => CallbackTo[Boolean],
    SearchForObjectsByCondition: (ISearchCondition, Boolean) => CallbackTo[IObjectSearchResults],
    SearchForObjectsByConditions: (ISearchConditions, MFSearchFlags, Boolean) => CallbackTo[IObjectSearchResults],
    SearchForObjectsByConditionsEx: (ISearchConditions, MFSearchFlags, Boolean, Double, Double) => CallbackTo[IObjectSearchResults],
    SearchForObjectsByConditionsXML: (ISearchConditions, Boolean) => CallbackTo[IXMLSearchResult],
    SearchForObjectsByExportedSearchConditions: (String, Boolean) => CallbackTo[IObjectSearchResults],
    SearchForObjectsByExportedSearchConditionsXML: (String, Boolean) => CallbackTo[IXMLSearchResult],
    SearchForObjectsByString: (String, Boolean, MFFullTextSearchFlags) => CallbackTo[IObjectSearchResults]
  ): IVaultObjectSearchOperations = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("FindFile")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Boolean) => FindFile(t0, t1).runNow()))
    __obj.updateDynamic("FindObjectVersionAndProperties")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Boolean) => FindObjectVersionAndProperties(t0, t1).runNow()))
    __obj.updateDynamic("GetFacetValues")(js.Any.fromFunction4((t0: typingsJapgolly.mfiles.ISearchConditions, t1: typingsJapgolly.mfiles.IExpressions, t2: scala.Double, t3: typingsJapgolly.mfiles.MFiles.MFFacetSearchFlags) => GetFacetValues(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("GetFacetValuesByPath")(js.Any.fromFunction4((t0: java.lang.String, t1: typingsJapgolly.mfiles.IExpressions, t2: scala.Double, t3: typingsJapgolly.mfiles.MFiles.MFFacetSearchFlags) => GetFacetValuesByPath(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("GetObjectCountInSearch")(js.Any.fromFunction2((t0: typingsJapgolly.mfiles.ISearchConditions, t1: typingsJapgolly.mfiles.MFiles.MFSearchFlags) => GetObjectCountInSearch(t0, t1).runNow()))
    __obj.updateDynamic("GetObjectsInPath")(js.Any.fromFunction3((t0: java.lang.String, t1: scala.Boolean, t2: scala.Boolean) => GetObjectsInPath(t0, t1, t2).runNow()))
    __obj.updateDynamic("GetSearchHits")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.mfiles.ISearchCondition) => GetSearchHits(t0, t1).runNow()))
    __obj.updateDynamic("IsObjectPathInMFiles")(js.Any.fromFunction1((t0: java.lang.String) => IsObjectPathInMFiles(t0).runNow()))
    __obj.updateDynamic("SearchForObjectsByCondition")(js.Any.fromFunction2((t0: typingsJapgolly.mfiles.ISearchCondition, t1: scala.Boolean) => SearchForObjectsByCondition(t0, t1).runNow()))
    __obj.updateDynamic("SearchForObjectsByConditions")(js.Any.fromFunction3((t0: typingsJapgolly.mfiles.ISearchConditions, t1: typingsJapgolly.mfiles.MFiles.MFSearchFlags, t2: scala.Boolean) => SearchForObjectsByConditions(t0, t1, t2).runNow()))
    __obj.updateDynamic("SearchForObjectsByConditionsEx")(js.Any.fromFunction5((t0: typingsJapgolly.mfiles.ISearchConditions, t1: typingsJapgolly.mfiles.MFiles.MFSearchFlags, t2: scala.Boolean, t3: scala.Double, t4: scala.Double) => SearchForObjectsByConditionsEx(t0, t1, t2, t3, t4).runNow()))
    __obj.updateDynamic("SearchForObjectsByConditionsXML")(js.Any.fromFunction2((t0: typingsJapgolly.mfiles.ISearchConditions, t1: scala.Boolean) => SearchForObjectsByConditionsXML(t0, t1).runNow()))
    __obj.updateDynamic("SearchForObjectsByExportedSearchConditions")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Boolean) => SearchForObjectsByExportedSearchConditions(t0, t1).runNow()))
    __obj.updateDynamic("SearchForObjectsByExportedSearchConditionsXML")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Boolean) => SearchForObjectsByExportedSearchConditionsXML(t0, t1).runNow()))
    __obj.updateDynamic("SearchForObjectsByString")(js.Any.fromFunction3((t0: java.lang.String, t1: scala.Boolean, t2: typingsJapgolly.mfiles.MFiles.MFFullTextSearchFlags) => SearchForObjectsByString(t0, t1, t2).runNow()))
    __obj.asInstanceOf[IVaultObjectSearchOperations]
  }
}

