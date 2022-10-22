package typingsJapgolly.reactNativeModals.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeModals.mod.DragEvent
import typingsJapgolly.reactNativeModals.mod.DraggableViewProps
import typingsJapgolly.reactNativeModals.mod.SwipeDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DraggableView {
  
  @JSImport("react-native-modals", "DraggableView")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactNativeModals.mod.DraggableView] {
    
    inline def onMove(value: /* event */ DragEvent => Callback): this.type = set("onMove", js.Any.fromFunction1((t0: /* event */ DragEvent) => value(t0).runNow()))
    
    inline def onRelease(value: /* event */ DragEvent => Callback): this.type = set("onRelease", js.Any.fromFunction1((t0: /* event */ DragEvent) => value(t0).runNow()))
    
    inline def onSwipeOut(value: /* event */ DragEvent => Callback): this.type = set("onSwipeOut", js.Any.fromFunction1((t0: /* event */ DragEvent) => value(t0).runNow()))
    
    inline def onSwiping(value: /* event */ DragEvent => Callback): this.type = set("onSwiping", js.Any.fromFunction1((t0: /* event */ DragEvent) => value(t0).runNow()))
    
    inline def onSwipingOut(value: /* event */ DragEvent => Callback): this.type = set("onSwipingOut", js.Any.fromFunction1((t0: /* event */ DragEvent) => value(t0).runNow()))
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
    
    inline def swipeDirection(value: SwipeDirection | js.Array[SwipeDirection]): this.type = set("swipeDirection", value.asInstanceOf[js.Any])
    
    inline def swipeDirectionVarargs(value: SwipeDirection*): this.type = set("swipeDirection", js.Array(value*))
    
    inline def swipeThreshold(value: Double): this.type = set("swipeThreshold", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: DraggableView.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DraggableViewProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
