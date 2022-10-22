package typingsJapgolly.ionicCore

import org.scalajs.dom.CustomEvent
import org.scalajs.dom.HTMLElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonPopoverElement
import typingsJapgolly.ionicCore.distTypesComponentsPopoverPopoverInterfaceMod.PopoverAttributes
import typingsJapgolly.ionicCore.distTypesComponentsPopoverPopoverInterfaceMod.PopoverInterface
import typingsJapgolly.ionicCore.distTypesComponentsPopoverPopoverInterfaceMod.PopoverSize
import typingsJapgolly.ionicCore.distTypesComponentsPopoverPopoverInterfaceMod.PositionAlign
import typingsJapgolly.ionicCore.distTypesComponentsPopoverPopoverInterfaceMod.PositionReference
import typingsJapgolly.ionicCore.distTypesComponentsPopoverPopoverInterfaceMod.PositionSide
import typingsJapgolly.ionicCore.distTypesComponentsPopoverPopoverInterfaceMod.TriggerAction
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.ComponentInterface
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.EventEmitter
import typingsJapgolly.ionicCore.distTypesUtilsOverlaysInterfaceMod.OverlayEventDetail
import typingsJapgolly.ionicCore.mod.ComponentProps
import typingsJapgolly.ionicCore.mod.ComponentRef
import typingsJapgolly.ionicCore.mod.FrameworkDelegate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsPopoverPopoverMod {
  
  @JSImport("@ionic/core/dist/types/components/popover/popover", "Popover")
  @js.native
  open class Popover ()
    extends StObject
       with ComponentInterface
       with PopoverInterface {
    
    /**
      * Describes how to align the popover content with the `reference` point.
      * Defaults to `'center'` for `ios` mode, and `'start'` for `md` mode.
      */
    var alignment: js.UndefOr[PositionAlign] = js.native
    
    /**
      * If `true`, the popover will display an arrow that points at the
      * `reference` when running in `ios` mode. Does not apply in `md` mode.
      */
    var arrow: Boolean = js.native
    
    /**
      * If `true`, the popover will be dismissed when the backdrop is clicked.
      */
    var backdropDismiss: Boolean = js.native
    
    /**
      * The component to display inside of the popover.
      * You only need to use this if you are not using
      * a JavaScript framework. Otherwise, you can just
      * slot your component inside of `ion-popover`.
      */
    var component: js.UndefOr[ComponentRef] = js.native
    
    @JSName("componentDidLoad")
    def componentDidLoad_MPopover(): Unit = js.native
    
    /**
      * The data to pass to the popover component.
      * You only need to use this if you are not using
      * a JavaScript framework. Otherwise, you can just
      * set the props directly on your component.
      */
    var componentProps: js.UndefOr[ComponentProps[Null]] = js.native
    
    @JSName("componentWillLoad")
    def componentWillLoad_MPopover(): Unit = js.native
    
    /* private */ var configureDismissInteraction: Any = js.native
    
    /* private */ var configureKeyboardInteraction: Any = js.native
    
    /* private */ var configureTriggerInteraction: Any = js.native
    
    @JSName("connectedCallback")
    def connectedCallback_MPopover(): Unit = js.native
    
    /* private */ var coreDelegate: Any = js.native
    
    /**
      * Additional classes to apply for custom CSS. If multiple classes are
      * provided they should be separated by spaces.
      * @internal
      */
    var cssClass: js.UndefOr[String | js.Array[String]] = js.native
    
    /* private */ var currentTransition: Any = js.native
    
    /** @internal */
    var delegate: js.UndefOr[FrameworkDelegate] = js.native
    
    /* private */ var destroyDismissInteraction: Any = js.native
    
    /* private */ var destroyKeyboardInteraction: Any = js.native
    
    /* private */ var destroyTriggerInteraction: Any = js.native
    
    /**
      * Emitted after the popover has dismissed.
      * Shorthand for ionPopoverDidDismiss.
      */
    @JSName("didDismissShorthand")
    var didDismissShorthand_Popover: EventEmitter[OverlayEventDetail[Any]] = js.native
    
    /**
      * Emitted after the popover has presented.
      * Shorthand for ionPopoverWillDismiss.
      */
    @JSName("didPresentShorthand")
    var didPresentShorthand_Popover: EventEmitter[Unit] = js.native
    
    def dismiss(data: Any, role: String, dismissParentPopover: Boolean): js.Promise[Boolean] = js.native
    def dismiss(data: Any, role: Unit, dismissParentPopover: Boolean): js.Promise[Boolean] = js.native
    def dismiss(data: Unit, role: String, dismissParentPopover: Boolean): js.Promise[Boolean] = js.native
    def dismiss(data: Unit, role: Unit, dismissParentPopover: Boolean): js.Promise[Boolean] = js.native
    
    /**
      * If `true`, the popover will be automatically
      * dismissed when the content has been clicked.
      */
    var dismissOnSelect: Boolean = js.native
    
    @JSName("el")
    var el_Popover: HTMLIonPopoverElement = js.native
    
    /**
      * The event to pass to the popover animation.
      */
    var event: Any = js.native
    
    /* private */ var focusDescendantOnPresent: Any = js.native
    
    /**
      * Determines whether or not an overlay
      * is being used inline or via a controller/JS
      * and returns the correct delegate.
      * By default, subsequent calls to getDelegate
      * will use a cached version of the delegate.
      * This is useful for calling dismiss after
      * present so that the correct delegate is given.
      */
    /* private */ var getDelegate: Any = js.native
    
    /**
      * @internal
      */
    def getParentPopover(): js.Promise[HTMLIonPopoverElement | Null] = js.native
    
    /** @internal */
    var hasController: Boolean = js.native
    
    /**
      * Additional attributes to pass to the popover.
      */
    var htmlAttributes: js.UndefOr[PopoverAttributes] = js.native
    
    /* private */ var `inline`: Any = js.native
    
    /**
      * If `true`, the popover will open. If `false`, the popover will close.
      * Use this if you need finer grained control over presentation, otherwise
      * just use the popoverController or the `trigger` property.
      * Note: `isOpen` will not automatically be set back to `false` when
      * the popover dismisses. You will need to do that in your code.
      */
    var isOpen: Boolean = js.native
    
    /**
      * If `true`, the component passed into `ion-popover` will
      * automatically be mounted when the popover is created. The
      * component will remain mounted even when the popover is dismissed.
      * However, the component will be destroyed when the popover is
      * destroyed. This property is not reactive and should only be
      * used when initially creating a popover.
      *
      * Note: This feature only applies to inline popovers in JavaScript
      * frameworks such as Angular, React, and Vue.
      */
    var keepContentsMounted: Boolean = js.native
    
    /**
      * @internal
      *
      * If `true` the popover will not register its own keyboard event handlers.
      * This allows the contents of the popover to handle their own keyboard interactions.
      *
      * If `false`, the popover will register its own keyboard event handlers for
      * navigating `ion-list` items within a popover (up/down/home/end/etc.).
      * This will also cancel browser keyboard event bindings to prevent scroll
      * behavior in a popover using a list of items.
      */
    var keyboardEvents: Boolean = js.native
    
    var lastFocus: js.UndefOr[HTMLElement] = js.native
    
    /* private */ var onBackdropTap: Any = js.native
    
    /**
      * Returns a promise that resolves when the popover did dismiss.
      */
    def onDidDismiss[T](): js.Promise[OverlayEventDetail[T]] = js.native
    
    def onIsOpenChange(newValue: Boolean, oldValue: Boolean): Unit = js.native
    
    /* private */ var onLifecycle: Any = js.native
    
    def onTriggerChange(): Unit = js.native
    
    /**
      * Returns a promise that resolves when the popover will dismiss.
      */
    def onWillDismiss[T](): js.Promise[OverlayEventDetail[T]] = js.native
    
    /* private */ var parentPopover: Any = js.native
    
    /* private */ var popoverId: Any = js.native
    
    /* private */ var popoverIndex: Any = js.native
    
    def present(event: CustomEvent): js.Promise[Unit] = js.native
    
    /**
      * When opening a popover from a trigger, we should not be
      * modifying the `event` prop from inside the component.
      * Additionally, when pressing the "Right" arrow key, we need
      * to shift focus to the first descendant in the newly presented
      * popover.
      *
      * @internal
      */
    def presentFromTrigger(): js.Promise[Unit] = js.native
    def presentFromTrigger(event: Any): js.Promise[Unit] = js.native
    def presentFromTrigger(event: Any, focusDescendant: Boolean): js.Promise[Unit] = js.native
    def presentFromTrigger(event: Unit, focusDescendant: Boolean): js.Promise[Unit] = js.native
    
    /**
      * Describes what to position the popover relative to.
      * If `'trigger'`, the popover will be positioned relative
      * to the trigger button. If passing in an event, this is
      * determined via event.target.
      * If `'event'`, the popover will be positioned relative
      * to the x/y coordinates of the trigger action. If passing
      * in an event, this is determined via event.clientX and event.clientY.
      */
    var reference: PositionReference = js.native
    
    @JSName("render")
    def render_MPopover(): Any = js.native
    
    /**
      * If `true`, a backdrop will be displayed behind the popover.
      * This property controls whether or not the backdrop
      * darkens the screen when the popover is presented.
      * It does not control whether or not the backdrop
      * is active or present in the DOM.
      */
    var showBackdrop: Boolean = js.native
    
    /**
      * Describes which side of the `reference` point to position
      * the popover on. The `'start'` and `'end'` values are RTL-aware,
      * and the `'left'` and `'right'` values are not.
      */
    var side: PositionSide = js.native
    
    /**
      * Describes how to calculate the popover width.
      * If `'cover'`, the popover width will match the width of the trigger.
      * If `'auto'`, the popover width will be determined by the content in
      * the popover.
      */
    var size: PopoverSize = js.native
    
    /**
      * If `true`, the popover will be translucent.
      * Only applies when the mode is `"ios"` and the device supports
      * [`backdrop-filter`](https://developer.mozilla.org/en-US/docs/Web/CSS/backdrop-filter#Browser_compatibility).
      */
    var translucent: Boolean = js.native
    
    /**
      * An ID corresponding to the trigger element that
      * causes the popover to open. Use the `trigger-action`
      * property to customize the interaction that results in
      * the popover opening.
      */
    var trigger: js.UndefOr[String] = js.native
    
    /**
      * Describes what kind of interaction with the trigger that
      * should cause the popover to open. Does not apply when the `trigger`
      * property is `undefined`.
      * If `'click'`, the popover will be presented when the trigger is left clicked.
      * If `'hover'`, the popover will be presented when a pointer hovers over the trigger.
      * If `'context-menu'`, the popover will be presented when the trigger is right
      * clicked on desktop and long pressed on mobile. This will also prevent your
      * device's normal context menu from appearing.
      */
    var triggerAction: TriggerAction = js.native
    
    /* private */ var triggerEl: Any = js.native
    
    /* private */ var usersElement: Any = js.native
    
    /**
      * Emitted before the popover has dismissed.
      * Shorthand for ionPopoverWillDismiss.
      */
    @JSName("willDismissShorthand")
    var willDismissShorthand_Popover: EventEmitter[OverlayEventDetail[Any]] = js.native
    
    /**
      * Emitted before the popover has presented.
      * Shorthand for ionPopoverWillPresent.
      */
    @JSName("willPresentShorthand")
    var willPresentShorthand_Popover: EventEmitter[Unit] = js.native
    
    /* private */ var workingDelegate: Any = js.native
  }
}
