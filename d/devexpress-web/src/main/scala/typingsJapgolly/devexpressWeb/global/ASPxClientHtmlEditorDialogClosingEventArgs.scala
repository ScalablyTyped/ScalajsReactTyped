package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientHtmlEditor.DialogClosing event.
  */
@JSGlobal("ASPxClientHtmlEditorDialogClosingEventArgs")
@js.native
open class ASPxClientHtmlEditorDialogClosingEventArgs ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ASPxClientHtmlEditorDialogClosingEventArgs {
  
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  /* CompleteClass */
  var cancel: Boolean = js.native
  
  /**
    * Gets the dialog object related to the event.
    */
  /* CompleteClass */
  var dialog: typingsJapgolly.devexpressWeb.ASPxClientHtmlEditorDialogBase = js.native
  
  /**
    * Gets the dialog name related to the event.
    */
  /* CompleteClass */
  var dialogName: String = js.native
  
  /**
    * Gets a string that contains specific information (if any) passed from the client side for server-side processing.
    */
  /* CompleteClass */
  var parameter: Any = js.native
}
