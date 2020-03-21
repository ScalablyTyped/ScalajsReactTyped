package typingsJapgolly.materialDrawer

import typingsJapgolly.materialDrawer.foundationMod.MDCDismissibleDrawerFoundation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/drawer/modal/foundation", JSImport.Namespace)
@js.native
object modalFoundationMod extends js.Object {
  @js.native
  class MDCModalDrawerFoundation () extends MDCDismissibleDrawerFoundation {
    /**
      * Called when drawer finishes close animation.
      */
    def closed(): Unit = js.native
    /**
      * Handles click event on scrim.
      */
    def handleScrimClick(): Unit = js.native
    /**
      * Called when drawer finishes open animation.
      */
    def opened(): Unit = js.native
  }
  
}

