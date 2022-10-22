package typingsJapgolly.reactNativeDraggableFlatlist

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libContextDraggableFlatListContextMod {
  
  @JSImport("react-native-draggable-flatlist/lib/context/draggableFlatListContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](hasActiveKeyOnDragEndKeyExtractorHorizontalChildren: Props[T]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasActiveKeyOnDragEndKeyExtractorHorizontalChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def useDraggableFlatListContext[T](): DraggableFlatListContextValue[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useDraggableFlatListContext")().asInstanceOf[DraggableFlatListContextValue[T]]
  
  /* Inlined std.Omit<react-native-draggable-flatlist.react-native-draggable-flatlist/lib/context/draggableFlatListContext.Props<T>, 'children'> */
  trait DraggableFlatListContextValue[T] extends StObject {
    
    var activeKey: js.UndefOr[String | Null] = js.undefined
    
    var horizontal: Boolean
    
    var keyExtractor: js.Function2[/* item */ T, /* index */ Double, String]
    
    var onDragEnd: js.Function1[/* hasFromTo */ js.Array[Double], Unit]
  }
  object DraggableFlatListContextValue {
    
    inline def apply[T](
      horizontal: Boolean,
      keyExtractor: (/* item */ T, /* index */ Double) => String,
      onDragEnd: /* hasFromTo */ js.Array[Double] => Callback
    ): DraggableFlatListContextValue[T] = {
      val __obj = js.Dynamic.literal(horizontal = horizontal.asInstanceOf[js.Any], keyExtractor = js.Any.fromFunction2(keyExtractor), onDragEnd = js.Any.fromFunction1((t0: /* hasFromTo */ js.Array[Double]) => onDragEnd(t0).runNow()))
      __obj.asInstanceOf[DraggableFlatListContextValue[T]]
    }
    
    extension [Self <: DraggableFlatListContextValue[?], T](x: Self & DraggableFlatListContextValue[T]) {
      
      inline def setActiveKey(value: String): Self = StObject.set(x, "activeKey", value.asInstanceOf[js.Any])
      
      inline def setActiveKeyNull: Self = StObject.set(x, "activeKey", null)
      
      inline def setActiveKeyUndefined: Self = StObject.set(x, "activeKey", js.undefined)
      
      inline def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      inline def setKeyExtractor(value: (/* item */ T, /* index */ Double) => String): Self = StObject.set(x, "keyExtractor", js.Any.fromFunction2(value))
      
      inline def setOnDragEnd(value: /* hasFromTo */ js.Array[Double] => Callback): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1((t0: /* hasFromTo */ js.Array[Double]) => value(t0).runNow()))
    }
  }
  
  trait Props[T] extends StObject {
    
    var activeKey: String | Null
    
    var children: Node
    
    var horizontal: Boolean
    
    def keyExtractor(item: T, index: Double): String
    
    def onDragEnd(hasFromTo: js.Array[Double]): Unit
  }
  object Props {
    
    inline def apply[T](horizontal: Boolean, keyExtractor: (T, Double) => String, onDragEnd: js.Array[Double] => Callback): Props[T] = {
      val __obj = js.Dynamic.literal(horizontal = horizontal.asInstanceOf[js.Any], keyExtractor = js.Any.fromFunction2(keyExtractor), onDragEnd = js.Any.fromFunction1((t0: js.Array[Double]) => onDragEnd(t0).runNow()), activeKey = null, children = null)
      __obj.asInstanceOf[Props[T]]
    }
    
    extension [Self <: Props[?], T](x: Self & Props[T]) {
      
      inline def setActiveKey(value: String): Self = StObject.set(x, "activeKey", value.asInstanceOf[js.Any])
      
      inline def setActiveKeyNull: Self = StObject.set(x, "activeKey", null)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      inline def setKeyExtractor(value: (T, Double) => String): Self = StObject.set(x, "keyExtractor", js.Any.fromFunction2(value))
      
      inline def setOnDragEnd(value: js.Array[Double] => Callback): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1((t0: js.Array[Double]) => value(t0).runNow()))
    }
  }
}
