package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides client functionality for the media dialogs within the ASPxHtmlEditor.
  */
trait ASPxClientHtmlEditorMediaDialogBase
  extends StObject
     with ASPxClientHtmlEditorEditElementDialog {
  
  /**
    * Provides access to the client object of the "Height" spin editor in the Html Editor's Audio/Video/Flash dialogs.
    */
  def GetHeightSpinEdit(): ASPxClientSpinEdit
  
  /**
    * Provides access to the client object of the media file selector that allows you to insert/change media files in the Html Editor's Audio/Video/Flash dialogs.
    */
  def GetMediaFileSelector(): ASPxClientMediaFileSelector
  
  /**
    * Provides access to the client object of the "More options" check box in the Html Editor's Audio/Video/Flash/Image dialogs.
    */
  def GetMoreOptionsCheckBox(): ASPxClientCheckBox
  
  /**
    * Provides access to the client object of the "Position" combo box in the Html Editor's Audio/Video/Flash/Image dialogs.
    */
  def GetPositionComboBox(): ASPxClientComboBox
  
  /**
    * Provides access to the client object of the "Width" spin editor in the Html Editor's Audio/Video/Flash dialogs.
    */
  def GetWidthSpinEdit(): ASPxClientSpinEdit
}
object ASPxClientHtmlEditorMediaDialogBase {
  
  inline def apply(
    GetBorderColorColorEdit: CallbackTo[ASPxClientColorEdit],
    GetBorderStyleComboBox: CallbackTo[ASPxClientComboBox],
    GetBorderWidthSpinEdit: CallbackTo[ASPxClientSpinEdit],
    GetBottomMarginTextBox: CallbackTo[ASPxClientTextBox],
    GetCancelButton: CallbackTo[ASPxClientButton],
    GetCssClassNameComboBox: CallbackTo[ASPxClientComboBox],
    GetFormLayout: CallbackTo[ASPxClientFormLayout],
    GetHeightSpinEdit: CallbackTo[ASPxClientSpinEdit],
    GetLeftMarginTextBox: CallbackTo[ASPxClientTextBox],
    GetMediaFileSelector: CallbackTo[ASPxClientMediaFileSelector],
    GetMoreOptionsCheckBox: CallbackTo[ASPxClientCheckBox],
    GetOkButton: CallbackTo[ASPxClientButton],
    GetPositionComboBox: CallbackTo[ASPxClientComboBox],
    GetRightMarginTextBox: CallbackTo[ASPxClientTextBox],
    GetTopMarginTextBox: CallbackTo[ASPxClientTextBox],
    GetWidthSpinEdit: CallbackTo[ASPxClientSpinEdit]
  ): ASPxClientHtmlEditorMediaDialogBase = {
    val __obj = js.Dynamic.literal(GetBorderColorColorEdit = GetBorderColorColorEdit.toJsFn, GetBorderStyleComboBox = GetBorderStyleComboBox.toJsFn, GetBorderWidthSpinEdit = GetBorderWidthSpinEdit.toJsFn, GetBottomMarginTextBox = GetBottomMarginTextBox.toJsFn, GetCancelButton = GetCancelButton.toJsFn, GetCssClassNameComboBox = GetCssClassNameComboBox.toJsFn, GetFormLayout = GetFormLayout.toJsFn, GetHeightSpinEdit = GetHeightSpinEdit.toJsFn, GetLeftMarginTextBox = GetLeftMarginTextBox.toJsFn, GetMediaFileSelector = GetMediaFileSelector.toJsFn, GetMoreOptionsCheckBox = GetMoreOptionsCheckBox.toJsFn, GetOkButton = GetOkButton.toJsFn, GetPositionComboBox = GetPositionComboBox.toJsFn, GetRightMarginTextBox = GetRightMarginTextBox.toJsFn, GetTopMarginTextBox = GetTopMarginTextBox.toJsFn, GetWidthSpinEdit = GetWidthSpinEdit.toJsFn)
    __obj.asInstanceOf[ASPxClientHtmlEditorMediaDialogBase]
  }
  
  extension [Self <: ASPxClientHtmlEditorMediaDialogBase](x: Self) {
    
    inline def setGetHeightSpinEdit(value: CallbackTo[ASPxClientSpinEdit]): Self = StObject.set(x, "GetHeightSpinEdit", value.toJsFn)
    
    inline def setGetMediaFileSelector(value: CallbackTo[ASPxClientMediaFileSelector]): Self = StObject.set(x, "GetMediaFileSelector", value.toJsFn)
    
    inline def setGetMoreOptionsCheckBox(value: CallbackTo[ASPxClientCheckBox]): Self = StObject.set(x, "GetMoreOptionsCheckBox", value.toJsFn)
    
    inline def setGetPositionComboBox(value: CallbackTo[ASPxClientComboBox]): Self = StObject.set(x, "GetPositionComboBox", value.toJsFn)
    
    inline def setGetWidthSpinEdit(value: CallbackTo[ASPxClientSpinEdit]): Self = StObject.set(x, "GetWidthSpinEdit", value.toJsFn)
  }
}
