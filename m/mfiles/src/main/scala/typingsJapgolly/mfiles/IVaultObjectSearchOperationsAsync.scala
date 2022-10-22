package typingsJapgolly.mfiles

import typingsJapgolly.mfiles.MFiles.MFFacetSearchFlags
import typingsJapgolly.mfiles.MFiles.MFFullTextSearchFlags
import typingsJapgolly.mfiles.MFiles.MFSearchFlags
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IVaultObjectSearchOperationsAsync extends StObject {
  
  def FindFile(RelativePath: String, UpdateFromServer: Boolean): Unit = js.native
  def FindFile(
    RelativePath: String,
    UpdateFromServer: Boolean,
    successCallback: js.Function1[/* result */ IObjectFileAndVersion, Unit]
  ): Unit = js.native
  def FindFile(
    RelativePath: String,
    UpdateFromServer: Boolean,
    successCallback: js.Function1[/* result */ IObjectFileAndVersion, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit]
  ): Unit = js.native
  def FindFile(
    RelativePath: String,
    UpdateFromServer: Boolean,
    successCallback: js.Function1[/* result */ IObjectFileAndVersion, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def FindFile(
    RelativePath: String,
    UpdateFromServer: Boolean,
    successCallback: js.Function1[/* result */ IObjectFileAndVersion, Unit],
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def FindFile(
    RelativePath: String,
    UpdateFromServer: Boolean,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit]
  ): Unit = js.native
  def FindFile(
    RelativePath: String,
    UpdateFromServer: Boolean,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def FindFile(
    RelativePath: String,
    UpdateFromServer: Boolean,
    successCallback: Unit,
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def FindObjectVersionAndProperties(RelativePath: String, UpdateFromServer: Boolean): Unit = js.native
  def FindObjectVersionAndProperties(
    RelativePath: String,
    UpdateFromServer: Boolean,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, Unit]
  ): Unit = js.native
  def FindObjectVersionAndProperties(
    RelativePath: String,
    UpdateFromServer: Boolean,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit]
  ): Unit = js.native
  def FindObjectVersionAndProperties(
    RelativePath: String,
    UpdateFromServer: Boolean,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def FindObjectVersionAndProperties(
    RelativePath: String,
    UpdateFromServer: Boolean,
    successCallback: js.Function1[/* result */ IObjectVersionAndProperties, Unit],
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def FindObjectVersionAndProperties(
    RelativePath: String,
    UpdateFromServer: Boolean,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit]
  ): Unit = js.native
  def FindObjectVersionAndProperties(
    RelativePath: String,
    UpdateFromServer: Boolean,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def FindObjectVersionAndProperties(
    RelativePath: String,
    UpdateFromServer: Boolean,
    successCallback: Unit,
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def GetFacetValues(
    SearchConditions: ISearchConditions,
    Facets: IExpressions,
    FacetValuesMaxCount: Double,
    Flags: MFFacetSearchFlags
  ): Unit = js.native
  def GetFacetValues(
    SearchConditions: ISearchConditions,
    Facets: IExpressions,
    FacetValuesMaxCount: Double,
    Flags: MFFacetSearchFlags,
    successCallback: js.Function1[/* result */ IStringData, Unit]
  ): Unit = js.native
  def GetFacetValues(
    SearchConditions: ISearchConditions,
    Facets: IExpressions,
    FacetValuesMaxCount: Double,
    Flags: MFFacetSearchFlags,
    successCallback: js.Function1[/* result */ IStringData, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit]
  ): Unit = js.native
  def GetFacetValues(
    SearchConditions: ISearchConditions,
    Facets: IExpressions,
    FacetValuesMaxCount: Double,
    Flags: MFFacetSearchFlags,
    successCallback: js.Function1[/* result */ IStringData, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetFacetValues(
    SearchConditions: ISearchConditions,
    Facets: IExpressions,
    FacetValuesMaxCount: Double,
    Flags: MFFacetSearchFlags,
    successCallback: js.Function1[/* result */ IStringData, Unit],
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetFacetValues(
    SearchConditions: ISearchConditions,
    Facets: IExpressions,
    FacetValuesMaxCount: Double,
    Flags: MFFacetSearchFlags,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit]
  ): Unit = js.native
  def GetFacetValues(
    SearchConditions: ISearchConditions,
    Facets: IExpressions,
    FacetValuesMaxCount: Double,
    Flags: MFFacetSearchFlags,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetFacetValues(
    SearchConditions: ISearchConditions,
    Facets: IExpressions,
    FacetValuesMaxCount: Double,
    Flags: MFFacetSearchFlags,
    successCallback: Unit,
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def GetFacetValuesByPath(RelativePath: String, Facets: IExpressions, FacetValuesMaxCount: Double, Flags: MFFacetSearchFlags): Unit = js.native
  def GetFacetValuesByPath(
    RelativePath: String,
    Facets: IExpressions,
    FacetValuesMaxCount: Double,
    Flags: MFFacetSearchFlags,
    successCallback: js.Function1[/* result */ IStringData, Unit]
  ): Unit = js.native
  def GetFacetValuesByPath(
    RelativePath: String,
    Facets: IExpressions,
    FacetValuesMaxCount: Double,
    Flags: MFFacetSearchFlags,
    successCallback: js.Function1[/* result */ IStringData, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit]
  ): Unit = js.native
  def GetFacetValuesByPath(
    RelativePath: String,
    Facets: IExpressions,
    FacetValuesMaxCount: Double,
    Flags: MFFacetSearchFlags,
    successCallback: js.Function1[/* result */ IStringData, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetFacetValuesByPath(
    RelativePath: String,
    Facets: IExpressions,
    FacetValuesMaxCount: Double,
    Flags: MFFacetSearchFlags,
    successCallback: js.Function1[/* result */ IStringData, Unit],
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetFacetValuesByPath(
    RelativePath: String,
    Facets: IExpressions,
    FacetValuesMaxCount: Double,
    Flags: MFFacetSearchFlags,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit]
  ): Unit = js.native
  def GetFacetValuesByPath(
    RelativePath: String,
    Facets: IExpressions,
    FacetValuesMaxCount: Double,
    Flags: MFFacetSearchFlags,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetFacetValuesByPath(
    RelativePath: String,
    Facets: IExpressions,
    FacetValuesMaxCount: Double,
    Flags: MFFacetSearchFlags,
    successCallback: Unit,
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def GetObjectCountInSearch(SearchConditions: ISearchConditions, SearchFlags: MFSearchFlags): Unit = js.native
  def GetObjectCountInSearch(
    SearchConditions: ISearchConditions,
    SearchFlags: MFSearchFlags,
    successCallback: js.Function1[/* result */ Double, Unit]
  ): Unit = js.native
  def GetObjectCountInSearch(
    SearchConditions: ISearchConditions,
    SearchFlags: MFSearchFlags,
    successCallback: js.Function1[/* result */ Double, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit]
  ): Unit = js.native
  def GetObjectCountInSearch(
    SearchConditions: ISearchConditions,
    SearchFlags: MFSearchFlags,
    successCallback: js.Function1[/* result */ Double, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetObjectCountInSearch(
    SearchConditions: ISearchConditions,
    SearchFlags: MFSearchFlags,
    successCallback: js.Function1[/* result */ Double, Unit],
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetObjectCountInSearch(
    SearchConditions: ISearchConditions,
    SearchFlags: MFSearchFlags,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit]
  ): Unit = js.native
  def GetObjectCountInSearch(
    SearchConditions: ISearchConditions,
    SearchFlags: MFSearchFlags,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetObjectCountInSearch(
    SearchConditions: ISearchConditions,
    SearchFlags: MFSearchFlags,
    successCallback: Unit,
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def GetObjectsInPath(RelativePath: String, SortResults: Boolean, UpdateFromServer: Boolean): Unit = js.native
  def GetObjectsInPath(
    RelativePath: String,
    SortResults: Boolean,
    UpdateFromServer: Boolean,
    successCallback: js.Function1[/* result */ IObjectSearchResults, Unit]
  ): Unit = js.native
  def GetObjectsInPath(
    RelativePath: String,
    SortResults: Boolean,
    UpdateFromServer: Boolean,
    successCallback: js.Function1[/* result */ IObjectSearchResults, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit]
  ): Unit = js.native
  def GetObjectsInPath(
    RelativePath: String,
    SortResults: Boolean,
    UpdateFromServer: Boolean,
    successCallback: js.Function1[/* result */ IObjectSearchResults, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetObjectsInPath(
    RelativePath: String,
    SortResults: Boolean,
    UpdateFromServer: Boolean,
    successCallback: js.Function1[/* result */ IObjectSearchResults, Unit],
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetObjectsInPath(
    RelativePath: String,
    SortResults: Boolean,
    UpdateFromServer: Boolean,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit]
  ): Unit = js.native
  def GetObjectsInPath(
    RelativePath: String,
    SortResults: Boolean,
    UpdateFromServer: Boolean,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetObjectsInPath(
    RelativePath: String,
    SortResults: Boolean,
    UpdateFromServer: Boolean,
    successCallback: Unit,
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def GetSearchHits(Input: String, SearchCondition: ISearchCondition): Unit = js.native
  def GetSearchHits(
    Input: String,
    SearchCondition: ISearchCondition,
    successCallback: js.Function1[/* result */ IStrings, Unit]
  ): Unit = js.native
  def GetSearchHits(
    Input: String,
    SearchCondition: ISearchCondition,
    successCallback: js.Function1[/* result */ IStrings, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit]
  ): Unit = js.native
  def GetSearchHits(
    Input: String,
    SearchCondition: ISearchCondition,
    successCallback: js.Function1[/* result */ IStrings, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetSearchHits(
    Input: String,
    SearchCondition: ISearchCondition,
    successCallback: js.Function1[/* result */ IStrings, Unit],
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetSearchHits(
    Input: String,
    SearchCondition: ISearchCondition,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit]
  ): Unit = js.native
  def GetSearchHits(
    Input: String,
    SearchCondition: ISearchCondition,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def GetSearchHits(
    Input: String,
    SearchCondition: ISearchCondition,
    successCallback: Unit,
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def IsObjectPathInMFiles(RelativePath: String): Unit = js.native
  def IsObjectPathInMFiles(RelativePath: String, successCallback: js.Function1[/* result */ Boolean, Unit]): Unit = js.native
  def IsObjectPathInMFiles(
    RelativePath: String,
    successCallback: js.Function1[/* result */ Boolean, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit]
  ): Unit = js.native
  def IsObjectPathInMFiles(
    RelativePath: String,
    successCallback: js.Function1[/* result */ Boolean, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def IsObjectPathInMFiles(
    RelativePath: String,
    successCallback: js.Function1[/* result */ Boolean, Unit],
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def IsObjectPathInMFiles(
    RelativePath: String,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit]
  ): Unit = js.native
  def IsObjectPathInMFiles(
    RelativePath: String,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def IsObjectPathInMFiles(
    RelativePath: String,
    successCallback: Unit,
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def SearchForObjectsByCondition(SearchCondition: ISearchCondition, SortResults: Boolean): Unit = js.native
  def SearchForObjectsByCondition(
    SearchCondition: ISearchCondition,
    SortResults: Boolean,
    successCallback: js.Function1[/* result */ IObjectSearchResults, Unit]
  ): Unit = js.native
  def SearchForObjectsByCondition(
    SearchCondition: ISearchCondition,
    SortResults: Boolean,
    successCallback: js.Function1[/* result */ IObjectSearchResults, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit]
  ): Unit = js.native
  def SearchForObjectsByCondition(
    SearchCondition: ISearchCondition,
    SortResults: Boolean,
    successCallback: js.Function1[/* result */ IObjectSearchResults, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def SearchForObjectsByCondition(
    SearchCondition: ISearchCondition,
    SortResults: Boolean,
    successCallback: js.Function1[/* result */ IObjectSearchResults, Unit],
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def SearchForObjectsByCondition(
    SearchCondition: ISearchCondition,
    SortResults: Boolean,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit]
  ): Unit = js.native
  def SearchForObjectsByCondition(
    SearchCondition: ISearchCondition,
    SortResults: Boolean,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def SearchForObjectsByCondition(
    SearchCondition: ISearchCondition,
    SortResults: Boolean,
    successCallback: Unit,
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def SearchForObjectsByConditions(SearchConditions: ISearchConditions, SearchFlags: MFSearchFlags, SortResults: Boolean): Unit = js.native
  def SearchForObjectsByConditions(
    SearchConditions: ISearchConditions,
    SearchFlags: MFSearchFlags,
    SortResults: Boolean,
    successCallback: js.Function1[/* result */ IObjectSearchResults, Unit]
  ): Unit = js.native
  def SearchForObjectsByConditions(
    SearchConditions: ISearchConditions,
    SearchFlags: MFSearchFlags,
    SortResults: Boolean,
    successCallback: js.Function1[/* result */ IObjectSearchResults, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit]
  ): Unit = js.native
  def SearchForObjectsByConditions(
    SearchConditions: ISearchConditions,
    SearchFlags: MFSearchFlags,
    SortResults: Boolean,
    successCallback: js.Function1[/* result */ IObjectSearchResults, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def SearchForObjectsByConditions(
    SearchConditions: ISearchConditions,
    SearchFlags: MFSearchFlags,
    SortResults: Boolean,
    successCallback: js.Function1[/* result */ IObjectSearchResults, Unit],
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def SearchForObjectsByConditions(
    SearchConditions: ISearchConditions,
    SearchFlags: MFSearchFlags,
    SortResults: Boolean,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit]
  ): Unit = js.native
  def SearchForObjectsByConditions(
    SearchConditions: ISearchConditions,
    SearchFlags: MFSearchFlags,
    SortResults: Boolean,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def SearchForObjectsByConditions(
    SearchConditions: ISearchConditions,
    SearchFlags: MFSearchFlags,
    SortResults: Boolean,
    successCallback: Unit,
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def SearchForObjectsByConditionsEx(
    SearchConditions: ISearchConditions,
    SearchFlags: MFSearchFlags,
    SortResults: Boolean,
    MaxResultCount: Double,
    SearchTimeoutInSeconds: Double
  ): Unit = js.native
  def SearchForObjectsByConditionsEx(
    SearchConditions: ISearchConditions,
    SearchFlags: MFSearchFlags,
    SortResults: Boolean,
    MaxResultCount: Double,
    SearchTimeoutInSeconds: Double,
    successCallback: js.Function1[/* result */ IObjectSearchResults, Unit]
  ): Unit = js.native
  def SearchForObjectsByConditionsEx(
    SearchConditions: ISearchConditions,
    SearchFlags: MFSearchFlags,
    SortResults: Boolean,
    MaxResultCount: Double,
    SearchTimeoutInSeconds: Double,
    successCallback: js.Function1[/* result */ IObjectSearchResults, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit]
  ): Unit = js.native
  def SearchForObjectsByConditionsEx(
    SearchConditions: ISearchConditions,
    SearchFlags: MFSearchFlags,
    SortResults: Boolean,
    MaxResultCount: Double,
    SearchTimeoutInSeconds: Double,
    successCallback: js.Function1[/* result */ IObjectSearchResults, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def SearchForObjectsByConditionsEx(
    SearchConditions: ISearchConditions,
    SearchFlags: MFSearchFlags,
    SortResults: Boolean,
    MaxResultCount: Double,
    SearchTimeoutInSeconds: Double,
    successCallback: js.Function1[/* result */ IObjectSearchResults, Unit],
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def SearchForObjectsByConditionsEx(
    SearchConditions: ISearchConditions,
    SearchFlags: MFSearchFlags,
    SortResults: Boolean,
    MaxResultCount: Double,
    SearchTimeoutInSeconds: Double,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit]
  ): Unit = js.native
  def SearchForObjectsByConditionsEx(
    SearchConditions: ISearchConditions,
    SearchFlags: MFSearchFlags,
    SortResults: Boolean,
    MaxResultCount: Double,
    SearchTimeoutInSeconds: Double,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def SearchForObjectsByConditionsEx(
    SearchConditions: ISearchConditions,
    SearchFlags: MFSearchFlags,
    SortResults: Boolean,
    MaxResultCount: Double,
    SearchTimeoutInSeconds: Double,
    successCallback: Unit,
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def SearchForObjectsByConditionsXML(SearchConditions: ISearchConditions, SortResults: Boolean): Unit = js.native
  def SearchForObjectsByConditionsXML(
    SearchConditions: ISearchConditions,
    SortResults: Boolean,
    successCallback: js.Function1[/* result */ IXMLSearchResult, Unit]
  ): Unit = js.native
  def SearchForObjectsByConditionsXML(
    SearchConditions: ISearchConditions,
    SortResults: Boolean,
    successCallback: js.Function1[/* result */ IXMLSearchResult, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit]
  ): Unit = js.native
  def SearchForObjectsByConditionsXML(
    SearchConditions: ISearchConditions,
    SortResults: Boolean,
    successCallback: js.Function1[/* result */ IXMLSearchResult, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def SearchForObjectsByConditionsXML(
    SearchConditions: ISearchConditions,
    SortResults: Boolean,
    successCallback: js.Function1[/* result */ IXMLSearchResult, Unit],
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def SearchForObjectsByConditionsXML(
    SearchConditions: ISearchConditions,
    SortResults: Boolean,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit]
  ): Unit = js.native
  def SearchForObjectsByConditionsXML(
    SearchConditions: ISearchConditions,
    SortResults: Boolean,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def SearchForObjectsByConditionsXML(
    SearchConditions: ISearchConditions,
    SortResults: Boolean,
    successCallback: Unit,
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def SearchForObjectsByExportedSearchConditions(ExportedSearchString: String, SortResults: Boolean): Unit = js.native
  def SearchForObjectsByExportedSearchConditions(
    ExportedSearchString: String,
    SortResults: Boolean,
    successCallback: js.Function1[/* result */ IObjectSearchResults, Unit]
  ): Unit = js.native
  def SearchForObjectsByExportedSearchConditions(
    ExportedSearchString: String,
    SortResults: Boolean,
    successCallback: js.Function1[/* result */ IObjectSearchResults, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit]
  ): Unit = js.native
  def SearchForObjectsByExportedSearchConditions(
    ExportedSearchString: String,
    SortResults: Boolean,
    successCallback: js.Function1[/* result */ IObjectSearchResults, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def SearchForObjectsByExportedSearchConditions(
    ExportedSearchString: String,
    SortResults: Boolean,
    successCallback: js.Function1[/* result */ IObjectSearchResults, Unit],
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def SearchForObjectsByExportedSearchConditions(
    ExportedSearchString: String,
    SortResults: Boolean,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit]
  ): Unit = js.native
  def SearchForObjectsByExportedSearchConditions(
    ExportedSearchString: String,
    SortResults: Boolean,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def SearchForObjectsByExportedSearchConditions(
    ExportedSearchString: String,
    SortResults: Boolean,
    successCallback: Unit,
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def SearchForObjectsByExportedSearchConditionsXML(SearchString: String, SortResults: Boolean): Unit = js.native
  def SearchForObjectsByExportedSearchConditionsXML(
    SearchString: String,
    SortResults: Boolean,
    successCallback: js.Function1[/* result */ IXMLSearchResult, Unit]
  ): Unit = js.native
  def SearchForObjectsByExportedSearchConditionsXML(
    SearchString: String,
    SortResults: Boolean,
    successCallback: js.Function1[/* result */ IXMLSearchResult, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit]
  ): Unit = js.native
  def SearchForObjectsByExportedSearchConditionsXML(
    SearchString: String,
    SortResults: Boolean,
    successCallback: js.Function1[/* result */ IXMLSearchResult, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def SearchForObjectsByExportedSearchConditionsXML(
    SearchString: String,
    SortResults: Boolean,
    successCallback: js.Function1[/* result */ IXMLSearchResult, Unit],
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def SearchForObjectsByExportedSearchConditionsXML(
    SearchString: String,
    SortResults: Boolean,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit]
  ): Unit = js.native
  def SearchForObjectsByExportedSearchConditionsXML(
    SearchString: String,
    SortResults: Boolean,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def SearchForObjectsByExportedSearchConditionsXML(
    SearchString: String,
    SortResults: Boolean,
    successCallback: Unit,
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def SearchForObjectsByString(SearchString: String, SortResults: Boolean, FullTextSearchFlags: MFFullTextSearchFlags): Unit = js.native
  def SearchForObjectsByString(
    SearchString: String,
    SortResults: Boolean,
    FullTextSearchFlags: MFFullTextSearchFlags,
    successCallback: js.Function1[/* result */ IObjectSearchResults, Unit]
  ): Unit = js.native
  def SearchForObjectsByString(
    SearchString: String,
    SortResults: Boolean,
    FullTextSearchFlags: MFFullTextSearchFlags,
    successCallback: js.Function1[/* result */ IObjectSearchResults, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit]
  ): Unit = js.native
  def SearchForObjectsByString(
    SearchString: String,
    SortResults: Boolean,
    FullTextSearchFlags: MFFullTextSearchFlags,
    successCallback: js.Function1[/* result */ IObjectSearchResults, Unit],
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def SearchForObjectsByString(
    SearchString: String,
    SortResults: Boolean,
    FullTextSearchFlags: MFFullTextSearchFlags,
    successCallback: js.Function1[/* result */ IObjectSearchResults, Unit],
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def SearchForObjectsByString(
    SearchString: String,
    SortResults: Boolean,
    FullTextSearchFlags: MFFullTextSearchFlags,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit]
  ): Unit = js.native
  def SearchForObjectsByString(
    SearchString: String,
    SortResults: Boolean,
    FullTextSearchFlags: MFFullTextSearchFlags,
    successCallback: Unit,
    errorCallback: js.Function3[/* shorterror */ String, /* longerror */ String, /* errorobj */ Any, Unit],
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
  def SearchForObjectsByString(
    SearchString: String,
    SortResults: Boolean,
    FullTextSearchFlags: MFFullTextSearchFlags,
    successCallback: Unit,
    errorCallback: Unit,
    finallyCallback: js.Function0[Unit]
  ): Unit = js.native
}
