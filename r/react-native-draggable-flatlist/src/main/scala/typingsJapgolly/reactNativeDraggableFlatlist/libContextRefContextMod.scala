package typingsJapgolly.reactNativeDraggableFlatlist

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.RefHandle
import typingsJapgolly.react.mod.ForwardedRef
import typingsJapgolly.react.mod.MutableRefObject
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactNativeDraggableFlatlist.anon.FlatListRef
import typingsJapgolly.reactNativeDraggableFlatlist.anon.Js
import typingsJapgolly.reactNativeDraggableFlatlist.libTypesMod.CellData
import typingsJapgolly.reactNativeDraggableFlatlist.libTypesMod.DraggableFlatListProps
import typingsJapgolly.reactNativeGestureHandler.libTypescriptComponentsGestureComponentsMod.FlatList
import typingsJapgolly.reactNativeGestureHandler.libTypescriptHandlersPanGestureHandlerMod.PanGestureHandler
import typingsJapgolly.reactNativeReanimated.mod.Animated.SpringConfig
import typingsJapgolly.reactNativeReanimated.mod.Animated.View
import typingsJapgolly.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libContextRefContextMod {
  
  @JSImport("react-native-draggable-flatlist/lib/context/refContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](hasChildrenFlatListRef: FlatListRef[T]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasChildrenFlatListRef.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def useRefs[T](): RefContextValue[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRefs")().asInstanceOf[RefContextValue[T]]
  
  trait RefContextValue[T] extends StObject {
    
    var animationConfigRef: MutableRefObject[SpringConfig]
    
    var cellDataRef: MutableRefObject[Map[String, CellData]]
    
    var containerRef: RefHandle[View]
    
    var flatListRef: RefHandle[FlatList[T]] | ForwardedRef[FlatList[T]]
    
    var isTouchActiveRef: MutableRefObject[Js]
    
    var keyToIndexRef: MutableRefObject[Map[String, Double]]
    
    var panGestureHandlerRef: RefHandle[PanGestureHandler]
    
    var propsRef: MutableRefObject[DraggableFlatListProps[T]]
    
    var scrollOffsetRef: MutableRefObject[Double]
  }
  object RefContextValue {
    
    inline def apply[T](
      animationConfigRef: MutableRefObject[SpringConfig],
      cellDataRef: MutableRefObject[Map[String, CellData]],
      containerRef: RefHandle[View],
      isTouchActiveRef: MutableRefObject[Js],
      keyToIndexRef: MutableRefObject[Map[String, Double]],
      panGestureHandlerRef: RefHandle[PanGestureHandler],
      propsRef: MutableRefObject[DraggableFlatListProps[T]],
      scrollOffsetRef: MutableRefObject[Double]
    ): RefContextValue[T] = {
      val __obj = js.Dynamic.literal(animationConfigRef = animationConfigRef.asInstanceOf[js.Any], cellDataRef = cellDataRef.asInstanceOf[js.Any], containerRef = containerRef.asInstanceOf[js.Any], isTouchActiveRef = isTouchActiveRef.asInstanceOf[js.Any], keyToIndexRef = keyToIndexRef.asInstanceOf[js.Any], panGestureHandlerRef = panGestureHandlerRef.asInstanceOf[js.Any], propsRef = propsRef.asInstanceOf[js.Any], scrollOffsetRef = scrollOffsetRef.asInstanceOf[js.Any], flatListRef = null)
      __obj.asInstanceOf[RefContextValue[T]]
    }
    
    extension [Self <: RefContextValue[?], T](x: Self & RefContextValue[T]) {
      
      inline def setAnimationConfigRef(value: MutableRefObject[SpringConfig]): Self = StObject.set(x, "animationConfigRef", value.asInstanceOf[js.Any])
      
      inline def setCellDataRef(value: MutableRefObject[Map[String, CellData]]): Self = StObject.set(x, "cellDataRef", value.asInstanceOf[js.Any])
      
      inline def setContainerRef(value: RefHandle[View]): Self = StObject.set(x, "containerRef", value.asInstanceOf[js.Any])
      
      inline def setFlatListRef(value: RefHandle[FlatList[T]] | ForwardedRef[FlatList[T]]): Self = StObject.set(x, "flatListRef", value.asInstanceOf[js.Any])
      
      inline def setFlatListRefFunction1(value: /* instance */ FlatList[T] | Null => Callback): Self = StObject.set(x, "flatListRef", js.Any.fromFunction1((t0: /* instance */ FlatList[T] | Null) => value(t0).runNow()))
      
      inline def setFlatListRefNull: Self = StObject.set(x, "flatListRef", null)
      
      inline def setIsTouchActiveRef(value: MutableRefObject[Js]): Self = StObject.set(x, "isTouchActiveRef", value.asInstanceOf[js.Any])
      
      inline def setKeyToIndexRef(value: MutableRefObject[Map[String, Double]]): Self = StObject.set(x, "keyToIndexRef", value.asInstanceOf[js.Any])
      
      inline def setPanGestureHandlerRef(value: RefHandle[PanGestureHandler]): Self = StObject.set(x, "panGestureHandlerRef", value.asInstanceOf[js.Any])
      
      inline def setPropsRef(value: MutableRefObject[DraggableFlatListProps[T]]): Self = StObject.set(x, "propsRef", value.asInstanceOf[js.Any])
      
      inline def setScrollOffsetRef(value: MutableRefObject[Double]): Self = StObject.set(x, "scrollOffsetRef", value.asInstanceOf[js.Any])
    }
  }
}
