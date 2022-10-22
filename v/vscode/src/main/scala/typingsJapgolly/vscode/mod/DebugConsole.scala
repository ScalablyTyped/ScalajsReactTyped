package typingsJapgolly.vscode.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DebugConsole extends StObject {
  
  /**
    * Append the given value to the debug console.
    *
    * @param value A string, falsy values will not be printed.
    */
  def append(value: String): Unit
  
  /**
    * Append the given value and a line feed character
    * to the debug console.
    *
    * @param value A string, falsy values will be printed.
    */
  def appendLine(value: String): Unit
}
object DebugConsole {
  
  inline def apply(append: String => Callback, appendLine: String => Callback): DebugConsole = {
    val __obj = js.Dynamic.literal(append = js.Any.fromFunction1((t0: String) => append(t0).runNow()), appendLine = js.Any.fromFunction1((t0: String) => appendLine(t0).runNow()))
    __obj.asInstanceOf[DebugConsole]
  }
  
  extension [Self <: DebugConsole](x: Self) {
    
    inline def setAppend(value: String => Callback): Self = StObject.set(x, "append", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setAppendLine(value: String => Callback): Self = StObject.set(x, "appendLine", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
