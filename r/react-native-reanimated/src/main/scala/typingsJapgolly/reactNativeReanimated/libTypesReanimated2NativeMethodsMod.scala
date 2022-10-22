package typingsJapgolly.reactNativeReanimated

import japgolly.scalajs.react.facade.React.Component
import japgolly.scalajs.react.facade.React.ComponentClassP
import typingsJapgolly.reactNativeReanimated.libTypesReanimated2CommonTypesMod.MeasuredDimensions
import typingsJapgolly.reactNativeReanimated.libTypesReanimated2HookCommonTypesMod.RefObjectFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesReanimated2NativeMethodsMod {
  
  @JSImport("react-native-reanimated/lib/types/reanimated2/NativeMethods", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getTag(): Null | Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getTag")().asInstanceOf[Null | Double]
  inline def getTag(view: Component[Any & js.Object, js.Object]): Null | Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getTag")(view.asInstanceOf[js.Any]).asInstanceOf[Null | Double]
  inline def getTag(view: ComponentClassP[Any & js.Object]): Null | Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getTag")(view.asInstanceOf[js.Any]).asInstanceOf[Null | Double]
  inline def getTag(view: Double): Null | Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getTag")(view.asInstanceOf[js.Any]).asInstanceOf[Null | Double]
  
  inline def measure(animatedRef: RefObjectFunction[Component[js.Object, js.Object]]): MeasuredDimensions | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("measure")(animatedRef.asInstanceOf[js.Any]).asInstanceOf[MeasuredDimensions | Null]
  
  inline def scrollTo(
    animatedRef: RefObjectFunction[Component[js.Object, js.Object]],
    x: Double,
    y: Double,
    animated: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scrollTo")(animatedRef.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], animated.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setGestureState(handlerTag: Double, newState: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setGestureState")(handlerTag.asInstanceOf[js.Any], newState.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
