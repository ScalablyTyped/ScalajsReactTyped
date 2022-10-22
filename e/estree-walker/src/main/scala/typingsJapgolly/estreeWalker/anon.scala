package typingsJapgolly.estreeWalker

import japgolly.scalajs.react.Callback
import typingsJapgolly.estree.mod.BaseNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Enter extends StObject {
    
    var enter: js.UndefOr[
        js.ThisFunction4[
          /* this */ Remove, 
          /* node */ BaseNode, 
          /* parent */ BaseNode, 
          /* key */ String, 
          /* index */ Double, 
          js.Promise[Unit]
        ]
      ] = js.undefined
    
    var leave: js.UndefOr[
        js.ThisFunction4[
          /* this */ Remove, 
          /* node */ BaseNode, 
          /* parent */ BaseNode, 
          /* key */ String, 
          /* index */ Double, 
          js.Promise[Unit]
        ]
      ] = js.undefined
  }
  object Enter {
    
    inline def apply(): Enter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Enter]
    }
    
    extension [Self <: Enter](x: Self) {
      
      inline def setEnter(
        value: js.ThisFunction4[
              /* this */ Remove, 
              /* node */ BaseNode, 
              /* parent */ BaseNode, 
              /* key */ String, 
              /* index */ Double, 
              js.Promise[Unit]
            ]
      ): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
      
      inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
      
      inline def setLeave(
        value: js.ThisFunction4[
              /* this */ Remove, 
              /* node */ BaseNode, 
              /* parent */ BaseNode, 
              /* key */ String, 
              /* index */ Double, 
              js.Promise[Unit]
            ]
      ): Self = StObject.set(x, "leave", value.asInstanceOf[js.Any])
      
      inline def setLeaveUndefined: Self = StObject.set(x, "leave", js.undefined)
    }
  }
  
  trait Leave extends StObject {
    
    var enter: js.UndefOr[
        js.ThisFunction4[
          /* this */ Remove, 
          /* node */ BaseNode, 
          /* parent */ BaseNode, 
          /* key */ String, 
          /* index */ Double, 
          Unit
        ]
      ] = js.undefined
    
    var leave: js.UndefOr[
        js.ThisFunction4[
          /* this */ Remove, 
          /* node */ BaseNode, 
          /* parent */ BaseNode, 
          /* key */ String, 
          /* index */ Double, 
          Unit
        ]
      ] = js.undefined
  }
  object Leave {
    
    inline def apply(): Leave = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Leave]
    }
    
    extension [Self <: Leave](x: Self) {
      
      inline def setEnter(
        value: js.ThisFunction4[
              /* this */ Remove, 
              /* node */ BaseNode, 
              /* parent */ BaseNode, 
              /* key */ String, 
              /* index */ Double, 
              Unit
            ]
      ): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
      
      inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
      
      inline def setLeave(
        value: js.ThisFunction4[
              /* this */ Remove, 
              /* node */ BaseNode, 
              /* parent */ BaseNode, 
              /* key */ String, 
              /* index */ Double, 
              Unit
            ]
      ): Self = StObject.set(x, "leave", value.asInstanceOf[js.Any])
      
      inline def setLeaveUndefined: Self = StObject.set(x, "leave", js.undefined)
    }
  }
  
  trait Remove extends StObject {
    
    def remove(): Unit
    
    def replace(node: BaseNode): Unit
    
    def skip(): Unit
  }
  object Remove {
    
    inline def apply(remove: Callback, replace: BaseNode => Callback, skip: Callback): Remove = {
      val __obj = js.Dynamic.literal(remove = remove.toJsFn, replace = js.Any.fromFunction1((t0: BaseNode) => replace(t0).runNow()), skip = skip.toJsFn)
      __obj.asInstanceOf[Remove]
    }
    
    extension [Self <: Remove](x: Self) {
      
      inline def setRemove(value: Callback): Self = StObject.set(x, "remove", value.toJsFn)
      
      inline def setReplace(value: BaseNode => Callback): Self = StObject.set(x, "replace", js.Any.fromFunction1((t0: BaseNode) => value(t0).runNow()))
      
      inline def setSkip(value: Callback): Self = StObject.set(x, "skip", value.toJsFn)
    }
  }
}
