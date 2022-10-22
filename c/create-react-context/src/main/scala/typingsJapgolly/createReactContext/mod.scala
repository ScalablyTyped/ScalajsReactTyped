package typingsJapgolly.createReactContext

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.ComponentClassP
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("create-react-context", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](defaultValue: T): Context[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[Context[T]]
  inline def default[T](defaultValue: T, calculateChangedBits: js.Function2[/* prev */ T, /* next */ T, Double]): Context[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(defaultValue.asInstanceOf[js.Any], calculateChangedBits.asInstanceOf[js.Any])).asInstanceOf[Context[T]]
  
  trait ConsumerProps[T] extends StObject {
    
    var children: RenderFn[T] | js.Array[RenderFn[T]]
    
    var observedBits: js.UndefOr[Double] = js.undefined
  }
  object ConsumerProps {
    
    inline def apply[T](children: RenderFn[T] | js.Array[RenderFn[T]]): ConsumerProps[T] = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConsumerProps[T]]
    }
    
    extension [Self <: ConsumerProps[?], T](x: Self & ConsumerProps[T]) {
      
      inline def setChildren(value: RenderFn[T] | js.Array[RenderFn[T]]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction1(value: T => Node): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenVarargs(value: RenderFn[T]*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setObservedBits(value: Double): Self = StObject.set(x, "observedBits", value.asInstanceOf[js.Any])
      
      inline def setObservedBitsUndefined: Self = StObject.set(x, "observedBits", js.undefined)
    }
  }
  
  trait Context[T] extends StObject {
    
    var Consumer: ComponentClassP[ConsumerProps[T] & js.Object]
    
    var Provider: ComponentClassP[ProviderProps[T] & js.Object]
  }
  object Context {
    
    inline def apply[T](
      Consumer: ComponentClassP[ConsumerProps[T] & js.Object],
      Provider: ComponentClassP[ProviderProps[T] & js.Object]
    ): Context[T] = {
      val __obj = js.Dynamic.literal(Consumer = Consumer.asInstanceOf[js.Any], Provider = Provider.asInstanceOf[js.Any])
      __obj.asInstanceOf[Context[T]]
    }
    
    extension [Self <: Context[?], T](x: Self & Context[T]) {
      
      inline def setConsumer(value: ComponentClassP[ConsumerProps[T] & js.Object]): Self = StObject.set(x, "Consumer", value.asInstanceOf[js.Any])
      
      inline def setProvider(value: ComponentClassP[ProviderProps[T] & js.Object]): Self = StObject.set(x, "Provider", value.asInstanceOf[js.Any])
    }
  }
  
  trait ProviderProps[T] extends StObject {
    
    var children: Node
    
    var value: T
  }
  object ProviderProps {
    
    inline def apply[T](value: T): ProviderProps[T] = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], children = null)
      __obj.asInstanceOf[ProviderProps[T]]
    }
    
    extension [Self <: ProviderProps[?], T](x: Self & ProviderProps[T]) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type RenderFn[T] = js.Function1[/* value */ T, Node]
}
