package typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is used for batch execution on PreparedStatements.
  *
  * A {@link com.sun.star.sdbc.PreparedStatement} uses one precompiled SQL {@link Statement} . In batch execution it is possible to set collection of
  * parameter settings, which are executed in one batch job.
  */
trait XPreparedBatchExecution
  extends StObject
     with XInterface {
  
  /**
    * adds a set of parameters to the batch.
    * @throws SQLException if a database access error occurs.
    */
  def addBatch(): Unit
  
  /**
    * makes the set of commands in the current batch empty.
    * @throws SQLException if a database access error occurs.
    */
  def clearBatch(): Unit
  
  /**
    * submits a batch of commands to the database for execution.
    * @returns an array of update counts containing one element for each command in the batch. The array is ordered according to the order in which commands wer
    * @throws SQLException if a database access error occurs.
    */
  def executeBatch(): SafeArray[Double]
}
object XPreparedBatchExecution {
  
  inline def apply(
    acquire: Callback,
    addBatch: Callback,
    clearBatch: Callback,
    executeBatch: CallbackTo[SafeArray[Double]],
    queryInterface: `type` => Any,
    release: Callback
  ): XPreparedBatchExecution = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, addBatch = addBatch.toJsFn, clearBatch = clearBatch.toJsFn, executeBatch = executeBatch.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XPreparedBatchExecution]
  }
  
  extension [Self <: XPreparedBatchExecution](x: Self) {
    
    inline def setAddBatch(value: Callback): Self = StObject.set(x, "addBatch", value.toJsFn)
    
    inline def setClearBatch(value: Callback): Self = StObject.set(x, "clearBatch", value.toJsFn)
    
    inline def setExecuteBatch(value: CallbackTo[SafeArray[Double]]): Self = StObject.set(x, "executeBatch", value.toJsFn)
  }
}
