package typingsJapgolly.materialDialog

import org.scalajs.dom.HTMLElement
import typingsJapgolly.materialBase.Element
import typingsJapgolly.materialDialog.anon.PartialMDCDialogAdapter
import typingsJapgolly.materialDialog.utilMod.MDCDialogFocusTrapFactory
import typingsJapgolly.materialDom.focusTrapMod.FocusTrap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@material/dialog", JSImport.Default)
  @js.native
  open class default ()
    extends typingsJapgolly.materialDialog.foundationMod.default {
    def this(adapter: PartialMDCDialogAdapter) = this()
  }
  
  @JSImport("@material/dialog", "MDCDialog")
  @js.native
  open class MDCDialog protected ()
    extends typingsJapgolly.materialDialog.componentMod.MDCDialog {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(
      root: Element,
      foundation: typingsJapgolly.materialDialog.foundationMod.MDCDialogFoundation,
      args: Any*
    ) = this()
  }
  /* static members */
  object MDCDialog {
    
    @JSImport("@material/dialog", "MDCDialog")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: org.scalajs.dom.Element): typingsJapgolly.materialDialog.componentMod.MDCDialog = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.materialDialog.componentMod.MDCDialog]
  }
  
  @JSImport("@material/dialog", "MDCDialogFoundation")
  @js.native
  open class MDCDialogFoundation ()
    extends typingsJapgolly.materialDialog.foundationMod.MDCDialogFoundation {
    def this(adapter: PartialMDCDialogAdapter) = this()
  }
  
  object cssClasses {
    
    @JSImport("@material/dialog", "cssClasses")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/dialog", "cssClasses.CLOSING")
    @js.native
    def CLOSING: String = js.native
    inline def CLOSING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOSING")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/dialog", "cssClasses.FULLSCREEN")
    @js.native
    def FULLSCREEN: String = js.native
    inline def FULLSCREEN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FULLSCREEN")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/dialog", "cssClasses.OPEN")
    @js.native
    def OPEN: String = js.native
    
    @JSImport("@material/dialog", "cssClasses.OPENING")
    @js.native
    def OPENING: String = js.native
    inline def OPENING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPENING")(x.asInstanceOf[js.Any])
    
    inline def OPEN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPEN")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/dialog", "cssClasses.SCRIM_HIDDEN")
    @js.native
    def SCRIM_HIDDEN: String = js.native
    inline def SCRIM_HIDDEN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SCRIM_HIDDEN")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/dialog", "cssClasses.SCROLLABLE")
    @js.native
    def SCROLLABLE: String = js.native
    inline def SCROLLABLE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SCROLLABLE")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/dialog", "cssClasses.SCROLL_DIVIDER_FOOTER")
    @js.native
    def SCROLL_DIVIDER_FOOTER: String = js.native
    inline def SCROLL_DIVIDER_FOOTER_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SCROLL_DIVIDER_FOOTER")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/dialog", "cssClasses.SCROLL_DIVIDER_HEADER")
    @js.native
    def SCROLL_DIVIDER_HEADER: String = js.native
    inline def SCROLL_DIVIDER_HEADER_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SCROLL_DIVIDER_HEADER")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/dialog", "cssClasses.SCROLL_LOCK")
    @js.native
    def SCROLL_LOCK: String = js.native
    inline def SCROLL_LOCK_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SCROLL_LOCK")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/dialog", "cssClasses.STACKED")
    @js.native
    def STACKED: String = js.native
    inline def STACKED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STACKED")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/dialog", "cssClasses.SURFACE_SCRIM_HIDING")
    @js.native
    def SURFACE_SCRIM_HIDING: String = js.native
    inline def SURFACE_SCRIM_HIDING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SURFACE_SCRIM_HIDING")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/dialog", "cssClasses.SURFACE_SCRIM_SHOWING")
    @js.native
    def SURFACE_SCRIM_SHOWING: String = js.native
    inline def SURFACE_SCRIM_SHOWING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SURFACE_SCRIM_SHOWING")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/dialog", "cssClasses.SURFACE_SCRIM_SHOWN")
    @js.native
    def SURFACE_SCRIM_SHOWN: String = js.native
    inline def SURFACE_SCRIM_SHOWN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SURFACE_SCRIM_SHOWN")(x.asInstanceOf[js.Any])
  }
  
  object numbers {
    
    @JSImport("@material/dialog", "numbers")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/dialog", "numbers.DIALOG_ANIMATION_CLOSE_TIME_MS")
    @js.native
    def DIALOG_ANIMATION_CLOSE_TIME_MS: Double = js.native
    inline def DIALOG_ANIMATION_CLOSE_TIME_MS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DIALOG_ANIMATION_CLOSE_TIME_MS")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/dialog", "numbers.DIALOG_ANIMATION_OPEN_TIME_MS")
    @js.native
    def DIALOG_ANIMATION_OPEN_TIME_MS: Double = js.native
    inline def DIALOG_ANIMATION_OPEN_TIME_MS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DIALOG_ANIMATION_OPEN_TIME_MS")(x.asInstanceOf[js.Any])
  }
  
  object strings {
    
    @JSImport("@material/dialog", "strings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/dialog", "strings.ACTION_ATTRIBUTE")
    @js.native
    def ACTION_ATTRIBUTE: String = js.native
    inline def ACTION_ATTRIBUTE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ACTION_ATTRIBUTE")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/dialog", "strings.BUTTON_DEFAULT_ATTRIBUTE")
    @js.native
    def BUTTON_DEFAULT_ATTRIBUTE: String = js.native
    inline def BUTTON_DEFAULT_ATTRIBUTE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BUTTON_DEFAULT_ATTRIBUTE")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/dialog", "strings.BUTTON_SELECTOR")
    @js.native
    def BUTTON_SELECTOR: String = js.native
    inline def BUTTON_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BUTTON_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/dialog", "strings.CLOSED_EVENT")
    @js.native
    def CLOSED_EVENT: String = js.native
    inline def CLOSED_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOSED_EVENT")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/dialog", "strings.CLOSE_ACTION")
    @js.native
    def CLOSE_ACTION: String = js.native
    inline def CLOSE_ACTION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOSE_ACTION")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/dialog", "strings.CLOSING_EVENT")
    @js.native
    def CLOSING_EVENT: String = js.native
    inline def CLOSING_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOSING_EVENT")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/dialog", "strings.CONTAINER_SELECTOR")
    @js.native
    def CONTAINER_SELECTOR: String = js.native
    inline def CONTAINER_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONTAINER_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/dialog", "strings.CONTENT_SELECTOR")
    @js.native
    def CONTENT_SELECTOR: String = js.native
    inline def CONTENT_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONTENT_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/dialog", "strings.DESTROY_ACTION")
    @js.native
    def DESTROY_ACTION: String = js.native
    inline def DESTROY_ACTION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DESTROY_ACTION")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/dialog", "strings.INITIAL_FOCUS_ATTRIBUTE")
    @js.native
    def INITIAL_FOCUS_ATTRIBUTE: String = js.native
    inline def INITIAL_FOCUS_ATTRIBUTE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INITIAL_FOCUS_ATTRIBUTE")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/dialog", "strings.OPENED_EVENT")
    @js.native
    def OPENED_EVENT: String = js.native
    inline def OPENED_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPENED_EVENT")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/dialog", "strings.OPENING_EVENT")
    @js.native
    def OPENING_EVENT: String = js.native
    inline def OPENING_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPENING_EVENT")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/dialog", "strings.SCRIM_SELECTOR")
    @js.native
    def SCRIM_SELECTOR: String = js.native
    inline def SCRIM_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SCRIM_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/dialog", "strings.SUPPRESS_DEFAULT_PRESS_SELECTOR")
    @js.native
    def SUPPRESS_DEFAULT_PRESS_SELECTOR: String = js.native
    inline def SUPPRESS_DEFAULT_PRESS_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SUPPRESS_DEFAULT_PRESS_SELECTOR")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/dialog", "strings.SURFACE_SELECTOR")
    @js.native
    def SURFACE_SELECTOR: String = js.native
    inline def SURFACE_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SURFACE_SELECTOR")(x.asInstanceOf[js.Any])
  }
  
  object util {
    
    @JSImport("@material/dialog", "util")
    @js.native
    val ^ : js.Any = js.native
    
    inline def areTopsMisaligned(els: js.Array[HTMLElement]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("areTopsMisaligned")(els.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def createFocusTrapInstance(surfaceEl: HTMLElement, focusTrapFactory: MDCDialogFocusTrapFactory): FocusTrap = (^.asInstanceOf[js.Dynamic].applyDynamic("createFocusTrapInstance")(surfaceEl.asInstanceOf[js.Any], focusTrapFactory.asInstanceOf[js.Any])).asInstanceOf[FocusTrap]
    inline def createFocusTrapInstance(surfaceEl: HTMLElement, focusTrapFactory: MDCDialogFocusTrapFactory, initialFocusEl: HTMLElement): FocusTrap = (^.asInstanceOf[js.Dynamic].applyDynamic("createFocusTrapInstance")(surfaceEl.asInstanceOf[js.Any], focusTrapFactory.asInstanceOf[js.Any], initialFocusEl.asInstanceOf[js.Any])).asInstanceOf[FocusTrap]
    
    inline def isScrollAtBottom(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isScrollAtBottom")().asInstanceOf[Boolean]
    inline def isScrollAtBottom(el: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isScrollAtBottom")(el.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isScrollAtTop(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isScrollAtTop")().asInstanceOf[Boolean]
    inline def isScrollAtTop(el: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isScrollAtTop")(el.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isScrollable(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isScrollable")().asInstanceOf[Boolean]
    inline def isScrollable(el: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isScrollable")(el.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
}
