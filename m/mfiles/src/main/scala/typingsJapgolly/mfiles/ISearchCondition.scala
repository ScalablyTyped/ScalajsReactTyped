package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFConditionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISearchCondition extends StObject {
  
  def Clone(): ISearchCondition
  
  var ConditionType: MFConditionType
  
  var Expression: IExpression
  
  def Set(Expression: IExpression, ConditionType: MFConditionType, TypedValue: ITypedValue): Unit
  
  var TypedValue: ITypedValue
}
object ISearchCondition {
  
  inline def apply(
    Clone: CallbackTo[ISearchCondition],
    ConditionType: MFConditionType,
    Expression: IExpression,
    Set: (IExpression, MFConditionType, ITypedValue) => Callback,
    TypedValue: ITypedValue
  ): ISearchCondition = {
    val __obj = js.Dynamic.literal(Clone = Clone.toJsFn, ConditionType = ConditionType.asInstanceOf[js.Any], Expression = Expression.asInstanceOf[js.Any], Set = js.Any.fromFunction3((t0: IExpression, t1: MFConditionType, t2: ITypedValue) => (Set(t0, t1, t2)).runNow()), TypedValue = TypedValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchCondition]
  }
  
  extension [Self <: ISearchCondition](x: Self) {
    
    inline def setClone(value: CallbackTo[ISearchCondition]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setConditionType(value: MFConditionType): Self = StObject.set(x, "ConditionType", value.asInstanceOf[js.Any])
    
    inline def setExpression(value: IExpression): Self = StObject.set(x, "Expression", value.asInstanceOf[js.Any])
    
    inline def setSet(value: (IExpression, MFConditionType, ITypedValue) => Callback): Self = StObject.set(x, "Set", js.Any.fromFunction3((t0: IExpression, t1: MFConditionType, t2: ITypedValue) => (value(t0, t1, t2)).runNow()))
    
    inline def setTypedValue(value: ITypedValue): Self = StObject.set(x, "TypedValue", value.asInstanceOf[js.Any])
  }
}
