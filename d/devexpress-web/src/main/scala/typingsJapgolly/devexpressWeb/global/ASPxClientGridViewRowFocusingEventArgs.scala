package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientGridView.RowFocusing event.
  */
@JSGlobal("ASPxClientGridViewRowFocusingEventArgs")
@js.native
open class ASPxClientGridViewRowFocusingEventArgs protected ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ASPxClientGridViewRowFocusingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientGridViewRowFocusingEventArgs class.
    * @param visibleIndex An integer value specifying the row visible index.
    * @param htmlEvent An object specifying the HTML event.
    */
  def this(visibleIndex: Double, htmlEvent: Any) = this()
  
  /**
    * Specifies whether to cancel the related action (for example, row edit, export).
    */
  /* CompleteClass */
  var cancel: Boolean = js.native
  
  /**
    * Provides access to the parameters associated with the ASPxClientGridView.RowFocusing event.
    */
  /* CompleteClass */
  var htmlEvent: Any = js.native
  
  /**
    * Gets the processed row's visible index.
    */
  /* CompleteClass */
  var visibleIndex: Double = js.native
}
