package typingsJapgolly.codemirrorAutocomplete

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Node
import typingsJapgolly.codemirrorAutocomplete.mod.Completion
import typingsJapgolly.codemirrorState.mod.EditorState
import typingsJapgolly.codemirrorState.mod.Transaction
import typingsJapgolly.lezerCommon.mod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Dispatch extends StObject {
    
    def dispatch(tr: Transaction): Unit
    
    var state: EditorState
  }
  object Dispatch {
    
    inline def apply(dispatch: Transaction => Callback, state: EditorState): Dispatch = {
      val __obj = js.Dynamic.literal(dispatch = js.Any.fromFunction1((t0: Transaction) => dispatch(t0).runNow()), state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dispatch]
    }
    
    extension [Self <: Dispatch](x: Self) {
      
      inline def setDispatch(value: Transaction => Callback): Self = StObject.set(x, "dispatch", js.Any.fromFunction1((t0: Transaction) => value(t0).runNow()))
      
      inline def setState(value: EditorState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  trait From extends StObject {
    
    var from: Double
    
    var text: String
    
    var to: Double
    
    var `type`: NodeType
  }
  object From {
    
    inline def apply(from: Double, text: String, to: Double, `type`: NodeType): From = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[From]
    }
    
    extension [Self <: From](x: Self) {
      
      inline def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setType(value: NodeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Position extends StObject {
    
    var position: Double
    
    def render(completion: Completion, state: EditorState): Node | Null
  }
  object Position {
    
    inline def apply(position: Double, render: (Completion, EditorState) => Node | Null): Position = {
      val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], render = js.Any.fromFunction2(render))
      __obj.asInstanceOf[Position]
    }
    
    extension [Self <: Position](x: Self) {
      
      inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setRender(value: (Completion, EditorState) => Node | Null): Self = StObject.set(x, "render", js.Any.fromFunction2(value))
    }
  }
  
  trait Text extends StObject {
    
    var from: Double
    
    var text: String
    
    var to: Double
  }
  object Text {
    
    inline def apply(from: Double, text: String, to: Double): Text = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[Text]
    }
    
    extension [Self <: Text](x: Self) {
      
      inline def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
}
