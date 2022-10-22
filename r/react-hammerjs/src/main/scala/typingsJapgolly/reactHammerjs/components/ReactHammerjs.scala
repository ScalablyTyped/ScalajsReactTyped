package typingsJapgolly.reactHammerjs.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.hammerjs.HammerInput
import typingsJapgolly.reactHammerjs.mod.HammerOptionsWithRecognizers
import typingsJapgolly.reactHammerjs.mod.ReactHammerProps
import typingsJapgolly.reactHammerjs.mod.^
import typingsJapgolly.reactHammerjs.reactHammerjsStrings.DIRECTION_ALL
import typingsJapgolly.reactHammerjs.reactHammerjsStrings.DIRECTION_DOWN
import typingsJapgolly.reactHammerjs.reactHammerjsStrings.DIRECTION_HORIZONTAL
import typingsJapgolly.reactHammerjs.reactHammerjsStrings.DIRECTION_LEFT
import typingsJapgolly.reactHammerjs.reactHammerjsStrings.DIRECTION_NONE
import typingsJapgolly.reactHammerjs.reactHammerjsStrings.DIRECTION_RIGHT
import typingsJapgolly.reactHammerjs.reactHammerjsStrings.DIRECTION_UP
import typingsJapgolly.reactHammerjs.reactHammerjsStrings.DIRECTION_VERTICAL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactHammerjs {
  
  object ReactHammerjs {
    
    @JSImport("react-hammerjs", JSImport.Namespace)
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[^] {
      
      inline def action(value: /* event */ HammerInput => Callback): this.type = set("action", js.Any.fromFunction1((t0: /* event */ HammerInput) => value(t0).runNow()))
      
      inline def direction(
        value: DIRECTION_NONE | DIRECTION_LEFT | DIRECTION_RIGHT | DIRECTION_UP | DIRECTION_DOWN | DIRECTION_HORIZONTAL | DIRECTION_VERTICAL | DIRECTION_ALL
      ): this.type = set("direction", value.asInstanceOf[js.Any])
      
      inline def onDoubleTap(value: /* event */ HammerInput => Callback): this.type = set("onDoubleTap", js.Any.fromFunction1((t0: /* event */ HammerInput) => value(t0).runNow()))
      
      inline def onPan(value: /* event */ HammerInput => Callback): this.type = set("onPan", js.Any.fromFunction1((t0: /* event */ HammerInput) => value(t0).runNow()))
      
      inline def onPanCancel(value: /* event */ HammerInput => Callback): this.type = set("onPanCancel", js.Any.fromFunction1((t0: /* event */ HammerInput) => value(t0).runNow()))
      
      inline def onPanEnd(value: /* event */ HammerInput => Callback): this.type = set("onPanEnd", js.Any.fromFunction1((t0: /* event */ HammerInput) => value(t0).runNow()))
      
      inline def onPanStart(value: /* event */ HammerInput => Callback): this.type = set("onPanStart", js.Any.fromFunction1((t0: /* event */ HammerInput) => value(t0).runNow()))
      
      inline def onPinch(value: /* event */ HammerInput => Callback): this.type = set("onPinch", js.Any.fromFunction1((t0: /* event */ HammerInput) => value(t0).runNow()))
      
      inline def onPinchCancel(value: /* event */ HammerInput => Callback): this.type = set("onPinchCancel", js.Any.fromFunction1((t0: /* event */ HammerInput) => value(t0).runNow()))
      
      inline def onPinchEnd(value: /* event */ HammerInput => Callback): this.type = set("onPinchEnd", js.Any.fromFunction1((t0: /* event */ HammerInput) => value(t0).runNow()))
      
      inline def onPinchIn(value: /* event */ HammerInput => Callback): this.type = set("onPinchIn", js.Any.fromFunction1((t0: /* event */ HammerInput) => value(t0).runNow()))
      
      inline def onPinchOut(value: /* event */ HammerInput => Callback): this.type = set("onPinchOut", js.Any.fromFunction1((t0: /* event */ HammerInput) => value(t0).runNow()))
      
      inline def onPinchStart(value: /* event */ HammerInput => Callback): this.type = set("onPinchStart", js.Any.fromFunction1((t0: /* event */ HammerInput) => value(t0).runNow()))
      
      inline def onPress(value: /* event */ HammerInput => Callback): this.type = set("onPress", js.Any.fromFunction1((t0: /* event */ HammerInput) => value(t0).runNow()))
      
      inline def onPressUp(value: /* event */ HammerInput => Callback): this.type = set("onPressUp", js.Any.fromFunction1((t0: /* event */ HammerInput) => value(t0).runNow()))
      
      inline def onRotate(value: /* event */ HammerInput => Callback): this.type = set("onRotate", js.Any.fromFunction1((t0: /* event */ HammerInput) => value(t0).runNow()))
      
      inline def onRotateCancel(value: /* event */ HammerInput => Callback): this.type = set("onRotateCancel", js.Any.fromFunction1((t0: /* event */ HammerInput) => value(t0).runNow()))
      
      inline def onRotateEnd(value: /* event */ HammerInput => Callback): this.type = set("onRotateEnd", js.Any.fromFunction1((t0: /* event */ HammerInput) => value(t0).runNow()))
      
      inline def onRotateMove(value: /* event */ HammerInput => Callback): this.type = set("onRotateMove", js.Any.fromFunction1((t0: /* event */ HammerInput) => value(t0).runNow()))
      
      inline def onRotateStart(value: /* event */ HammerInput => Callback): this.type = set("onRotateStart", js.Any.fromFunction1((t0: /* event */ HammerInput) => value(t0).runNow()))
      
      inline def onSwipe(value: /* event */ HammerInput => Callback): this.type = set("onSwipe", js.Any.fromFunction1((t0: /* event */ HammerInput) => value(t0).runNow()))
      
      inline def onSwipeDown(value: /* event */ HammerInput => Callback): this.type = set("onSwipeDown", js.Any.fromFunction1((t0: /* event */ HammerInput) => value(t0).runNow()))
      
      inline def onSwipeLeft(value: /* event */ HammerInput => Callback): this.type = set("onSwipeLeft", js.Any.fromFunction1((t0: /* event */ HammerInput) => value(t0).runNow()))
      
      inline def onSwipeRight(value: /* event */ HammerInput => Callback): this.type = set("onSwipeRight", js.Any.fromFunction1((t0: /* event */ HammerInput) => value(t0).runNow()))
      
      inline def onSwipeUp(value: /* event */ HammerInput => Callback): this.type = set("onSwipeUp", js.Any.fromFunction1((t0: /* event */ HammerInput) => value(t0).runNow()))
      
      inline def onTap(value: /* event */ HammerInput => Callback): this.type = set("onTap", js.Any.fromFunction1((t0: /* event */ HammerInput) => value(t0).runNow()))
      
      inline def options(value: HammerOptionsWithRecognizers): this.type = set("options", value.asInstanceOf[js.Any])
      
      inline def vertical(value: Boolean): this.type = set("vertical", value.asInstanceOf[js.Any])
    }
    
    implicit def make(companion: ReactHammerjs.type): typingsJapgolly.reactHammerjs.components.ReactHammerjs.ReactHammerjs.Builder = new typingsJapgolly.reactHammerjs.components.ReactHammerjs.ReactHammerjs.Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: ReactHammerProps): typingsJapgolly.reactHammerjs.components.ReactHammerjs.ReactHammerjs.Builder = new typingsJapgolly.reactHammerjs.components.ReactHammerjs.ReactHammerjs.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("react-hammerjs", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def action(value: /* event */ HammerInput => Callback): this.type = set("action", js.Any.fromFunction1((t0: /* event */ HammerInput) => value(t0).runNow()))
    
    inline def direction(
      value: DIRECTION_NONE | DIRECTION_LEFT | DIRECTION_RIGHT | DIRECTION_UP | DIRECTION_DOWN | DIRECTION_HORIZONTAL | DIRECTION_VERTICAL | DIRECTION_ALL
    ): this.type = set("direction", value.asInstanceOf[js.Any])
    
    inline def onDoubleTap(value: /* event */ HammerInput => Callback): this.type = set("onDoubleTap", js.Any.fromFunction1((t0: /* event */ HammerInput) => value(t0).runNow()))
    
    inline def onPan(value: /* event */ HammerInput => Callback): this.type = set("onPan", js.Any.fromFunction1((t0: /* event */ HammerInput) => value(t0).runNow()))
    
    inline def onPanCancel(value: /* event */ HammerInput => Callback): this.type = set("onPanCancel", js.Any.fromFunction1((t0: /* event */ HammerInput) => value(t0).runNow()))
    
    inline def onPanEnd(value: /* event */ HammerInput => Callback): this.type = set("onPanEnd", js.Any.fromFunction1((t0: /* event */ HammerInput) => value(t0).runNow()))
    
    inline def onPanStart(value: /* event */ HammerInput => Callback): this.type = set("onPanStart", js.Any.fromFunction1((t0: /* event */ HammerInput) => value(t0).runNow()))
    
    inline def onPinch(value: /* event */ HammerInput => Callback): this.type = set("onPinch", js.Any.fromFunction1((t0: /* event */ HammerInput) => value(t0).runNow()))
    
    inline def onPinchCancel(value: /* event */ HammerInput => Callback): this.type = set("onPinchCancel", js.Any.fromFunction1((t0: /* event */ HammerInput) => value(t0).runNow()))
    
    inline def onPinchEnd(value: /* event */ HammerInput => Callback): this.type = set("onPinchEnd", js.Any.fromFunction1((t0: /* event */ HammerInput) => value(t0).runNow()))
    
    inline def onPinchIn(value: /* event */ HammerInput => Callback): this.type = set("onPinchIn", js.Any.fromFunction1((t0: /* event */ HammerInput) => value(t0).runNow()))
    
    inline def onPinchOut(value: /* event */ HammerInput => Callback): this.type = set("onPinchOut", js.Any.fromFunction1((t0: /* event */ HammerInput) => value(t0).runNow()))
    
    inline def onPinchStart(value: /* event */ HammerInput => Callback): this.type = set("onPinchStart", js.Any.fromFunction1((t0: /* event */ HammerInput) => value(t0).runNow()))
    
    inline def onPress(value: /* event */ HammerInput => Callback): this.type = set("onPress", js.Any.fromFunction1((t0: /* event */ HammerInput) => value(t0).runNow()))
    
    inline def onPressUp(value: /* event */ HammerInput => Callback): this.type = set("onPressUp", js.Any.fromFunction1((t0: /* event */ HammerInput) => value(t0).runNow()))
    
    inline def onRotate(value: /* event */ HammerInput => Callback): this.type = set("onRotate", js.Any.fromFunction1((t0: /* event */ HammerInput) => value(t0).runNow()))
    
    inline def onRotateCancel(value: /* event */ HammerInput => Callback): this.type = set("onRotateCancel", js.Any.fromFunction1((t0: /* event */ HammerInput) => value(t0).runNow()))
    
    inline def onRotateEnd(value: /* event */ HammerInput => Callback): this.type = set("onRotateEnd", js.Any.fromFunction1((t0: /* event */ HammerInput) => value(t0).runNow()))
    
    inline def onRotateMove(value: /* event */ HammerInput => Callback): this.type = set("onRotateMove", js.Any.fromFunction1((t0: /* event */ HammerInput) => value(t0).runNow()))
    
    inline def onRotateStart(value: /* event */ HammerInput => Callback): this.type = set("onRotateStart", js.Any.fromFunction1((t0: /* event */ HammerInput) => value(t0).runNow()))
    
    inline def onSwipe(value: /* event */ HammerInput => Callback): this.type = set("onSwipe", js.Any.fromFunction1((t0: /* event */ HammerInput) => value(t0).runNow()))
    
    inline def onSwipeDown(value: /* event */ HammerInput => Callback): this.type = set("onSwipeDown", js.Any.fromFunction1((t0: /* event */ HammerInput) => value(t0).runNow()))
    
    inline def onSwipeLeft(value: /* event */ HammerInput => Callback): this.type = set("onSwipeLeft", js.Any.fromFunction1((t0: /* event */ HammerInput) => value(t0).runNow()))
    
    inline def onSwipeRight(value: /* event */ HammerInput => Callback): this.type = set("onSwipeRight", js.Any.fromFunction1((t0: /* event */ HammerInput) => value(t0).runNow()))
    
    inline def onSwipeUp(value: /* event */ HammerInput => Callback): this.type = set("onSwipeUp", js.Any.fromFunction1((t0: /* event */ HammerInput) => value(t0).runNow()))
    
    inline def onTap(value: /* event */ HammerInput => Callback): this.type = set("onTap", js.Any.fromFunction1((t0: /* event */ HammerInput) => value(t0).runNow()))
    
    inline def options(value: HammerOptionsWithRecognizers): this.type = set("options", value.asInstanceOf[js.Any])
    
    inline def vertical(value: Boolean): this.type = set("vertical", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactHammerjs.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ReactHammerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
