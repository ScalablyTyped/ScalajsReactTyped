package typingsJapgolly.lovefield.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransactionStats extends StObject {
  
  def changedTableCount(): Double
  
  def deletedRowCount(): Double
  
  def insertedRowCount(): Double
  
  def success(): Boolean
  
  def updatedRowCount(): Double
}
object TransactionStats {
  
  inline def apply(
    changedTableCount: CallbackTo[Double],
    deletedRowCount: CallbackTo[Double],
    insertedRowCount: CallbackTo[Double],
    success: CallbackTo[Boolean],
    updatedRowCount: CallbackTo[Double]
  ): TransactionStats = {
    val __obj = js.Dynamic.literal(changedTableCount = changedTableCount.toJsFn, deletedRowCount = deletedRowCount.toJsFn, insertedRowCount = insertedRowCount.toJsFn, success = success.toJsFn, updatedRowCount = updatedRowCount.toJsFn)
    __obj.asInstanceOf[TransactionStats]
  }
  
  extension [Self <: TransactionStats](x: Self) {
    
    inline def setChangedTableCount(value: CallbackTo[Double]): Self = StObject.set(x, "changedTableCount", value.toJsFn)
    
    inline def setDeletedRowCount(value: CallbackTo[Double]): Self = StObject.set(x, "deletedRowCount", value.toJsFn)
    
    inline def setInsertedRowCount(value: CallbackTo[Double]): Self = StObject.set(x, "insertedRowCount", value.toJsFn)
    
    inline def setSuccess(value: CallbackTo[Boolean]): Self = StObject.set(x, "success", value.toJsFn)
    
    inline def setUpdatedRowCount(value: CallbackTo[Double]): Self = StObject.set(x, "updatedRowCount", value.toJsFn)
  }
}
