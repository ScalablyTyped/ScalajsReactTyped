package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides client functionality for the Column Properties dialog within the ASPxHtmlEditor.
  */
trait ASPxClientHtmlEditorTableColumnPropertiesDialog
  extends StObject
     with ASPxClientHtmlEditorTableElementPropertiesDialog {
  
  /**
    * Provides access to the client object of the "Width" combo box in the Html Editor's "Column Properties" dialog.
    */
  def GetWidthTypeComboBox(): ASPxClientComboBox
  
  /**
    * Provides access to the client object of the spin editor that allows you to set the column width value in the Html Editor's "Column Properties" dialog.
    */
  def GetWidthValueSpinEdit(): ASPxClientSpinEdit
  
  /**
    * Provides access to the client object of the combo box that allows you to specify the column width measurement unit in the Html Editor's "Column Properties" dialog.
    */
  def GetWidthValueTypeComboBox(): ASPxClientComboBox
}
object ASPxClientHtmlEditorTableColumnPropertiesDialog {
  
  inline def apply(
    GetBackgroundColorColorEdit: CallbackTo[ASPxClientColorEdit],
    GetCancelButton: CallbackTo[ASPxClientButton],
    GetFormLayout: CallbackTo[ASPxClientFormLayout],
    GetHorizontalAlignmentComboBox: CallbackTo[ASPxClientComboBox],
    GetOkButton: CallbackTo[ASPxClientButton],
    GetVerticalAlignmentComboBox: CallbackTo[ASPxClientComboBox],
    GetWidthTypeComboBox: CallbackTo[ASPxClientComboBox],
    GetWidthValueSpinEdit: CallbackTo[ASPxClientSpinEdit],
    GetWidthValueTypeComboBox: CallbackTo[ASPxClientComboBox]
  ): ASPxClientHtmlEditorTableColumnPropertiesDialog = {
    val __obj = js.Dynamic.literal(GetBackgroundColorColorEdit = GetBackgroundColorColorEdit.toJsFn, GetCancelButton = GetCancelButton.toJsFn, GetFormLayout = GetFormLayout.toJsFn, GetHorizontalAlignmentComboBox = GetHorizontalAlignmentComboBox.toJsFn, GetOkButton = GetOkButton.toJsFn, GetVerticalAlignmentComboBox = GetVerticalAlignmentComboBox.toJsFn, GetWidthTypeComboBox = GetWidthTypeComboBox.toJsFn, GetWidthValueSpinEdit = GetWidthValueSpinEdit.toJsFn, GetWidthValueTypeComboBox = GetWidthValueTypeComboBox.toJsFn)
    __obj.asInstanceOf[ASPxClientHtmlEditorTableColumnPropertiesDialog]
  }
  
  extension [Self <: ASPxClientHtmlEditorTableColumnPropertiesDialog](x: Self) {
    
    inline def setGetWidthTypeComboBox(value: CallbackTo[ASPxClientComboBox]): Self = StObject.set(x, "GetWidthTypeComboBox", value.toJsFn)
    
    inline def setGetWidthValueSpinEdit(value: CallbackTo[ASPxClientSpinEdit]): Self = StObject.set(x, "GetWidthValueSpinEdit", value.toJsFn)
    
    inline def setGetWidthValueTypeComboBox(value: CallbackTo[ASPxClientComboBox]): Self = StObject.set(x, "GetWidthValueTypeComboBox", value.toJsFn)
  }
}
