package typingsJapgolly.materialLinearProgress

import org.scalajs.dom.raw.Element
import typingsJapgolly.materialBase.mod.MDCComponent
import typingsJapgolly.materialLinearProgress.adapterMod.MDCLinearProgressAdapter
import typingsJapgolly.materialLinearProgress.foundationMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/linear-progress", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class MDCLinearProgress () extends MDCComponent[MDCLinearProgressAdapter, default] {
    var buffer: Double = js.native
    var determinate: Boolean = js.native
    var progress: Double = js.native
    var reverse: Boolean = js.native
    def close(): Unit = js.native
    def open(): Unit = js.native
  }
  
  @js.native
  class MDCLinearProgressFoundation () extends default
  
  /* static members */
  @js.native
  object MDCLinearProgress extends js.Object {
    def attachTo(root: Element): MDCLinearProgress = js.native
  }
  
  /* static members */
  @js.native
  object MDCLinearProgressFoundation extends js.Object {
    val cssClasses: typingsJapgolly.materialLinearProgress.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCLinearProgressAdapter = js.native
    val strings: typingsJapgolly.materialLinearProgress.constantsMod.strings = js.native
  }
  
}

