package typingsJapgolly.materialRadio

import typingsJapgolly.materialRadio.adapterMod.MDCRadioAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/radio/foundation", JSImport.Namespace)
@js.native
object foundationMod extends js.Object {
  @js.native
  trait MDCRadioFoundation
    extends typingsJapgolly.materialBase.foundationMod.default[MDCRadioAdapter] {
    def getValue(): String = js.native
    def isChecked(): Boolean = js.native
    def isDisabled(): Boolean = js.native
    def setChecked(checked: Boolean): Unit = js.native
    def setDisabled(disabled: Boolean): Unit = js.native
    def setValue(): Unit = js.native
    def setValue(value: String): Unit = js.native
  }
  
  @js.native
  class default () extends MDCRadioFoundation
  
  /* static members */
  @js.native
  object default extends js.Object {
    val cssClasses: typingsJapgolly.materialRadio.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCRadioAdapter = js.native
    val strings: typingsJapgolly.materialRadio.constantsMod.strings = js.native
  }
  
}

