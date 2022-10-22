package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides client functionality for the YouTube Video dialog within the ASPxHtmlEditor.
  */
trait ASPxClientHtmlEditorYouTubeDialog
  extends StObject
     with ASPxClientHtmlEditorEditElementDialog {
  
  /**
    * Provides access to the client object of the "Allow fullscreen" check box in the Html Editor's "Insert YouTube Video" dialog.
    */
  def GetAllowFullscreenCheckBox(): ASPxClientCheckBox
  
  /**
    * Provides access to the client object of the "Enable privacy-enhanced mode" check box in the Html Editor's YouTube Video dialog.
    */
  def GetConfidentModeCheckBox(): ASPxClientCheckBox
  
  /**
    * Provides access to the client object of the "Show player controls" check box in the Html Editor's YouTube Video dialog.
    */
  def GetShowPlayerControlsCheckBox(): ASPxClientCheckBox
  
  /**
    * Provides access to the client object of the "Show suggested videos when the video finishes" check box in the Html Editor's YouTube Video dialog.
    */
  def GetShowSameVideosCheckBox(): ASPxClientCheckBox
  
  /**
    * Provides access to the client object of the "Show video title and player actions" check box in the Html Editor's YouTube Video dialog.
    */
  def GetShowVideoNameCheckBox(): ASPxClientCheckBox
}
object ASPxClientHtmlEditorYouTubeDialog {
  
  inline def apply(
    GetAllowFullscreenCheckBox: CallbackTo[ASPxClientCheckBox],
    GetBorderColorColorEdit: CallbackTo[ASPxClientColorEdit],
    GetBorderStyleComboBox: CallbackTo[ASPxClientComboBox],
    GetBorderWidthSpinEdit: CallbackTo[ASPxClientSpinEdit],
    GetBottomMarginTextBox: CallbackTo[ASPxClientTextBox],
    GetCancelButton: CallbackTo[ASPxClientButton],
    GetConfidentModeCheckBox: CallbackTo[ASPxClientCheckBox],
    GetCssClassNameComboBox: CallbackTo[ASPxClientComboBox],
    GetFormLayout: CallbackTo[ASPxClientFormLayout],
    GetLeftMarginTextBox: CallbackTo[ASPxClientTextBox],
    GetOkButton: CallbackTo[ASPxClientButton],
    GetRightMarginTextBox: CallbackTo[ASPxClientTextBox],
    GetShowPlayerControlsCheckBox: CallbackTo[ASPxClientCheckBox],
    GetShowSameVideosCheckBox: CallbackTo[ASPxClientCheckBox],
    GetShowVideoNameCheckBox: CallbackTo[ASPxClientCheckBox],
    GetTopMarginTextBox: CallbackTo[ASPxClientTextBox]
  ): ASPxClientHtmlEditorYouTubeDialog = {
    val __obj = js.Dynamic.literal(GetAllowFullscreenCheckBox = GetAllowFullscreenCheckBox.toJsFn, GetBorderColorColorEdit = GetBorderColorColorEdit.toJsFn, GetBorderStyleComboBox = GetBorderStyleComboBox.toJsFn, GetBorderWidthSpinEdit = GetBorderWidthSpinEdit.toJsFn, GetBottomMarginTextBox = GetBottomMarginTextBox.toJsFn, GetCancelButton = GetCancelButton.toJsFn, GetConfidentModeCheckBox = GetConfidentModeCheckBox.toJsFn, GetCssClassNameComboBox = GetCssClassNameComboBox.toJsFn, GetFormLayout = GetFormLayout.toJsFn, GetLeftMarginTextBox = GetLeftMarginTextBox.toJsFn, GetOkButton = GetOkButton.toJsFn, GetRightMarginTextBox = GetRightMarginTextBox.toJsFn, GetShowPlayerControlsCheckBox = GetShowPlayerControlsCheckBox.toJsFn, GetShowSameVideosCheckBox = GetShowSameVideosCheckBox.toJsFn, GetShowVideoNameCheckBox = GetShowVideoNameCheckBox.toJsFn, GetTopMarginTextBox = GetTopMarginTextBox.toJsFn)
    __obj.asInstanceOf[ASPxClientHtmlEditorYouTubeDialog]
  }
  
  extension [Self <: ASPxClientHtmlEditorYouTubeDialog](x: Self) {
    
    inline def setGetAllowFullscreenCheckBox(value: CallbackTo[ASPxClientCheckBox]): Self = StObject.set(x, "GetAllowFullscreenCheckBox", value.toJsFn)
    
    inline def setGetConfidentModeCheckBox(value: CallbackTo[ASPxClientCheckBox]): Self = StObject.set(x, "GetConfidentModeCheckBox", value.toJsFn)
    
    inline def setGetShowPlayerControlsCheckBox(value: CallbackTo[ASPxClientCheckBox]): Self = StObject.set(x, "GetShowPlayerControlsCheckBox", value.toJsFn)
    
    inline def setGetShowSameVideosCheckBox(value: CallbackTo[ASPxClientCheckBox]): Self = StObject.set(x, "GetShowSameVideosCheckBox", value.toJsFn)
    
    inline def setGetShowVideoNameCheckBox(value: CallbackTo[ASPxClientCheckBox]): Self = StObject.set(x, "GetShowVideoNameCheckBox", value.toJsFn)
  }
}
