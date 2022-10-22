package typingsJapgolly.einsModal

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.einsModal.einsModalStrings.hide
import typingsJapgolly.einsModal.einsModalStrings.show
import typingsJapgolly.einsModal.einsModalStrings.toggle
import typingsJapgolly.einsModal.mod.global.HTMLElement
import typingsJapgolly.einsModal.mod.global.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("eins-modal", JSImport.Default)
  @js.native
  val default: EinsModal = js.native
  
  @js.native
  trait EinsModal extends StObject {
    
    /**
      * Add an event listener to a element and/or assign it to a modal.
      * @param triggerElementOrId
      * @param modalElementOrId
      * @param options
      */
    def addButton(triggerElementOrId: String): Unit = js.native
    def addButton(triggerElementOrId: String, modalElementOrId: String): Unit = js.native
    def addButton(triggerElementOrId: String, modalElementOrId: String, options: EinsModalOptions): Unit = js.native
    def addButton(triggerElementOrId: String, modalElementOrId: Null, options: EinsModalOptions): Unit = js.native
    def addButton(triggerElementOrId: String, modalElementOrId: Unit, options: EinsModalOptions): Unit = js.native
    def addButton(triggerElementOrId: String, modalElementOrId: HTMLElement): Unit = js.native
    def addButton(triggerElementOrId: String, modalElementOrId: HTMLElement, options: EinsModalOptions): Unit = js.native
    def addButton(triggerElementOrId: String, modalElementOrId: JQuery): Unit = js.native
    def addButton(triggerElementOrId: String, modalElementOrId: JQuery, options: EinsModalOptions): Unit = js.native
    def addButton(triggerElementOrId: HTMLElement): Unit = js.native
    def addButton(triggerElementOrId: HTMLElement, modalElementOrId: String): Unit = js.native
    def addButton(triggerElementOrId: HTMLElement, modalElementOrId: String, options: EinsModalOptions): Unit = js.native
    def addButton(triggerElementOrId: HTMLElement, modalElementOrId: Null, options: EinsModalOptions): Unit = js.native
    def addButton(triggerElementOrId: HTMLElement, modalElementOrId: Unit, options: EinsModalOptions): Unit = js.native
    def addButton(triggerElementOrId: HTMLElement, modalElementOrId: HTMLElement): Unit = js.native
    def addButton(triggerElementOrId: HTMLElement, modalElementOrId: HTMLElement, options: EinsModalOptions): Unit = js.native
    def addButton(triggerElementOrId: HTMLElement, modalElementOrId: JQuery): Unit = js.native
    def addButton(triggerElementOrId: HTMLElement, modalElementOrId: JQuery, options: EinsModalOptions): Unit = js.native
    def addButton(triggerElementOrId: JQuery): Unit = js.native
    def addButton(triggerElementOrId: JQuery, modalElementOrId: String): Unit = js.native
    def addButton(triggerElementOrId: JQuery, modalElementOrId: String, options: EinsModalOptions): Unit = js.native
    def addButton(triggerElementOrId: JQuery, modalElementOrId: Null, options: EinsModalOptions): Unit = js.native
    def addButton(triggerElementOrId: JQuery, modalElementOrId: Unit, options: EinsModalOptions): Unit = js.native
    def addButton(triggerElementOrId: JQuery, modalElementOrId: HTMLElement): Unit = js.native
    def addButton(triggerElementOrId: JQuery, modalElementOrId: HTMLElement, options: EinsModalOptions): Unit = js.native
    def addButton(triggerElementOrId: JQuery, modalElementOrId: JQuery): Unit = js.native
    def addButton(triggerElementOrId: JQuery, modalElementOrId: JQuery, options: EinsModalOptions): Unit = js.native
    
    /**
      * Add ".modal()" function to a modal
      * @param modalElementOrId
      */
    def addModalFunction(modalElementOrId: String): Unit = js.native
    def addModalFunction(modalElementOrId: HTMLElement): Unit = js.native
    def addModalFunction(modalElementOrId: JQuery): Unit = js.native
    
    /**
      * Close a modal.
      * @param modalElementOrId
      * @param options
      */
    def close(): Unit = js.native
    def close(modalElementOrId: String): Unit = js.native
    def close(modalElementOrId: String, options: EinsModalOptions): Unit = js.native
    def close(modalElementOrId: Unit, options: EinsModalOptions): Unit = js.native
    def close(modalElementOrId: HTMLElement): Unit = js.native
    def close(modalElementOrId: HTMLElement, options: EinsModalOptions): Unit = js.native
    def close(modalElementOrId: JQuery): Unit = js.native
    def close(modalElementOrId: JQuery, options: EinsModalOptions): Unit = js.native
    
    /**
      * Get a list of all open modal objects
      */
    def getOpenModals(): js.Array[Any | HTMLElement | JQuery] = js.native
    
    /**
      * Check if modal is open
      * @param modalElementOrId
      */
    def isOpen(modalElementOrId: String): Boolean = js.native
    def isOpen(modalElementOrId: HTMLElement): Boolean = js.native
    
    /**
      * Open a modal.
      * @param modalElementOrId
      * @param options
      */
    def open(modalElementOrId: String): Unit = js.native
    def open(modalElementOrId: String, options: EinsModalOptions): Unit = js.native
    def open(modalElementOrId: HTMLElement): Unit = js.native
    def open(modalElementOrId: HTMLElement, options: EinsModalOptions): Unit = js.native
    def open(modalElementOrId: JQuery): Unit = js.native
    def open(modalElementOrId: JQuery, options: EinsModalOptions): Unit = js.native
    
    /**
      * Remove all event listeners from an element.
      * @param triggerElementOrId
      */
    def removeButton(triggerElementOrId: String): Unit = js.native
    def removeButton(triggerElementOrId: HTMLElement): Unit = js.native
    def removeButton(triggerElementOrId: JQuery): Unit = js.native
    
    /**
      * Override default options.
      * @param options
      */
    def setDefaultOptions(options: EinsModalOptions): Unit = js.native
  }
  
  trait EinsModalOptions extends StObject {
    
    /**
      * Close modal with click/ touch on backdrop
      * @default false
      */
    var backdropClose: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Duration it takes to close the modal in milliseconds
      * @default 200
      */
    var closeDuration: js.UndefOr[Double] = js.undefined
    
    /**
      * Animation when closing modal
      * @default: 'expandOut'
      */
    var closeTransition: js.UndefOr[typingsJapgolly.einsModal.mod.closeTransition] = js.undefined
    
    /**
      * Enable/ Disable showing multiple modals on screen
      * @default true
      */
    var multiple: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Duration it takes to open the modal in milliseconds
      * @default: 400
      */
    var openDuration: js.UndefOr[Double] = js.undefined
    
    /**
      * Animation when opening modal
      * @default 'bounceIn'
      */
    var openTransition: js.UndefOr[typingsJapgolly.einsModal.mod.openTransition] = js.undefined
    
    /**
      * Wait for next action (open/close) before opening modal
      * @default true
      */
    @JSName("wait")
    var wait_FEinsModalOptions: js.UndefOr[Boolean] = js.undefined
  }
  object EinsModalOptions {
    
    inline def apply(): EinsModalOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EinsModalOptions]
    }
    
    extension [Self <: EinsModalOptions](x: Self) {
      
      inline def setBackdropClose(value: Boolean): Self = StObject.set(x, "backdropClose", value.asInstanceOf[js.Any])
      
      inline def setBackdropCloseUndefined: Self = StObject.set(x, "backdropClose", js.undefined)
      
      inline def setCloseDuration(value: Double): Self = StObject.set(x, "closeDuration", value.asInstanceOf[js.Any])
      
      inline def setCloseDurationUndefined: Self = StObject.set(x, "closeDuration", js.undefined)
      
      inline def setCloseTransition(value: closeTransition): Self = StObject.set(x, "closeTransition", value.asInstanceOf[js.Any])
      
      inline def setCloseTransitionUndefined: Self = StObject.set(x, "closeTransition", js.undefined)
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      inline def setOpenDuration(value: Double): Self = StObject.set(x, "openDuration", value.asInstanceOf[js.Any])
      
      inline def setOpenDurationUndefined: Self = StObject.set(x, "openDuration", js.undefined)
      
      inline def setOpenTransition(value: openTransition): Self = StObject.set(x, "openTransition", value.asInstanceOf[js.Any])
      
      inline def setOpenTransitionUndefined: Self = StObject.set(x, "openTransition", js.undefined)
      
      inline def setWait_(value: Boolean): Self = StObject.set(x, "wait", value.asInstanceOf[js.Any])
      
      inline def setWait_Undefined: Self = StObject.set(x, "wait", js.undefined)
    }
  }
  
  type ModalFunction = js.Function2[/* action */ show | hide | toggle, /* options */ js.UndefOr[EinsModalOptions], Unit]
  
  type _To = EinsModal
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: EinsModal = default
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.einsModal.einsModalStrings.fadeOut
    - typingsJapgolly.einsModal.einsModalStrings.flipXOut
    - typingsJapgolly.einsModal.einsModalStrings.flipYOut
    - typingsJapgolly.einsModal.einsModalStrings.flipBounceXOut
    - typingsJapgolly.einsModal.einsModalStrings.flipBounceYOut
    - typingsJapgolly.einsModal.einsModalStrings.swoopOut
    - typingsJapgolly.einsModal.einsModalStrings.whirlOut
    - typingsJapgolly.einsModal.einsModalStrings.shrinkOut
    - typingsJapgolly.einsModal.einsModalStrings.expandOut
    - typingsJapgolly.einsModal.einsModalStrings.bounceOut
    - typingsJapgolly.einsModal.einsModalStrings.bounceUpOut
    - typingsJapgolly.einsModal.einsModalStrings.bounceDownOut
    - typingsJapgolly.einsModal.einsModalStrings.bounceLeftOut
    - typingsJapgolly.einsModal.einsModalStrings.bounceRightOut
    - typingsJapgolly.einsModal.einsModalStrings.slideUpOut
    - typingsJapgolly.einsModal.einsModalStrings.slideDownOut
    - typingsJapgolly.einsModal.einsModalStrings.slideLeftOut
    - typingsJapgolly.einsModal.einsModalStrings.slideUpBigOut
    - typingsJapgolly.einsModal.einsModalStrings.slideDownBigOut
    - typingsJapgolly.einsModal.einsModalStrings.slideLeftBigOut
    - typingsJapgolly.einsModal.einsModalStrings.slideRightBigOut
    - typingsJapgolly.einsModal.einsModalStrings.perspectiveUpOut
    - typingsJapgolly.einsModal.einsModalStrings.perspectiveDownOut
    - typingsJapgolly.einsModal.einsModalStrings.perspectiveLeftOut
    - typingsJapgolly.einsModal.einsModalStrings.perspectiveRightOut
  */
  trait closeTransition extends StObject
  object closeTransition {
    
    inline def bounceDownOut: typingsJapgolly.einsModal.einsModalStrings.bounceDownOut = "bounceDownOut".asInstanceOf[typingsJapgolly.einsModal.einsModalStrings.bounceDownOut]
    
    inline def bounceLeftOut: typingsJapgolly.einsModal.einsModalStrings.bounceLeftOut = "bounceLeftOut".asInstanceOf[typingsJapgolly.einsModal.einsModalStrings.bounceLeftOut]
    
    inline def bounceOut: typingsJapgolly.einsModal.einsModalStrings.bounceOut = "bounceOut".asInstanceOf[typingsJapgolly.einsModal.einsModalStrings.bounceOut]
    
    inline def bounceRightOut: typingsJapgolly.einsModal.einsModalStrings.bounceRightOut = "bounceRightOut".asInstanceOf[typingsJapgolly.einsModal.einsModalStrings.bounceRightOut]
    
    inline def bounceUpOut: typingsJapgolly.einsModal.einsModalStrings.bounceUpOut = "bounceUpOut".asInstanceOf[typingsJapgolly.einsModal.einsModalStrings.bounceUpOut]
    
    inline def expandOut: typingsJapgolly.einsModal.einsModalStrings.expandOut = "expandOut".asInstanceOf[typingsJapgolly.einsModal.einsModalStrings.expandOut]
    
    inline def fadeOut: typingsJapgolly.einsModal.einsModalStrings.fadeOut = "fadeOut".asInstanceOf[typingsJapgolly.einsModal.einsModalStrings.fadeOut]
    
    inline def flipBounceXOut: typingsJapgolly.einsModal.einsModalStrings.flipBounceXOut = "flipBounceXOut".asInstanceOf[typingsJapgolly.einsModal.einsModalStrings.flipBounceXOut]
    
    inline def flipBounceYOut: typingsJapgolly.einsModal.einsModalStrings.flipBounceYOut = "flipBounceYOut".asInstanceOf[typingsJapgolly.einsModal.einsModalStrings.flipBounceYOut]
    
    inline def flipXOut: typingsJapgolly.einsModal.einsModalStrings.flipXOut = "flipXOut".asInstanceOf[typingsJapgolly.einsModal.einsModalStrings.flipXOut]
    
    inline def flipYOut: typingsJapgolly.einsModal.einsModalStrings.flipYOut = "flipYOut".asInstanceOf[typingsJapgolly.einsModal.einsModalStrings.flipYOut]
    
    inline def perspectiveDownOut: typingsJapgolly.einsModal.einsModalStrings.perspectiveDownOut = "perspectiveDownOut".asInstanceOf[typingsJapgolly.einsModal.einsModalStrings.perspectiveDownOut]
    
    inline def perspectiveLeftOut: typingsJapgolly.einsModal.einsModalStrings.perspectiveLeftOut = "perspectiveLeftOut".asInstanceOf[typingsJapgolly.einsModal.einsModalStrings.perspectiveLeftOut]
    
    inline def perspectiveRightOut: typingsJapgolly.einsModal.einsModalStrings.perspectiveRightOut = "perspectiveRightOut".asInstanceOf[typingsJapgolly.einsModal.einsModalStrings.perspectiveRightOut]
    
    inline def perspectiveUpOut: typingsJapgolly.einsModal.einsModalStrings.perspectiveUpOut = "perspectiveUpOut".asInstanceOf[typingsJapgolly.einsModal.einsModalStrings.perspectiveUpOut]
    
    inline def shrinkOut: typingsJapgolly.einsModal.einsModalStrings.shrinkOut = "shrinkOut".asInstanceOf[typingsJapgolly.einsModal.einsModalStrings.shrinkOut]
    
    inline def slideDownBigOut: typingsJapgolly.einsModal.einsModalStrings.slideDownBigOut = "slideDownBigOut".asInstanceOf[typingsJapgolly.einsModal.einsModalStrings.slideDownBigOut]
    
    inline def slideDownOut: typingsJapgolly.einsModal.einsModalStrings.slideDownOut = "slideDownOut".asInstanceOf[typingsJapgolly.einsModal.einsModalStrings.slideDownOut]
    
    inline def slideLeftBigOut: typingsJapgolly.einsModal.einsModalStrings.slideLeftBigOut = "slideLeftBigOut".asInstanceOf[typingsJapgolly.einsModal.einsModalStrings.slideLeftBigOut]
    
    inline def slideLeftOut: typingsJapgolly.einsModal.einsModalStrings.slideLeftOut = "slideLeftOut".asInstanceOf[typingsJapgolly.einsModal.einsModalStrings.slideLeftOut]
    
    inline def slideRightBigOut: typingsJapgolly.einsModal.einsModalStrings.slideRightBigOut = "slideRightBigOut".asInstanceOf[typingsJapgolly.einsModal.einsModalStrings.slideRightBigOut]
    
    inline def slideUpBigOut: typingsJapgolly.einsModal.einsModalStrings.slideUpBigOut = "slideUpBigOut".asInstanceOf[typingsJapgolly.einsModal.einsModalStrings.slideUpBigOut]
    
    inline def slideUpOut: typingsJapgolly.einsModal.einsModalStrings.slideUpOut = "slideUpOut".asInstanceOf[typingsJapgolly.einsModal.einsModalStrings.slideUpOut]
    
    inline def swoopOut: typingsJapgolly.einsModal.einsModalStrings.swoopOut = "swoopOut".asInstanceOf[typingsJapgolly.einsModal.einsModalStrings.swoopOut]
    
    inline def whirlOut: typingsJapgolly.einsModal.einsModalStrings.whirlOut = "whirlOut".asInstanceOf[typingsJapgolly.einsModal.einsModalStrings.whirlOut]
  }
  
  object global {
    
    trait HTMLElement extends StObject {
      
      var modal: js.UndefOr[ModalFunction] = js.undefined
    }
    object HTMLElement {
      
      inline def apply(): HTMLElement = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[HTMLElement]
      }
      
      extension [Self <: HTMLElement](x: Self) {
        
        inline def setModal(value: (/* action */ show | hide | toggle, /* options */ js.UndefOr[EinsModalOptions]) => Callback): Self = StObject.set(x, "modal", js.Any.fromFunction2((t0: /* action */ show | hide | toggle, t1: /* options */ js.UndefOr[EinsModalOptions]) => (value(t0, t1)).runNow()))
        
        inline def setModalUndefined: Self = StObject.set(x, "modal", js.undefined)
      }
    }
    
    trait JQuery extends StObject {
      
      var modal: js.UndefOr[ModalFunction] = js.undefined
    }
    object JQuery {
      
      inline def apply(): JQuery = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[JQuery]
      }
      
      extension [Self <: JQuery](x: Self) {
        
        inline def setModal(value: (/* action */ show | hide | toggle, /* options */ js.UndefOr[EinsModalOptions]) => Callback): Self = StObject.set(x, "modal", js.Any.fromFunction2((t0: /* action */ show | hide | toggle, t1: /* options */ js.UndefOr[EinsModalOptions]) => (value(t0, t1)).runNow()))
        
        inline def setModalUndefined: Self = StObject.set(x, "modal", js.undefined)
      }
    }
    
    trait Window extends StObject {
      
      var einsModal: EinsModal
    }
    object Window {
      
      inline def apply(einsModal: EinsModal): Window = {
        val __obj = js.Dynamic.literal(einsModal = einsModal.asInstanceOf[js.Any])
        __obj.asInstanceOf[Window]
      }
      
      extension [Self <: Window](x: Self) {
        
        inline def setEinsModal(value: EinsModal): Self = StObject.set(x, "einsModal", value.asInstanceOf[js.Any])
      }
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.einsModal.einsModalStrings.fadeIn
    - typingsJapgolly.einsModal.einsModalStrings.flipXIn
    - typingsJapgolly.einsModal.einsModalStrings.flipYIn
    - typingsJapgolly.einsModal.einsModalStrings.flipBounceXIn
    - typingsJapgolly.einsModal.einsModalStrings.flipBounceYIn
    - typingsJapgolly.einsModal.einsModalStrings.swoopIn
    - typingsJapgolly.einsModal.einsModalStrings.whirlIn
    - typingsJapgolly.einsModal.einsModalStrings.shrinkIn
    - typingsJapgolly.einsModal.einsModalStrings.expandIn
    - typingsJapgolly.einsModal.einsModalStrings.bounceIn
    - typingsJapgolly.einsModal.einsModalStrings.bounceUpIn
    - typingsJapgolly.einsModal.einsModalStrings.bounceDownIn
    - typingsJapgolly.einsModal.einsModalStrings.bounceLeftIn
    - typingsJapgolly.einsModal.einsModalStrings.bounceRightIn
    - typingsJapgolly.einsModal.einsModalStrings.slideUpIn
    - typingsJapgolly.einsModal.einsModalStrings.slideDownIn
    - typingsJapgolly.einsModal.einsModalStrings.slideLeftIn
    - typingsJapgolly.einsModal.einsModalStrings.slideUpBigIn
    - typingsJapgolly.einsModal.einsModalStrings.slideDownBigIn
    - typingsJapgolly.einsModal.einsModalStrings.slideLeftBigIn
    - typingsJapgolly.einsModal.einsModalStrings.slideRightBigIn
    - typingsJapgolly.einsModal.einsModalStrings.perspectiveUpIn
    - typingsJapgolly.einsModal.einsModalStrings.perspectiveDownIn
    - typingsJapgolly.einsModal.einsModalStrings.perspectiveLeftIn
    - typingsJapgolly.einsModal.einsModalStrings.perspectiveRightIn
  */
  trait openTransition extends StObject
  object openTransition {
    
    inline def bounceDownIn: typingsJapgolly.einsModal.einsModalStrings.bounceDownIn = "bounceDownIn".asInstanceOf[typingsJapgolly.einsModal.einsModalStrings.bounceDownIn]
    
    inline def bounceIn: typingsJapgolly.einsModal.einsModalStrings.bounceIn = "bounceIn".asInstanceOf[typingsJapgolly.einsModal.einsModalStrings.bounceIn]
    
    inline def bounceLeftIn: typingsJapgolly.einsModal.einsModalStrings.bounceLeftIn = "bounceLeftIn".asInstanceOf[typingsJapgolly.einsModal.einsModalStrings.bounceLeftIn]
    
    inline def bounceRightIn: typingsJapgolly.einsModal.einsModalStrings.bounceRightIn = "bounceRightIn".asInstanceOf[typingsJapgolly.einsModal.einsModalStrings.bounceRightIn]
    
    inline def bounceUpIn: typingsJapgolly.einsModal.einsModalStrings.bounceUpIn = "bounceUpIn".asInstanceOf[typingsJapgolly.einsModal.einsModalStrings.bounceUpIn]
    
    inline def expandIn: typingsJapgolly.einsModal.einsModalStrings.expandIn = "expandIn".asInstanceOf[typingsJapgolly.einsModal.einsModalStrings.expandIn]
    
    inline def fadeIn: typingsJapgolly.einsModal.einsModalStrings.fadeIn = "fadeIn".asInstanceOf[typingsJapgolly.einsModal.einsModalStrings.fadeIn]
    
    inline def flipBounceXIn: typingsJapgolly.einsModal.einsModalStrings.flipBounceXIn = "flipBounceXIn".asInstanceOf[typingsJapgolly.einsModal.einsModalStrings.flipBounceXIn]
    
    inline def flipBounceYIn: typingsJapgolly.einsModal.einsModalStrings.flipBounceYIn = "flipBounceYIn".asInstanceOf[typingsJapgolly.einsModal.einsModalStrings.flipBounceYIn]
    
    inline def flipXIn: typingsJapgolly.einsModal.einsModalStrings.flipXIn = "flipXIn".asInstanceOf[typingsJapgolly.einsModal.einsModalStrings.flipXIn]
    
    inline def flipYIn: typingsJapgolly.einsModal.einsModalStrings.flipYIn = "flipYIn".asInstanceOf[typingsJapgolly.einsModal.einsModalStrings.flipYIn]
    
    inline def perspectiveDownIn: typingsJapgolly.einsModal.einsModalStrings.perspectiveDownIn = "perspectiveDownIn".asInstanceOf[typingsJapgolly.einsModal.einsModalStrings.perspectiveDownIn]
    
    inline def perspectiveLeftIn: typingsJapgolly.einsModal.einsModalStrings.perspectiveLeftIn = "perspectiveLeftIn".asInstanceOf[typingsJapgolly.einsModal.einsModalStrings.perspectiveLeftIn]
    
    inline def perspectiveRightIn: typingsJapgolly.einsModal.einsModalStrings.perspectiveRightIn = "perspectiveRightIn".asInstanceOf[typingsJapgolly.einsModal.einsModalStrings.perspectiveRightIn]
    
    inline def perspectiveUpIn: typingsJapgolly.einsModal.einsModalStrings.perspectiveUpIn = "perspectiveUpIn".asInstanceOf[typingsJapgolly.einsModal.einsModalStrings.perspectiveUpIn]
    
    inline def shrinkIn: typingsJapgolly.einsModal.einsModalStrings.shrinkIn = "shrinkIn".asInstanceOf[typingsJapgolly.einsModal.einsModalStrings.shrinkIn]
    
    inline def slideDownBigIn: typingsJapgolly.einsModal.einsModalStrings.slideDownBigIn = "slideDownBigIn".asInstanceOf[typingsJapgolly.einsModal.einsModalStrings.slideDownBigIn]
    
    inline def slideDownIn: typingsJapgolly.einsModal.einsModalStrings.slideDownIn = "slideDownIn".asInstanceOf[typingsJapgolly.einsModal.einsModalStrings.slideDownIn]
    
    inline def slideLeftBigIn: typingsJapgolly.einsModal.einsModalStrings.slideLeftBigIn = "slideLeftBigIn".asInstanceOf[typingsJapgolly.einsModal.einsModalStrings.slideLeftBigIn]
    
    inline def slideLeftIn: typingsJapgolly.einsModal.einsModalStrings.slideLeftIn = "slideLeftIn".asInstanceOf[typingsJapgolly.einsModal.einsModalStrings.slideLeftIn]
    
    inline def slideRightBigIn: typingsJapgolly.einsModal.einsModalStrings.slideRightBigIn = "slideRightBigIn".asInstanceOf[typingsJapgolly.einsModal.einsModalStrings.slideRightBigIn]
    
    inline def slideUpBigIn: typingsJapgolly.einsModal.einsModalStrings.slideUpBigIn = "slideUpBigIn".asInstanceOf[typingsJapgolly.einsModal.einsModalStrings.slideUpBigIn]
    
    inline def slideUpIn: typingsJapgolly.einsModal.einsModalStrings.slideUpIn = "slideUpIn".asInstanceOf[typingsJapgolly.einsModal.einsModalStrings.slideUpIn]
    
    inline def swoopIn: typingsJapgolly.einsModal.einsModalStrings.swoopIn = "swoopIn".asInstanceOf[typingsJapgolly.einsModal.einsModalStrings.swoopIn]
    
    inline def whirlIn: typingsJapgolly.einsModal.einsModalStrings.whirlIn = "whirlIn".asInstanceOf[typingsJapgolly.einsModal.einsModalStrings.whirlIn]
  }
}
