package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides client functionality for the Cell Properties dialog within the ASPxHtmlEditor.
  */
trait ASPxClientHtmlEditorTableCellPropertiesDialog
  extends StObject
     with ASPxClientHtmlEditorTableElementPropertiesDialog {
  
  /**
    * Provides access to the client object of the "Apply to all cells in the table" check box in the Html Editor's Cell Properties dialog.
    */
  def GetApplyToAllCellsCheckBox(): ASPxClientCheckBox
}
object ASPxClientHtmlEditorTableCellPropertiesDialog {
  
  inline def apply(
    GetApplyToAllCellsCheckBox: CallbackTo[ASPxClientCheckBox],
    GetBackgroundColorColorEdit: CallbackTo[ASPxClientColorEdit],
    GetCancelButton: CallbackTo[ASPxClientButton],
    GetFormLayout: CallbackTo[ASPxClientFormLayout],
    GetHorizontalAlignmentComboBox: CallbackTo[ASPxClientComboBox],
    GetOkButton: CallbackTo[ASPxClientButton],
    GetVerticalAlignmentComboBox: CallbackTo[ASPxClientComboBox]
  ): ASPxClientHtmlEditorTableCellPropertiesDialog = {
    val __obj = js.Dynamic.literal(GetApplyToAllCellsCheckBox = GetApplyToAllCellsCheckBox.toJsFn, GetBackgroundColorColorEdit = GetBackgroundColorColorEdit.toJsFn, GetCancelButton = GetCancelButton.toJsFn, GetFormLayout = GetFormLayout.toJsFn, GetHorizontalAlignmentComboBox = GetHorizontalAlignmentComboBox.toJsFn, GetOkButton = GetOkButton.toJsFn, GetVerticalAlignmentComboBox = GetVerticalAlignmentComboBox.toJsFn)
    __obj.asInstanceOf[ASPxClientHtmlEditorTableCellPropertiesDialog]
  }
  
  extension [Self <: ASPxClientHtmlEditorTableCellPropertiesDialog](x: Self) {
    
    inline def setGetApplyToAllCellsCheckBox(value: CallbackTo[ASPxClientCheckBox]): Self = StObject.set(x, "GetApplyToAllCellsCheckBox", value.toJsFn)
  }
}
