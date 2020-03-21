package typingsJapgolly.materialDrawer

import org.scalajs.dom.raw.KeyboardEvent
import typingsJapgolly.materialBase.foundationMod.default
import typingsJapgolly.materialDrawer.adapterMod.MDCDrawerAdapter
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/drawer/dismissible/foundation", JSImport.Namespace)
@js.native
object foundationMod extends js.Object {
  @js.native
  class MDCDismissibleDrawerFoundation protected () extends default[MDCDrawerAdapter] {
    def this(adapter: MDCDrawerAdapter) = this()
    /**
      * Function to close the drawer.
      */
    def close(): Unit = js.native
    /**
      * Keydown handler to close drawer when key is escape.
      */
    def handleKeydown(evt: KeyboardEvent): Unit = js.native
    /**
      * Handles a transition end event on the root element.
      */
    def handleTransitionEnd(evt: Event_): Unit = js.native
    /**
      * Returns true if drawer is animating closed.
      */
    def isClosing(): Boolean = js.native
    /**
      * Returns true if drawer is in open state.
      */
    def isOpen(): Boolean = js.native
    /**
      * Returns true if drawer is animating open.
      */
    def isOpening(): Boolean = js.native
    /**
      * Function to open the drawer.
      */
    def open(): Unit = js.native
  }
  
  /* static members */
  @js.native
  object MDCDismissibleDrawerFoundation extends js.Object {
    val cssClasses: typingsJapgolly.materialDrawer.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCDrawerAdapter = js.native
    val strings: typingsJapgolly.materialDrawer.constantsMod.strings = js.native
  }
  
}

