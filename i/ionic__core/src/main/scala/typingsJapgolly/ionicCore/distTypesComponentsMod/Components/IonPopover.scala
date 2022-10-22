package typingsJapgolly.ionicCore.distTypesComponentsMod.Components

import org.scalajs.dom.CustomEvent
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.PointerEvent
import org.scalajs.dom.TouchEvent
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonPopoverElement
import typingsJapgolly.ionicCore.distTypesComponentsPopoverPopoverInterfaceMod.PopoverAttributes
import typingsJapgolly.ionicCore.distTypesComponentsPopoverPopoverInterfaceMod.PopoverSize
import typingsJapgolly.ionicCore.distTypesComponentsPopoverPopoverInterfaceMod.PositionAlign
import typingsJapgolly.ionicCore.distTypesComponentsPopoverPopoverInterfaceMod.PositionReference
import typingsJapgolly.ionicCore.distTypesComponentsPopoverPopoverInterfaceMod.PositionSide
import typingsJapgolly.ionicCore.distTypesComponentsPopoverPopoverInterfaceMod.TriggerAction
import typingsJapgolly.ionicCore.distTypesUtilsAnimationAnimationInterfaceMod.AnimationBuilder
import typingsJapgolly.ionicCore.distTypesUtilsOverlaysInterfaceMod.OverlayEventDetail
import typingsJapgolly.ionicCore.ionicCoreStrings.ios
import typingsJapgolly.ionicCore.ionicCoreStrings.md
import typingsJapgolly.ionicCore.mod.ComponentProps
import typingsJapgolly.ionicCore.mod.ComponentRef
import typingsJapgolly.ionicCore.mod.FrameworkDelegate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IonPopover extends StObject {
  
  /**
    * Describes how to align the popover content with the `reference` point. Defaults to `'center'` for `ios` mode, and `'start'` for `md` mode.
    */
  var alignment: js.UndefOr[PositionAlign] = js.native
  
  /**
    * If `true`, the popover will animate.
    */
  var animated: Boolean = js.native
  
  /**
    * If `true`, the popover will display an arrow that points at the `reference` when running in `ios` mode. Does not apply in `md` mode.
    */
  var arrow: Boolean = js.native
  
  /**
    * If `true`, the popover will be dismissed when the backdrop is clicked.
    */
  var backdropDismiss: Boolean = js.native
  
  /**
    * The component to display inside of the popover. You only need to use this if you are not using a JavaScript framework. Otherwise, you can just slot your component inside of `ion-popover`.
    */
  var component: js.UndefOr[ComponentRef] = js.native
  
  /**
    * The data to pass to the popover component. You only need to use this if you are not using a JavaScript framework. Otherwise, you can just set the props directly on your component.
    */
  var componentProps: js.UndefOr[ComponentProps[Null]] = js.native
  
  /**
    * Additional classes to apply for custom CSS. If multiple classes are provided they should be separated by spaces.
    */
  var cssClass: js.UndefOr[String | js.Array[String]] = js.native
  
  var delegate: js.UndefOr[FrameworkDelegate] = js.native
  
  /**
    * Dismiss the popover overlay after it has been presented.
    * @param data Any data to emit in the dismiss events.
    * @param role The role of the element that is dismissing the popover. For example, 'cancel' or 'backdrop'.
    * @param dismissParentPopover If `true`, dismissing this popover will also dismiss a parent popover if this popover is nested. Defaults to `true`.
    */
  def dismiss(): js.Promise[Boolean] = js.native
  def dismiss(data: Any): js.Promise[Boolean] = js.native
  def dismiss(data: Any, role: String): js.Promise[Boolean] = js.native
  def dismiss(data: Any, role: String, dismissParentPopover: Boolean): js.Promise[Boolean] = js.native
  def dismiss(data: Any, role: Unit, dismissParentPopover: Boolean): js.Promise[Boolean] = js.native
  def dismiss(data: Unit, role: String): js.Promise[Boolean] = js.native
  def dismiss(data: Unit, role: String, dismissParentPopover: Boolean): js.Promise[Boolean] = js.native
  def dismiss(data: Unit, role: Unit, dismissParentPopover: Boolean): js.Promise[Boolean] = js.native
  
  /**
    * If `true`, the popover will be automatically dismissed when the content has been clicked.
    */
  var dismissOnSelect: Boolean = js.native
  
  /**
    * Animation to use when the popover is presented.
    */
  var enterAnimation: js.UndefOr[AnimationBuilder] = js.native
  
  /**
    * The event to pass to the popover animation.
    */
  var event: Any = js.native
  
  def getParentPopover(): js.Promise[HTMLIonPopoverElement | Null] = js.native
  
  var hasController: Boolean = js.native
  
  /**
    * Additional attributes to pass to the popover.
    */
  var htmlAttributes: js.UndefOr[PopoverAttributes] = js.native
  
  /**
    * If `true`, the popover will open. If `false`, the popover will close. Use this if you need finer grained control over presentation, otherwise just use the popoverController or the `trigger` property. Note: `isOpen` will not automatically be set back to `false` when the popover dismisses. You will need to do that in your code.
    */
  var isOpen: Boolean = js.native
  
  /**
    * If `true`, the component passed into `ion-popover` will automatically be mounted when the popover is created. The component will remain mounted even when the popover is dismissed. However, the component will be destroyed when the popover is destroyed. This property is not reactive and should only be used when initially creating a popover.  Note: This feature only applies to inline popovers in JavaScript frameworks such as Angular, React, and Vue.
    */
  var keepContentsMounted: Boolean = js.native
  
  /**
    * If `true`, the keyboard will be automatically dismissed when the overlay is presented.
    */
  var keyboardClose: Boolean = js.native
  
  var keyboardEvents: Boolean = js.native
  
  /**
    * Animation to use when the popover is dismissed.
    */
  var leaveAnimation: js.UndefOr[AnimationBuilder] = js.native
  
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.native
  
  /**
    * Returns a promise that resolves when the popover did dismiss.
    */
  def onDidDismiss[T](): js.Promise[OverlayEventDetail[T]] = js.native
  
  /**
    * Returns a promise that resolves when the popover will dismiss.
    */
  def onWillDismiss[T](): js.Promise[OverlayEventDetail[T]] = js.native
  
  var overlayIndex: Double = js.native
  
  /**
    * Present the popover overlay after it has been created. Developers can pass a mouse, touch, or pointer event to position the popover relative to where that event was dispatched.
    */
  def present(): js.Promise[Unit] = js.native
  def present(event: CustomEvent): js.Promise[Unit] = js.native
  def present(event: MouseEvent): js.Promise[Unit] = js.native
  def present(event: PointerEvent): js.Promise[Unit] = js.native
  def present(event: TouchEvent): js.Promise[Unit] = js.native
  
  /**
    * When opening a popover from a trigger, we should not be modifying the `event` prop from inside the component. Additionally, when pressing the "Right" arrow key, we need to shift focus to the first descendant in the newly presented popover.
    */
  def presentFromTrigger(): js.Promise[Unit] = js.native
  def presentFromTrigger(event: Any): js.Promise[Unit] = js.native
  def presentFromTrigger(event: Any, focusDescendant: Boolean): js.Promise[Unit] = js.native
  def presentFromTrigger(event: Unit, focusDescendant: Boolean): js.Promise[Unit] = js.native
  
  /**
    * Describes what to position the popover relative to. If `'trigger'`, the popover will be positioned relative to the trigger button. If passing in an event, this is determined via event.target. If `'event'`, the popover will be positioned relative to the x/y coordinates of the trigger action. If passing in an event, this is determined via event.clientX and event.clientY.
    */
  var reference: PositionReference = js.native
  
  /**
    * If `true`, a backdrop will be displayed behind the popover. This property controls whether or not the backdrop darkens the screen when the popover is presented. It does not control whether or not the backdrop is active or present in the DOM.
    */
  var showBackdrop: Boolean = js.native
  
  /**
    * Describes which side of the `reference` point to position the popover on. The `'start'` and `'end'` values are RTL-aware, and the `'left'` and `'right'` values are not.
    */
  var side: PositionSide = js.native
  
  /**
    * Describes how to calculate the popover width. If `'cover'`, the popover width will match the width of the trigger. If `'auto'`, the popover width will be determined by the content in the popover.
    */
  var size: PopoverSize = js.native
  
  /**
    * If `true`, the popover will be translucent. Only applies when the mode is `"ios"` and the device supports [`backdrop-filter`](https://developer.mozilla.org/en-US/docs/Web/CSS/backdrop-filter#Browser_compatibility).
    */
  var translucent: Boolean = js.native
  
  /**
    * An ID corresponding to the trigger element that causes the popover to open. Use the `trigger-action` property to customize the interaction that results in the popover opening.
    */
  var trigger: js.UndefOr[String] = js.native
  
  /**
    * Describes what kind of interaction with the trigger that should cause the popover to open. Does not apply when the `trigger` property is `undefined`. If `'click'`, the popover will be presented when the trigger is left clicked. If `'hover'`, the popover will be presented when a pointer hovers over the trigger. If `'context-menu'`, the popover will be presented when the trigger is right clicked on desktop and long pressed on mobile. This will also prevent your device's normal context menu from appearing.
    */
  var triggerAction: TriggerAction = js.native
}
