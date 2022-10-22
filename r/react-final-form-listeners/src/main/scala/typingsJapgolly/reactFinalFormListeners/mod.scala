package typingsJapgolly.reactFinalFormListeners

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-final-form-listeners", "ExternallyChanged")
  @js.native
  val ExternallyChanged: FC[ExternallyChangedProps] = js.native
  
  @JSImport("react-final-form-listeners", "OnBlur")
  @js.native
  val OnBlur: FC[OnBlurProps] = js.native
  
  @JSImport("react-final-form-listeners", "OnChange")
  @js.native
  val OnChange: FC[OnChangeProps] = js.native
  
  @JSImport("react-final-form-listeners", "OnFocus")
  @js.native
  val OnFocus: FC[OnFocusProps] = js.native
  
  trait ExternallyChangedProps extends StObject {
    
    def children(externallyChanged: Boolean): Node
    
    var name: String
  }
  object ExternallyChangedProps {
    
    inline def apply(children: Boolean => Node, name: String): ExternallyChangedProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExternallyChangedProps]
    }
    
    extension [Self <: ExternallyChangedProps](x: Self) {
      
      inline def setChildren(value: Boolean => Node): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait OnBlurProps extends StObject {
    
    def children(): Unit
    
    var name: String
  }
  object OnBlurProps {
    
    inline def apply(children: Callback, name: String): OnBlurProps = {
      val __obj = js.Dynamic.literal(children = children.toJsFn, name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnBlurProps]
    }
    
    extension [Self <: OnBlurProps](x: Self) {
      
      inline def setChildren(value: Callback): Self = StObject.set(x, "children", value.toJsFn)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait OnChangeProps extends StObject {
    
    def children(value: Any, previous: Any): Unit
    
    var name: String
  }
  object OnChangeProps {
    
    inline def apply(children: (Any, Any) => Callback, name: String): OnChangeProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction2((t0: Any, t1: Any) => (children(t0, t1)).runNow()), name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnChangeProps]
    }
    
    extension [Self <: OnChangeProps](x: Self) {
      
      inline def setChildren(value: (Any, Any) => Callback): Self = StObject.set(x, "children", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait OnFocusProps extends StObject {
    
    def children(): Unit
    
    var name: String
  }
  object OnFocusProps {
    
    inline def apply(children: Callback, name: String): OnFocusProps = {
      val __obj = js.Dynamic.literal(children = children.toJsFn, name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnFocusProps]
    }
    
    extension [Self <: OnFocusProps](x: Self) {
      
      inline def setChildren(value: Callback): Self = StObject.set(x, "children", value.toJsFn)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
