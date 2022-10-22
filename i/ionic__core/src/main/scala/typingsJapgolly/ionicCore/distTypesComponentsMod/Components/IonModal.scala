package typingsJapgolly.ionicCore.distTypesComponentsMod.Components

import org.scalajs.dom.HTMLElement
import typingsJapgolly.ionicCore.distTypesComponentsModalModalInterfaceMod.ModalAttributes
import typingsJapgolly.ionicCore.distTypesComponentsModalModalInterfaceMod.ModalHandleBehavior
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
trait IonModal extends StObject {
  
  /**
    * If `true`, the modal will animate.
    */
  var animated: Boolean = js.native
  
  /**
    * A decimal value between 0 and 1 that indicates the point after which the backdrop will begin to fade in when using a sheet modal. Prior to this point, the backdrop will be hidden and the content underneath the sheet can be interacted with. This value is exclusive meaning the backdrop will become active after the value specified.
    */
  var backdropBreakpoint: Double = js.native
  
  /**
    * If `true`, the modal will be dismissed when the backdrop is clicked.
    */
  var backdropDismiss: Boolean = js.native
  
  /**
    * The breakpoints to use when creating a sheet modal. Each value in the array must be a decimal between 0 and 1 where 0 indicates the modal is fully closed and 1 indicates the modal is fully open. Values are relative to the height of the modal, not the height of the screen. One of the values in this array must be the value of the `initialBreakpoint` property. For example: [0, .25, .5, 1]
    */
  var breakpoints: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * Determines whether or not a modal can dismiss when calling the `dismiss` method.  If the value is `true` or the value's function returns `true`, the modal will close when trying to dismiss. If the value is `false` or the value's function returns `false`, the modal will not close when trying to dismiss.
    */
  var canDismiss: js.UndefOr[Boolean | js.Function0[js.Promise[Boolean]]] = js.native
  
  /**
    * The component to display inside of the modal.
    */
  var component: js.UndefOr[ComponentRef] = js.native
  
  /**
    * The data to pass to the modal component.
    */
  var componentProps: js.UndefOr[ComponentProps[Null]] = js.native
  
  /**
    * Additional classes to apply for custom CSS. If multiple classes are provided they should be separated by spaces.
    */
  var cssClass: js.UndefOr[String | js.Array[String]] = js.native
  
  var delegate: js.UndefOr[FrameworkDelegate] = js.native
  
  /**
    * Dismiss the modal overlay after it has been presented.
    * @param data Any data to emit in the dismiss events.
    * @param role The role of the element that is dismissing the modal. For example, 'cancel' or 'backdrop'.
    */
  def dismiss(): js.Promise[Boolean] = js.native
  def dismiss(data: Any): js.Promise[Boolean] = js.native
  def dismiss(data: Any, role: String): js.Promise[Boolean] = js.native
  def dismiss(data: Unit, role: String): js.Promise[Boolean] = js.native
  
  /**
    * Animation to use when the modal is presented.
    */
  var enterAnimation: js.UndefOr[AnimationBuilder] = js.native
  
  /**
    * Returns the current breakpoint of a sheet style modal
    */
  def getCurrentBreakpoint(): js.Promise[js.UndefOr[Double]] = js.native
  
  /**
    * The horizontal line that displays at the top of a sheet modal. It is `true` by default when setting the `breakpoints` and `initialBreakpoint` properties.
    */
  var handle: js.UndefOr[Boolean] = js.native
  
  /**
    * The interaction behavior for the sheet modal when the handle is pressed.  Defaults to `"none"`, which  means the modal will not change size or position when the handle is pressed. Set to `"cycle"` to let the modal cycle between available breakpoints when pressed.  Handle behavior is unavailable when the `handle` property is set to `false` or when the `breakpoints` property is not set (using a fullscreen or card modal).
    */
  var handleBehavior: js.UndefOr[ModalHandleBehavior] = js.native
  
  var hasController: Boolean = js.native
  
  /**
    * Additional attributes to pass to the modal.
    */
  var htmlAttributes: js.UndefOr[ModalAttributes] = js.native
  
  /**
    * A decimal value between 0 and 1 that indicates the initial point the modal will open at when creating a sheet modal. This value must also be listed in the `breakpoints` array.
    */
  var initialBreakpoint: js.UndefOr[Double] = js.native
  
  /**
    * If `true`, the modal will open. If `false`, the modal will close. Use this if you need finer grained control over presentation, otherwise just use the modalController or the `trigger` property. Note: `isOpen` will not automatically be set back to `false` when the modal dismisses. You will need to do that in your code.
    */
  var isOpen: Boolean = js.native
  
  /**
    * If `true`, the component passed into `ion-modal` will automatically be mounted when the modal is created. The component will remain mounted even when the modal is dismissed. However, the component will be destroyed when the modal is destroyed. This property is not reactive and should only be used when initially creating a modal.  Note: This feature only applies to inline modals in JavaScript frameworks such as Angular, React, and Vue.
    */
  var keepContentsMounted: Boolean = js.native
  
  /**
    * If `true`, the keyboard will be automatically dismissed when the overlay is presented.
    */
  var keyboardClose: Boolean = js.native
  
  /**
    * Animation to use when the modal is dismissed.
    */
  var leaveAnimation: js.UndefOr[AnimationBuilder] = js.native
  
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[ios | md] = js.native
  
  /**
    * Returns a promise that resolves when the modal did dismiss.
    */
  def onDidDismiss[T](): js.Promise[OverlayEventDetail[T]] = js.native
  
  /**
    * Returns a promise that resolves when the modal will dismiss.
    */
  def onWillDismiss[T](): js.Promise[OverlayEventDetail[T]] = js.native
  
  var overlayIndex: Double = js.native
  
  /**
    * Present the modal overlay after it has been created.
    */
  def present(): js.Promise[Unit] = js.native
  
  /**
    * The element that presented the modal. This is used for card presentation effects and for stacking multiple modals on top of each other. Only applies in iOS mode.
    */
  var presentingElement: js.UndefOr[HTMLElement] = js.native
  
  /**
    * Move a sheet style modal to a specific breakpoint. The breakpoint value must be a value defined in your `breakpoints` array.
    */
  def setCurrentBreakpoint(breakpoint: Double): js.Promise[Unit] = js.native
  
  /**
    * If `true`, a backdrop will be displayed behind the modal. This property controls whether or not the backdrop darkens the screen when the modal is presented. It does not control whether or not the backdrop is active or present in the DOM.
    */
  var showBackdrop: Boolean = js.native
  
  /**
    * If `true`, the modal can be swiped to dismiss. Only applies in iOS mode.
    * @deprecated - To prevent modals from dismissing, use canDismiss instead.
    */
  var swipeToClose: Boolean = js.native
  
  /**
    * An ID corresponding to the trigger element that causes the modal to open when clicked.
    */
  var trigger: js.UndefOr[String] = js.native
}
