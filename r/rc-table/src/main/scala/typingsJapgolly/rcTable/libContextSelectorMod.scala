package typingsJapgolly.rcTable

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.std.Partial
import typingsJapgolly.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libContextSelectorMod {
  
  @JSImport("rc-table/lib/ContextSelector", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createContext[T](): ReturnCreateContext[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createContext")().asInstanceOf[ReturnCreateContext[T]]
  inline def createContext[T](defaultContext: T): ReturnCreateContext[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createContext")(defaultContext.asInstanceOf[js.Any]).asInstanceOf[ReturnCreateContext[T]]
  
  inline def useContextSelector[T, S /* <: /* keyof T */ String */](holder: ReturnCreateContext[T], selector: S): /* import warning: importer.ImportType#apply Failed type conversion: T[S] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("useContextSelector")(holder.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T[S] */ js.Any]
  inline def useContextSelector[T, O /* <: Partial[T] */](holder: ReturnCreateContext[T], selector: js.Array[/* keyof T */ String]): O = (^.asInstanceOf[js.Dynamic].applyDynamic("useContextSelector")(holder.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[O]
  inline def useContextSelector[T, O](holder: ReturnCreateContext[T], selector: Selector[T, O]): O = (^.asInstanceOf[js.Dynamic].applyDynamic("useContextSelector")(holder.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[O]
  
  trait Context[T] extends StObject {
    
    def getValue(): T
    
    var listeners: Listeners[T]
  }
  object Context {
    
    inline def apply[T](getValue: CallbackTo[T], listeners: Listeners[T]): Context[T] = {
      val __obj = js.Dynamic.literal(getValue = getValue.toJsFn, listeners = listeners.asInstanceOf[js.Any])
      __obj.asInstanceOf[Context[T]]
    }
    
    extension [Self <: Context[?], T](x: Self & Context[T]) {
      
      inline def setGetValue(value: CallbackTo[T]): Self = StObject.set(x, "getValue", value.toJsFn)
      
      inline def setListeners(value: Listeners[T]): Self = StObject.set(x, "listeners", value.asInstanceOf[js.Any])
    }
  }
  
  trait ContextSelectorProviderProps[T] extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var value: T
  }
  object ContextSelectorProviderProps {
    
    inline def apply[T](value: T): ContextSelectorProviderProps[T] = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContextSelectorProviderProps[T]]
    }
    
    extension [Self <: ContextSelectorProviderProps[?], T](x: Self & ContextSelectorProviderProps[T]) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type Listeners[T] = Set[Trigger[T]]
  
  trait ReturnCreateContext[T] extends StObject {
    
    var Context: typingsJapgolly.react.mod.Context[typingsJapgolly.rcTable.libContextSelectorMod.Context[T]]
    
    var Provider: ComponentType[ContextSelectorProviderProps[T]]
  }
  object ReturnCreateContext {
    
    inline def apply[T](
      Context: typingsJapgolly.react.mod.Context[Context[T]],
      Provider: ComponentType[ContextSelectorProviderProps[T]]
    ): ReturnCreateContext[T] = {
      val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], Provider = Provider.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReturnCreateContext[T]]
    }
    
    extension [Self <: ReturnCreateContext[?], T](x: Self & ReturnCreateContext[T]) {
      
      inline def setContext(value: typingsJapgolly.react.mod.Context[Context[T]]): Self = StObject.set(x, "Context", value.asInstanceOf[js.Any])
      
      inline def setProvider(value: ComponentType[ContextSelectorProviderProps[T]]): Self = StObject.set(x, "Provider", value.asInstanceOf[js.Any])
    }
  }
  
  type Selector[T, O] = js.Function1[/* value */ T, O]
  
  type Trigger[T] = js.Function1[/* value */ T, Unit]
}
