package typingsJapgolly.reactNative.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.reactNative.anon.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Touchable extends StObject {
  
  var onTouchCancel: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle & Element], Unit]] = js.undefined
  
  var onTouchEnd: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle & Element], Unit]] = js.undefined
  
  var onTouchEndCapture: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle & Element], Unit]] = js.undefined
  
  var onTouchMove: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle & Element], Unit]] = js.undefined
  
  var onTouchStart: js.UndefOr[js.Function1[ReactEventFrom[NodeHandle & Element], Unit]] = js.undefined
}
object Touchable {
  
  inline def apply(): Touchable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Touchable]
  }
  
  @JSImport("react-native", "Touchable")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-native", "Touchable.TOUCH_TARGET_DEBUG")
  @js.native
  def TOUCH_TARGET_DEBUG: Boolean = js.native
  inline def TOUCH_TARGET_DEBUG_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TOUCH_TARGET_DEBUG")(x.asInstanceOf[js.Any])
  
  inline def renderDebugView(config: Color): japgolly.scalajs.react.facade.React.Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("renderDebugView")(config.asInstanceOf[js.Any]).asInstanceOf[japgolly.scalajs.react.facade.React.Element | Null]
  
  extension [Self <: Touchable](x: Self) {
    
    inline def setOnTouchCancel(value: ReactEventFrom[NodeHandle & Element] => Callback): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
    
    inline def setOnTouchEnd(value: ReactEventFrom[NodeHandle & Element] => Callback): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def setOnTouchEndCapture(value: ReactEventFrom[NodeHandle & Element] => Callback): Self = StObject.set(x, "onTouchEndCapture", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def setOnTouchEndCaptureUndefined: Self = StObject.set(x, "onTouchEndCapture", js.undefined)
    
    inline def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
    
    inline def setOnTouchMove(value: ReactEventFrom[NodeHandle & Element] => Callback): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
    
    inline def setOnTouchStart(value: ReactEventFrom[NodeHandle & Element] => Callback): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1((t0: ReactEventFrom[NodeHandle & Element]) => value(t0).runNow()))
    
    inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
  }
}
