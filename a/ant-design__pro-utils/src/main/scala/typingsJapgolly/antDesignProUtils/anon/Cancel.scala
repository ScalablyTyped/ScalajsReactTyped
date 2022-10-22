package typingsJapgolly.antDesignProUtils.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cancel[U] extends StObject {
  
  def cancel(): Unit
  
  def run(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
  ): js.Promise[js.UndefOr[U]]
}
object Cancel {
  
  inline def apply[U](cancel: Callback, run: Any => js.Promise[js.UndefOr[U]]): Cancel[U] = {
    val __obj = js.Dynamic.literal(cancel = cancel.toJsFn, run = js.Any.fromFunction1(run))
    __obj.asInstanceOf[Cancel[U]]
  }
  
  extension [Self <: Cancel[?], U](x: Self & Cancel[U]) {
    
    inline def setCancel(value: Callback): Self = StObject.set(x, "cancel", value.toJsFn)
    
    inline def setRun(value: Any => js.Promise[js.UndefOr[U]]): Self = StObject.set(x, "run", js.Any.fromFunction1(value))
  }
}
