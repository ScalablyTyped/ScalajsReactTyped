package typingsJapgolly.materialSnackbar

import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import typingsJapgolly.materialBase.foundationMod.MDCFoundation
import typingsJapgolly.materialSnackbar.adapterMod.MDCSnackbarAdapter
import typingsJapgolly.materialSnackbar.anon.PartialMDCSnackbarAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object foundationMod {
  
  @JSImport("@material/snackbar/foundation", JSImport.Default)
  @js.native
  open class default () extends MDCSnackbarFoundation {
    def this(adapter: PartialMDCSnackbarAdapter) = this()
  }
  
  @JSImport("@material/snackbar/foundation", "MDCSnackbarFoundation")
  @js.native
  open class MDCSnackbarFoundation () extends MDCFoundation[MDCSnackbarAdapter] {
    def this(adapter: PartialMDCSnackbarAdapter) = this()
    
    /* private */ var animationFrame: Any = js.native
    
    /* private */ var animationTimer: Any = js.native
    
    /* private */ var autoDismissTimeoutMs: Any = js.native
    
    /* private */ var autoDismissTimer: Any = js.native
    
    /* private */ var clearAutoDismissTimer: Any = js.native
    
    /**
      * @param reason Why the snackbar was closed. Value will be passed to CLOSING_EVENT and CLOSED_EVENT via the
      *     `event.detail.reason` property. Standard values are REASON_ACTION and REASON_DISMISS, but custom
      *     client-specific values may also be used if desired.
      */
    def close(): Unit = js.native
    def close(reason: String): Unit = js.native
    
    /* private */ var closeOnEscape: Any = js.native
    
    def getCloseOnEscape(): Boolean = js.native
    
    def getTimeoutMs(): Double = js.native
    
    def handleActionButtonClick(_evt: MouseEvent): Unit = js.native
    
    def handleActionIconClick(_evt: MouseEvent): Unit = js.native
    
    /* private */ var handleAnimationTimerEnd: Any = js.native
    
    def handleKeyDown(evt: KeyboardEvent): Unit = js.native
    
    def isOpen(): Boolean = js.native
    
    def open(): Unit = js.native
    
    /* private */ var opened: Any = js.native
    
    /**
      * Runs the given logic on the next animation frame, using setTimeout to factor in Firefox reflow behavior.
      */
    /* private */ var runNextAnimationFrame: Any = js.native
    
    def setCloseOnEscape(closeOnEscape: Boolean): Unit = js.native
    
    def setTimeoutMs(timeoutMs: Double): Unit = js.native
  }
}
