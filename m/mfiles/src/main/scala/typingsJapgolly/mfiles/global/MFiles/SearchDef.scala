package typingsJapgolly.mfiles.global.MFiles

import typingsJapgolly.mfiles.IExpressionExs
import typingsJapgolly.mfiles.ISearchConditions
import typingsJapgolly.mfiles.ISearchDef
import typingsJapgolly.mfiles.MFiles.MFSearchFlags
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.SearchDef")
@js.native
open class SearchDef ()
  extends StObject
     with ISearchDef {
  
  /* CompleteClass */
  override def Clone(): ISearchDef = js.native
  
  /* CompleteClass */
  var Conditions: ISearchConditions = js.native
  
  /* CompleteClass */
  override def IsIndirectionUsed(): Boolean = js.native
  
  /* CompleteClass */
  var Levels: IExpressionExs = js.native
  
  /* CompleteClass */
  var LookInAllVersions: Boolean = js.native
  
  /* CompleteClass */
  var ReturnLatestVisibleVersion: Boolean = js.native
  
  /* CompleteClass */
  var SearchFlags: MFSearchFlags = js.native
}
