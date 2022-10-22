package typingsJapgolly.camljs.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILookupFieldExpression extends StObject {
  
  /** Specifies that lookup id value will be used. */
  def Id(): INumberFieldExpression
  
  /** Specifies that lookup value will be used and this value is of type Boolean */
  def ValueAsBoolean(): IBooleanFieldExpression
  
  /** Specifies that lookup value will be used and this value is of type Date */
  def ValueAsDate(): IDateTimeFieldExpression
  
  /** Specifies that lookup value will be used and this value is of type DateTime */
  def ValueAsDateTime(): IDateTimeFieldExpression
  
  /** Specifies that lookup value will be used and this value is of type Number */
  def ValueAsNumber(): INumberFieldExpression
  
  /** Specifies that lookup value will be used and this value is of type Text */
  def ValueAsText(): ITextFieldExpression
}
object ILookupFieldExpression {
  
  inline def apply(
    Id: CallbackTo[INumberFieldExpression],
    ValueAsBoolean: CallbackTo[IBooleanFieldExpression],
    ValueAsDate: CallbackTo[IDateTimeFieldExpression],
    ValueAsDateTime: CallbackTo[IDateTimeFieldExpression],
    ValueAsNumber: CallbackTo[INumberFieldExpression],
    ValueAsText: CallbackTo[ITextFieldExpression]
  ): ILookupFieldExpression = {
    val __obj = js.Dynamic.literal(Id = Id.toJsFn, ValueAsBoolean = ValueAsBoolean.toJsFn, ValueAsDate = ValueAsDate.toJsFn, ValueAsDateTime = ValueAsDateTime.toJsFn, ValueAsNumber = ValueAsNumber.toJsFn, ValueAsText = ValueAsText.toJsFn)
    __obj.asInstanceOf[ILookupFieldExpression]
  }
  
  extension [Self <: ILookupFieldExpression](x: Self) {
    
    inline def setId(value: CallbackTo[INumberFieldExpression]): Self = StObject.set(x, "Id", value.toJsFn)
    
    inline def setValueAsBoolean(value: CallbackTo[IBooleanFieldExpression]): Self = StObject.set(x, "ValueAsBoolean", value.toJsFn)
    
    inline def setValueAsDate(value: CallbackTo[IDateTimeFieldExpression]): Self = StObject.set(x, "ValueAsDate", value.toJsFn)
    
    inline def setValueAsDateTime(value: CallbackTo[IDateTimeFieldExpression]): Self = StObject.set(x, "ValueAsDateTime", value.toJsFn)
    
    inline def setValueAsNumber(value: CallbackTo[INumberFieldExpression]): Self = StObject.set(x, "ValueAsNumber", value.toJsFn)
    
    inline def setValueAsText(value: CallbackTo[ITextFieldExpression]): Self = StObject.set(x, "ValueAsText", value.toJsFn)
  }
}
