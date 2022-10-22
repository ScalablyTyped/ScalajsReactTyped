package typingsJapgolly.firebaseFirestore.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcLocalPersistencePromiseMod.PersistencePromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `17` extends StObject {
  
  def forEach(cb: js.Function1[/* el */ PersistencePromise[Any], Unit]): Unit
}
object `17` {
  
  inline def apply(forEach: js.Function1[/* el */ PersistencePromise[Any], Unit] => Callback): `17` = {
    val __obj = js.Dynamic.literal(forEach = js.Any.fromFunction1((t0: js.Function1[/* el */ PersistencePromise[Any], Unit]) => forEach(t0).runNow()))
    __obj.asInstanceOf[`17`]
  }
  
  extension [Self <: `17`](x: Self) {
    
    inline def setForEach(value: js.Function1[/* el */ PersistencePromise[Any], Unit] => Callback): Self = StObject.set(x, "forEach", js.Any.fromFunction1((t0: js.Function1[/* el */ PersistencePromise[Any], Unit]) => value(t0).runNow()))
  }
}
