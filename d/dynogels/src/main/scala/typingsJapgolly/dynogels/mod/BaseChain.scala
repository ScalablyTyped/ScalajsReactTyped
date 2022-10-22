package typingsJapgolly.dynogels.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseChain[T] extends StObject {
  
  def beginsWith(value: Any): T
  
  def between(value1: Any, value2: Any): T
  
  def exists(): T
  
  def gt(value: Any): T
  
  def gte(value: Any): T
  
  def lt(value: Any): T
  
  def lte(value: Any): T
  
  def `null`(): T
}
object BaseChain {
  
  inline def apply[T](
    beginsWith: Any => T,
    between: (Any, Any) => T,
    exists: CallbackTo[T],
    gt: Any => T,
    gte: Any => T,
    lt: Any => T,
    lte: Any => T,
    `null`: CallbackTo[T]
  ): BaseChain[T] = {
    val __obj = js.Dynamic.literal(beginsWith = js.Any.fromFunction1(beginsWith), between = js.Any.fromFunction2(between), exists = exists.toJsFn, gt = js.Any.fromFunction1(gt), gte = js.Any.fromFunction1(gte), lt = js.Any.fromFunction1(lt), lte = js.Any.fromFunction1(lte))
    __obj.updateDynamic("null")(`null`.toJsFn)
    __obj.asInstanceOf[BaseChain[T]]
  }
  
  extension [Self <: BaseChain[?], T](x: Self & BaseChain[T]) {
    
    inline def setBeginsWith(value: Any => T): Self = StObject.set(x, "beginsWith", js.Any.fromFunction1(value))
    
    inline def setBetween(value: (Any, Any) => T): Self = StObject.set(x, "between", js.Any.fromFunction2(value))
    
    inline def setExists(value: CallbackTo[T]): Self = StObject.set(x, "exists", value.toJsFn)
    
    inline def setGt(value: Any => T): Self = StObject.set(x, "gt", js.Any.fromFunction1(value))
    
    inline def setGte(value: Any => T): Self = StObject.set(x, "gte", js.Any.fromFunction1(value))
    
    inline def setLt(value: Any => T): Self = StObject.set(x, "lt", js.Any.fromFunction1(value))
    
    inline def setLte(value: Any => T): Self = StObject.set(x, "lte", js.Any.fromFunction1(value))
    
    inline def setNull(value: CallbackTo[T]): Self = StObject.set(x, "null", value.toJsFn)
  }
}
