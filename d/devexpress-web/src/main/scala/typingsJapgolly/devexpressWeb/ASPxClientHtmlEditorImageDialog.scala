package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides client functionality for the Image dialog within the  ASPxHtmlEditor.
  */
trait ASPxClientHtmlEditorImageDialog
  extends StObject
     with ASPxClientHtmlEditorMediaDialogBase {
  
  /**
    * Provides access to the client object of the "Create thumbnail" check box in the Html Editor's Image dialog.
    */
  def GetCreateThumbnailCheckBox(): ASPxClientCheckBox
  
  /**
    * Provides access to the client object of the "Description" text box in the Html Editor's Image dialog.
    */
  def GetDescriptionTextBox(): ASPxClientTextBox
  
  /**
    * Provides access to the client object of the "Size" combo box in the Html Editor's Image dialog.
    */
  def GetSizeComboBox(): ASPxClientComboBox
  
  /**
    * Provides access to the client object of the "New image name" text box in the Html Editor's Image dialog.
    */
  def GetThumbnailNameTextBox(): ASPxClientTextBox
  
  /**
    * Provides access to the client object of the "Wrap text around image" check box in the Html Editor's Image dialog.
    */
  def GetWrapTextCheckBox(): ASPxClientCheckBox
}
object ASPxClientHtmlEditorImageDialog {
  
  inline def apply(
    GetBorderColorColorEdit: CallbackTo[ASPxClientColorEdit],
    GetBorderStyleComboBox: CallbackTo[ASPxClientComboBox],
    GetBorderWidthSpinEdit: CallbackTo[ASPxClientSpinEdit],
    GetBottomMarginTextBox: CallbackTo[ASPxClientTextBox],
    GetCancelButton: CallbackTo[ASPxClientButton],
    GetCreateThumbnailCheckBox: CallbackTo[ASPxClientCheckBox],
    GetCssClassNameComboBox: CallbackTo[ASPxClientComboBox],
    GetDescriptionTextBox: CallbackTo[ASPxClientTextBox],
    GetFormLayout: CallbackTo[ASPxClientFormLayout],
    GetHeightSpinEdit: CallbackTo[ASPxClientSpinEdit],
    GetLeftMarginTextBox: CallbackTo[ASPxClientTextBox],
    GetMediaFileSelector: CallbackTo[ASPxClientMediaFileSelector],
    GetMoreOptionsCheckBox: CallbackTo[ASPxClientCheckBox],
    GetOkButton: CallbackTo[ASPxClientButton],
    GetPositionComboBox: CallbackTo[ASPxClientComboBox],
    GetRightMarginTextBox: CallbackTo[ASPxClientTextBox],
    GetSizeComboBox: CallbackTo[ASPxClientComboBox],
    GetThumbnailNameTextBox: CallbackTo[ASPxClientTextBox],
    GetTopMarginTextBox: CallbackTo[ASPxClientTextBox],
    GetWidthSpinEdit: CallbackTo[ASPxClientSpinEdit],
    GetWrapTextCheckBox: CallbackTo[ASPxClientCheckBox]
  ): ASPxClientHtmlEditorImageDialog = {
    val __obj = js.Dynamic.literal(GetBorderColorColorEdit = GetBorderColorColorEdit.toJsFn, GetBorderStyleComboBox = GetBorderStyleComboBox.toJsFn, GetBorderWidthSpinEdit = GetBorderWidthSpinEdit.toJsFn, GetBottomMarginTextBox = GetBottomMarginTextBox.toJsFn, GetCancelButton = GetCancelButton.toJsFn, GetCreateThumbnailCheckBox = GetCreateThumbnailCheckBox.toJsFn, GetCssClassNameComboBox = GetCssClassNameComboBox.toJsFn, GetDescriptionTextBox = GetDescriptionTextBox.toJsFn, GetFormLayout = GetFormLayout.toJsFn, GetHeightSpinEdit = GetHeightSpinEdit.toJsFn, GetLeftMarginTextBox = GetLeftMarginTextBox.toJsFn, GetMediaFileSelector = GetMediaFileSelector.toJsFn, GetMoreOptionsCheckBox = GetMoreOptionsCheckBox.toJsFn, GetOkButton = GetOkButton.toJsFn, GetPositionComboBox = GetPositionComboBox.toJsFn, GetRightMarginTextBox = GetRightMarginTextBox.toJsFn, GetSizeComboBox = GetSizeComboBox.toJsFn, GetThumbnailNameTextBox = GetThumbnailNameTextBox.toJsFn, GetTopMarginTextBox = GetTopMarginTextBox.toJsFn, GetWidthSpinEdit = GetWidthSpinEdit.toJsFn, GetWrapTextCheckBox = GetWrapTextCheckBox.toJsFn)
    __obj.asInstanceOf[ASPxClientHtmlEditorImageDialog]
  }
  
  extension [Self <: ASPxClientHtmlEditorImageDialog](x: Self) {
    
    inline def setGetCreateThumbnailCheckBox(value: CallbackTo[ASPxClientCheckBox]): Self = StObject.set(x, "GetCreateThumbnailCheckBox", value.toJsFn)
    
    inline def setGetDescriptionTextBox(value: CallbackTo[ASPxClientTextBox]): Self = StObject.set(x, "GetDescriptionTextBox", value.toJsFn)
    
    inline def setGetSizeComboBox(value: CallbackTo[ASPxClientComboBox]): Self = StObject.set(x, "GetSizeComboBox", value.toJsFn)
    
    inline def setGetThumbnailNameTextBox(value: CallbackTo[ASPxClientTextBox]): Self = StObject.set(x, "GetThumbnailNameTextBox", value.toJsFn)
    
    inline def setGetWrapTextCheckBox(value: CallbackTo[ASPxClientCheckBox]): Self = StObject.set(x, "GetWrapTextCheckBox", value.toJsFn)
  }
}
