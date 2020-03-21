package typingsJapgolly.materialSnackbar

import org.scalajs.dom.raw.Element
import typingsJapgolly.materialBase.mod.MDCComponent
import typingsJapgolly.materialSnackbar.adapterMod.MDCSnackbarAdapter
import typingsJapgolly.materialSnackbar.foundationMod.MDCSnackbarData
import typingsJapgolly.materialSnackbar.foundationMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/snackbar", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class MDCSnackbar () extends MDCComponent[MDCSnackbarAdapter, default] {
    var dismissesOnAction: Boolean = js.native
    def show(data: MDCSnackbarData): Unit = js.native
  }
  
  @js.native
  class MDCSnackbarFoundation () extends default
  
  /* static members */
  @js.native
  object MDCSnackbar extends js.Object {
    def attachTo(root: Element): MDCSnackbar = js.native
  }
  
  /* static members */
  @js.native
  object MDCSnackbarFoundation extends js.Object {
    val cssClasses: typingsJapgolly.materialSnackbar.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCSnackbarAdapter = js.native
    val strings: typingsJapgolly.materialSnackbar.constantsMod.strings = js.native
  }
  
}

