package typingsJapgolly.suitescript

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomLine extends StObject {
  
  def isBookSpecific(): Boolean
  
  def setAccountId(accountId: Double): Unit
  
  def setBookSpecific(bookSpecific: Boolean): Unit
  
  def setClassId(classId: Double): Unit
  
  def setCreditAmount(credit: String): Unit
  
  def setDebitAmount(debit: String): Unit
  
  def setDepartmentId(departmentId: Double): Unit
  
  def setLocationId(locationId: Double): Unit
  
  def setMemo(memo: String): Unit
}
object CustomLine {
  
  inline def apply(
    isBookSpecific: CallbackTo[Boolean],
    setAccountId: Double => Callback,
    setBookSpecific: Boolean => Callback,
    setClassId: Double => Callback,
    setCreditAmount: String => Callback,
    setDebitAmount: String => Callback,
    setDepartmentId: Double => Callback,
    setLocationId: Double => Callback,
    setMemo: String => Callback
  ): CustomLine = {
    val __obj = js.Dynamic.literal(isBookSpecific = isBookSpecific.toJsFn, setAccountId = js.Any.fromFunction1((t0: Double) => setAccountId(t0).runNow()), setBookSpecific = js.Any.fromFunction1((t0: Boolean) => setBookSpecific(t0).runNow()), setClassId = js.Any.fromFunction1((t0: Double) => setClassId(t0).runNow()), setCreditAmount = js.Any.fromFunction1((t0: String) => setCreditAmount(t0).runNow()), setDebitAmount = js.Any.fromFunction1((t0: String) => setDebitAmount(t0).runNow()), setDepartmentId = js.Any.fromFunction1((t0: Double) => setDepartmentId(t0).runNow()), setLocationId = js.Any.fromFunction1((t0: Double) => setLocationId(t0).runNow()), setMemo = js.Any.fromFunction1((t0: String) => setMemo(t0).runNow()))
    __obj.asInstanceOf[CustomLine]
  }
  
  extension [Self <: CustomLine](x: Self) {
    
    inline def setIsBookSpecific(value: CallbackTo[Boolean]): Self = StObject.set(x, "isBookSpecific", value.toJsFn)
    
    inline def setSetAccountId(value: Double => Callback): Self = StObject.set(x, "setAccountId", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetBookSpecific(value: Boolean => Callback): Self = StObject.set(x, "setBookSpecific", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSetClassId(value: Double => Callback): Self = StObject.set(x, "setClassId", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetCreditAmount(value: String => Callback): Self = StObject.set(x, "setCreditAmount", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetDebitAmount(value: String => Callback): Self = StObject.set(x, "setDebitAmount", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetDepartmentId(value: Double => Callback): Self = StObject.set(x, "setDepartmentId", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetLocationId(value: Double => Callback): Self = StObject.set(x, "setLocationId", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetMemo(value: String => Callback): Self = StObject.set(x, "setMemo", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
