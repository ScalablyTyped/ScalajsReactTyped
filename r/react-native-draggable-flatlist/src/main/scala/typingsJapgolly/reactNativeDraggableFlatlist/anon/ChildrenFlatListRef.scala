package typingsJapgolly.reactNativeDraggableFlatlist.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.ForwardedRef
import typingsJapgolly.reactNativeGestureHandler.libTypescriptComponentsGestureComponentsMod.FlatList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChildrenFlatListRef[T] extends StObject {
  
  var children: Node
  
  var flatListRef: js.UndefOr[ForwardedRef[FlatList[T]] | Null] = js.undefined
}
object ChildrenFlatListRef {
  
  inline def apply[T](): ChildrenFlatListRef[T] = {
    val __obj = js.Dynamic.literal(children = null)
    __obj.asInstanceOf[ChildrenFlatListRef[T]]
  }
  
  extension [Self <: ChildrenFlatListRef[?], T](x: Self & ChildrenFlatListRef[T]) {
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setFlatListRef(value: ForwardedRef[FlatList[T]]): Self = StObject.set(x, "flatListRef", value.asInstanceOf[js.Any])
    
    inline def setFlatListRefFunction1(value: /* instance */ FlatList[T] | Null => Callback): Self = StObject.set(x, "flatListRef", js.Any.fromFunction1((t0: /* instance */ FlatList[T] | Null) => value(t0).runNow()))
    
    inline def setFlatListRefNull: Self = StObject.set(x, "flatListRef", null)
    
    inline def setFlatListRefUndefined: Self = StObject.set(x, "flatListRef", js.undefined)
  }
}
