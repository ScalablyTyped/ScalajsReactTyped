package typingsJapgolly.materialComponentsWeb.mod

import org.scalajs.dom.raw.Element
import typingsJapgolly.materialSnackbar.adapterMod.MDCSnackbarAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "snackbar")
@js.native
object snackbar extends js.Object {
  @js.native
  class MDCSnackbar ()
    extends typingsJapgolly.materialSnackbar.mod.MDCSnackbar
  
  @js.native
  class MDCSnackbarFoundation ()
    extends typingsJapgolly.materialSnackbar.mod.MDCSnackbarFoundation
  
  /* static members */
  @js.native
  object MDCSnackbar extends js.Object {
    def attachTo(root: Element): typingsJapgolly.materialSnackbar.mod.MDCSnackbar = js.native
  }
  
  /* static members */
  @js.native
  object MDCSnackbarFoundation extends js.Object {
    val cssClasses: typingsJapgolly.materialSnackbar.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCSnackbarAdapter = js.native
    val strings: typingsJapgolly.materialSnackbar.constantsMod.strings = js.native
  }
  
}

