package typingsJapgolly.vscode.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Progress[T] extends StObject {
  
  /**
    * Report a progress update.
    * @param value A progress item, like a message and/or an
    * report on how much work finished
    */
  def report(value: T): Unit
}
object Progress {
  
  inline def apply[T](report: T => Callback): Progress[T] = {
    val __obj = js.Dynamic.literal(report = js.Any.fromFunction1((t0: T) => report(t0).runNow()))
    __obj.asInstanceOf[Progress[T]]
  }
  
  extension [Self <: Progress[?], T](x: Self & Progress[T]) {
    
    inline def setReport(value: T => Callback): Self = StObject.set(x, "report", js.Any.fromFunction1((t0: T) => value(t0).runNow()))
  }
}
