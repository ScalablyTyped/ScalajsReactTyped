package typingsJapgolly.materialSlider

import org.scalajs.dom.raw.Element
import typingsJapgolly.materialSlider.adapterMod.MDCSliderAdapter
import typingsJapgolly.materialSlider.foundationMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/slider", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class MDCSlider ()
    extends typingsJapgolly.materialBase.componentMod.default[MDCSliderAdapter, default] {
    var disabled: Boolean = js.native
    var max: Double = js.native
    var min: Double = js.native
    var step: Double = js.native
    var value: Double = js.native
    def initialize(): Unit = js.native
    def layout(): Unit = js.native
    def stepDown(): Unit = js.native
    def stepDown(amount: Double): Unit = js.native
    def stepUp(): Unit = js.native
    def stepUp(amount: Double): Unit = js.native
  }
  
  @js.native
  class MDCSliderFoundation () extends default
  
  /* static members */
  @js.native
  object MDCSlider extends js.Object {
    def attachTo(root: Element): MDCSlider = js.native
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

