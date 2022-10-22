package typingsJapgolly.camljs.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBooleanFieldExpression extends StObject {
  
  /** Checks whether the value of the field is equal to the specified value */
  def EqualTo(value: Boolean): IExpression
  
  /** Checks whether the value of the field is False */
  def IsFalse(): IExpression
  
  /** Checks whether the value of the field was not specified by user */
  def IsNotNull(): IExpression
  
  /** Checks whether the value of the field was specified by user */
  def IsNull(): IExpression
  
  /** Checks whether the value of the field is True */
  def IsTrue(): IExpression
  
  /** Checks whether the value of the field is not equal to the specified value */
  def NotEqualTo(value: Boolean): IExpression
}
object IBooleanFieldExpression {
  
  inline def apply(
    EqualTo: Boolean => IExpression,
    IsFalse: CallbackTo[IExpression],
    IsNotNull: CallbackTo[IExpression],
    IsNull: CallbackTo[IExpression],
    IsTrue: CallbackTo[IExpression],
    NotEqualTo: Boolean => IExpression
  ): IBooleanFieldExpression = {
    val __obj = js.Dynamic.literal(EqualTo = js.Any.fromFunction1(EqualTo), IsFalse = IsFalse.toJsFn, IsNotNull = IsNotNull.toJsFn, IsNull = IsNull.toJsFn, IsTrue = IsTrue.toJsFn, NotEqualTo = js.Any.fromFunction1(NotEqualTo))
    __obj.asInstanceOf[IBooleanFieldExpression]
  }
  
  extension [Self <: IBooleanFieldExpression](x: Self) {
    
    inline def setEqualTo(value: Boolean => IExpression): Self = StObject.set(x, "EqualTo", js.Any.fromFunction1(value))
    
    inline def setIsFalse(value: CallbackTo[IExpression]): Self = StObject.set(x, "IsFalse", value.toJsFn)
    
    inline def setIsNotNull(value: CallbackTo[IExpression]): Self = StObject.set(x, "IsNotNull", value.toJsFn)
    
    inline def setIsNull(value: CallbackTo[IExpression]): Self = StObject.set(x, "IsNull", value.toJsFn)
    
    inline def setIsTrue(value: CallbackTo[IExpression]): Self = StObject.set(x, "IsTrue", value.toJsFn)
    
    inline def setNotEqualTo(value: Boolean => IExpression): Self = StObject.set(x, "NotEqualTo", js.Any.fromFunction1(value))
  }
}
