package typingsJapgolly.pgPromise.mod

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.pgPromise.anon.Deferrable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Transaction Mode namespace;
// API: http://vitaly-t.github.io/pg-promise/txMode.html
trait ITXMode extends StObject {
  
  var TransactionMode: Instantiable1[
    /* options */ js.UndefOr[Deferrable], 
    typingsJapgolly.pgPromise.mod.TransactionMode
  ]
  
  var isolationLevel: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof isolationLevel */ Any
}
object ITXMode {
  
  inline def apply(
    TransactionMode: Instantiable1[/* options */ js.UndefOr[Deferrable], TransactionMode],
    isolationLevel: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof isolationLevel */ Any
  ): ITXMode = {
    val __obj = js.Dynamic.literal(TransactionMode = TransactionMode.asInstanceOf[js.Any], isolationLevel = isolationLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITXMode]
  }
  
  extension [Self <: ITXMode](x: Self) {
    
    inline def setIsolationLevel(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof isolationLevel */ Any): Self = StObject.set(x, "isolationLevel", value.asInstanceOf[js.Any])
    
    inline def setTransactionMode(value: Instantiable1[/* options */ js.UndefOr[Deferrable], TransactionMode]): Self = StObject.set(x, "TransactionMode", value.asInstanceOf[js.Any])
  }
}
