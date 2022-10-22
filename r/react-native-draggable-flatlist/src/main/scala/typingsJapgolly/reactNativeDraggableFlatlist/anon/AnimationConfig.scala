package typingsJapgolly.reactNativeDraggableFlatlist.anon

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Node
import typingsJapgolly.react.mod.ForwardedRef
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeDraggableFlatlist.libTypesMod.DragEndParams
import typingsJapgolly.reactNativeDraggableFlatlist.libTypesMod.RenderItem
import typingsJapgolly.reactNativeDraggableFlatlist.libTypesMod.RenderItemParams
import typingsJapgolly.reactNativeDraggableFlatlist.libTypesMod.RenderPlaceholder
import typingsJapgolly.reactNativeGestureHandler.libTypescriptComponentsGestureComponentsMod.FlatList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationConfig[T] extends StObject {
  
  var activationDistance: js.UndefOr[Double] = js.undefined
  
  var animationConfig: js.UndefOr[PartialSpringConfig] = js.undefined
  
  var autoscrollSpeed: js.UndefOr[Double] = js.undefined
  
  var autoscrollThreshold: js.UndefOr[Double] = js.undefined
  
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var data: js.Array[T]
  
  var debug: js.UndefOr[Boolean] = js.undefined
  
  var dragItemOverflow: js.UndefOr[Boolean] = js.undefined
  
  def keyExtractor(item: T, index: Double): String
  
  var onAnimValInit: js.UndefOr[js.Function1[/* animVals */ ActivationDistance, Unit]] = js.undefined
  
  var onDragBegin: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.undefined
  
  var onDragEnd: js.UndefOr[js.Function1[/* params */ DragEndParams[T], Unit]] = js.undefined
  
  var onPlaceholderIndexChange: js.UndefOr[js.Function1[/* placeholderIndex */ Double, Unit]] = js.undefined
  
  var onRelease: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.undefined
  
  var onScrollOffsetChange: js.UndefOr[js.Function1[/* scrollOffset */ Double, Unit]] = js.undefined
  
  var outerScrollOffset: js.UndefOr[Node] = js.undefined
  
  var ref: js.UndefOr[ForwardedRef[FlatList[T]]] = js.undefined
  
  var renderItem: RenderItem[T]
  
  var renderPlaceholder: js.UndefOr[RenderPlaceholder[T]] = js.undefined
  
  var simultaneousHandlers: js.UndefOr[
    typingsJapgolly.react.mod.Ref[Any] | js.Array[typingsJapgolly.react.mod.Ref[Any]]
  ] = js.undefined
}
object AnimationConfig {
  
  inline def apply[T](
    data: js.Array[T],
    keyExtractor: (T, Double) => String,
    renderItem: /* params */ RenderItemParams[T] => japgolly.scalajs.react.facade.React.Node
  ): AnimationConfig[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], keyExtractor = js.Any.fromFunction2(keyExtractor), renderItem = js.Any.fromFunction1(renderItem))
    __obj.asInstanceOf[AnimationConfig[T]]
  }
  
  extension [Self <: AnimationConfig[?], T](x: Self & AnimationConfig[T]) {
    
    inline def setActivationDistance(value: Double): Self = StObject.set(x, "activationDistance", value.asInstanceOf[js.Any])
    
    inline def setActivationDistanceUndefined: Self = StObject.set(x, "activationDistance", js.undefined)
    
    inline def setAnimationConfig(value: PartialSpringConfig): Self = StObject.set(x, "animationConfig", value.asInstanceOf[js.Any])
    
    inline def setAnimationConfigUndefined: Self = StObject.set(x, "animationConfig", js.undefined)
    
    inline def setAutoscrollSpeed(value: Double): Self = StObject.set(x, "autoscrollSpeed", value.asInstanceOf[js.Any])
    
    inline def setAutoscrollSpeedUndefined: Self = StObject.set(x, "autoscrollSpeed", js.undefined)
    
    inline def setAutoscrollThreshold(value: Double): Self = StObject.set(x, "autoscrollThreshold", value.asInstanceOf[js.Any])
    
    inline def setAutoscrollThresholdUndefined: Self = StObject.set(x, "autoscrollThreshold", js.undefined)
    
    inline def setContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
    
    inline def setContainerStyleNull: Self = StObject.set(x, "containerStyle", null)
    
    inline def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
    
    inline def setData(value: js.Array[T]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: T*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    inline def setDragItemOverflow(value: Boolean): Self = StObject.set(x, "dragItemOverflow", value.asInstanceOf[js.Any])
    
    inline def setDragItemOverflowUndefined: Self = StObject.set(x, "dragItemOverflow", js.undefined)
    
    inline def setKeyExtractor(value: (T, Double) => String): Self = StObject.set(x, "keyExtractor", js.Any.fromFunction2(value))
    
    inline def setOnAnimValInit(value: /* animVals */ ActivationDistance => Callback): Self = StObject.set(x, "onAnimValInit", js.Any.fromFunction1((t0: /* animVals */ ActivationDistance) => value(t0).runNow()))
    
    inline def setOnAnimValInitUndefined: Self = StObject.set(x, "onAnimValInit", js.undefined)
    
    inline def setOnDragBegin(value: /* index */ Double => Callback): Self = StObject.set(x, "onDragBegin", js.Any.fromFunction1((t0: /* index */ Double) => value(t0).runNow()))
    
    inline def setOnDragBeginUndefined: Self = StObject.set(x, "onDragBegin", js.undefined)
    
    inline def setOnDragEnd(value: /* params */ DragEndParams[T] => Callback): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1((t0: /* params */ DragEndParams[T]) => value(t0).runNow()))
    
    inline def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
    
    inline def setOnPlaceholderIndexChange(value: /* placeholderIndex */ Double => Callback): Self = StObject.set(x, "onPlaceholderIndexChange", js.Any.fromFunction1((t0: /* placeholderIndex */ Double) => value(t0).runNow()))
    
    inline def setOnPlaceholderIndexChangeUndefined: Self = StObject.set(x, "onPlaceholderIndexChange", js.undefined)
    
    inline def setOnRelease(value: /* index */ Double => Callback): Self = StObject.set(x, "onRelease", js.Any.fromFunction1((t0: /* index */ Double) => value(t0).runNow()))
    
    inline def setOnReleaseUndefined: Self = StObject.set(x, "onRelease", js.undefined)
    
    inline def setOnScrollOffsetChange(value: /* scrollOffset */ Double => Callback): Self = StObject.set(x, "onScrollOffsetChange", js.Any.fromFunction1((t0: /* scrollOffset */ Double) => value(t0).runNow()))
    
    inline def setOnScrollOffsetChangeUndefined: Self = StObject.set(x, "onScrollOffsetChange", js.undefined)
    
    inline def setOuterScrollOffset(value: Node): Self = StObject.set(x, "outerScrollOffset", value.asInstanceOf[js.Any])
    
    inline def setOuterScrollOffsetUndefined: Self = StObject.set(x, "outerScrollOffset", js.undefined)
    
    inline def setRef(value: ForwardedRef[FlatList[T]]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: /* instance */ FlatList[T] | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: /* instance */ FlatList[T] | Null) => value(t0).runNow()))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    inline def setRenderItem(value: /* params */ RenderItemParams[T] => japgolly.scalajs.react.facade.React.Node): Self = StObject.set(x, "renderItem", js.Any.fromFunction1(value))
    
    inline def setRenderPlaceholder(value: /* params */ Index[T] => Element): Self = StObject.set(x, "renderPlaceholder", js.Any.fromFunction1(value))
    
    inline def setRenderPlaceholderUndefined: Self = StObject.set(x, "renderPlaceholder", js.undefined)
    
    inline def setSimultaneousHandlers(value: typingsJapgolly.react.mod.Ref[Any] | js.Array[typingsJapgolly.react.mod.Ref[Any]]): Self = StObject.set(x, "simultaneousHandlers", value.asInstanceOf[js.Any])
    
    inline def setSimultaneousHandlersFunction1(value: Any | Null => Callback): Self = StObject.set(x, "simultaneousHandlers", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
    
    inline def setSimultaneousHandlersNull: Self = StObject.set(x, "simultaneousHandlers", null)
    
    inline def setSimultaneousHandlersUndefined: Self = StObject.set(x, "simultaneousHandlers", js.undefined)
    
    inline def setSimultaneousHandlersVarargs(value: typingsJapgolly.react.mod.Ref[Any]*): Self = StObject.set(x, "simultaneousHandlers", js.Array(value*))
  }
}
