package typingsJapgolly.camljs.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IUserMultiFieldExpression extends StObject {
  
  /** DEPRECATED: "Eq" operation in CAML works exactly the same as "Includes". To avoid confusion, please use Includes. */
  def EqualTo(value: Any): IExpression
  
  /** DEPRECATED: use "IncludesSuchItemThat().ValueAsText().EqualTo(value)" instead. */
  def Includes(value: Any): IExpression
  
  /** Checks a condition against every item in the multi lookup value */
  def IncludesSuchItemThat(): IUserFieldExpression
  
  /** Checks whether the field values collection is not empty */
  def IsNotNull(): IExpression
  
  /** Checks whether the field values collection is empty */
  def IsNull(): IExpression
  
  /** DEPRECATED: "Neq" operation in CAML works exactly the same as "NotIncludes". To avoid confusion, please use NotIncludes. */
  def NotEqualTo(value: Any): IExpression
  
  /** DEPRECATED: use "IncludesSuchItemThat().ValueAsText().NotEqualTo(value)" instead. */
  def NotIncludes(value: Any): IExpression
}
object IUserMultiFieldExpression {
  
  inline def apply(
    EqualTo: Any => IExpression,
    Includes: Any => IExpression,
    IncludesSuchItemThat: CallbackTo[IUserFieldExpression],
    IsNotNull: CallbackTo[IExpression],
    IsNull: CallbackTo[IExpression],
    NotEqualTo: Any => IExpression,
    NotIncludes: Any => IExpression
  ): IUserMultiFieldExpression = {
    val __obj = js.Dynamic.literal(EqualTo = js.Any.fromFunction1(EqualTo), Includes = js.Any.fromFunction1(Includes), IncludesSuchItemThat = IncludesSuchItemThat.toJsFn, IsNotNull = IsNotNull.toJsFn, IsNull = IsNull.toJsFn, NotEqualTo = js.Any.fromFunction1(NotEqualTo), NotIncludes = js.Any.fromFunction1(NotIncludes))
    __obj.asInstanceOf[IUserMultiFieldExpression]
  }
  
  extension [Self <: IUserMultiFieldExpression](x: Self) {
    
    inline def setEqualTo(value: Any => IExpression): Self = StObject.set(x, "EqualTo", js.Any.fromFunction1(value))
    
    inline def setIncludes(value: Any => IExpression): Self = StObject.set(x, "Includes", js.Any.fromFunction1(value))
    
    inline def setIncludesSuchItemThat(value: CallbackTo[IUserFieldExpression]): Self = StObject.set(x, "IncludesSuchItemThat", value.toJsFn)
    
    inline def setIsNotNull(value: CallbackTo[IExpression]): Self = StObject.set(x, "IsNotNull", value.toJsFn)
    
    inline def setIsNull(value: CallbackTo[IExpression]): Self = StObject.set(x, "IsNull", value.toJsFn)
    
    inline def setNotEqualTo(value: Any => IExpression): Self = StObject.set(x, "NotEqualTo", js.Any.fromFunction1(value))
    
    inline def setNotIncludes(value: Any => IExpression): Self = StObject.set(x, "NotIncludes", js.Any.fromFunction1(value))
  }
}
