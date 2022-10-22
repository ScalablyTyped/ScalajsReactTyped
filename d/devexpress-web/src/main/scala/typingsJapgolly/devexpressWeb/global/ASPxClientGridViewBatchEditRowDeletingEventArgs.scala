package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientGridView.BatchEditRowDeleting event.
  */
@JSGlobal("ASPxClientGridViewBatchEditRowDeletingEventArgs")
@js.native
open class ASPxClientGridViewBatchEditRowDeletingEventArgs protected ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ASPxClientGridViewBatchEditRowDeletingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientGridViewBatchEditRowDeletingEventArgs class.
    * @param visibleIndex An integer value that specifies the row's visible index.
    * @param rowValues An object that provides row values.
    * @param key An object that is the row's key.
    */
  def this(visibleIndex: Double, rowValues: Any, key: Any) = this()
  
  /**
    * Specifies whether to cancel the related action (for example, row edit, export).
    */
  /* CompleteClass */
  var cancel: Boolean = js.native
  
  /**
    * Gets the row's key.
    */
  /* CompleteClass */
  var key: Any = js.native
  
  /**
    * Gets a hashtable that maintains information about deleted cells.
    */
  /* CompleteClass */
  var rowValues: Any = js.native
  
  /**
    * Gets the processed row's visible index.
    */
  /* CompleteClass */
  var visibleIndex: Double = js.native
}
