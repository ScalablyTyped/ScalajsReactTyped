package typingsJapgolly.reactNativeDraggableFlatlist.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.RefHandle
import typingsJapgolly.react.mod.Dispatch
import typingsJapgolly.react.mod.SetStateAction
import typingsJapgolly.reactNativeGestureHandler.libTypescriptComponentsGestureComponentsMod.ScrollView
import typingsJapgolly.reactNativeReanimated.mod.Animated.Value
import typingsJapgolly.reactNativeReanimated.mod.Animated.View
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerRef extends StObject {
  
  var containerRef: RefHandle[View]
  
  var containerSize: Value
  
  var outerScrollEnabled: Boolean
  
  var outerScrollOffset: Value
  
  var scrollViewSize: Value
  
  var scrollableRef: RefHandle[ScrollView]
  
  var setOuterScrollEnabled: Dispatch[SetStateAction[Boolean]]
}
object ContainerRef {
  
  inline def apply(
    containerRef: RefHandle[View],
    containerSize: Value,
    outerScrollEnabled: Boolean,
    outerScrollOffset: Value,
    scrollViewSize: Value,
    scrollableRef: RefHandle[ScrollView],
    setOuterScrollEnabled: SetStateAction[Boolean] => Callback
  ): ContainerRef = {
    val __obj = js.Dynamic.literal(containerRef = containerRef.asInstanceOf[js.Any], containerSize = containerSize.asInstanceOf[js.Any], outerScrollEnabled = outerScrollEnabled.asInstanceOf[js.Any], outerScrollOffset = outerScrollOffset.asInstanceOf[js.Any], scrollViewSize = scrollViewSize.asInstanceOf[js.Any], scrollableRef = scrollableRef.asInstanceOf[js.Any], setOuterScrollEnabled = js.Any.fromFunction1((t0: SetStateAction[Boolean]) => setOuterScrollEnabled(t0).runNow()))
    __obj.asInstanceOf[ContainerRef]
  }
  
  extension [Self <: ContainerRef](x: Self) {
    
    inline def setContainerRef(value: RefHandle[View]): Self = StObject.set(x, "containerRef", value.asInstanceOf[js.Any])
    
    inline def setContainerSize(value: Value): Self = StObject.set(x, "containerSize", value.asInstanceOf[js.Any])
    
    inline def setOuterScrollEnabled(value: Boolean): Self = StObject.set(x, "outerScrollEnabled", value.asInstanceOf[js.Any])
    
    inline def setOuterScrollOffset(value: Value): Self = StObject.set(x, "outerScrollOffset", value.asInstanceOf[js.Any])
    
    inline def setScrollViewSize(value: Value): Self = StObject.set(x, "scrollViewSize", value.asInstanceOf[js.Any])
    
    inline def setScrollableRef(value: RefHandle[ScrollView]): Self = StObject.set(x, "scrollableRef", value.asInstanceOf[js.Any])
    
    inline def setSetOuterScrollEnabled(value: SetStateAction[Boolean] => Callback): Self = StObject.set(x, "setOuterScrollEnabled", js.Any.fromFunction1((t0: SetStateAction[Boolean]) => value(t0).runNow()))
  }
}
