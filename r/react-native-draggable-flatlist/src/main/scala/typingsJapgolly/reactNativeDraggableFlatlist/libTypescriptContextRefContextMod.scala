package typingsJapgolly.reactNativeDraggableFlatlist

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.RefHandle
import typingsJapgolly.react.mod.ForwardedRef
import typingsJapgolly.react.mod.MutableRefObject
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactNativeDraggableFlatlist.anon.ChildrenFlatListRef
import typingsJapgolly.reactNativeDraggableFlatlist.libTypescriptTypesMod.CellData
import typingsJapgolly.reactNativeDraggableFlatlist.libTypescriptTypesMod.DraggableFlatListProps
import typingsJapgolly.reactNativeGestureHandler.libTypescriptComponentsGestureComponentsMod.FlatList
import typingsJapgolly.reactNativeReanimated.mod.Animated.ScrollView
import typingsJapgolly.reactNativeReanimated.mod.Animated.View
import typingsJapgolly.reactNativeReanimated.mod.WithSpringConfig
import typingsJapgolly.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptContextRefContextMod {
  
  @JSImport("react-native-draggable-flatlist/lib/typescript/context/refContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](hasChildrenFlatListRef: ChildrenFlatListRef[T]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasChildrenFlatListRef.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def useRefs[T](): RefContextValue[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRefs")().asInstanceOf[RefContextValue[T]]
  
  trait RefContextValue[T] extends StObject {
    
    var animationConfigRef: MutableRefObject[WithSpringConfig]
    
    var cellDataRef: MutableRefObject[Map[String, CellData]]
    
    var containerRef: RefHandle[View]
    
    var flatlistRef: RefHandle[FlatList[T]] | ForwardedRef[FlatList[T]]
    
    var keyToIndexRef: MutableRefObject[Map[String, Double]]
    
    var propsRef: MutableRefObject[DraggableFlatListProps[T]]
    
    var scrollViewRef: RefHandle[ScrollView]
  }
  object RefContextValue {
    
    inline def apply[T](
      animationConfigRef: MutableRefObject[WithSpringConfig],
      cellDataRef: MutableRefObject[Map[String, CellData]],
      containerRef: RefHandle[View],
      keyToIndexRef: MutableRefObject[Map[String, Double]],
      propsRef: MutableRefObject[DraggableFlatListProps[T]],
      scrollViewRef: RefHandle[ScrollView]
    ): RefContextValue[T] = {
      val __obj = js.Dynamic.literal(animationConfigRef = animationConfigRef.asInstanceOf[js.Any], cellDataRef = cellDataRef.asInstanceOf[js.Any], containerRef = containerRef.asInstanceOf[js.Any], keyToIndexRef = keyToIndexRef.asInstanceOf[js.Any], propsRef = propsRef.asInstanceOf[js.Any], scrollViewRef = scrollViewRef.asInstanceOf[js.Any], flatlistRef = null)
      __obj.asInstanceOf[RefContextValue[T]]
    }
    
    extension [Self <: RefContextValue[?], T](x: Self & RefContextValue[T]) {
      
      inline def setAnimationConfigRef(value: MutableRefObject[WithSpringConfig]): Self = StObject.set(x, "animationConfigRef", value.asInstanceOf[js.Any])
      
      inline def setCellDataRef(value: MutableRefObject[Map[String, CellData]]): Self = StObject.set(x, "cellDataRef", value.asInstanceOf[js.Any])
      
      inline def setContainerRef(value: RefHandle[View]): Self = StObject.set(x, "containerRef", value.asInstanceOf[js.Any])
      
      inline def setFlatlistRef(value: RefHandle[FlatList[T]] | ForwardedRef[FlatList[T]]): Self = StObject.set(x, "flatlistRef", value.asInstanceOf[js.Any])
      
      inline def setFlatlistRefFunction1(value: /* instance */ FlatList[T] | Null => Callback): Self = StObject.set(x, "flatlistRef", js.Any.fromFunction1((t0: /* instance */ FlatList[T] | Null) => value(t0).runNow()))
      
      inline def setFlatlistRefNull: Self = StObject.set(x, "flatlistRef", null)
      
      inline def setKeyToIndexRef(value: MutableRefObject[Map[String, Double]]): Self = StObject.set(x, "keyToIndexRef", value.asInstanceOf[js.Any])
      
      inline def setPropsRef(value: MutableRefObject[DraggableFlatListProps[T]]): Self = StObject.set(x, "propsRef", value.asInstanceOf[js.Any])
      
      inline def setScrollViewRef(value: RefHandle[ScrollView]): Self = StObject.set(x, "scrollViewRef", value.asInstanceOf[js.Any])
    }
  }
}
