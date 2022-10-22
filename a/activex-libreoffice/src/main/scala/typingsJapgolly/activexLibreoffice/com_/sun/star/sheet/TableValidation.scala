package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.CellAddress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** represents the data validation settings for a cell or cell range. */
trait TableValidation
  extends StObject
     with XPropertySet
     with XSheetCondition {
  
  /**
    * specifies the style of the error message.
    *
    * This is used only if {@link TableValidation.ShowErrorMessage} is set to `TRUE` .
    */
  var ErrorAlertStyle: ValidationAlertStyle
  
  /**
    * specifies the text of the error message.
    *
    * This is only used if {@link TableValidation.ShowErrorMessage} is set to `TRUE` .
    */
  var ErrorMessage: String
  
  /**
    * specifies the title of the window showing the error message.
    *
    * This is only used if {@link TableValidation.ShowErrorMessage} is set to `TRUE` .
    */
  var ErrorTitle: String
  
  /** specifies if blank cells should be allowed. */
  var IgnoreBlankCells: Boolean
  
  /**
    * specifies the text of the input message.
    *
    * This is only used if {@link TableValidation.ShowInputMessage} is set to `TRUE` .
    */
  var InputMessage: String
  
  /**
    * specifies the title of the window showing the input message.
    *
    * This is only used if {@link TableValidation.ShowInputMessage} is set to `TRUE` .
    */
  var InputTitle: String
  
  /** specifies if an error message is displayed when invalid data is entered. */
  var ShowErrorMessage: Boolean
  
  /** specifies if an input message is shown when the cursor is in a cell with these validation settings. */
  var ShowInputMessage: Boolean
  
  /**
    * specifies if the list of possible values should be shown on the cell and how.
    *
    * See also {@link TableValidationVisibility}
    */
  var ShowList: Double
  
  /** specifies the type of validation. */
  var Type: ValidationType
}
object TableValidation {
  
  inline def apply(
    ErrorAlertStyle: ValidationAlertStyle,
    ErrorMessage: String,
    ErrorTitle: String,
    Formula1: String,
    Formula2: String,
    IgnoreBlankCells: Boolean,
    InputMessage: String,
    InputTitle: String,
    Operator: ConditionOperator,
    PropertySetInfo: XPropertySetInfo,
    ShowErrorMessage: Boolean,
    ShowInputMessage: Boolean,
    ShowList: Double,
    SourcePosition: CellAddress,
    Type: ValidationType,
    acquire: Callback,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    getFormula1: CallbackTo[String],
    getFormula2: CallbackTo[String],
    getOperator: CallbackTo[ConditionOperator],
    getPropertySetInfo: CallbackTo[XPropertySetInfo],
    getPropertyValue: String => Any,
    getSourcePosition: CallbackTo[CellAddress],
    queryInterface: `type` => Any,
    release: Callback,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    setFormula1: String => Callback,
    setFormula2: String => Callback,
    setOperator: ConditionOperator => Callback,
    setPropertyValue: (String, Any) => Callback,
    setSourcePosition: CellAddress => Callback
  ): TableValidation = {
    val __obj = js.Dynamic.literal(ErrorAlertStyle = ErrorAlertStyle.asInstanceOf[js.Any], ErrorMessage = ErrorMessage.asInstanceOf[js.Any], ErrorTitle = ErrorTitle.asInstanceOf[js.Any], Formula1 = Formula1.asInstanceOf[js.Any], Formula2 = Formula2.asInstanceOf[js.Any], IgnoreBlankCells = IgnoreBlankCells.asInstanceOf[js.Any], InputMessage = InputMessage.asInstanceOf[js.Any], InputTitle = InputTitle.asInstanceOf[js.Any], Operator = Operator.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], ShowErrorMessage = ShowErrorMessage.asInstanceOf[js.Any], ShowInputMessage = ShowInputMessage.asInstanceOf[js.Any], ShowList = ShowList.asInstanceOf[js.Any], SourcePosition = SourcePosition.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], acquire = acquire.toJsFn, addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), getFormula1 = getFormula1.toJsFn, getFormula2 = getFormula2.toJsFn, getOperator = getOperator.toJsFn, getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), getSourcePosition = getSourcePosition.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), setFormula1 = js.Any.fromFunction1((t0: String) => setFormula1(t0).runNow()), setFormula2 = js.Any.fromFunction1((t0: String) => setFormula2(t0).runNow()), setOperator = js.Any.fromFunction1((t0: ConditionOperator) => setOperator(t0).runNow()), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()), setSourcePosition = js.Any.fromFunction1((t0: CellAddress) => setSourcePosition(t0).runNow()))
    __obj.asInstanceOf[TableValidation]
  }
  
  extension [Self <: TableValidation](x: Self) {
    
    inline def setErrorAlertStyle(value: ValidationAlertStyle): Self = StObject.set(x, "ErrorAlertStyle", value.asInstanceOf[js.Any])
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorTitle(value: String): Self = StObject.set(x, "ErrorTitle", value.asInstanceOf[js.Any])
    
    inline def setIgnoreBlankCells(value: Boolean): Self = StObject.set(x, "IgnoreBlankCells", value.asInstanceOf[js.Any])
    
    inline def setInputMessage(value: String): Self = StObject.set(x, "InputMessage", value.asInstanceOf[js.Any])
    
    inline def setInputTitle(value: String): Self = StObject.set(x, "InputTitle", value.asInstanceOf[js.Any])
    
    inline def setShowErrorMessage(value: Boolean): Self = StObject.set(x, "ShowErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setShowInputMessage(value: Boolean): Self = StObject.set(x, "ShowInputMessage", value.asInstanceOf[js.Any])
    
    inline def setShowList(value: Double): Self = StObject.set(x, "ShowList", value.asInstanceOf[js.Any])
    
    inline def setType(value: ValidationType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
