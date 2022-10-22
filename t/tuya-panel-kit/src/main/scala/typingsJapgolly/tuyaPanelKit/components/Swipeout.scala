package typingsJapgolly.tuyaPanelKit.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.tuyaPanelKit.mod.SwipeoutAction
import typingsJapgolly.tuyaPanelKit.mod.SwipeoutProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Swipeout {
  
  @JSImport("tuya-panel-kit", "Swipeout")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.tuyaPanelKit.mod.Swipeout] {
    
    inline def accessibilityLabel(value: String): this.type = set("accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def autoClose(value: Boolean): this.type = set("autoClose", value.asInstanceOf[js.Any])
    
    inline def backgroundColor(value: String): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
    
    inline def buttonWidth(value: Double): this.type = set("buttonWidth", value.asInstanceOf[js.Any])
    
    inline def close(value: Boolean): this.type = set("close", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def left(value: js.Array[SwipeoutAction]): this.type = set("left", value.asInstanceOf[js.Any])
    
    inline def leftVarargs(value: SwipeoutAction*): this.type = set("left", js.Array(value*))
    
    inline def onClose(value: (/* sectionID */ js.UndefOr[Double], /* rowID */ js.UndefOr[Double]) => Callback): this.type = set("onClose", js.Any.fromFunction2((t0: /* sectionID */ js.UndefOr[Double], t1: /* rowID */ js.UndefOr[Double]) => (value(t0, t1)).runNow()))
    
    inline def onOpen(value: (/* sectionID */ js.UndefOr[Double], /* rowID */ js.UndefOr[Double]) => Callback): this.type = set("onOpen", js.Any.fromFunction2((t0: /* sectionID */ js.UndefOr[Double], t1: /* rowID */ js.UndefOr[Double]) => (value(t0, t1)).runNow()))
    
    inline def right(value: js.Array[SwipeoutAction]): this.type = set("right", value.asInstanceOf[js.Any])
    
    inline def rightVarargs(value: SwipeoutAction*): this.type = set("right", js.Array(value*))
    
    inline def rowID(value: Double): this.type = set("rowID", value.asInstanceOf[js.Any])
    
    inline def scroll(value: /* value */ js.UndefOr[Boolean] => Callback): this.type = set("scroll", js.Any.fromFunction1((t0: /* value */ js.UndefOr[Boolean]) => value(t0).runNow()))
    
    inline def sectionID(value: Double): this.type = set("sectionID", value.asInstanceOf[js.Any])
    
    inline def sensitivity(value: Double): this.type = set("sensitivity", value.asInstanceOf[js.Any])
    
    inline def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styleNull: this.type = set("style", null)
  }
  
  implicit def make(companion: Swipeout.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SwipeoutProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
