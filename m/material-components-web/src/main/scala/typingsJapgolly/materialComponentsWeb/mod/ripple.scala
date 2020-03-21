package typingsJapgolly.materialComponentsWeb.mod

import org.scalajs.dom.raw.ClientRect
import org.scalajs.dom.raw.Element
import typingsJapgolly.materialRipple.AnonIsUnbounded
import typingsJapgolly.materialRipple.AnonPassive
import typingsJapgolly.materialRipple.AnonX
import typingsJapgolly.materialRipple.adapterMod.MDCRippleAdapter
import typingsJapgolly.std.Event_
import typingsJapgolly.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "ripple")
@js.native
object ripple extends js.Object {
  @js.native
  class MDCRipple ()
    extends typingsJapgolly.materialRipple.mod.MDCRipple
  
  @js.native
  class MDCRippleFoundation ()
    extends typingsJapgolly.materialRipple.mod.MDCRippleFoundation
  
  @js.native
  class RippleCapableSurface ()
    extends typingsJapgolly.materialRipple.mod.RippleCapableSurface
  
  /* static members */
  @js.native
  object MDCRipple extends js.Object {
    def attachTo(root: Element): typingsJapgolly.materialRipple.mod.MDCRipple = js.native
    def attachTo(root: Element, options: AnonIsUnbounded): typingsJapgolly.materialRipple.mod.MDCRipple = js.native
    def createAdapter(instance: typingsJapgolly.materialRipple.mod.RippleCapableSurface): MDCRippleAdapter = js.native
  }
  
  /* static members */
  @js.native
  object MDCRippleFoundation extends js.Object {
    val cssClasses: typingsJapgolly.materialRipple.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCRippleAdapter = js.native
    val numbers: typingsJapgolly.materialRipple.constantsMod.numbers = js.native
    val strings: typingsJapgolly.materialRipple.constantsMod.strings = js.native
  }
  
  @js.native
  object util extends js.Object {
    def applyPassive(): Boolean | AnonPassive = js.native
    def applyPassive(globalObj: Window_): Boolean | AnonPassive = js.native
    def applyPassive(globalObj: Window_, forceRefresh: Boolean): Boolean | AnonPassive = js.native
    def getMatchesProperty(HTMLElementPrototype: js.Object): js.Array[String] = js.native
    def getNormalizedEventCoords(ev: Event_, pageOffset: AnonX, clientRect: ClientRect): AnonX = js.native
    def supportsCssVariables(windowObj: Window_): js.UndefOr[Boolean] = js.native
    def supportsCssVariables(windowObj: Window_, forceRefresh: Boolean): js.UndefOr[Boolean] = js.native
  }
  
}

