package typingsJapgolly.jsreportCore.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlobStorage extends StObject {
  
  def init(): js.Promise[Any]
  
  def read(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
  ): Any
  
  def registerProvider(provider: Any): Unit
  
  def remove(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
  ): js.Promise[Any]
  
  def write(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
  ): Any
}
object BlobStorage {
  
  inline def apply(
    init: CallbackTo[js.Promise[Any]],
    read: Any => Any,
    registerProvider: Any => Callback,
    remove: Any => js.Promise[Any],
    write: Any => Any
  ): BlobStorage = {
    val __obj = js.Dynamic.literal(init = init.toJsFn, read = js.Any.fromFunction1(read), registerProvider = js.Any.fromFunction1((t0: Any) => registerProvider(t0).runNow()), remove = js.Any.fromFunction1(remove), write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[BlobStorage]
  }
  
  extension [Self <: BlobStorage](x: Self) {
    
    inline def setInit(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "init", value.toJsFn)
    
    inline def setRead(value: Any => Any): Self = StObject.set(x, "read", js.Any.fromFunction1(value))
    
    inline def setRegisterProvider(value: Any => Callback): Self = StObject.set(x, "registerProvider", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setRemove(value: Any => js.Promise[Any]): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    
    inline def setWrite(value: Any => Any): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
  }
}
