package typingsJapgolly.webix.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Undo extends StObject {
  
  def ignoreUndo(functor: WebixCallback): Unit
  
  def removeUndo(id: String): Unit
  
  def undo(id: String): Unit
}
object Undo {
  
  @JSImport("webix", "Undo")
  @js.native
  val ^ : Undo = js.native
  
  extension [Self <: Undo](x: Self) {
    
    inline def setIgnoreUndo(value: WebixCallback => Callback): Self = StObject.set(x, "ignoreUndo", js.Any.fromFunction1((t0: WebixCallback) => value(t0).runNow()))
    
    inline def setRemoveUndo(value: String => Callback): Self = StObject.set(x, "removeUndo", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setUndo(value: String => Callback): Self = StObject.set(x, "undo", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
