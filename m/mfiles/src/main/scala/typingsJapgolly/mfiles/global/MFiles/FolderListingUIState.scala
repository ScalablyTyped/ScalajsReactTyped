package typingsJapgolly.mfiles.global.MFiles

import typingsJapgolly.mfiles.IFolderListingColumnSortings
import typingsJapgolly.mfiles.IFolderListingColumns
import typingsJapgolly.mfiles.IFolderListingUIState
import typingsJapgolly.mfiles.MFiles.MFFolderListingItemGroupingMode
import typingsJapgolly.mfiles.MFiles.MFFolderListingViewMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.FolderListingUIState")
@js.native
open class FolderListingUIState ()
  extends StObject
     with IFolderListingUIState {
  
  /* CompleteClass */
  var ColumnSortings: IFolderListingColumnSortings = js.native
  
  /* CompleteClass */
  var Columns: IFolderListingColumns = js.native
  
  /* CompleteClass */
  var GroupingMode: MFFolderListingItemGroupingMode = js.native
  
  /* CompleteClass */
  var IconSize: Double = js.native
  
  /* CompleteClass */
  var ViewMode: MFFolderListingViewMode = js.native
}
