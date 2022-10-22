package typingsJapgolly.fortawesomeFontawesomeSvgCore

import org.scalajs.dom.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Callback extends StObject {
    
    var callback: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var node: Node
  }
  object Callback {
    
    inline def apply(node: Node): Callback = {
      val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[Callback]
    }
    
    extension [Self <: Callback](x: Self) {
      
      inline def setCallback(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "callback", value.toJsFn)
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setNode(value: Node): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
}
