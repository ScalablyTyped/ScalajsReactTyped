package typingsJapgolly.reactNativeDraggableFlatlist.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.RefHandle
import typingsJapgolly.react.mod.Dispatch
import typingsJapgolly.react.mod.SetStateAction
import typingsJapgolly.reactNativeGestureHandler.libTypescriptComponentsGestureComponentsMod.ScrollView
import typingsJapgolly.reactNativeReanimated.mod.SharedValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerSize extends StObject {
  
  var containerSize: SharedValue[Double]
  
  var outerScrollEnabled: Boolean
  
  var outerScrollOffset: SharedValue[Double]
  
  var scrollViewSize: SharedValue[Double]
  
  var scrollableRef: RefHandle[ScrollView]
  
  var setOuterScrollEnabled: Dispatch[SetStateAction[Boolean]]
}
object ContainerSize {
  
  inline def apply(
    containerSize: SharedValue[Double],
    outerScrollEnabled: Boolean,
    outerScrollOffset: SharedValue[Double],
    scrollViewSize: SharedValue[Double],
    scrollableRef: RefHandle[ScrollView],
    setOuterScrollEnabled: SetStateAction[Boolean] => Callback
  ): ContainerSize = {
    val __obj = js.Dynamic.literal(containerSize = containerSize.asInstanceOf[js.Any], outerScrollEnabled = outerScrollEnabled.asInstanceOf[js.Any], outerScrollOffset = outerScrollOffset.asInstanceOf[js.Any], scrollViewSize = scrollViewSize.asInstanceOf[js.Any], scrollableRef = scrollableRef.asInstanceOf[js.Any], setOuterScrollEnabled = js.Any.fromFunction1((t0: SetStateAction[Boolean]) => setOuterScrollEnabled(t0).runNow()))
    __obj.asInstanceOf[ContainerSize]
  }
  
  extension [Self <: ContainerSize](x: Self) {
    
    inline def setContainerSize(value: SharedValue[Double]): Self = StObject.set(x, "containerSize", value.asInstanceOf[js.Any])
    
    inline def setOuterScrollEnabled(value: Boolean): Self = StObject.set(x, "outerScrollEnabled", value.asInstanceOf[js.Any])
    
    inline def setOuterScrollOffset(value: SharedValue[Double]): Self = StObject.set(x, "outerScrollOffset", value.asInstanceOf[js.Any])
    
    inline def setScrollViewSize(value: SharedValue[Double]): Self = StObject.set(x, "scrollViewSize", value.asInstanceOf[js.Any])
    
    inline def setScrollableRef(value: RefHandle[ScrollView]): Self = StObject.set(x, "scrollableRef", value.asInstanceOf[js.Any])
    
    inline def setSetOuterScrollEnabled(value: SetStateAction[Boolean] => Callback): Self = StObject.set(x, "setOuterScrollEnabled", js.Any.fromFunction1((t0: SetStateAction[Boolean]) => value(t0).runNow()))
  }
}
