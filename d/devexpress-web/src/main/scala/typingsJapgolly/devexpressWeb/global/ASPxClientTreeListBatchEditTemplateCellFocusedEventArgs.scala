package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientTreeList.BatchEditTemplateCellFocused event.
  */
@JSGlobal("ASPxClientTreeListBatchEditTemplateCellFocusedEventArgs")
@js.native
open class ASPxClientTreeListBatchEditTemplateCellFocusedEventArgs protected ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ASPxClientTreeListBatchEditTemplateCellFocusedEventArgs {
  /**
    * Initializes a new instance of the ASPxClientTreeListBatchEditTemplateCellFocusedEventArgs class.
    * @param column An ASPxClientTreeListColumn object specifying the column.
    */
  def this(column: typingsJapgolly.devexpressWeb.ASPxClientTreeListColumn) = this()
  
  /**
    * Gets the currently processed column.
    */
  /* CompleteClass */
  var column: typingsJapgolly.devexpressWeb.ASPxClientTreeListColumn = js.native
  
  /**
    * Gets or sets a value specifying whether the event was handled.
    */
  /* CompleteClass */
  var handled: Boolean = js.native
}
