package typingsJapgolly.mfiles.global.MFiles

import typingsJapgolly.mfiles.IExpressions
import typingsJapgolly.mfiles.IObjectFileAndVersion
import typingsJapgolly.mfiles.IObjectSearchResults
import typingsJapgolly.mfiles.IObjectVersionAndProperties
import typingsJapgolly.mfiles.ISearchCondition
import typingsJapgolly.mfiles.ISearchConditions
import typingsJapgolly.mfiles.IStringData
import typingsJapgolly.mfiles.IStrings
import typingsJapgolly.mfiles.IVaultObjectSearchOperations
import typingsJapgolly.mfiles.IXMLSearchResult
import typingsJapgolly.mfiles.MFiles.MFFacetSearchFlags
import typingsJapgolly.mfiles.MFiles.MFFullTextSearchFlags
import typingsJapgolly.mfiles.MFiles.MFSearchFlags
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.VaultObjectSearchOperations")
@js.native
open class VaultObjectSearchOperations ()
  extends StObject
     with IVaultObjectSearchOperations {
  
  /* CompleteClass */
  override def FindFile(RelativePath: String, UpdateFromServer: Boolean): IObjectFileAndVersion = js.native
  
  /* CompleteClass */
  override def FindObjectVersionAndProperties(RelativePath: String, UpdateFromServer: Boolean): IObjectVersionAndProperties = js.native
  
  /* CompleteClass */
  override def GetFacetValues(
    SearchConditions: ISearchConditions,
    Facets: IExpressions,
    FacetValuesMaxCount: Double,
    Flags: MFFacetSearchFlags
  ): IStringData = js.native
  
  /* CompleteClass */
  override def GetFacetValuesByPath(RelativePath: String, Facets: IExpressions, FacetValuesMaxCount: Double, Flags: MFFacetSearchFlags): IStringData = js.native
  
  /* CompleteClass */
  override def GetObjectCountInSearch(SearchConditions: ISearchConditions, SearchFlags: MFSearchFlags): Double = js.native
  
  /* CompleteClass */
  override def GetObjectsInPath(RelativePath: String, SortResults: Boolean, UpdateFromServer: Boolean): IObjectSearchResults = js.native
  
  /* CompleteClass */
  override def GetSearchHits(Input: String, SearchCondition: ISearchCondition): IStrings = js.native
  
  /* CompleteClass */
  override def IsObjectPathInMFiles(RelativePath: String): Boolean = js.native
  
  /* CompleteClass */
  override def SearchForObjectsByCondition(SearchCondition: ISearchCondition, SortResults: Boolean): IObjectSearchResults = js.native
  
  /* CompleteClass */
  override def SearchForObjectsByConditions(SearchConditions: ISearchConditions, SearchFlags: MFSearchFlags, SortResults: Boolean): IObjectSearchResults = js.native
  
  /* CompleteClass */
  override def SearchForObjectsByConditionsEx(
    SearchConditions: ISearchConditions,
    SearchFlags: MFSearchFlags,
    SortResults: Boolean,
    MaxResultCount: Double,
    SearchTimeoutInSeconds: Double
  ): IObjectSearchResults = js.native
  
  /* CompleteClass */
  override def SearchForObjectsByConditionsXML(SearchConditions: ISearchConditions, SortResults: Boolean): IXMLSearchResult = js.native
  
  /* CompleteClass */
  override def SearchForObjectsByExportedSearchConditions(ExportedSearchString: String, SortResults: Boolean): IObjectSearchResults = js.native
  
  /* CompleteClass */
  override def SearchForObjectsByExportedSearchConditionsXML(SearchString: String, SortResults: Boolean): IXMLSearchResult = js.native
  
  /* CompleteClass */
  override def SearchForObjectsByString(SearchString: String, SortResults: Boolean, FullTextSearchFlags: MFFullTextSearchFlags): IObjectSearchResults = js.native
}
