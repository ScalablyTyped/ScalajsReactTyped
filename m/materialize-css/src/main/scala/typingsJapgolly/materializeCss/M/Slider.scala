package typingsJapgolly.materializeCss.M

import org.scalajs.dom.raw.Element
import typingsJapgolly.materializeCss.MElements
import typingsJapgolly.materializeCss.PartialSliderOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("M.Slider")
@js.native
class Slider () extends Component[SliderOptions] {
  /**
    * Index of current slide
    */
  var activeIndex: Double = js.native
  /**
    * Move to next slider
    */
  def next(): Unit = js.native
  /**
    * Pause slider autoslide
    */
  def pause(): Unit = js.native
  /**
    * Move to prev slider
    */
  def prev(): Unit = js.native
  /**
    * Start slider autoslide
    */
  def start(): Unit = js.native
}

/* static members */
@JSGlobal("M.Slider")
@js.native
object Slider extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): Slider = js.native
  /**
    * Init Sliders
    */
  def init(els: MElements): js.Array[Slider] = js.native
  def init(els: MElements, options: PartialSliderOptions): js.Array[Slider] = js.native
  /**
    * Init Slider
    */
  def init(els: typingsJapgolly.std.Element): Slider = js.native
  def init(els: typingsJapgolly.std.Element, options: PartialSliderOptions): Slider = js.native
}

