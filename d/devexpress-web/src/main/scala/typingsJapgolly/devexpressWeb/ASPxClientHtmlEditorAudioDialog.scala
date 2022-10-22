package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides client functionality for the Audio dialog within the  ASPxHtmlEditor.
  */
trait ASPxClientHtmlEditorAudioDialog
  extends StObject
     with ASPxClientHtmlEditorMediaDialogBase {
  
  /**
    * Provides access to the client object of the "Auto play" check box in the Html Editor's Audio dialogs.
    */
  def GetAutoPlayCheckBox(): ASPxClientCheckBox
  
  /**
    * Provides access to the client object of the "Loop" check box in the Html Editor's Audio dialogs.
    */
  def GetLoopCheckBox(): ASPxClientCheckBox
  
  /**
    * Provides access to the client object of the "Preload mode" combo box in the Html Editor's Audio dialogs.
    */
  def GetPreloadModeComboBox(): ASPxClientComboBox
  
  /**
    * Provides access to the client object of the "Show player controls" check box in the Html Editor's Audio dialogs.
    */
  def GetShowPlayerControlsCheckBox(): ASPxClientCheckBox
}
object ASPxClientHtmlEditorAudioDialog {
  
  inline def apply(
    GetAutoPlayCheckBox: CallbackTo[ASPxClientCheckBox],
    GetBorderColorColorEdit: CallbackTo[ASPxClientColorEdit],
    GetBorderStyleComboBox: CallbackTo[ASPxClientComboBox],
    GetBorderWidthSpinEdit: CallbackTo[ASPxClientSpinEdit],
    GetBottomMarginTextBox: CallbackTo[ASPxClientTextBox],
    GetCancelButton: CallbackTo[ASPxClientButton],
    GetCssClassNameComboBox: CallbackTo[ASPxClientComboBox],
    GetFormLayout: CallbackTo[ASPxClientFormLayout],
    GetHeightSpinEdit: CallbackTo[ASPxClientSpinEdit],
    GetLeftMarginTextBox: CallbackTo[ASPxClientTextBox],
    GetLoopCheckBox: CallbackTo[ASPxClientCheckBox],
    GetMediaFileSelector: CallbackTo[ASPxClientMediaFileSelector],
    GetMoreOptionsCheckBox: CallbackTo[ASPxClientCheckBox],
    GetOkButton: CallbackTo[ASPxClientButton],
    GetPositionComboBox: CallbackTo[ASPxClientComboBox],
    GetPreloadModeComboBox: CallbackTo[ASPxClientComboBox],
    GetRightMarginTextBox: CallbackTo[ASPxClientTextBox],
    GetShowPlayerControlsCheckBox: CallbackTo[ASPxClientCheckBox],
    GetTopMarginTextBox: CallbackTo[ASPxClientTextBox],
    GetWidthSpinEdit: CallbackTo[ASPxClientSpinEdit]
  ): ASPxClientHtmlEditorAudioDialog = {
    val __obj = js.Dynamic.literal(GetAutoPlayCheckBox = GetAutoPlayCheckBox.toJsFn, GetBorderColorColorEdit = GetBorderColorColorEdit.toJsFn, GetBorderStyleComboBox = GetBorderStyleComboBox.toJsFn, GetBorderWidthSpinEdit = GetBorderWidthSpinEdit.toJsFn, GetBottomMarginTextBox = GetBottomMarginTextBox.toJsFn, GetCancelButton = GetCancelButton.toJsFn, GetCssClassNameComboBox = GetCssClassNameComboBox.toJsFn, GetFormLayout = GetFormLayout.toJsFn, GetHeightSpinEdit = GetHeightSpinEdit.toJsFn, GetLeftMarginTextBox = GetLeftMarginTextBox.toJsFn, GetLoopCheckBox = GetLoopCheckBox.toJsFn, GetMediaFileSelector = GetMediaFileSelector.toJsFn, GetMoreOptionsCheckBox = GetMoreOptionsCheckBox.toJsFn, GetOkButton = GetOkButton.toJsFn, GetPositionComboBox = GetPositionComboBox.toJsFn, GetPreloadModeComboBox = GetPreloadModeComboBox.toJsFn, GetRightMarginTextBox = GetRightMarginTextBox.toJsFn, GetShowPlayerControlsCheckBox = GetShowPlayerControlsCheckBox.toJsFn, GetTopMarginTextBox = GetTopMarginTextBox.toJsFn, GetWidthSpinEdit = GetWidthSpinEdit.toJsFn)
    __obj.asInstanceOf[ASPxClientHtmlEditorAudioDialog]
  }
  
  extension [Self <: ASPxClientHtmlEditorAudioDialog](x: Self) {
    
    inline def setGetAutoPlayCheckBox(value: CallbackTo[ASPxClientCheckBox]): Self = StObject.set(x, "GetAutoPlayCheckBox", value.toJsFn)
    
    inline def setGetLoopCheckBox(value: CallbackTo[ASPxClientCheckBox]): Self = StObject.set(x, "GetLoopCheckBox", value.toJsFn)
    
    inline def setGetPreloadModeComboBox(value: CallbackTo[ASPxClientComboBox]): Self = StObject.set(x, "GetPreloadModeComboBox", value.toJsFn)
    
    inline def setGetShowPlayerControlsCheckBox(value: CallbackTo[ASPxClientCheckBox]): Self = StObject.set(x, "GetShowPlayerControlsCheckBox", value.toJsFn)
  }
}
