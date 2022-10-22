package typingsJapgolly.ionicCore

import org.scalajs.dom.CustomEvent
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import typingsJapgolly.ionicCore.distTypesComponentsMenuMenuInterfaceMod.MenuChangeEventDetail
import typingsJapgolly.ionicCore.distTypesComponentsMenuMenuInterfaceMod.MenuI
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.ComponentInterface
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsMenuMenuMod {
  
  @JSImport("@ionic/core/dist/types/components/menu/menu", "Menu")
  @js.native
  open class Menu ()
    extends StObject
       with ComponentInterface
       with MenuI {
    
    /* private */ var _isActive: Any = js.native
    
    /* private */ var afterAnimation: Any = js.native
    
    /* private */ var animation: Any = js.native
    
    /* private */ var beforeAnimation: Any = js.native
    
    /* private */ var blocker: Any = js.native
    
    /* private */ var canStart: Any = js.native
    
    /* private */ var canSwipe: Any = js.native
    
    @JSName("componentDidLoad")
    def componentDidLoad_MMenu(): js.Promise[Unit] = js.native
    
    @JSName("componentWillLoad")
    def componentWillLoad_MMenu(): Unit = js.native
    
    @JSName("connectedCallback")
    def connectedCallback_MMenu(): js.Promise[Unit] = js.native
    
    /**
      * The `id` of the main content. When using
      * a router this is typically `ion-router-outlet`.
      * When not using a router, this is typically
      * your main view's `ion-content`. This is not the
      * id of the `ion-content` inside of your `ion-menu`.
      */
    var contentId: js.UndefOr[String] = js.native
    
    /* protected */ def disabledChanged(): Unit = js.native
    
    @JSName("disconnectedCallback")
    def disconnectedCallback_MMenu(): Unit = js.native
    
    /* private */ var focusFirstDescendant: Any = js.native
    
    /* private */ var focusLastDescendant: Any = js.native
    
    /* private */ var forceClosing: Any = js.native
    
    /* private */ var gesture: Any = js.native
    
    /* private */ var handleFocus: Any = js.native
    
    /* private */ var inheritedAttributes: Any = js.native
    
    /**
      * Emitted when the menu is closed.
      */
    var ionDidClose: EventEmitter[Unit] = js.native
    
    /**
      * Emitted when the menu is open.
      */
    var ionDidOpen: EventEmitter[Unit] = js.native
    
    /**
      * Emitted when the menu state is changed.
      * @internal
      */
    /* protected */ var ionMenuChange: EventEmitter[MenuChangeEventDetail] = js.native
    
    /**
      * Emitted when the menu is about to be closed.
      */
    var ionWillClose: EventEmitter[Unit] = js.native
    
    /**
      * Emitted when the menu is about to be opened.
      */
    var ionWillOpen: EventEmitter[Unit] = js.native
    
    /**
      * Returns `true` is the menu is open.
      */
    def isOpen(): js.Promise[Boolean] = js.native
    
    var isPaneVisible: Boolean = js.native
    
    var lastFocus: js.UndefOr[HTMLElement] = js.native
    
    /* private */ var lastOnEnd: Any = js.native
    
    /* private */ var loadAnimation: Any = js.native
    
    /**
      * The edge threshold for dragging the menu open.
      * If a drag/swipe happens over this value, the menu is not triggered.
      */
    var maxEdgeStart: Double = js.native
    
    def onBackdropClick(ev: Any): Unit = js.native
    
    /* private */ var onEnd: Any = js.native
    
    def onKeydown(ev: KeyboardEvent): Unit = js.native
    
    /* private */ var onMove: Any = js.native
    
    def onSplitPaneChanged(ev: CustomEvent): Unit = js.native
    
    /* private */ var onStart: Any = js.native
    
    /* private */ var onWillStart: Any = js.native
    
    @JSName("render")
    def render_MMenu(): Any = js.native
    
    /* protected */ def sideChanged(): Unit = js.native
    
    /* private */ var startAnimation: Any = js.native
    
    /**
      * If `true`, swiping the menu is enabled.
      */
    var swipeGesture: Boolean = js.native
    
    /* protected */ def swipeGestureChanged(): Unit = js.native
    
    /* private */ var trapKeyboardFocus: Any = js.native
    
    /**
      * The display type of the menu.
      * Available options: `"overlay"`, `"reveal"`, `"push"`.
      */
    var `type`: js.UndefOr[String] = js.native
    
    def typeChanged(`type`: String): Unit = js.native
    def typeChanged(`type`: String, oldType: String): Unit = js.native
    
    /* private */ var updateState: Any = js.native
  }
}
