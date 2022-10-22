package typingsJapgolly.reactPlotlyJs.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.plotlyJs.mod.ButtonClickEvent
import typingsJapgolly.plotlyJs.mod.Data
import typingsJapgolly.plotlyJs.mod.Frame
import typingsJapgolly.plotlyJs.mod.PlotRestyleEvent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactPlotlyJs.anon.PartialConfig
import typingsJapgolly.reactPlotlyJs.anon.PartialLayout
import typingsJapgolly.reactPlotlyJs.anon.ReadonlyClickAnnotationEv
import typingsJapgolly.reactPlotlyJs.anon.ReadonlyError
import typingsJapgolly.reactPlotlyJs.anon.ReadonlyFigure
import typingsJapgolly.reactPlotlyJs.anon.ReadonlyFrameAnimationEve
import typingsJapgolly.reactPlotlyJs.anon.ReadonlyHTMLElement
import typingsJapgolly.reactPlotlyJs.anon.ReadonlyLegendClickEvent
import typingsJapgolly.reactPlotlyJs.anon.ReadonlyPlotHoverEvent
import typingsJapgolly.reactPlotlyJs.anon.ReadonlyPlotMouseEvent
import typingsJapgolly.reactPlotlyJs.anon.ReadonlyPlotRelayoutEvent
import typingsJapgolly.reactPlotlyJs.anon.ReadonlyPlotSelectionEven
import typingsJapgolly.reactPlotlyJs.anon.ReadonlySliderChangeEvent
import typingsJapgolly.reactPlotlyJs.anon.ReadonlySliderEndEvent
import typingsJapgolly.reactPlotlyJs.anon.ReadonlySliderStartEvent
import typingsJapgolly.reactPlotlyJs.mod.PlotParams
import typingsJapgolly.reactPlotlyJs.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactPlotlyDotjs {
  
  inline def apply(data: js.Array[Data], layout: PartialLayout): Builder = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PlotParams]))
  }
  
  @JSImport("react-plotly.js", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def config(value: PartialConfig): this.type = set("config", value.asInstanceOf[js.Any])
    
    inline def debug(value: Boolean): this.type = set("debug", value.asInstanceOf[js.Any])
    
    inline def divId(value: String): this.type = set("divId", value.asInstanceOf[js.Any])
    
    inline def frames(value: js.Array[Frame]): this.type = set("frames", value.asInstanceOf[js.Any])
    
    inline def framesVarargs(value: Frame*): this.type = set("frames", js.Array(value*))
    
    inline def onAfterExport(value: Callback): this.type = set("onAfterExport", value.toJsFn)
    
    inline def onAfterPlot(value: Callback): this.type = set("onAfterPlot", value.toJsFn)
    
    inline def onAnimated(value: Callback): this.type = set("onAnimated", value.toJsFn)
    
    inline def onAnimatingFrame(value: /* event */ ReadonlyFrameAnimationEve => Callback): this.type = set("onAnimatingFrame", js.Any.fromFunction1((t0: /* event */ ReadonlyFrameAnimationEve) => value(t0).runNow()))
    
    inline def onAnimationInterrupted(value: Callback): this.type = set("onAnimationInterrupted", value.toJsFn)
    
    inline def onAutoSize(value: Callback): this.type = set("onAutoSize", value.toJsFn)
    
    inline def onBeforeExport(value: Callback): this.type = set("onBeforeExport", value.toJsFn)
    
    inline def onBeforeHover(value: /* event */ ReadonlyPlotMouseEvent => Boolean): this.type = set("onBeforeHover", js.Any.fromFunction1(value))
    
    inline def onButtonClicked(value: /* event */ ButtonClickEvent => Callback): this.type = set("onButtonClicked", js.Any.fromFunction1((t0: /* event */ ButtonClickEvent) => value(t0).runNow()))
    
    inline def onClick(value: /* event */ ReadonlyPlotMouseEvent => Callback): this.type = set("onClick", js.Any.fromFunction1((t0: /* event */ ReadonlyPlotMouseEvent) => value(t0).runNow()))
    
    inline def onClickAnnotation(value: /* event */ ReadonlyClickAnnotationEv => Callback): this.type = set("onClickAnnotation", js.Any.fromFunction1((t0: /* event */ ReadonlyClickAnnotationEv) => value(t0).runNow()))
    
    inline def onDeselect(value: Callback): this.type = set("onDeselect", value.toJsFn)
    
    inline def onDoubleClick(value: Callback): this.type = set("onDoubleClick", value.toJsFn)
    
    inline def onError(value: /* err */ ReadonlyError => Callback): this.type = set("onError", js.Any.fromFunction1((t0: /* err */ ReadonlyError) => value(t0).runNow()))
    
    inline def onFramework(value: Callback): this.type = set("onFramework", value.toJsFn)
    
    inline def onHover(value: /* event */ ReadonlyPlotHoverEvent => Callback): this.type = set("onHover", js.Any.fromFunction1((t0: /* event */ ReadonlyPlotHoverEvent) => value(t0).runNow()))
    
    inline def onInitialized(value: (/* figure */ ReadonlyFigure, /* graphDiv */ ReadonlyHTMLElement) => Callback): this.type = set("onInitialized", js.Any.fromFunction2((t0: /* figure */ ReadonlyFigure, t1: /* graphDiv */ ReadonlyHTMLElement) => (value(t0, t1)).runNow()))
    
    inline def onLegendClick(value: /* event */ ReadonlyLegendClickEvent => Boolean): this.type = set("onLegendClick", js.Any.fromFunction1(value))
    
    inline def onLegendDoubleClick(value: /* event */ ReadonlyLegendClickEvent => Boolean): this.type = set("onLegendDoubleClick", js.Any.fromFunction1(value))
    
    inline def onPurge(value: (/* figure */ ReadonlyFigure, /* graphDiv */ ReadonlyHTMLElement) => Callback): this.type = set("onPurge", js.Any.fromFunction2((t0: /* figure */ ReadonlyFigure, t1: /* graphDiv */ ReadonlyHTMLElement) => (value(t0, t1)).runNow()))
    
    inline def onRedraw(value: Callback): this.type = set("onRedraw", value.toJsFn)
    
    inline def onRelayout(value: /* event */ ReadonlyPlotRelayoutEvent => Callback): this.type = set("onRelayout", js.Any.fromFunction1((t0: /* event */ ReadonlyPlotRelayoutEvent) => value(t0).runNow()))
    
    inline def onRestyle(value: /* event */ PlotRestyleEvent => Callback): this.type = set("onRestyle", js.Any.fromFunction1((t0: /* event */ PlotRestyleEvent) => value(t0).runNow()))
    
    inline def onSelected(value: /* event */ ReadonlyPlotSelectionEven => Callback): this.type = set("onSelected", js.Any.fromFunction1((t0: /* event */ ReadonlyPlotSelectionEven) => value(t0).runNow()))
    
    inline def onSelecting(value: /* event */ ReadonlyPlotSelectionEven => Callback): this.type = set("onSelecting", js.Any.fromFunction1((t0: /* event */ ReadonlyPlotSelectionEven) => value(t0).runNow()))
    
    inline def onSliderChange(value: /* event */ ReadonlySliderChangeEvent => Callback): this.type = set("onSliderChange", js.Any.fromFunction1((t0: /* event */ ReadonlySliderChangeEvent) => value(t0).runNow()))
    
    inline def onSliderEnd(value: /* event */ ReadonlySliderEndEvent => Callback): this.type = set("onSliderEnd", js.Any.fromFunction1((t0: /* event */ ReadonlySliderEndEvent) => value(t0).runNow()))
    
    inline def onSliderStart(value: /* event */ ReadonlySliderStartEvent => Callback): this.type = set("onSliderStart", js.Any.fromFunction1((t0: /* event */ ReadonlySliderStartEvent) => value(t0).runNow()))
    
    inline def onTransitionInterrupted(value: Callback): this.type = set("onTransitionInterrupted", value.toJsFn)
    
    inline def onTransitioning(value: Callback): this.type = set("onTransitioning", value.toJsFn)
    
    inline def onUnhover(value: /* event */ ReadonlyPlotMouseEvent => Callback): this.type = set("onUnhover", js.Any.fromFunction1((t0: /* event */ ReadonlyPlotMouseEvent) => value(t0).runNow()))
    
    inline def onUpdate(value: (/* figure */ ReadonlyFigure, /* graphDiv */ ReadonlyHTMLElement) => Callback): this.type = set("onUpdate", js.Any.fromFunction2((t0: /* figure */ ReadonlyFigure, t1: /* graphDiv */ ReadonlyHTMLElement) => (value(t0, t1)).runNow()))
    
    inline def revision(value: Double): this.type = set("revision", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def useResizeHandler(value: Boolean): this.type = set("useResizeHandler", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PlotParams): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
