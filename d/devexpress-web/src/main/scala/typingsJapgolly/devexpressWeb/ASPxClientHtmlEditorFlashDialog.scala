package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides client functionality for the Flash dialog within the  ASPxHtmlEditor.
  */
trait ASPxClientHtmlEditorFlashDialog
  extends StObject
     with ASPxClientHtmlEditorMediaDialogBase {
  
  /**
    * Provides access to the client object of the "Allow fullscreen" check box in the Html Editor's Flash dialog.
    */
  def GetAllowFullscreenCheckBox(): ASPxClientCheckBox
  
  /**
    * Provides access to the client object of the "Auto play" check box in the Html Editor's Flash dialog.
    */
  def GetAutoPlayCheckBox(): ASPxClientCheckBox
  
  /**
    * Provides access to the client object of the "Enable flash menu" check box in the Html Editor's Flash dialog.
    */
  def GetEnableFlashMenuCheckBox(): ASPxClientCheckBox
  
  /**
    * Provides access to the client object of the "Loop" check box in the Html Editor's Flash dialog.
    */
  def GetLoopCheckBox(): ASPxClientCheckBox
  
  /**
    * Provides access to the client object of the "Quality" combo box in the Html Editor's Flash dialog.
    */
  def GetQualityComboBox(): ASPxClientComboBox
}
object ASPxClientHtmlEditorFlashDialog {
  
  inline def apply(
    GetAllowFullscreenCheckBox: CallbackTo[ASPxClientCheckBox],
    GetAutoPlayCheckBox: CallbackTo[ASPxClientCheckBox],
    GetBorderColorColorEdit: CallbackTo[ASPxClientColorEdit],
    GetBorderStyleComboBox: CallbackTo[ASPxClientComboBox],
    GetBorderWidthSpinEdit: CallbackTo[ASPxClientSpinEdit],
    GetBottomMarginTextBox: CallbackTo[ASPxClientTextBox],
    GetCancelButton: CallbackTo[ASPxClientButton],
    GetCssClassNameComboBox: CallbackTo[ASPxClientComboBox],
    GetEnableFlashMenuCheckBox: CallbackTo[ASPxClientCheckBox],
    GetFormLayout: CallbackTo[ASPxClientFormLayout],
    GetHeightSpinEdit: CallbackTo[ASPxClientSpinEdit],
    GetLeftMarginTextBox: CallbackTo[ASPxClientTextBox],
    GetLoopCheckBox: CallbackTo[ASPxClientCheckBox],
    GetMediaFileSelector: CallbackTo[ASPxClientMediaFileSelector],
    GetMoreOptionsCheckBox: CallbackTo[ASPxClientCheckBox],
    GetOkButton: CallbackTo[ASPxClientButton],
    GetPositionComboBox: CallbackTo[ASPxClientComboBox],
    GetQualityComboBox: CallbackTo[ASPxClientComboBox],
    GetRightMarginTextBox: CallbackTo[ASPxClientTextBox],
    GetTopMarginTextBox: CallbackTo[ASPxClientTextBox],
    GetWidthSpinEdit: CallbackTo[ASPxClientSpinEdit]
  ): ASPxClientHtmlEditorFlashDialog = {
    val __obj = js.Dynamic.literal(GetAllowFullscreenCheckBox = GetAllowFullscreenCheckBox.toJsFn, GetAutoPlayCheckBox = GetAutoPlayCheckBox.toJsFn, GetBorderColorColorEdit = GetBorderColorColorEdit.toJsFn, GetBorderStyleComboBox = GetBorderStyleComboBox.toJsFn, GetBorderWidthSpinEdit = GetBorderWidthSpinEdit.toJsFn, GetBottomMarginTextBox = GetBottomMarginTextBox.toJsFn, GetCancelButton = GetCancelButton.toJsFn, GetCssClassNameComboBox = GetCssClassNameComboBox.toJsFn, GetEnableFlashMenuCheckBox = GetEnableFlashMenuCheckBox.toJsFn, GetFormLayout = GetFormLayout.toJsFn, GetHeightSpinEdit = GetHeightSpinEdit.toJsFn, GetLeftMarginTextBox = GetLeftMarginTextBox.toJsFn, GetLoopCheckBox = GetLoopCheckBox.toJsFn, GetMediaFileSelector = GetMediaFileSelector.toJsFn, GetMoreOptionsCheckBox = GetMoreOptionsCheckBox.toJsFn, GetOkButton = GetOkButton.toJsFn, GetPositionComboBox = GetPositionComboBox.toJsFn, GetQualityComboBox = GetQualityComboBox.toJsFn, GetRightMarginTextBox = GetRightMarginTextBox.toJsFn, GetTopMarginTextBox = GetTopMarginTextBox.toJsFn, GetWidthSpinEdit = GetWidthSpinEdit.toJsFn)
    __obj.asInstanceOf[ASPxClientHtmlEditorFlashDialog]
  }
  
  extension [Self <: ASPxClientHtmlEditorFlashDialog](x: Self) {
    
    inline def setGetAllowFullscreenCheckBox(value: CallbackTo[ASPxClientCheckBox]): Self = StObject.set(x, "GetAllowFullscreenCheckBox", value.toJsFn)
    
    inline def setGetAutoPlayCheckBox(value: CallbackTo[ASPxClientCheckBox]): Self = StObject.set(x, "GetAutoPlayCheckBox", value.toJsFn)
    
    inline def setGetEnableFlashMenuCheckBox(value: CallbackTo[ASPxClientCheckBox]): Self = StObject.set(x, "GetEnableFlashMenuCheckBox", value.toJsFn)
    
    inline def setGetLoopCheckBox(value: CallbackTo[ASPxClientCheckBox]): Self = StObject.set(x, "GetLoopCheckBox", value.toJsFn)
    
    inline def setGetQualityComboBox(value: CallbackTo[ASPxClientComboBox]): Self = StObject.set(x, "GetQualityComboBox", value.toJsFn)
  }
}
