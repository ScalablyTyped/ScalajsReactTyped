package typingsJapgolly.estreeWalker

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesWalkerMod {
  
  @JSImport("estree-walker/types/walker", "WalkerBase")
  @js.native
  open class WalkerBase () extends StObject {
    
    /** @type {WalkerContext} */
    var context: WalkerContext = js.native
    
    /**
      *
      * @param {any} parent
      * @param {string} prop
      * @param {number} index
      */
    def remove(parent: Any, prop: String, index: Double): Unit = js.native
    
    /**
      *
      * @param {any} parent
      * @param {string} prop
      * @param {number} index
      * @param {BaseNode} node
      */
    def replace(parent: Any, prop: String, index: Double, node: typingsJapgolly.estree.mod.BaseNode): Unit = js.native
    
    /** @type {BaseNode | null} */
    var replacement: BaseNode | Null = js.native
    
    /** @type {boolean} */
    var should_remove: Boolean = js.native
    
    /** @type {boolean} */
    var should_skip: Boolean = js.native
  }
  
  type BaseNode = typingsJapgolly.estree.mod.BaseNode
  
  trait WalkerContext extends StObject {
    
    def remove(): Unit
    
    def replace(node: typingsJapgolly.estree.mod.BaseNode): Unit
    
    def skip(): Unit
  }
  object WalkerContext {
    
    inline def apply(remove: Callback, replace: typingsJapgolly.estree.mod.BaseNode => Callback, skip: Callback): WalkerContext = {
      val __obj = js.Dynamic.literal(remove = remove.toJsFn, replace = js.Any.fromFunction1((t0: typingsJapgolly.estree.mod.BaseNode) => replace(t0).runNow()), skip = skip.toJsFn)
      __obj.asInstanceOf[WalkerContext]
    }
    
    extension [Self <: WalkerContext](x: Self) {
      
      inline def setRemove(value: Callback): Self = StObject.set(x, "remove", value.toJsFn)
      
      inline def setReplace(value: typingsJapgolly.estree.mod.BaseNode => Callback): Self = StObject.set(x, "replace", js.Any.fromFunction1((t0: typingsJapgolly.estree.mod.BaseNode) => value(t0).runNow()))
      
      inline def setSkip(value: Callback): Self = StObject.set(x, "skip", value.toJsFn)
    }
  }
}
