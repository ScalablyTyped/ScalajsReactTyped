package typingsJapgolly.mssql.mod

import typingsJapgolly.events.mod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mssql", "Transaction")
@js.native
open class Transaction () extends EventEmitter {
  def this(connection: ConnectionPool) = this()
  
  def begin(): Transaction = js.native
  def begin(
    isolationLevel: Unit,
    callback: js.Function1[/* err */ js.UndefOr[ConnectionError | TransactionError], Unit]
  ): Transaction = js.native
  def begin(isolationLevel: IIsolationLevel): Transaction = js.native
  def begin(
    isolationLevel: IIsolationLevel,
    callback: js.Function1[/* err */ js.UndefOr[ConnectionError | TransactionError], Unit]
  ): Transaction = js.native
  /**
    * Begin a transaction.
    * @param [isolationLevel] - Controls the locking and row versioning behavior of TSQL statements issued by a connection.
    * @param [callback] A callback which is called after transaction has began, or an error has occurred. If omited, method returns Promise.
    */
  @JSName("begin")
  def begin_Promise(): js.Promise[Transaction] = js.native
  @JSName("begin")
  def begin_Promise(isolationLevel: IIsolationLevel): js.Promise[Transaction] = js.native
  
  def commit(): js.Promise[Unit] = js.native
  def commit(callback: js.Function1[/* err */ js.UndefOr[Any], Unit]): Unit = js.native
  
  var isolationLevel: IIsolationLevel = js.native
  
  def request(): Request = js.native
  
  def rollback(): js.Promise[Unit] = js.native
  def rollback(callback: js.Function1[/* err */ js.UndefOr[Any], Unit]): Unit = js.native
}
