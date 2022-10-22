package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides client functionality for the Insert Table dialog within the  ASPxHtmlEditor.
  */
trait ASPxClientHtmlEditorInsertTableDialog
  extends StObject
     with ASPxClientHtmlEditorTableDialog {
  
  /**
    * Provides access to the client object of the "Columns" spin editor in the Html Editor's Table dialogs.
    */
  def GetColumnCountSpinEdit(): ASPxClientSpinEdit
  
  /**
    * Provides access to the client object of the "Equal column widths" check box in the Html Editor's Table dialogs.
    */
  def GetEqualWidthCheckBox(): ASPxClientCheckBox
  
  /**
    * Provides access to the client object of the "Rows" spin editor in the Html Editor's Table dialogs.
    */
  def GetRowCountSpinEdit(): ASPxClientSpinEdit
}
object ASPxClientHtmlEditorInsertTableDialog {
  
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
    GetColumnCountSpinEdit: CallbackTo[ASPxClientSpinEdit],
    GetEqualWidthCheckBox: CallbackTo[ASPxClientCheckBox],
    GetFormLayout: CallbackTo[ASPxClientFormLayout],
    GetHeadersComboBox: CallbackTo[ASPxClientComboBox],
    GetHeightTypeComboBox: CallbackTo[ASPxClientComboBox],
    GetHeightValueSpinEdit: CallbackTo[ASPxClientSpinEdit],
    GetHeightValueTypeComboBox: CallbackTo[ASPxClientComboBox],
    GetOkButton: CallbackTo[ASPxClientButton],
    GetRowCountSpinEdit: CallbackTo[ASPxClientSpinEdit],
    GetSummaryTextBox: CallbackTo[ASPxClientTextBox],
    GetWidthTypeComboBox: CallbackTo[ASPxClientComboBox],
    GetWidthValueSpinEdit: CallbackTo[ASPxClientSpinEdit],
    GetWidthValueTypeComboBox: CallbackTo[ASPxClientComboBox]
  ): ASPxClientHtmlEditorInsertTableDialog = {
    val __obj = js.Dynamic.literal(GetAccessibilityCheckBox = GetAccessibilityCheckBox.toJsFn, GetAlignmentComboBox = GetAlignmentComboBox.toJsFn, GetBackgroundColorColorEdit = GetBackgroundColorColorEdit.toJsFn, GetBorderColorColorEdit = GetBorderColorColorEdit.toJsFn, GetBorderWidthSpinEdit = GetBorderWidthSpinEdit.toJsFn, GetCancelButton = GetCancelButton.toJsFn, GetCaptionTextBox = GetCaptionTextBox.toJsFn, GetCellPaddingSpinEdit = GetCellPaddingSpinEdit.toJsFn, GetCellSpacingSpinEdit = GetCellSpacingSpinEdit.toJsFn, GetColumnCountSpinEdit = GetColumnCountSpinEdit.toJsFn, GetEqualWidthCheckBox = GetEqualWidthCheckBox.toJsFn, GetFormLayout = GetFormLayout.toJsFn, GetHeadersComboBox = GetHeadersComboBox.toJsFn, GetHeightTypeComboBox = GetHeightTypeComboBox.toJsFn, GetHeightValueSpinEdit = GetHeightValueSpinEdit.toJsFn, GetHeightValueTypeComboBox = GetHeightValueTypeComboBox.toJsFn, GetOkButton = GetOkButton.toJsFn, GetRowCountSpinEdit = GetRowCountSpinEdit.toJsFn, GetSummaryTextBox = GetSummaryTextBox.toJsFn, GetWidthTypeComboBox = GetWidthTypeComboBox.toJsFn, GetWidthValueSpinEdit = GetWidthValueSpinEdit.toJsFn, GetWidthValueTypeComboBox = GetWidthValueTypeComboBox.toJsFn)
    __obj.asInstanceOf[ASPxClientHtmlEditorInsertTableDialog]
  }
  
  extension [Self <: ASPxClientHtmlEditorInsertTableDialog](x: Self) {
    
    inline def setGetColumnCountSpinEdit(value: CallbackTo[ASPxClientSpinEdit]): Self = StObject.set(x, "GetColumnCountSpinEdit", value.toJsFn)
    
    inline def setGetEqualWidthCheckBox(value: CallbackTo[ASPxClientCheckBox]): Self = StObject.set(x, "GetEqualWidthCheckBox", value.toJsFn)
    
    inline def setGetRowCountSpinEdit(value: CallbackTo[ASPxClientSpinEdit]): Self = StObject.set(x, "GetRowCountSpinEdit", value.toJsFn)
  }
}
