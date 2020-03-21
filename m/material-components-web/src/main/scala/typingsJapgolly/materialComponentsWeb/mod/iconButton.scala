package typingsJapgolly.materialComponentsWeb.mod

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.materialIconButton.AnonARIAPRESSED
import typingsJapgolly.materialIconButton.AnonICONBUTTONON
import typingsJapgolly.materialIconButton.PartialMDCIconButtonToggl
import typingsJapgolly.materialIconButton.adapterMod.MDCIconButtonToggleAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "iconButton")
@js.native
object iconButton extends js.Object {
  @js.native
  class MDCIconButtonToggle ()
    extends typingsJapgolly.materialIconButton.mod.MDCIconButtonToggle
  
  @js.native
  class MDCIconButtonToggleFoundation ()
    extends typingsJapgolly.materialIconButton.mod.MDCIconButtonToggleFoundation {
    def this(adapter: PartialMDCIconButtonToggl) = this()
  }
  
  /* static members */
  @js.native
  object MDCIconButtonToggle extends js.Object {
    def attachTo(root: HTMLElement): typingsJapgolly.materialIconButton.componentMod.MDCIconButtonToggle = js.native
  }
  
  /* static members */
  @js.native
  object MDCIconButtonToggleFoundation extends js.Object {
    val cssClasses: AnonICONBUTTONON = js.native
    val defaultAdapter: MDCIconButtonToggleAdapter = js.native
    val strings: AnonARIAPRESSED = js.native
  }
  
  @js.native
  object cssClasses extends js.Object {
    var ICON_BUTTON_ON: String = js.native
    var ROOT: String = js.native
  }
  
  @js.native
  object strings extends js.Object {
    var ARIA_PRESSED: String = js.native
    var CHANGE_EVENT: String = js.native
  }
  
}

