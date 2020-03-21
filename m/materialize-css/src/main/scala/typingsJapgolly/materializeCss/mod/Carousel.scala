package typingsJapgolly.materializeCss.mod

import org.scalajs.dom.raw.Element
import typingsJapgolly.materializeCss.MElements
import typingsJapgolly.materializeCss.PartialCarouselOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "Carousel")
@js.native
class Carousel ()
  extends typingsJapgolly.materializeCss.M.Carousel

/* static members */
@JSImport("materialize-css", "Carousel")
@js.native
object Carousel extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typingsJapgolly.materializeCss.M.Carousel = js.native
  /**
    * Init carousels
    */
  def init(els: MElements): js.Array[typingsJapgolly.materializeCss.M.Carousel] = js.native
  def init(els: MElements, options: PartialCarouselOptions): js.Array[typingsJapgolly.materializeCss.M.Carousel] = js.native
  /**
    * Init carousel
    */
  def init(els: typingsJapgolly.std.Element): typingsJapgolly.materializeCss.M.Carousel = js.native
  def init(els: typingsJapgolly.std.Element, options: PartialCarouselOptions): typingsJapgolly.materializeCss.M.Carousel = js.native
}

