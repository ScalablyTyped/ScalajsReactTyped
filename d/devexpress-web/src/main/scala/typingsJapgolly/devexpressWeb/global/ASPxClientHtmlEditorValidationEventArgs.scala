package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientHtmlEditor.Validation client event.
  */
@JSGlobal("ASPxClientHtmlEditorValidationEventArgs")
@js.native
open class ASPxClientHtmlEditorValidationEventArgs protected ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ASPxClientHtmlEditorValidationEventArgs {
  /**
    * Initializes a new instance of the ASPxClientHtmlEditorValidationEventArgs class.
    * @param html A string value that specifies the HTML content to validate. This value is assigned to the ASPxClientHtmlEditorValidationEventArgs.html property.
    * @param isValid true if the validation has been completed successfully; otherwise, false. This value is assigned to the ASPxClientHtmlEditorValidationEventArgs.isValid property.
    * @param errorText A string value representing the error description. This value is assigned to the ASPxClientHtmlEditorValidationEventArgs.errorText property.
    */
  def this(html: String, isValid: Boolean, errorText: Boolean) = this()
  
  /**
    * Gets or sets the error text to be displayed within the editor's error frame if the editor's validation fails.
    */
  /* CompleteClass */
  var errorText: String = js.native
  
  /**
    * Gets or sets the HTML markup that is the ASPxHtmlEditor's content.
    */
  /* CompleteClass */
  var html: String = js.native
  
  /**
    * Gets or sets a value specifying whether the validated value is valid.
    */
  /* CompleteClass */
  var isValid: Boolean = js.native
}
