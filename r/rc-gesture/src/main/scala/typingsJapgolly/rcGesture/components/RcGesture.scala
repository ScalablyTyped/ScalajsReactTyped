package typingsJapgolly.rcGesture.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactTouchEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.rcGesture.mod.IGesture
import typingsJapgolly.rcGesture.mod.IGestureStatus
import typingsJapgolly.rcGesture.mod.default
import typingsJapgolly.rcGesture.rcGestureStrings.all
import typingsJapgolly.rcGesture.rcGestureStrings.horizontal
import typingsJapgolly.rcGesture.rcGestureStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RcGesture {
  
  @JSImport("rc-gesture", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def direction(value: all | vertical | horizontal): this.type = set("direction", value.asInstanceOf[js.Any])
    
    inline def enablePinch(value: Boolean): this.type = set("enablePinch", value.asInstanceOf[js.Any])
    
    inline def enableRotate(value: Boolean): this.type = set("enableRotate", value.asInstanceOf[js.Any])
    
    inline def onPan(value: /* s */ IGestureStatus => Callback): this.type = set("onPan", js.Any.fromFunction1((t0: /* s */ IGestureStatus) => value(t0).runNow()))
    
    inline def onPanCancel(value: /* s */ IGestureStatus => Callback): this.type = set("onPanCancel", js.Any.fromFunction1((t0: /* s */ IGestureStatus) => value(t0).runNow()))
    
    inline def onPanDown(value: /* s */ IGestureStatus => Callback): this.type = set("onPanDown", js.Any.fromFunction1((t0: /* s */ IGestureStatus) => value(t0).runNow()))
    
    inline def onPanEnd(value: /* s */ IGestureStatus => Callback): this.type = set("onPanEnd", js.Any.fromFunction1((t0: /* s */ IGestureStatus) => value(t0).runNow()))
    
    inline def onPanLeft(value: /* s */ IGestureStatus => Callback): this.type = set("onPanLeft", js.Any.fromFunction1((t0: /* s */ IGestureStatus) => value(t0).runNow()))
    
    inline def onPanMove(value: /* s */ IGestureStatus => Callback): this.type = set("onPanMove", js.Any.fromFunction1((t0: /* s */ IGestureStatus) => value(t0).runNow()))
    
    inline def onPanRight(value: /* s */ IGestureStatus => Callback): this.type = set("onPanRight", js.Any.fromFunction1((t0: /* s */ IGestureStatus) => value(t0).runNow()))
    
    inline def onPanStart(value: /* s */ IGestureStatus => Callback): this.type = set("onPanStart", js.Any.fromFunction1((t0: /* s */ IGestureStatus) => value(t0).runNow()))
    
    inline def onPanUp(value: /* s */ IGestureStatus => Callback): this.type = set("onPanUp", js.Any.fromFunction1((t0: /* s */ IGestureStatus) => value(t0).runNow()))
    
    inline def onPinch(value: /* s */ IGestureStatus => Callback): this.type = set("onPinch", js.Any.fromFunction1((t0: /* s */ IGestureStatus) => value(t0).runNow()))
    
    inline def onPinchCancel(value: /* s */ IGestureStatus => Callback): this.type = set("onPinchCancel", js.Any.fromFunction1((t0: /* s */ IGestureStatus) => value(t0).runNow()))
    
    inline def onPinchEnd(value: /* s */ IGestureStatus => Callback): this.type = set("onPinchEnd", js.Any.fromFunction1((t0: /* s */ IGestureStatus) => value(t0).runNow()))
    
    inline def onPinchIn(value: /* s */ IGestureStatus => Callback): this.type = set("onPinchIn", js.Any.fromFunction1((t0: /* s */ IGestureStatus) => value(t0).runNow()))
    
    inline def onPinchMove(value: /* s */ IGestureStatus => Callback): this.type = set("onPinchMove", js.Any.fromFunction1((t0: /* s */ IGestureStatus) => value(t0).runNow()))
    
    inline def onPinchOut(value: /* s */ IGestureStatus => Callback): this.type = set("onPinchOut", js.Any.fromFunction1((t0: /* s */ IGestureStatus) => value(t0).runNow()))
    
    inline def onPinchStart(value: /* s */ IGestureStatus => Callback): this.type = set("onPinchStart", js.Any.fromFunction1((t0: /* s */ IGestureStatus) => value(t0).runNow()))
    
    inline def onPress(value: /* s */ IGestureStatus => Callback): this.type = set("onPress", js.Any.fromFunction1((t0: /* s */ IGestureStatus) => value(t0).runNow()))
    
    inline def onPressUp(value: /* s */ IGestureStatus => Callback): this.type = set("onPressUp", js.Any.fromFunction1((t0: /* s */ IGestureStatus) => value(t0).runNow()))
    
    inline def onRotate(value: /* s */ IGestureStatus => Callback): this.type = set("onRotate", js.Any.fromFunction1((t0: /* s */ IGestureStatus) => value(t0).runNow()))
    
    inline def onRotateCancel(value: /* s */ IGestureStatus => Callback): this.type = set("onRotateCancel", js.Any.fromFunction1((t0: /* s */ IGestureStatus) => value(t0).runNow()))
    
    inline def onRotateEnd(value: /* s */ IGestureStatus => Callback): this.type = set("onRotateEnd", js.Any.fromFunction1((t0: /* s */ IGestureStatus) => value(t0).runNow()))
    
    inline def onRotateMove(value: /* s */ IGestureStatus => Callback): this.type = set("onRotateMove", js.Any.fromFunction1((t0: /* s */ IGestureStatus) => value(t0).runNow()))
    
    inline def onRotateStart(value: /* s */ IGestureStatus => Callback): this.type = set("onRotateStart", js.Any.fromFunction1((t0: /* s */ IGestureStatus) => value(t0).runNow()))
    
    inline def onSwipe(value: /* s */ IGestureStatus => Callback): this.type = set("onSwipe", js.Any.fromFunction1((t0: /* s */ IGestureStatus) => value(t0).runNow()))
    
    inline def onSwipeDown(value: /* s */ IGestureStatus => Callback): this.type = set("onSwipeDown", js.Any.fromFunction1((t0: /* s */ IGestureStatus) => value(t0).runNow()))
    
    inline def onSwipeLeft(value: /* s */ IGestureStatus => Callback): this.type = set("onSwipeLeft", js.Any.fromFunction1((t0: /* s */ IGestureStatus) => value(t0).runNow()))
    
    inline def onSwipeRight(value: /* s */ IGestureStatus => Callback): this.type = set("onSwipeRight", js.Any.fromFunction1((t0: /* s */ IGestureStatus) => value(t0).runNow()))
    
    inline def onSwipeUp(value: /* s */ IGestureStatus => Callback): this.type = set("onSwipeUp", js.Any.fromFunction1((t0: /* s */ IGestureStatus) => value(t0).runNow()))
    
    inline def onTap(value: /* s */ IGestureStatus => Callback): this.type = set("onTap", js.Any.fromFunction1((t0: /* s */ IGestureStatus) => value(t0).runNow()))
    
    inline def onTouchCancel(value: ReactTouchEventFrom[HTMLElement & Element] => Callback): this.type = set("onTouchCancel", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def onTouchEnd(value: ReactTouchEventFrom[HTMLElement & Element] => Callback): this.type = set("onTouchEnd", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def onTouchMove(value: ReactTouchEventFrom[HTMLElement & Element] => Callback): this.type = set("onTouchMove", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLElement & Element]) => value(t0).runNow()))
    
    inline def onTouchStart(value: ReactTouchEventFrom[HTMLElement & Element] => Callback): this.type = set("onTouchStart", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLElement & Element]) => value(t0).runNow()))
  }
  
  implicit def make(companion: RcGesture.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: IGesture): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
