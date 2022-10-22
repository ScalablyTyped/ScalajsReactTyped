package typingsJapgolly.reactWidgets.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactWidgets.esmSlideDownTransitionMod.SlideDownTransitionProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SlideDownTransition {
  
  inline def apply(in: Boolean): Builder = {
    val __props = js.Dynamic.literal(in = in.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SlideDownTransitionProps]))
  }
  
  @JSImport("react-widgets/esm", "SlideDownTransition")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactWidgets.esmMod.SlideDownTransition] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def dropUp(value: Boolean): this.type = set("dropUp", value.asInstanceOf[js.Any])
    
    inline def innerClassName(value: String): this.type = set("innerClassName", value.asInstanceOf[js.Any])
    
    inline def onEntered(value: Callback): this.type = set("onEntered", value.toJsFn)
    
    inline def onEntering(value: Callback): this.type = set("onEntering", value.toJsFn)
    
    inline def onExit(value: Callback): this.type = set("onExit", value.toJsFn)
    
    inline def onExited(value: Callback): this.type = set("onExited", value.toJsFn)
  }
  
  def withProps(p: SlideDownTransitionProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
