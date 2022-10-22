package typingsJapgolly.reactTooltip.components

import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.Event
import org.scalajs.dom.EventTarget
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLSpanElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactTooltip.anon.Left
import typingsJapgolly.reactTooltip.mod.Effect
import typingsJapgolly.reactTooltip.mod.GetContent
import typingsJapgolly.reactTooltip.mod.Offset
import typingsJapgolly.reactTooltip.mod.Place
import typingsJapgolly.reactTooltip.mod.TooltipProps
import typingsJapgolly.reactTooltip.mod.Type
import typingsJapgolly.reactTooltip.mod.VoidFunc
import typingsJapgolly.reactTooltip.mod.default
import typingsJapgolly.reactTooltip.reactTooltipStrings.div
import typingsJapgolly.reactTooltip.reactTooltipStrings.span
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactTooltip {
  
  @JSImport("react-tooltip", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def afterHide(value: VoidFunc): this.type = set("afterHide", value.asInstanceOf[js.Any])
    
    inline def afterShow(value: VoidFunc): this.type = set("afterShow", value.asInstanceOf[js.Any])
    
    inline def arrowColor(value: String): this.type = set("arrowColor", value.asInstanceOf[js.Any])
    
    inline def backgroundColor(value: String): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
    
    inline def bodyMode(value: Boolean): this.type = set("bodyMode", value.asInstanceOf[js.Any])
    
    inline def border(value: Boolean): this.type = set("border", value.asInstanceOf[js.Any])
    
    inline def borderClass(value: String): this.type = set("borderClass", value.asInstanceOf[js.Any])
    
    inline def borderColor(value: String): this.type = set("borderColor", value.asInstanceOf[js.Any])
    
    inline def `class`(value: String): this.type = set("class", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def clickable(value: Boolean): this.type = set("clickable", value.asInstanceOf[js.Any])
    
    inline def delayHide(value: Double): this.type = set("delayHide", value.asInstanceOf[js.Any])
    
    inline def delayShow(value: Double): this.type = set("delayShow", value.asInstanceOf[js.Any])
    
    inline def delayUpdate(value: Double): this.type = set("delayUpdate", value.asInstanceOf[js.Any])
    
    inline def disable(value: Boolean): this.type = set("disable", value.asInstanceOf[js.Any])
    
    inline def effect(value: Effect): this.type = set("effect", value.asInstanceOf[js.Any])
    
    inline def event(
      value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 102, starting with typingsJapgolly.reactTooltip.reactTooltipStrings.fullscreenchange, typingsJapgolly.reactTooltip.reactTooltipStrings.fullscreenerror, typingsJapgolly.reactTooltip.reactTooltipStrings.copy */ Any
    ): this.type = set("event", value.asInstanceOf[js.Any])
    
    inline def eventOff(
      value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 102, starting with typingsJapgolly.reactTooltip.reactTooltipStrings.fullscreenchange, typingsJapgolly.reactTooltip.reactTooltipStrings.fullscreenerror, typingsJapgolly.reactTooltip.reactTooltipStrings.copy */ Any
    ): this.type = set("eventOff", value.asInstanceOf[js.Any])
    
    inline def getContent(value: GetContent): this.type = set("getContent", value.asInstanceOf[js.Any])
    
    inline def getContentFunction1(value: /* toolTipStr */ String => Node): this.type = set("getContent", js.Any.fromFunction1(value))
    
    inline def globalEventOff(
      value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 102, starting with typingsJapgolly.reactTooltip.reactTooltipStrings.fullscreenchange, typingsJapgolly.reactTooltip.reactTooltipStrings.fullscreenerror, typingsJapgolly.reactTooltip.reactTooltipStrings.copy */ Any
    ): this.type = set("globalEventOff", value.asInstanceOf[js.Any])
    
    inline def html(value: Boolean): this.type = set("html", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def insecure(value: Boolean): this.type = set("insecure", value.asInstanceOf[js.Any])
    
    inline def isCapture(value: Boolean): this.type = set("isCapture", value.asInstanceOf[js.Any])
    
    inline def multiline(value: Boolean): this.type = set("multiline", value.asInstanceOf[js.Any])
    
    inline def offset(value: Offset): this.type = set("offset", value.asInstanceOf[js.Any])
    
    inline def overridePosition(
      value: (/* position */ Left, /* currentEvent */ Event, /* currentTarget */ EventTarget, /* refNode */ Null | HTMLDivElement | HTMLSpanElement, /* place */ Place, /* desiredPlace */ Place, /* effect */ Effect, /* offset */ Offset) => Left
    ): this.type = set("overridePosition", js.Any.fromFunction8(value))
    
    inline def place(value: Place): this.type = set("place", value.asInstanceOf[js.Any])
    
    inline def possibleCustomEvents(value: String): this.type = set("possibleCustomEvents", value.asInstanceOf[js.Any])
    
    inline def possibleCustomEventsOff(value: String): this.type = set("possibleCustomEventsOff", value.asInstanceOf[js.Any])
    
    inline def resizeHide(value: Boolean): this.type = set("resizeHide", value.asInstanceOf[js.Any])
    
    inline def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
    
    inline def scrollHide(value: Boolean): this.type = set("scrollHide", value.asInstanceOf[js.Any])
    
    inline def textColor(value: String): this.type = set("textColor", value.asInstanceOf[js.Any])
    
    inline def `type`(value: Type): this.type = set("type", value.asInstanceOf[js.Any])
    
    inline def uuid(value: String): this.type = set("uuid", value.asInstanceOf[js.Any])
    
    inline def wrapper(value: div | span): this.type = set("wrapper", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactTooltip.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TooltipProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
