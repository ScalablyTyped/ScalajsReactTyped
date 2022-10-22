package typingsJapgolly.reactMdDialog

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesNestedDialogContextMod {
  
  @JSImport("@react-md/dialog/types/NestedDialogContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def NestedDialogContextProvider(hasChildren: NestedDialogContextProviderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("NestedDialogContextProvider")(hasChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def useNestedDialogContext(): NestedDialogContext = ^.asInstanceOf[js.Dynamic].applyDynamic("useNestedDialogContext")().asInstanceOf[NestedDialogContext]
  
  trait NestedDialogContext extends StObject {
    
    def add(dialogId: String): Unit
    
    def remove(dialogId: String): Unit
    
    var stack: js.Array[String]
  }
  object NestedDialogContext {
    
    inline def apply(add: String => Callback, remove: String => Callback, stack: js.Array[String]): NestedDialogContext = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1((t0: String) => add(t0).runNow()), remove = js.Any.fromFunction1((t0: String) => remove(t0).runNow()), stack = stack.asInstanceOf[js.Any])
      __obj.asInstanceOf[NestedDialogContext]
    }
    
    extension [Self <: NestedDialogContext](x: Self) {
      
      inline def setAdd(value: String => Callback): Self = StObject.set(x, "add", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setRemove(value: String => Callback): Self = StObject.set(x, "remove", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setStack(value: js.Array[String]): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      inline def setStackVarargs(value: String*): Self = StObject.set(x, "stack", js.Array(value*))
    }
  }
  
  trait NestedDialogContextProviderProps extends StObject {
    
    var children: Node
  }
  object NestedDialogContextProviderProps {
    
    inline def apply(): NestedDialogContextProviderProps = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[NestedDialogContextProviderProps]
    }
    
    extension [Self <: NestedDialogContextProviderProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    }
  }
}
