package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides client functionality for Html Editor dialogs operated with its elements.
  */
trait ASPxClientHtmlEditorEditElementDialog
  extends StObject
     with ASPxClientHtmlEditorDialogBase {
  
  /**
    * Provides access to the client object of the "Border color" color editor in the Html Editor's dialogs (Style Settings).
    */
  def GetBorderColorColorEdit(): ASPxClientColorEdit
  
  /**
    * Provides access to the client object of the "Border style" combo box in the Html Editor's dialogs (Style Settings).
    */
  def GetBorderStyleComboBox(): ASPxClientComboBox
  
  /**
    * Provides access to the client object of the "Border width" spin editor in the Html Editor's dialogs (Style Settings).
    */
  def GetBorderWidthSpinEdit(): ASPxClientSpinEdit
  
  /**
    * Provides access to the client object of the "Bottom margin" text box in the Html Editor's dialogs (Style Settings).
    */
  def GetBottomMarginTextBox(): ASPxClientTextBox
  
  /**
    * Provides access to the client object of the "CSS class" combo box in the Html Editor's dialogs (Style Settings).
    */
  def GetCssClassNameComboBox(): ASPxClientComboBox
  
  /**
    * Provides access to the client object of the "Left margin" text box in the Html Editor's dialogs (Style Settings).
    */
  def GetLeftMarginTextBox(): ASPxClientTextBox
  
  /**
    * Provides access to the client object of the "Right margin" text box in the Html Editor's dialogs (Style Settings).
    */
  def GetRightMarginTextBox(): ASPxClientTextBox
  
  /**
    * Provides access to the client object of the "Top margin" text box in the Html Editor's dialogs (Style Settings).
    */
  def GetTopMarginTextBox(): ASPxClientTextBox
}
object ASPxClientHtmlEditorEditElementDialog {
  
  inline def apply(
    GetBorderColorColorEdit: CallbackTo[ASPxClientColorEdit],
    GetBorderStyleComboBox: CallbackTo[ASPxClientComboBox],
    GetBorderWidthSpinEdit: CallbackTo[ASPxClientSpinEdit],
    GetBottomMarginTextBox: CallbackTo[ASPxClientTextBox],
    GetCancelButton: CallbackTo[ASPxClientButton],
    GetCssClassNameComboBox: CallbackTo[ASPxClientComboBox],
    GetFormLayout: CallbackTo[ASPxClientFormLayout],
    GetLeftMarginTextBox: CallbackTo[ASPxClientTextBox],
    GetOkButton: CallbackTo[ASPxClientButton],
    GetRightMarginTextBox: CallbackTo[ASPxClientTextBox],
    GetTopMarginTextBox: CallbackTo[ASPxClientTextBox]
  ): ASPxClientHtmlEditorEditElementDialog = {
    val __obj = js.Dynamic.literal(GetBorderColorColorEdit = GetBorderColorColorEdit.toJsFn, GetBorderStyleComboBox = GetBorderStyleComboBox.toJsFn, GetBorderWidthSpinEdit = GetBorderWidthSpinEdit.toJsFn, GetBottomMarginTextBox = GetBottomMarginTextBox.toJsFn, GetCancelButton = GetCancelButton.toJsFn, GetCssClassNameComboBox = GetCssClassNameComboBox.toJsFn, GetFormLayout = GetFormLayout.toJsFn, GetLeftMarginTextBox = GetLeftMarginTextBox.toJsFn, GetOkButton = GetOkButton.toJsFn, GetRightMarginTextBox = GetRightMarginTextBox.toJsFn, GetTopMarginTextBox = GetTopMarginTextBox.toJsFn)
    __obj.asInstanceOf[ASPxClientHtmlEditorEditElementDialog]
  }
  
  extension [Self <: ASPxClientHtmlEditorEditElementDialog](x: Self) {
    
    inline def setGetBorderColorColorEdit(value: CallbackTo[ASPxClientColorEdit]): Self = StObject.set(x, "GetBorderColorColorEdit", value.toJsFn)
    
    inline def setGetBorderStyleComboBox(value: CallbackTo[ASPxClientComboBox]): Self = StObject.set(x, "GetBorderStyleComboBox", value.toJsFn)
    
    inline def setGetBorderWidthSpinEdit(value: CallbackTo[ASPxClientSpinEdit]): Self = StObject.set(x, "GetBorderWidthSpinEdit", value.toJsFn)
    
    inline def setGetBottomMarginTextBox(value: CallbackTo[ASPxClientTextBox]): Self = StObject.set(x, "GetBottomMarginTextBox", value.toJsFn)
    
    inline def setGetCssClassNameComboBox(value: CallbackTo[ASPxClientComboBox]): Self = StObject.set(x, "GetCssClassNameComboBox", value.toJsFn)
    
    inline def setGetLeftMarginTextBox(value: CallbackTo[ASPxClientTextBox]): Self = StObject.set(x, "GetLeftMarginTextBox", value.toJsFn)
    
    inline def setGetRightMarginTextBox(value: CallbackTo[ASPxClientTextBox]): Self = StObject.set(x, "GetRightMarginTextBox", value.toJsFn)
    
    inline def setGetTopMarginTextBox(value: CallbackTo[ASPxClientTextBox]): Self = StObject.set(x, "GetTopMarginTextBox", value.toJsFn)
  }
}
