package typingsJapgolly.ecmarkdown

import japgolly.scalajs.react.Callback
import typingsJapgolly.ecmarkdown.distNodeTypesMod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distVisitorMod {
  
  @JSImport("ecmarkdown/dist/visitor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def visit(node: js.Array[Node], observer: Observer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("visit")(node.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def visit(node: Node, observer: Observer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("visit")(node.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait Observer extends StObject {
    
    var enter: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.undefined
    
    var exit: js.UndefOr[js.Function1[/* node */ Node, Unit]] = js.undefined
  }
  object Observer {
    
    inline def apply(): Observer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Observer]
    }
    
    extension [Self <: Observer](x: Self) {
      
      inline def setEnter(value: /* node */ Node => Callback): Self = StObject.set(x, "enter", js.Any.fromFunction1((t0: /* node */ Node) => value(t0).runNow()))
      
      inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
      
      inline def setExit(value: /* node */ Node => Callback): Self = StObject.set(x, "exit", js.Any.fromFunction1((t0: /* node */ Node) => value(t0).runNow()))
      
      inline def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
    }
  }
}
