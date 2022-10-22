package typingsJapgolly.prosemirrorMenu

import japgolly.scalajs.react.Callback
import org.scalajs.dom.DocumentFragment
import org.scalajs.dom.Node
import typingsJapgolly.prosemirrorMenu.mod.MenuElement
import typingsJapgolly.prosemirrorModel.mod.Schema
import typingsJapgolly.prosemirrorState.mod.EditorState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Content[S /* <: Schema[Any, Any] */] extends StObject {
    
    var content: js.Array[js.Array[MenuElement[S]]]
    
    var floating: js.UndefOr[Boolean | Null] = js.undefined
  }
  object Content {
    
    inline def apply[S /* <: Schema[Any, Any] */](content: js.Array[js.Array[MenuElement[S]]]): Content[S] = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[Content[S]]
    }
    
    extension [Self <: Content[?], S /* <: Schema[Any, Any] */](x: Self & Content[S]) {
      
      inline def setContent(value: js.Array[js.Array[MenuElement[S]]]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentVarargs(value: js.Array[MenuElement[S]]*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setFloating(value: Boolean): Self = StObject.set(x, "floating", value.asInstanceOf[js.Any])
      
      inline def setFloatingNull: Self = StObject.set(x, "floating", null)
      
      inline def setFloatingUndefined: Self = StObject.set(x, "floating", js.undefined)
    }
  }
  
  trait Dom extends StObject {
    
    var dom: Node
    
    def update(p: EditorState): Unit
  }
  object Dom {
    
    inline def apply(dom: Node, update: EditorState => Callback): Dom = {
      val __obj = js.Dynamic.literal(dom = dom.asInstanceOf[js.Any], update = js.Any.fromFunction1((t0: EditorState) => update(t0).runNow()))
      __obj.asInstanceOf[Dom]
    }
    
    extension [Self <: Dom](x: Self) {
      
      inline def setDom(value: Node): Self = StObject.set(x, "dom", value.asInstanceOf[js.Any])
      
      inline def setUpdate(value: EditorState => Callback): Self = StObject.set(x, "update", js.Any.fromFunction1((t0: EditorState) => value(t0).runNow()))
    }
  }
  
  trait DomUpdate extends StObject {
    
    var dom: DocumentFragment
    
    def update(p: EditorState): Boolean
  }
  object DomUpdate {
    
    inline def apply(dom: DocumentFragment, update: EditorState => Boolean): DomUpdate = {
      val __obj = js.Dynamic.literal(dom = dom.asInstanceOf[js.Any], update = js.Any.fromFunction1(update))
      __obj.asInstanceOf[DomUpdate]
    }
    
    extension [Self <: DomUpdate](x: Self) {
      
      inline def setDom(value: DocumentFragment): Self = StObject.set(x, "dom", value.asInstanceOf[js.Any])
      
      inline def setUpdate(value: EditorState => Boolean): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    }
  }
  
  trait Update extends StObject {
    
    var dom: Node
    
    def update(p: EditorState): Boolean
  }
  object Update {
    
    inline def apply(dom: Node, update: EditorState => Boolean): Update = {
      val __obj = js.Dynamic.literal(dom = dom.asInstanceOf[js.Any], update = js.Any.fromFunction1(update))
      __obj.asInstanceOf[Update]
    }
    
    extension [Self <: Update](x: Self) {
      
      inline def setDom(value: Node): Self = StObject.set(x, "dom", value.asInstanceOf[js.Any])
      
      inline def setUpdate(value: EditorState => Boolean): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    }
  }
}
