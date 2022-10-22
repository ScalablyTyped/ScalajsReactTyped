package typingsJapgolly.lovefield.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.lovefield.mod.query.Builder
import typingsJapgolly.lovefield.mod.schema.Table
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Transaction extends StObject {
  
  def attach(query: Builder): js.Promise[js.Array[js.Object]]
  
  def begin(scope: js.Array[Table]): js.Promise[Unit]
  
  def commit(): js.Promise[Unit]
  
  def exec(queries: js.Array[Builder]): js.Promise[js.Array[js.Array[js.Object]]]
  
  def rollback(): js.Promise[Unit]
  
  def stats(): TransactionStats
}
object Transaction {
  
  inline def apply(
    attach: Builder => js.Promise[js.Array[js.Object]],
    begin: js.Array[Table] => js.Promise[Unit],
    commit: CallbackTo[js.Promise[Unit]],
    exec: js.Array[Builder] => js.Promise[js.Array[js.Array[js.Object]]],
    rollback: CallbackTo[js.Promise[Unit]],
    stats: CallbackTo[TransactionStats]
  ): Transaction = {
    val __obj = js.Dynamic.literal(attach = js.Any.fromFunction1(attach), begin = js.Any.fromFunction1(begin), commit = commit.toJsFn, exec = js.Any.fromFunction1(exec), rollback = rollback.toJsFn, stats = stats.toJsFn)
    __obj.asInstanceOf[Transaction]
  }
  
  extension [Self <: Transaction](x: Self) {
    
    inline def setAttach(value: Builder => js.Promise[js.Array[js.Object]]): Self = StObject.set(x, "attach", js.Any.fromFunction1(value))
    
    inline def setBegin(value: js.Array[Table] => js.Promise[Unit]): Self = StObject.set(x, "begin", js.Any.fromFunction1(value))
    
    inline def setCommit(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "commit", value.toJsFn)
    
    inline def setExec(value: js.Array[Builder] => js.Promise[js.Array[js.Array[js.Object]]]): Self = StObject.set(x, "exec", js.Any.fromFunction1(value))
    
    inline def setRollback(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "rollback", value.toJsFn)
    
    inline def setStats(value: CallbackTo[TransactionStats]): Self = StObject.set(x, "stats", value.toJsFn)
  }
}
