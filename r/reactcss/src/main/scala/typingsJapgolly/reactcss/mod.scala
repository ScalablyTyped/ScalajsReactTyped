package typingsJapgolly.reactcss

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.ComponentClassP
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.react.mod.LegacyRef
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("reactcss", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](classes: Classes[T], activations: Any*): T = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(scala.List(classes.asInstanceOf[js.Any]).`++`(activations.asInstanceOf[Seq[js.Any]])*).asInstanceOf[T]
  
  inline def hover[A](component: ComponentClassP[A & js.Object]): ComponentClassP[A & js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("hover")(component.asInstanceOf[js.Any]).asInstanceOf[ComponentClassP[A & js.Object]]
  inline def hover[A](component: FunctionComponent[A]): ComponentClassP[A & js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("hover")(component.asInstanceOf[js.Any]).asInstanceOf[ComponentClassP[A & js.Object]]
  
  inline def loop(index: Double, length: Double): LoopableProps = (^.asInstanceOf[js.Dynamic].applyDynamic("loop")(index.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[LoopableProps]
  
  type CSS = CSSProperties
  
  trait Classes[T]
    extends StObject
       with /* scope */ StringDictionary[Partial[T]] {
    
    var default: Partial[T]
  }
  object Classes {
    
    inline def apply[T](default: Partial[T]): Classes[T] = {
      val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
      __obj.asInstanceOf[Classes[T]]
    }
    
    extension [Self <: Classes[?], T](x: Self & Classes[T]) {
      
      inline def setDefault(value: Partial[T]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    }
  }
  
  trait HoverProps[T] extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var hover: js.UndefOr[Boolean] = js.undefined
    
    var ref: js.UndefOr[LegacyRef[T]] = js.undefined
  }
  object HoverProps {
    
    inline def apply[T](): HoverProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HoverProps[T]]
    }
    
    extension [Self <: HoverProps[?], T](x: Self & HoverProps[T]) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setHover(value: Boolean): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
      
      inline def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
      
      inline def setRef(value: LegacyRef[T]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: T | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: T | Null) => value(t0).runNow()))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
  
  trait LoopableProps extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var even: js.UndefOr[Boolean] = js.undefined
    
    var `first-child`: js.UndefOr[Boolean] = js.undefined
    
    var `last-child`: js.UndefOr[Boolean] = js.undefined
    
    var `nth-child`: Double
    
    var odd: js.UndefOr[Boolean] = js.undefined
    
    var ref: js.UndefOr[LegacyRef[Any]] = js.undefined
  }
  object LoopableProps {
    
    inline def apply(`nth-child`: Double): LoopableProps = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("nth-child")(`nth-child`.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoopableProps]
    }
    
    extension [Self <: LoopableProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setEven(value: Boolean): Self = StObject.set(x, "even", value.asInstanceOf[js.Any])
      
      inline def setEvenUndefined: Self = StObject.set(x, "even", js.undefined)
      
      inline def `setFirst-child`(value: Boolean): Self = StObject.set(x, "first-child", value.asInstanceOf[js.Any])
      
      inline def `setFirst-childUndefined`: Self = StObject.set(x, "first-child", js.undefined)
      
      inline def `setLast-child`(value: Boolean): Self = StObject.set(x, "last-child", value.asInstanceOf[js.Any])
      
      inline def `setLast-childUndefined`: Self = StObject.set(x, "last-child", js.undefined)
      
      inline def `setNth-child`(value: Double): Self = StObject.set(x, "nth-child", value.asInstanceOf[js.Any])
      
      inline def setOdd(value: Boolean): Self = StObject.set(x, "odd", value.asInstanceOf[js.Any])
      
      inline def setOddUndefined: Self = StObject.set(x, "odd", js.undefined)
      
      inline def setRef(value: LegacyRef[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: Any | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
}
