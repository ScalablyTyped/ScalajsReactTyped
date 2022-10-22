package typingsJapgolly.materialDrawer

import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.TransitionEvent
import typingsJapgolly.materialBase.foundationMod.MDCFoundation
import typingsJapgolly.materialDrawer.adapterMod.MDCDrawerAdapter
import typingsJapgolly.materialDrawer.anon.PartialMDCDrawerAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dismissibleFoundationMod {
  
  @JSImport("@material/drawer/dismissible/foundation", JSImport.Default)
  @js.native
  open class default () extends MDCDismissibleDrawerFoundation {
    def this(adapter: PartialMDCDrawerAdapter) = this()
  }
  
  @JSImport("@material/drawer/dismissible/foundation", "MDCDismissibleDrawerFoundation")
  @js.native
  open class MDCDismissibleDrawerFoundation () extends MDCFoundation[MDCDrawerAdapter] {
    def this(adapter: PartialMDCDrawerAdapter) = this()
    
    /* private */ var animationFrame: Any = js.native
    
    /* private */ var animationTimer: Any = js.native
    
    /**
      * Closes the drawer from the open state.
      */
    def close(): Unit = js.native
    
    /**
      * Extension point for when drawer finishes close animation.
      */
    /* protected */ def closed(): Unit = js.native
    
    /**
      * Keydown handler to close drawer when key is escape.
      */
    def handleKeydown(evt: KeyboardEvent): Unit = js.native
    
    /**
      * Handles the `transitionend` event when the drawer finishes opening/closing.
      */
    def handleTransitionEnd(evt: TransitionEvent): Unit = js.native
    
    /**
      * Returns true if the drawer is animating closed.
      * @return true if drawer is animating closed.
      */
    def isClosing(): Boolean = js.native
    
    /* private */ var isElement: Any = js.native
    
    /**
      * Returns true if the drawer is in the open position.
      * @return true if drawer is in open state.
      */
    def isOpen(): Boolean = js.native
    
    /**
      * Returns true if the drawer is animating open.
      * @return true if drawer is animating open.
      */
    def isOpening(): Boolean = js.native
    
    /**
      * Opens the drawer from the closed state.
      */
    def open(): Unit = js.native
    
    /**
      * Extension point for when drawer finishes open animation.
      */
    /* protected */ def opened(): Unit = js.native
    
    /**
      * Runs the given logic on the next animation frame, using setTimeout to factor in Firefox reflow behavior.
      */
    /* private */ var runNextAnimationFrame: Any = js.native
  }
}
