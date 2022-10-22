package typingsJapgolly.camljs.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IModStatFieldExpression extends StObject {
  
  /** Checks whether the value of the field is Approved - same as ModStatId.EqualTo(0) */
  def IsApproved(): IExpression
  
  /** Checks whether the value of the field is Pending - same as ModStatId.EqualTo(2) */
  def IsPending(): IExpression
  
  /** Checks whether the value of the field is Rejected - same as ModStatId.EqualTo(1) */
  def IsRejected(): IExpression
  
  /** Represents moderation status ID. */
  def ModStatId(): INumberFieldExpression
  
  /** Represents moderation status as localized text. In most cases it is better to use ModStatId in the queries instead of ValueAsText. */
  def ValueAsText(): ITextFieldExpression
}
object IModStatFieldExpression {
  
  inline def apply(
    IsApproved: CallbackTo[IExpression],
    IsPending: CallbackTo[IExpression],
    IsRejected: CallbackTo[IExpression],
    ModStatId: CallbackTo[INumberFieldExpression],
    ValueAsText: CallbackTo[ITextFieldExpression]
  ): IModStatFieldExpression = {
    val __obj = js.Dynamic.literal(IsApproved = IsApproved.toJsFn, IsPending = IsPending.toJsFn, IsRejected = IsRejected.toJsFn, ModStatId = ModStatId.toJsFn, ValueAsText = ValueAsText.toJsFn)
    __obj.asInstanceOf[IModStatFieldExpression]
  }
  
  extension [Self <: IModStatFieldExpression](x: Self) {
    
    inline def setIsApproved(value: CallbackTo[IExpression]): Self = StObject.set(x, "IsApproved", value.toJsFn)
    
    inline def setIsPending(value: CallbackTo[IExpression]): Self = StObject.set(x, "IsPending", value.toJsFn)
    
    inline def setIsRejected(value: CallbackTo[IExpression]): Self = StObject.set(x, "IsRejected", value.toJsFn)
    
    inline def setModStatId(value: CallbackTo[INumberFieldExpression]): Self = StObject.set(x, "ModStatId", value.toJsFn)
    
    inline def setValueAsText(value: CallbackTo[ITextFieldExpression]): Self = StObject.set(x, "ValueAsText", value.toJsFn)
  }
}
