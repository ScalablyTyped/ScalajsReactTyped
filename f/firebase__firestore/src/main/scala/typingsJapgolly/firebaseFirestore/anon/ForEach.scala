package typingsJapgolly.firebaseFirestore.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.firebaseFirestore.distFirestoreSrcLocalPersistencePromiseMod.PersistencePromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForEach extends StObject {
  
  def forEach(cb: js.Function1[/* el */ PersistencePromise[Any], Unit]): Unit
}
object ForEach {
  
  inline def apply(forEach: js.Function1[/* el */ PersistencePromise[Any], Unit] => Callback): ForEach = {
    val __obj = js.Dynamic.literal(forEach = js.Any.fromFunction1((t0: js.Function1[/* el */ PersistencePromise[Any], Unit]) => forEach(t0).runNow()))
    __obj.asInstanceOf[ForEach]
  }
  
  extension [Self <: ForEach](x: Self) {
    
    inline def setForEach(value: js.Function1[/* el */ PersistencePromise[Any], Unit] => Callback): Self = StObject.set(x, "forEach", js.Any.fromFunction1((t0: js.Function1[/* el */ PersistencePromise[Any], Unit]) => value(t0).runNow()))
  }
}
