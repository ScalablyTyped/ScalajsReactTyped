package typingsJapgolly.materializeCss.mod

import org.scalajs.dom.raw.Element
import typingsJapgolly.materializeCss.MElements
import typingsJapgolly.materializeCss.PartialSliderOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "Slider")
@js.native
class Slider ()
  extends typingsJapgolly.materializeCss.M.Slider

/* static members */
@JSImport("materialize-css", "Slider")
@js.native
object Slider extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typingsJapgolly.materializeCss.M.Slider = js.native
  /**
    * Init Sliders
    */
  def init(els: MElements): js.Array[typingsJapgolly.materializeCss.M.Slider] = js.native
  def init(els: MElements, options: PartialSliderOptions): js.Array[typingsJapgolly.materializeCss.M.Slider] = js.native
  /**
    * Init Slider
    */
  def init(els: typingsJapgolly.std.Element): typingsJapgolly.materializeCss.M.Slider = js.native
  def init(els: typingsJapgolly.std.Element, options: PartialSliderOptions): typingsJapgolly.materializeCss.M.Slider = js.native
}

