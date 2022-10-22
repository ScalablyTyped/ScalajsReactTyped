package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientCardView.BatchEditTemplateCellFocused event.
  */
@JSGlobal("ASPxClientCardViewBatchEditTemplateCellFocusedEventArgs")
@js.native
open class ASPxClientCardViewBatchEditTemplateCellFocusedEventArgs protected ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ASPxClientCardViewBatchEditTemplateCellFocusedEventArgs {
  /**
    * Initializes a new instance of the ASPxClientCardViewBatchEditTemplateCellFocusedEventArgs class with the specified column.
    * @param column An ASPxClientCardViewColumn object that is the processed CardView column. This value is assigned to the ASPxClientCardViewBatchEditTemplateCellFocusedEventArgs.column property.
    */
  def this(column: typingsJapgolly.devexpressWeb.ASPxClientCardViewColumn) = this()
  
  /**
    * Gets the currently processed column.
    */
  /* CompleteClass */
  var column: typingsJapgolly.devexpressWeb.ASPxClientCardViewColumn = js.native
  
  /**
    * Gets or sets a value specifying whether the event was handled.
    */
  /* CompleteClass */
  var handled: Boolean = js.native
}
