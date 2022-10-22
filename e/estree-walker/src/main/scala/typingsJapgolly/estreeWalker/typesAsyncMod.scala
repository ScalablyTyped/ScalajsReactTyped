package typingsJapgolly.estreeWalker

import japgolly.scalajs.react.Callback
import typingsJapgolly.estreeWalker.anon.Remove
import typingsJapgolly.estreeWalker.typesWalkerMod.WalkerBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesAsyncMod {
  
  @JSImport("estree-walker/types/async", "AsyncWalker")
  @js.native
  open class AsyncWalker protected () extends WalkerBase {
    /**
      *
      * @param {AsyncHandler} enter
      * @param {AsyncHandler} leave
      */
    def this(
      enter: js.ThisFunction4[
            /* this */ Remove, 
            /* node */ typingsJapgolly.estree.mod.BaseNode, 
            /* parent */ typingsJapgolly.estree.mod.BaseNode, 
            /* key */ String, 
            /* index */ Double, 
            js.Promise[Unit]
          ],
      leave: js.ThisFunction4[
            /* this */ Remove, 
            /* node */ typingsJapgolly.estree.mod.BaseNode, 
            /* parent */ typingsJapgolly.estree.mod.BaseNode, 
            /* key */ String, 
            /* index */ Double, 
            js.Promise[Unit]
          ]
    ) = this()
    
    /** @type {AsyncHandler} */
    def enter(
      node: typingsJapgolly.estree.mod.BaseNode,
      parent: typingsJapgolly.estree.mod.BaseNode,
      key: String,
      index: Double
    ): js.Promise[Unit] = js.native
    /** @type {AsyncHandler} */
    @JSName("enter")
    var enter_Original: AsyncHandler = js.native
    
    /** @type {AsyncHandler} */
    def leave(
      node: typingsJapgolly.estree.mod.BaseNode,
      parent: typingsJapgolly.estree.mod.BaseNode,
      key: String,
      index: Double
    ): js.Promise[Unit] = js.native
    /** @type {AsyncHandler} */
    @JSName("leave")
    var leave_Original: AsyncHandler = js.native
    
    /**
      *
      * @param {BaseNode} node
      * @param {BaseNode} parent
      * @param {string} [prop]
      * @param {number} [index]
      * @returns {Promise<BaseNode>}
      */
    def visit(node: typingsJapgolly.estree.mod.BaseNode, parent: typingsJapgolly.estree.mod.BaseNode): js.Promise[typingsJapgolly.estree.mod.BaseNode] = js.native
    def visit(
      node: typingsJapgolly.estree.mod.BaseNode,
      parent: typingsJapgolly.estree.mod.BaseNode,
      prop: String
    ): js.Promise[typingsJapgolly.estree.mod.BaseNode] = js.native
    def visit(
      node: typingsJapgolly.estree.mod.BaseNode,
      parent: typingsJapgolly.estree.mod.BaseNode,
      prop: String,
      index: Double
    ): js.Promise[typingsJapgolly.estree.mod.BaseNode] = js.native
    def visit(
      node: typingsJapgolly.estree.mod.BaseNode,
      parent: typingsJapgolly.estree.mod.BaseNode,
      prop: Unit,
      index: Double
    ): js.Promise[typingsJapgolly.estree.mod.BaseNode] = js.native
  }
  
  type AsyncHandler = js.ThisFunction4[
    /* this */ Remove, 
    /* node */ typingsJapgolly.estree.mod.BaseNode, 
    /* parent */ typingsJapgolly.estree.mod.BaseNode, 
    /* key */ String, 
    /* index */ Double, 
    js.Promise[Unit]
  ]
  
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
