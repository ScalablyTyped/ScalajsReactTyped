package typingsJapgolly.plotlyJs.mod

import typingsJapgolly.plotlyJs.plotlyJsStrings.plotly_afterexport
import typingsJapgolly.plotlyJs.plotlyJsStrings.plotly_afterplot
import typingsJapgolly.plotlyJs.plotlyJsStrings.plotly_animated
import typingsJapgolly.plotlyJs.plotlyJsStrings.plotly_animatingframe
import typingsJapgolly.plotlyJs.plotlyJsStrings.plotly_animationinterrupted
import typingsJapgolly.plotlyJs.plotlyJsStrings.plotly_autosize
import typingsJapgolly.plotlyJs.plotlyJsStrings.plotly_beforeexport
import typingsJapgolly.plotlyJs.plotlyJsStrings.plotly_beforeplot
import typingsJapgolly.plotlyJs.plotlyJsStrings.plotly_click
import typingsJapgolly.plotlyJs.plotlyJsStrings.plotly_clickannotation
import typingsJapgolly.plotlyJs.plotlyJsStrings.plotly_deselect
import typingsJapgolly.plotlyJs.plotlyJsStrings.plotly_doubleclick
import typingsJapgolly.plotlyJs.plotlyJsStrings.plotly_event
import typingsJapgolly.plotlyJs.plotlyJsStrings.plotly_framework
import typingsJapgolly.plotlyJs.plotlyJsStrings.plotly_hover
import typingsJapgolly.plotlyJs.plotlyJsStrings.plotly_legendclick
import typingsJapgolly.plotlyJs.plotlyJsStrings.plotly_legenddoubleclick
import typingsJapgolly.plotlyJs.plotlyJsStrings.plotly_redraw
import typingsJapgolly.plotlyJs.plotlyJsStrings.plotly_relayout
import typingsJapgolly.plotlyJs.plotlyJsStrings.plotly_restyle
import typingsJapgolly.plotlyJs.plotlyJsStrings.plotly_selected
import typingsJapgolly.plotlyJs.plotlyJsStrings.plotly_selecting
import typingsJapgolly.plotlyJs.plotlyJsStrings.plotly_sliderchange
import typingsJapgolly.plotlyJs.plotlyJsStrings.plotly_sliderend
import typingsJapgolly.plotlyJs.plotlyJsStrings.plotly_sliderstart
import typingsJapgolly.plotlyJs.plotlyJsStrings.plotly_transitioning
import typingsJapgolly.plotlyJs.plotlyJsStrings.plotly_transitioninterrupted
import typingsJapgolly.plotlyJs.plotlyJsStrings.plotly_unhover
import typingsJapgolly.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotlyHTMLElement extends HTMLElement {
  def on(
    event: plotly_afterexport | plotly_afterplot | plotly_animated | plotly_animationinterrupted | plotly_autosize | plotly_beforeexport | plotly_deselect | plotly_doubleclick | plotly_framework | plotly_redraw | plotly_transitioning | plotly_transitioninterrupted,
    callback: js.Function0[Unit]
  ): Unit = js.native
  @JSName("on")
  def on_plotlyanimatingframe(event: plotly_animatingframe, callback: js.Function1[/* event */ FrameAnimationEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_plotlybeforeplot(event: plotly_beforeplot, callback: js.Function1[/* event */ BeforePlotEvent, Boolean]): Unit = js.native
  @JSName("on")
  def on_plotlyclick(event: plotly_click, callback: js.Function1[/* event */ PlotMouseEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_plotlyclickannotation(event: plotly_clickannotation, callback: js.Function1[/* event */ ClickAnnotationEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_plotlyevent(event: plotly_event, callback: js.Function1[/* data */ js.Any, Unit]): Unit = js.native
  @JSName("on")
  def on_plotlyhover(event: plotly_hover, callback: js.Function1[/* event */ PlotMouseEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_plotlylegendclick(event: plotly_legendclick, callback: js.Function1[/* event */ LegendClickEvent, Boolean]): Unit = js.native
  @JSName("on")
  def on_plotlylegenddoubleclick(event: plotly_legenddoubleclick, callback: js.Function1[/* event */ LegendClickEvent, Boolean]): Unit = js.native
  @JSName("on")
  def on_plotlyrelayout(event: plotly_relayout, callback: js.Function1[/* event */ PlotRelayoutEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_plotlyrestyle(event: plotly_restyle, callback: js.Function1[/* data */ PlotRestyleEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_plotlyselected(event: plotly_selected, callback: js.Function1[/* event */ PlotSelectionEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_plotlyselecting(event: plotly_selecting, callback: js.Function1[/* event */ PlotSelectionEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_plotlysliderchange(event: plotly_sliderchange, callback: js.Function1[/* event */ SliderChangeEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_plotlysliderend(event: plotly_sliderend, callback: js.Function1[/* event */ SliderEndEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_plotlysliderstart(event: plotly_sliderstart, callback: js.Function1[/* event */ SliderStartEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_plotlyunhover(event: plotly_unhover, callback: js.Function1[/* event */ PlotMouseEvent, Unit]): Unit = js.native
  def removeAllListeners(handler: String): Unit = js.native
}

