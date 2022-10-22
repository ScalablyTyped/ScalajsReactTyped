package typingsJapgolly.semanticUiReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Document
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.Window
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.semanticUiReact.distCommonjsModulesStickyStickyMod.StickyProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Sticky {
  
  @JSImport("semantic-ui-react", "Sticky")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.semanticUiReact.mod.Sticky] {
    
    inline def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
    
    inline def as(value: Any): this.type = set("as", value.asInstanceOf[js.Any])
    
    inline def bottomOffset(value: Double): this.type = set("bottomOffset", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def context(value: Document | Window | HTMLElement | typingsJapgolly.react.mod.Ref[HTMLElement]): this.type = set("context", value.asInstanceOf[js.Any])
    
    inline def contextFunction1(value: HTMLElement | Null => Callback): this.type = set("context", js.Any.fromFunction1((t0: HTMLElement | Null) => value(t0).runNow()))
    
    inline def contextNull: this.type = set("context", null)
    
    inline def offset(value: Double): this.type = set("offset", value.asInstanceOf[js.Any])
    
    inline def onBottom(value: (/* event */ ReactMouseEventFrom[HTMLElement], /* data */ StickyProps) => Callback): this.type = set("onBottom", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[HTMLElement], t1: /* data */ StickyProps) => (value(t0, t1)).runNow()))
    
    inline def onStick(value: (/* event */ ReactMouseEventFrom[HTMLElement], /* data */ StickyProps) => Callback): this.type = set("onStick", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[HTMLElement], t1: /* data */ StickyProps) => (value(t0, t1)).runNow()))
    
    inline def onTop(value: (/* event */ ReactMouseEventFrom[HTMLElement], /* data */ StickyProps) => Callback): this.type = set("onTop", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[HTMLElement], t1: /* data */ StickyProps) => (value(t0, t1)).runNow()))
    
    inline def onUnstick(value: (/* event */ ReactMouseEventFrom[HTMLElement], /* data */ StickyProps) => Callback): this.type = set("onUnstick", js.Any.fromFunction2((t0: /* event */ ReactMouseEventFrom[HTMLElement], t1: /* data */ StickyProps) => (value(t0, t1)).runNow()))
    
    inline def pushing(value: Boolean): this.type = set("pushing", value.asInstanceOf[js.Any])
    
    inline def scrollContext(value: Document | Window | HTMLElement | typingsJapgolly.react.mod.Ref[HTMLElement]): this.type = set("scrollContext", value.asInstanceOf[js.Any])
    
    inline def scrollContextFunction1(value: HTMLElement | Null => Callback): this.type = set("scrollContext", js.Any.fromFunction1((t0: HTMLElement | Null) => value(t0).runNow()))
    
    inline def scrollContextNull: this.type = set("scrollContext", null)
    
    inline def styleElement(value: CSSProperties): this.type = set("styleElement", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Sticky.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: StickyProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
