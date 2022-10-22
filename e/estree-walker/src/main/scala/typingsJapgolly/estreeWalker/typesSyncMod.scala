package typingsJapgolly.estreeWalker

import japgolly.scalajs.react.Callback
import typingsJapgolly.estreeWalker.anon.Remove
import typingsJapgolly.estreeWalker.typesWalkerMod.WalkerBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSyncMod {
  
  @JSImport("estree-walker/types/sync", "SyncWalker")
  @js.native
  open class SyncWalker protected () extends WalkerBase {
    /**
      *
      * @param {SyncHandler} enter
      * @param {SyncHandler} leave
      */
    def this(
      enter: js.ThisFunction4[
            /* this */ Remove, 
            /* node */ typingsJapgolly.estree.mod.BaseNode, 
            /* parent */ typingsJapgolly.estree.mod.BaseNode, 
            /* key */ String, 
            /* index */ Double, 
            Unit
          ],
      leave: js.ThisFunction4[
            /* this */ Remove, 
            /* node */ typingsJapgolly.estree.mod.BaseNode, 
            /* parent */ typingsJapgolly.estree.mod.BaseNode, 
            /* key */ String, 
            /* index */ Double, 
            Unit
          ]
    ) = this()
    
    /** @type {SyncHandler} */
    def enter(
      node: typingsJapgolly.estree.mod.BaseNode,
      parent: typingsJapgolly.estree.mod.BaseNode,
      key: String,
      index: Double
    ): Unit = js.native
    /** @type {SyncHandler} */
    @JSName("enter")
    var enter_Original: SyncHandler = js.native
    
    /** @type {SyncHandler} */
    def leave(
      node: typingsJapgolly.estree.mod.BaseNode,
      parent: typingsJapgolly.estree.mod.BaseNode,
      key: String,
      index: Double
    ): Unit = js.native
    /** @type {SyncHandler} */
    @JSName("leave")
    var leave_Original: SyncHandler = js.native
    
    /**
      *
      * @param {BaseNode} node
      * @param {BaseNode} parent
      * @param {string} [prop]
      * @param {number} [index]
      * @returns {BaseNode}
      */
    def visit(node: typingsJapgolly.estree.mod.BaseNode, parent: typingsJapgolly.estree.mod.BaseNode): typingsJapgolly.estree.mod.BaseNode = js.native
    def visit(
      node: typingsJapgolly.estree.mod.BaseNode,
      parent: typingsJapgolly.estree.mod.BaseNode,
      prop: String
    ): typingsJapgolly.estree.mod.BaseNode = js.native
    def visit(
      node: typingsJapgolly.estree.mod.BaseNode,
      parent: typingsJapgolly.estree.mod.BaseNode,
      prop: String,
      index: Double
    ): typingsJapgolly.estree.mod.BaseNode = js.native
    def visit(
      node: typingsJapgolly.estree.mod.BaseNode,
      parent: typingsJapgolly.estree.mod.BaseNode,
      prop: Unit,
      index: Double
    ): typingsJapgolly.estree.mod.BaseNode = js.native
  }
  
  type BaseNode = typingsJapgolly.estree.mod.BaseNode
  
  type SyncHandler = js.ThisFunction4[
    /* this */ Remove, 
    /* node */ typingsJapgolly.estree.mod.BaseNode, 
    /* parent */ typingsJapgolly.estree.mod.BaseNode, 
    /* key */ String, 
    /* index */ Double, 
    Unit
  ]
  
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
