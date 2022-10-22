package typingsJapgolly.prosemirrorState

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.prosemirrorModel.mod.Node
import typingsJapgolly.prosemirrorState.mod.AllSelection
import typingsJapgolly.prosemirrorState.mod.EditorState
import typingsJapgolly.prosemirrorState.mod.Plugin
import typingsJapgolly.prosemirrorState.mod.Transaction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Map extends StObject {
    
    def map(): Any
    
    def resolve(doc: Node): AllSelection
  }
  object Map {
    
    inline def apply(map: CallbackTo[Any], resolve: Node => AllSelection): Map = {
      val __obj = js.Dynamic.literal(map = map.toJsFn, resolve = js.Any.fromFunction1(resolve))
      __obj.asInstanceOf[Map]
    }
    
    extension [Self <: Map](x: Self) {
      
      inline def setMap(value: CallbackTo[Any]): Self = StObject.set(x, "map", value.toJsFn)
      
      inline def setResolve(value: Node => AllSelection): Self = StObject.set(x, "resolve", js.Any.fromFunction1(value))
    }
  }
  
  trait Plugins extends StObject {
    
    /**
      New set of active plugins.
      */
    var plugins: js.UndefOr[js.Array[Plugin[Any]]] = js.undefined
  }
  object Plugins {
    
    inline def apply(): Plugins = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Plugins]
    }
    
    extension [Self <: Plugins](x: Self) {
      
      inline def setPlugins(value: js.Array[Plugin[Any]]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: Plugin[Any]*): Self = StObject.set(x, "plugins", js.Array(value*))
    }
  }
  
  trait State extends StObject {
    
    var state: EditorState
    
    var transactions: js.Array[Transaction]
  }
  object State {
    
    inline def apply(state: EditorState, transactions: js.Array[Transaction]): State = {
      val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any], transactions = transactions.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    extension [Self <: State](x: Self) {
      
      inline def setState(value: EditorState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setTransactions(value: js.Array[Transaction]): Self = StObject.set(x, "transactions", value.asInstanceOf[js.Any])
      
      inline def setTransactionsVarargs(value: Transaction*): Self = StObject.set(x, "transactions", js.Array(value*))
    }
  }
}
