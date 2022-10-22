package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides client functionality for the Table dialog within the ASPxHtmlEditor.
  */
trait ASPxClientHtmlEditorTableDialog
  extends StObject
     with ASPxClientHtmlEditorTableDialogBase {
  
  /**
    * Provides access to the client object of the "Accessibility" check box related to the Html Editor's Table dialogs.
    */
  def GetAccessibilityCheckBox(): ASPxClientCheckBox
  
  /**
    * Provides access to the client object of the "Alignment" combo box in the Html Editor's Table dialogs.
    */
  def GetAlignmentComboBox(): ASPxClientComboBox
  
  /**
    * Provides access to the client object of the "Border Color" color editor in the Html Editor's Table dialogs.
    */
  def GetBorderColorColorEdit(): ASPxClientColorEdit
  
  /**
    * Provides access to the client object of the "Border size" spin editor in the Html Editor's Table dialogs.
    */
  def GetBorderWidthSpinEdit(): ASPxClientSpinEdit
  
  /**
    * Provides access to the client object of the "Caption" text box in the Html Editor's Table dialogs.
    */
  def GetCaptionTextBox(): ASPxClientTextBox
  
  /**
    * Provides access to the client object of the "Cell padding" spin editor in the Html Editor's Table dialogs.
    */
  def GetCellPaddingSpinEdit(): ASPxClientSpinEdit
  
  /**
    * Provides access to the client object of the "Cell spacing" spin editor in the Html Editor's Table dialogs.
    */
  def GetCellSpacingSpinEdit(): ASPxClientSpinEdit
  
  /**
    * Provides access to the client object of the "Headers" combo box in the Html Editor's Table dialogs.
    */
  def GetHeadersComboBox(): ASPxClientComboBox
  
  /**
    * Provides access to the client object of the "Height" combo box in the Html Editor's Table dialogs.
    */
  def GetHeightTypeComboBox(): ASPxClientComboBox
  
  /**
    * Provides access to the client object of the spin editor in the Html Editor's Table dialogs that allows you specify the table height value.
    */
  def GetHeightValueSpinEdit(): ASPxClientSpinEdit
  
  /**
    * Provides access to the client object of the combo box in the Html Editor's Table dialogs that allows you to specify the table height measurement unit.
    */
  def GetHeightValueTypeComboBox(): ASPxClientComboBox
  
  /**
    * Provides access to the client object of the "Summary" text box in the Html Editor's Table dialogs.
    */
  def GetSummaryTextBox(): ASPxClientTextBox
  
  /**
    * Provides access to the client object of the "Width" combo box in the Html Editor's Table dialogs.
    */
  def GetWidthTypeComboBox(): ASPxClientComboBox
  
  /**
    * Provides access to the client object of the spin editor in the Html Editor's Table dialogs that allows you to specify the table width value.
    */
  def GetWidthValueSpinEdit(): ASPxClientSpinEdit
  
  /**
    * Provides access to the client object of the combo box in the Html Editor's Table dialogs that allows you to specify the table width measurement unit.
    */
  def GetWidthValueTypeComboBox(): ASPxClientComboBox
}
object ASPxClientHtmlEditorTableDialog {
  
  inline def apply(
    GetAccessibilityCheckBox: CallbackTo[ASPxClientCheckBox],
    GetAlignmentComboBox: CallbackTo[ASPxClientComboBox],
    GetBackgroundColorColorEdit: CallbackTo[ASPxClientColorEdit],
    GetBorderColorColorEdit: CallbackTo[ASPxClientColorEdit],
    GetBorderWidthSpinEdit: CallbackTo[ASPxClientSpinEdit],
    GetCancelButton: CallbackTo[ASPxClientButton],
    GetCaptionTextBox: CallbackTo[ASPxClientTextBox],
    GetCellPaddingSpinEdit: CallbackTo[ASPxClientSpinEdit],
    GetCellSpacingSpinEdit: CallbackTo[ASPxClientSpinEdit],
    GetFormLayout: CallbackTo[ASPxClientFormLayout],
    GetHeadersComboBox: CallbackTo[ASPxClientComboBox],
    GetHeightTypeComboBox: CallbackTo[ASPxClientComboBox],
    GetHeightValueSpinEdit: CallbackTo[ASPxClientSpinEdit],
    GetHeightValueTypeComboBox: CallbackTo[ASPxClientComboBox],
    GetOkButton: CallbackTo[ASPxClientButton],
    GetSummaryTextBox: CallbackTo[ASPxClientTextBox],
    GetWidthTypeComboBox: CallbackTo[ASPxClientComboBox],
    GetWidthValueSpinEdit: CallbackTo[ASPxClientSpinEdit],
    GetWidthValueTypeComboBox: CallbackTo[ASPxClientComboBox]
  ): ASPxClientHtmlEditorTableDialog = {
    val __obj = js.Dynamic.literal(GetAccessibilityCheckBox = GetAccessibilityCheckBox.toJsFn, GetAlignmentComboBox = GetAlignmentComboBox.toJsFn, GetBackgroundColorColorEdit = GetBackgroundColorColorEdit.toJsFn, GetBorderColorColorEdit = GetBorderColorColorEdit.toJsFn, GetBorderWidthSpinEdit = GetBorderWidthSpinEdit.toJsFn, GetCancelButton = GetCancelButton.toJsFn, GetCaptionTextBox = GetCaptionTextBox.toJsFn, GetCellPaddingSpinEdit = GetCellPaddingSpinEdit.toJsFn, GetCellSpacingSpinEdit = GetCellSpacingSpinEdit.toJsFn, GetFormLayout = GetFormLayout.toJsFn, GetHeadersComboBox = GetHeadersComboBox.toJsFn, GetHeightTypeComboBox = GetHeightTypeComboBox.toJsFn, GetHeightValueSpinEdit = GetHeightValueSpinEdit.toJsFn, GetHeightValueTypeComboBox = GetHeightValueTypeComboBox.toJsFn, GetOkButton = GetOkButton.toJsFn, GetSummaryTextBox = GetSummaryTextBox.toJsFn, GetWidthTypeComboBox = GetWidthTypeComboBox.toJsFn, GetWidthValueSpinEdit = GetWidthValueSpinEdit.toJsFn, GetWidthValueTypeComboBox = GetWidthValueTypeComboBox.toJsFn)
    __obj.asInstanceOf[ASPxClientHtmlEditorTableDialog]
  }
  
  extension [Self <: ASPxClientHtmlEditorTableDialog](x: Self) {
    
    inline def setGetAccessibilityCheckBox(value: CallbackTo[ASPxClientCheckBox]): Self = StObject.set(x, "GetAccessibilityCheckBox", value.toJsFn)
    
    inline def setGetAlignmentComboBox(value: CallbackTo[ASPxClientComboBox]): Self = StObject.set(x, "GetAlignmentComboBox", value.toJsFn)
    
    inline def setGetBorderColorColorEdit(value: CallbackTo[ASPxClientColorEdit]): Self = StObject.set(x, "GetBorderColorColorEdit", value.toJsFn)
    
    inline def setGetBorderWidthSpinEdit(value: CallbackTo[ASPxClientSpinEdit]): Self = StObject.set(x, "GetBorderWidthSpinEdit", value.toJsFn)
    
    inline def setGetCaptionTextBox(value: CallbackTo[ASPxClientTextBox]): Self = StObject.set(x, "GetCaptionTextBox", value.toJsFn)
    
    inline def setGetCellPaddingSpinEdit(value: CallbackTo[ASPxClientSpinEdit]): Self = StObject.set(x, "GetCellPaddingSpinEdit", value.toJsFn)
    
    inline def setGetCellSpacingSpinEdit(value: CallbackTo[ASPxClientSpinEdit]): Self = StObject.set(x, "GetCellSpacingSpinEdit", value.toJsFn)
    
    inline def setGetHeadersComboBox(value: CallbackTo[ASPxClientComboBox]): Self = StObject.set(x, "GetHeadersComboBox", value.toJsFn)
    
    inline def setGetHeightTypeComboBox(value: CallbackTo[ASPxClientComboBox]): Self = StObject.set(x, "GetHeightTypeComboBox", value.toJsFn)
    
    inline def setGetHeightValueSpinEdit(value: CallbackTo[ASPxClientSpinEdit]): Self = StObject.set(x, "GetHeightValueSpinEdit", value.toJsFn)
    
    inline def setGetHeightValueTypeComboBox(value: CallbackTo[ASPxClientComboBox]): Self = StObject.set(x, "GetHeightValueTypeComboBox", value.toJsFn)
    
    inline def setGetSummaryTextBox(value: CallbackTo[ASPxClientTextBox]): Self = StObject.set(x, "GetSummaryTextBox", value.toJsFn)
    
    inline def setGetWidthTypeComboBox(value: CallbackTo[ASPxClientComboBox]): Self = StObject.set(x, "GetWidthTypeComboBox", value.toJsFn)
    
    inline def setGetWidthValueSpinEdit(value: CallbackTo[ASPxClientSpinEdit]): Self = StObject.set(x, "GetWidthValueSpinEdit", value.toJsFn)
    
    inline def setGetWidthValueTypeComboBox(value: CallbackTo[ASPxClientComboBox]): Self = StObject.set(x, "GetWidthValueTypeComboBox", value.toJsFn)
  }
}
