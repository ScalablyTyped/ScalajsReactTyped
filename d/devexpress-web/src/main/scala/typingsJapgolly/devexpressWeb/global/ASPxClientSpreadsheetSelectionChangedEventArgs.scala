package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientSpreadsheet.SelectionChanged event.
  */
@JSGlobal("ASPxClientSpreadsheetSelectionChangedEventArgs")
@js.native
open class ASPxClientSpreadsheetSelectionChangedEventArgs protected ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ASPxClientSpreadsheetSelectionChangedEventArgs {
  /**
    * Initializes a new instance of the ASPxClientSpreadsheetSelectionChangedEventArgs within the specified setting.
    * @param selection An ASPxClientSpreadsheetSelection object defining the selection in the Spreadsheet.
    */
  def this(selection: typingsJapgolly.devexpressWeb.ASPxClientSpreadsheetSelection) = this()
  
  /**
    * Gets an object that determines the currently selected region within the Spreadsheet.
    */
  /* CompleteClass */
  var selection: typingsJapgolly.devexpressWeb.ASPxClientSpreadsheetSelection = js.native
}
