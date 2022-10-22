package typingsJapgolly.reactPopover.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.Element
import org.scalajs.dom.Event
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactPopover.mod.PopoverPlace
import typingsJapgolly.reactPopover.mod.PopoverProps
import typingsJapgolly.reactPopover.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactPopover {
  
  @JSImport("react-popover", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[^] {
    
    inline def appendTarget(value: Element): this.type = set("appendTarget", value.asInstanceOf[js.Any])
    
    inline def body(value: VdomNode): this.type = set("body", value.rawNode.asInstanceOf[js.Any])
    
    inline def bodyNull: this.type = set("body", null)
    
    inline def bodyVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): this.type = set("body", js.Array(value*))
    
    inline def bodyVdomElement(value: VdomElement): this.type = set("body", value.rawElement.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def enterExitTransitionDurationMs(value: Double): this.type = set("enterExitTransitionDurationMs", value.asInstanceOf[js.Any])
    
    inline def isOpen(value: Boolean): this.type = set("isOpen", value.asInstanceOf[js.Any])
    
    inline def onOuterAction(value: /* event */ Event => Callback): this.type = set("onOuterAction", js.Any.fromFunction1((t0: /* event */ Event) => value(t0).runNow()))
    
    inline def place(value: PopoverPlace): this.type = set("place", value.asInstanceOf[js.Any])
    
    inline def preferPlace(value: PopoverPlace): this.type = set("preferPlace", value.asInstanceOf[js.Any])
    
    inline def refreshIntervalMs(value: Double): this.type = set("refreshIntervalMs", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def target(value: VdomElement): this.type = set("target", value.rawElement.asInstanceOf[js.Any])
    
    inline def tipSize(value: Double): this.type = set("tipSize", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactPopover.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PopoverProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
