package typingsJapgolly.hystrixjs.mod

import typingsJapgolly.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommandA3[R, T, U, V] extends StObject {
  
  def execute(t: T, u: U, v: V): PromiseLike[R]
}
object CommandA3 {
  
  inline def apply[R, T, U, V](execute: (T, U, V) => PromiseLike[R]): CommandA3[R, T, U, V] = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction3(execute))
    __obj.asInstanceOf[CommandA3[R, T, U, V]]
  }
  
  extension [Self <: CommandA3[?, ?, ?, ?], R, T, U, V](x: Self & (CommandA3[R, T, U, V])) {
    
    inline def setExecute(value: (T, U, V) => PromiseLike[R]): Self = StObject.set(x, "execute", js.Any.fromFunction3(value))
  }
}
