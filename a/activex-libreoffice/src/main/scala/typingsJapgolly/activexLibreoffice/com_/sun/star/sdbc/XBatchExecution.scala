package typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** is used for collecting and executing a set of SQL statements. */
trait XBatchExecution
  extends StObject
     with XInterface {
  
  /**
    * adds a SQL command to the current batch of commands for the statement object.
    * @param sql the SQL statement which should be appended to the batch.
    * @throws SQLException if a database access error occurs.
    */
  def addBatch(sql: String): Unit
  
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
object XBatchExecution {
  
  inline def apply(
    acquire: Callback,
    addBatch: String => Callback,
    clearBatch: Callback,
    executeBatch: CallbackTo[SafeArray[Double]],
    queryInterface: `type` => Any,
    release: Callback
  ): XBatchExecution = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, addBatch = js.Any.fromFunction1((t0: String) => addBatch(t0).runNow()), clearBatch = clearBatch.toJsFn, executeBatch = executeBatch.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XBatchExecution]
  }
  
  extension [Self <: XBatchExecution](x: Self) {
    
    inline def setAddBatch(value: String => Callback): Self = StObject.set(x, "addBatch", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setClearBatch(value: Callback): Self = StObject.set(x, "clearBatch", value.toJsFn)
    
    inline def setExecuteBatch(value: CallbackTo[SafeArray[Double]]): Self = StObject.set(x, "executeBatch", value.toJsFn)
  }
}
