package typingsJapgolly.primereact.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.primereact.tooltipTooltipMod.TooltipProps
import typingsJapgolly.primereact.tooltipTooltipMod.TooltipTargetType
import typingsJapgolly.primereact.tooltipTooltipoptionsMod.TooltipAppendToType
import typingsJapgolly.primereact.tooltipTooltipoptionsMod.TooltipEventParams
import typingsJapgolly.primereact.tooltipTooltipoptionsMod.TooltipEventType
import typingsJapgolly.primereact.tooltipTooltipoptionsMod.TooltipPositionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tooltip {
  
  @JSImport("primereact", "Tooltip")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.primereact.mod.Tooltip] {
    
    inline def appendTo(value: TooltipAppendToType): this.type = set("appendTo", value.asInstanceOf[js.Any])
    
    inline def appendToNull: this.type = set("appendTo", null)
    
    inline def at(value: String): this.type = set("at", value.asInstanceOf[js.Any])
    
    inline def autoHide(value: Boolean): this.type = set("autoHide", value.asInstanceOf[js.Any])
    
    inline def autoZIndex(value: Boolean): this.type = set("autoZIndex", value.asInstanceOf[js.Any])
    
    inline def baseZIndex(value: Double): this.type = set("baseZIndex", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def content(value: String): this.type = set("content", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def event(value: TooltipEventType): this.type = set("event", value.asInstanceOf[js.Any])
    
    inline def hideDelay(value: Double): this.type = set("hideDelay", value.asInstanceOf[js.Any])
    
    inline def hideEvent(value: String): this.type = set("hideEvent", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def mouseTrack(value: Boolean): this.type = set("mouseTrack", value.asInstanceOf[js.Any])
    
    inline def mouseTrackLeft(value: Double): this.type = set("mouseTrackLeft", value.asInstanceOf[js.Any])
    
    inline def mouseTrackTop(value: Double): this.type = set("mouseTrackTop", value.asInstanceOf[js.Any])
    
    inline def my(value: String): this.type = set("my", value.asInstanceOf[js.Any])
    
    inline def onBeforeHide(value: /* e */ TooltipEventParams => Callback): this.type = set("onBeforeHide", js.Any.fromFunction1((t0: /* e */ TooltipEventParams) => value(t0).runNow()))
    
    inline def onBeforeShow(value: /* e */ TooltipEventParams => Callback): this.type = set("onBeforeShow", js.Any.fromFunction1((t0: /* e */ TooltipEventParams) => value(t0).runNow()))
    
    inline def onHide(value: /* e */ TooltipEventParams => Callback): this.type = set("onHide", js.Any.fromFunction1((t0: /* e */ TooltipEventParams) => value(t0).runNow()))
    
    inline def onShow(value: /* e */ TooltipEventParams => Callback): this.type = set("onShow", js.Any.fromFunction1((t0: /* e */ TooltipEventParams) => value(t0).runNow()))
    
    inline def position(value: TooltipPositionType): this.type = set("position", value.asInstanceOf[js.Any])
    
    inline def showDelay(value: Double): this.type = set("showDelay", value.asInstanceOf[js.Any])
    
    inline def showEvent(value: String): this.type = set("showEvent", value.asInstanceOf[js.Any])
    
    inline def showOnDisabled(value: Boolean): this.type = set("showOnDisabled", value.asInstanceOf[js.Any])
    
    inline def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def target(value: TooltipTargetType): this.type = set("target", value.asInstanceOf[js.Any])
    
    inline def targetVarargs(value: String*): this.type = set("target", js.Array(value*))
    
    inline def updateDelay(value: Double): this.type = set("updateDelay", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Tooltip.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TooltipProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
