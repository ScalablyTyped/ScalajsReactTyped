package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides client functionality for the Row Properties dialog within the ASPxHtmlEditor.
  */
trait ASPxClientHtmlEditorTableRowPropertiesDialog
  extends StObject
     with ASPxClientHtmlEditorTableElementPropertiesDialog {
  
  /**
    * Provides access to the client object of the "Height" combo box in the Html Editor's "Row Properties" dialog.
    */
  def GetHeightTypeComboBox(): ASPxClientComboBox
  
  /**
    * Provides access to the client ASPxSpinEdit object that allows you to specify the row height in the Html Editor's "Row Properties" dialog.
    */
  def GetHeightValueSpinEdit(): ASPxClientSpinEdit
  
  /**
    * Provides access to the client ASPxComboBox object that allows you to specify the row height measurement unit in the Html Editor's "Row Properties" dialog.
    */
  def GetHeightValueTypeComboBox(): ASPxClientComboBox
}
object ASPxClientHtmlEditorTableRowPropertiesDialog {
  
  inline def apply(
    GetBackgroundColorColorEdit: CallbackTo[ASPxClientColorEdit],
    GetCancelButton: CallbackTo[ASPxClientButton],
    GetFormLayout: CallbackTo[ASPxClientFormLayout],
    GetHeightTypeComboBox: CallbackTo[ASPxClientComboBox],
    GetHeightValueSpinEdit: CallbackTo[ASPxClientSpinEdit],
    GetHeightValueTypeComboBox: CallbackTo[ASPxClientComboBox],
    GetHorizontalAlignmentComboBox: CallbackTo[ASPxClientComboBox],
    GetOkButton: CallbackTo[ASPxClientButton],
    GetVerticalAlignmentComboBox: CallbackTo[ASPxClientComboBox]
  ): ASPxClientHtmlEditorTableRowPropertiesDialog = {
    val __obj = js.Dynamic.literal(GetBackgroundColorColorEdit = GetBackgroundColorColorEdit.toJsFn, GetCancelButton = GetCancelButton.toJsFn, GetFormLayout = GetFormLayout.toJsFn, GetHeightTypeComboBox = GetHeightTypeComboBox.toJsFn, GetHeightValueSpinEdit = GetHeightValueSpinEdit.toJsFn, GetHeightValueTypeComboBox = GetHeightValueTypeComboBox.toJsFn, GetHorizontalAlignmentComboBox = GetHorizontalAlignmentComboBox.toJsFn, GetOkButton = GetOkButton.toJsFn, GetVerticalAlignmentComboBox = GetVerticalAlignmentComboBox.toJsFn)
    __obj.asInstanceOf[ASPxClientHtmlEditorTableRowPropertiesDialog]
  }
  
  extension [Self <: ASPxClientHtmlEditorTableRowPropertiesDialog](x: Self) {
    
    inline def setGetHeightTypeComboBox(value: CallbackTo[ASPxClientComboBox]): Self = StObject.set(x, "GetHeightTypeComboBox", value.toJsFn)
    
    inline def setGetHeightValueSpinEdit(value: CallbackTo[ASPxClientSpinEdit]): Self = StObject.set(x, "GetHeightValueSpinEdit", value.toJsFn)
    
    inline def setGetHeightValueTypeComboBox(value: CallbackTo[ASPxClientComboBox]): Self = StObject.set(x, "GetHeightValueTypeComboBox", value.toJsFn)
  }
}
