package typingsJapgolly.atlaskitTokens.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.babelTraverse.mod.NodePath
import typingsJapgolly.babelTypes.mod.Program_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Enter extends StObject {
  
  def enter(path: NodePath[Program_], state: Opts): Unit
  
  def exit(path: NodePath[Program_]): Unit
}
object Enter {
  
  inline def apply(enter: (NodePath[Program_], Opts) => Callback, exit: NodePath[Program_] => Callback): Enter = {
    val __obj = js.Dynamic.literal(enter = js.Any.fromFunction2((t0: NodePath[Program_], t1: Opts) => (enter(t0, t1)).runNow()), exit = js.Any.fromFunction1((t0: NodePath[Program_]) => exit(t0).runNow()))
    __obj.asInstanceOf[Enter]
  }
  
  extension [Self <: Enter](x: Self) {
    
    inline def setEnter(value: (NodePath[Program_], Opts) => Callback): Self = StObject.set(x, "enter", js.Any.fromFunction2((t0: NodePath[Program_], t1: Opts) => (value(t0, t1)).runNow()))
    
    inline def setExit(value: NodePath[Program_] => Callback): Self = StObject.set(x, "exit", js.Any.fromFunction1((t0: NodePath[Program_]) => value(t0).runNow()))
  }
}
