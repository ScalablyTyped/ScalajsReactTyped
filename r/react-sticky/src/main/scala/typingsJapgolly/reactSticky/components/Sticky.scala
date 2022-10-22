package typingsJapgolly.reactSticky.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactSticky.mod.StickyChildArgs
import typingsJapgolly.reactSticky.mod.StickyProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Sticky {
  
  inline def apply(children: StickyChildArgs => Element): Builder = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Builder(js.Array(this.component, __props.asInstanceOf[StickyProps]))
  }
  
  @JSImport("react-sticky", "Sticky")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactSticky.mod.Sticky] {
    
    inline def bottomOffset(value: Double): this.type = set("bottomOffset", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def disableCompensation(value: Boolean): this.type = set("disableCompensation", value.asInstanceOf[js.Any])
    
    inline def disableHardwareAcceleration(value: Boolean): this.type = set("disableHardwareAcceleration", value.asInstanceOf[js.Any])
    
    inline def isActive(value: Boolean): this.type = set("isActive", value.asInstanceOf[js.Any])
    
    inline def onStickyStateChange(value: /* isSticky */ Boolean => Callback): this.type = set("onStickyStateChange", js.Any.fromFunction1((t0: /* isSticky */ Boolean) => value(t0).runNow()))
    
    inline def relative(value: Boolean): this.type = set("relative", value.asInstanceOf[js.Any])
    
    inline def stickyClassName(value: String): this.type = set("stickyClassName", value.asInstanceOf[js.Any])
    
    inline def stickyStyle(value: Any): this.type = set("stickyStyle", value.asInstanceOf[js.Any])
    
    inline def style(value: Any): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def topOffset(value: Double): this.type = set("topOffset", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: StickyProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
