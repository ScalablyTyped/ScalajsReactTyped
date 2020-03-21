package typingsJapgolly.materialComponentsWeb.mod

import org.scalajs.dom.raw.Element
import typingsJapgolly.materialSlider.adapterMod.MDCSliderAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "slider")
@js.native
object slider extends js.Object {
  @js.native
  class MDCSlider ()
    extends typingsJapgolly.materialSlider.mod.MDCSlider
  
  @js.native
  class MDCSliderFoundation ()
    extends typingsJapgolly.materialSlider.mod.MDCSliderFoundation
  
  /* static members */
  @js.native
  object MDCSlider extends js.Object {
    def attachTo(root: Element): typingsJapgolly.materialSlider.mod.MDCSlider = js.native
  }
  
  /* static members */
  @js.native
  object MDCSliderFoundation extends js.Object {
    val cssClasses: typingsJapgolly.materialSlider.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCSliderAdapter = js.native
    val numbers: typingsJapgolly.materialSlider.constantsMod.numbers = js.native
    val strings: typingsJapgolly.materialSlider.constantsMod.strings = js.native
  }
  
}

