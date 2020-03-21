package typingsJapgolly.sweetalert

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.sweetalert.optionsMod.SwalOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sweetalert/typings/modules/init/modal", JSImport.Namespace)
@js.native
object modalMod extends js.Object {
  def default(): Unit = js.native
  def initModalContent(opts: SwalOptions): Unit = js.native
  def injectElIntoModal(markup: String): HTMLElement = js.native
}

