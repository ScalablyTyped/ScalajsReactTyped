package typingsJapgolly.reactTouch.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactTouch.mod.SwipeableConfig
import typingsJapgolly.reactTouch.mod.SwipeableProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Swipeable {
  
  @JSImport("react-touch", "Swipeable")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactTouch.mod.Swipeable] {
    
    inline def config(value: SwipeableConfig): this.type = set("config", value.asInstanceOf[js.Any])
    
    inline def onMouseDown(value: Callback): this.type = set("onMouseDown", value.toJsFn)
    
    inline def onSwipeDown(value: Callback): this.type = set("onSwipeDown", value.toJsFn)
    
    inline def onSwipeLeft(value: Callback): this.type = set("onSwipeLeft", value.toJsFn)
    
    inline def onSwipeRight(value: Callback): this.type = set("onSwipeRight", value.toJsFn)
    
    inline def onSwipeUp(value: Callback): this.type = set("onSwipeUp", value.toJsFn)
    
    inline def onTouchStart(value: Callback): this.type = set("onTouchStart", value.toJsFn)
  }
  
  implicit def make(companion: Swipeable.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SwipeableProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
