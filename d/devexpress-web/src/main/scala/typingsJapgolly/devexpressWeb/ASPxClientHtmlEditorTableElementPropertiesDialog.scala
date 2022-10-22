package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides client functionality for Table dialogs within the ASPxHtmlEditor.
  */
trait ASPxClientHtmlEditorTableElementPropertiesDialog
  extends StObject
     with ASPxClientHtmlEditorTableDialogBase {
  
  /**
    * Provides access to the client object of the "Horizontal" combo box in the Html Editor's Row/Column/Cell Properties dialog's Alignment group.
    */
  def GetHorizontalAlignmentComboBox(): ASPxClientComboBox
  
  /**
    * Provides access to the client object of the "Vertical" combo box in the Html Editor's Row/Column/Cell Properties dialog's Alignment group.
    */
  def GetVerticalAlignmentComboBox(): ASPxClientComboBox
}
object ASPxClientHtmlEditorTableElementPropertiesDialog {
  
  inline def apply(
    GetBackgroundColorColorEdit: CallbackTo[ASPxClientColorEdit],
    GetCancelButton: CallbackTo[ASPxClientButton],
    GetFormLayout: CallbackTo[ASPxClientFormLayout],
    GetHorizontalAlignmentComboBox: CallbackTo[ASPxClientComboBox],
    GetOkButton: CallbackTo[ASPxClientButton],
    GetVerticalAlignmentComboBox: CallbackTo[ASPxClientComboBox]
  ): ASPxClientHtmlEditorTableElementPropertiesDialog = {
    val __obj = js.Dynamic.literal(GetBackgroundColorColorEdit = GetBackgroundColorColorEdit.toJsFn, GetCancelButton = GetCancelButton.toJsFn, GetFormLayout = GetFormLayout.toJsFn, GetHorizontalAlignmentComboBox = GetHorizontalAlignmentComboBox.toJsFn, GetOkButton = GetOkButton.toJsFn, GetVerticalAlignmentComboBox = GetVerticalAlignmentComboBox.toJsFn)
    __obj.asInstanceOf[ASPxClientHtmlEditorTableElementPropertiesDialog]
  }
  
  extension [Self <: ASPxClientHtmlEditorTableElementPropertiesDialog](x: Self) {
    
    inline def setGetHorizontalAlignmentComboBox(value: CallbackTo[ASPxClientComboBox]): Self = StObject.set(x, "GetHorizontalAlignmentComboBox", value.toJsFn)
    
    inline def setGetVerticalAlignmentComboBox(value: CallbackTo[ASPxClientComboBox]): Self = StObject.set(x, "GetVerticalAlignmentComboBox", value.toJsFn)
  }
}
