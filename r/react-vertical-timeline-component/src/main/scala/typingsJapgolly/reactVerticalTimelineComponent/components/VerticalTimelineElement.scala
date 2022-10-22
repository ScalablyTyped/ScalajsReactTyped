package typingsJapgolly.reactVerticalTimelineComponent.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactVerticalTimelineComponent.mod.VerticalTimelineElementProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object VerticalTimelineElement {
  
  @JSImport("react-vertical-timeline-component", "VerticalTimelineElement")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactVerticalTimelineComponent.mod.VerticalTimelineElement] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def contentArrowStyle(value: CSSProperties): this.type = set("contentArrowStyle", value.asInstanceOf[js.Any])
    
    inline def contentStyle(value: CSSProperties): this.type = set("contentStyle", value.asInstanceOf[js.Any])
    
    inline def date(value: String): this.type = set("date", value.asInstanceOf[js.Any])
    
    inline def dateClassName(value: String): this.type = set("dateClassName", value.asInstanceOf[js.Any])
    
    inline def icon(value: VdomNode): this.type = set("icon", value.rawNode.asInstanceOf[js.Any])
    
    inline def iconClassName(value: String): this.type = set("iconClassName", value.asInstanceOf[js.Any])
    
    inline def iconNull: this.type = set("icon", null)
    
    inline def iconOnClick(value: Callback): this.type = set("iconOnClick", value.toJsFn)
    
    inline def iconStyle(value: CSSProperties): this.type = set("iconStyle", value.asInstanceOf[js.Any])
    
    inline def iconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("icon", js.Array(value*))
    
    inline def iconVdomElement(value: VdomElement): this.type = set("icon", value.rawElement.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def intersectionObserverProps(value: Any): this.type = set("intersectionObserverProps", value.asInstanceOf[js.Any])
    
    inline def onTimelineElementClick(value: Callback): this.type = set("onTimelineElementClick", value.toJsFn)
    
    inline def position(value: String): this.type = set("position", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def textClassName(value: String): this.type = set("textClassName", value.asInstanceOf[js.Any])
    
    inline def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: VerticalTimelineElement.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: VerticalTimelineElementProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
