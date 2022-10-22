package typingsJapgolly.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientUploadControl.ValidationErrorOccurred event.
  */
trait ASPxClientUploadControlValidationErrorOccurredEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets or sets the error text.
    */
  var errorText: String
  
  /**
    * Returns an array of invalid files.
    */
  var invalidFiles: js.Array[ASPxClientUploadControlInvalidFileInfo]
  
  /**
    * Gets or sets a value specifying whether an alert message is displayed when the ASPxClientUploadControl.ValidationErrorOccurred event fires.
    */
  var showAlert: Boolean
  
  /**
    * Gets the validation settings for the selected files.
    */
  var validationSettings: ASPxClientUploadControlValidationSettings
}
object ASPxClientUploadControlValidationErrorOccurredEventArgs {
  
  inline def apply(
    errorText: String,
    invalidFiles: js.Array[ASPxClientUploadControlInvalidFileInfo],
    showAlert: Boolean,
    validationSettings: ASPxClientUploadControlValidationSettings
  ): ASPxClientUploadControlValidationErrorOccurredEventArgs = {
    val __obj = js.Dynamic.literal(errorText = errorText.asInstanceOf[js.Any], invalidFiles = invalidFiles.asInstanceOf[js.Any], showAlert = showAlert.asInstanceOf[js.Any], validationSettings = validationSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientUploadControlValidationErrorOccurredEventArgs]
  }
  
  extension [Self <: ASPxClientUploadControlValidationErrorOccurredEventArgs](x: Self) {
    
    inline def setErrorText(value: String): Self = StObject.set(x, "errorText", value.asInstanceOf[js.Any])
    
    inline def setInvalidFiles(value: js.Array[ASPxClientUploadControlInvalidFileInfo]): Self = StObject.set(x, "invalidFiles", value.asInstanceOf[js.Any])
    
    inline def setInvalidFilesVarargs(value: ASPxClientUploadControlInvalidFileInfo*): Self = StObject.set(x, "invalidFiles", js.Array(value*))
    
    inline def setShowAlert(value: Boolean): Self = StObject.set(x, "showAlert", value.asInstanceOf[js.Any])
    
    inline def setValidationSettings(value: ASPxClientUploadControlValidationSettings): Self = StObject.set(x, "validationSettings", value.asInstanceOf[js.Any])
  }
}
