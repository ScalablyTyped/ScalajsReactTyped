package typingsJapgolly.angularMaterial.mod.angularAugmentingMod.material

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsJapgolly.angular.JQuery
import typingsJapgolly.angular.mod.IControllerConstructor
import typingsJapgolly.angular.mod.Injectable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPanelConfig extends js.Object {
   // default: false
  var animation: js.UndefOr[IPanelAnimation] = js.undefined
  var attachTo: js.UndefOr[String | JQuery | Element] = js.undefined
  var bindToController: js.UndefOr[Boolean] = js.undefined
  var clickOutsideToClose: js.UndefOr[Boolean] = js.undefined
  var controller: js.UndefOr[String | Injectable[IControllerConstructor]] = js.undefined
  var controllerAs: js.UndefOr[String] = js.undefined
   // default: false
  var disableParentScroll: js.UndefOr[Boolean] = js.undefined
   // default: false
  var escapeToClose: js.UndefOr[Boolean] = js.undefined
   // default: false
  var focusOnOpen: js.UndefOr[Boolean] = js.undefined
   // default: true
  var fullscreen: js.UndefOr[Boolean] = js.undefined
  var hasBackdrop: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
   // default: true
  var locals: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var onCloseSuccess: js.UndefOr[js.Function2[/* panel */ IPanelRef, /* closeReason */ String, _]] = js.undefined
   // default: false
  var onDomAdded: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Thenable[Unit] | Unit]] = js.undefined
  var onDomRemoved: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Thenable[Unit] | Unit]] = js.undefined
  var onOpenComplete: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Thenable[Unit] | Unit]] = js.undefined
  var onRemoving: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Thenable[Unit] | Unit]] = js.undefined
  var origin: js.UndefOr[String | JQuery | Element] = js.undefined
  var panelClass: js.UndefOr[String] = js.undefined
   // default: 80
  var position: js.UndefOr[IPanelPosition] = js.undefined
  var propagateContainerEvents: js.UndefOr[Boolean] = js.undefined
  var resolve: js.UndefOr[ResolveObject] = js.undefined
  var template: js.UndefOr[String] = js.undefined
  var templateUrl: js.UndefOr[String] = js.undefined
   // default: false
  var trapFocus: js.UndefOr[Boolean] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object IPanelConfig {
  @scala.inline
  def apply(
    animation: IPanelAnimation = null,
    attachTo: String | JQuery | Element = null,
    bindToController: js.UndefOr[Boolean] = js.undefined,
    clickOutsideToClose: js.UndefOr[Boolean] = js.undefined,
    controller: String | Injectable[IControllerConstructor] = null,
    controllerAs: String = null,
    disableParentScroll: js.UndefOr[Boolean] = js.undefined,
    escapeToClose: js.UndefOr[Boolean] = js.undefined,
    focusOnOpen: js.UndefOr[Boolean] = js.undefined,
    fullscreen: js.UndefOr[Boolean] = js.undefined,
    hasBackdrop: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    locals: StringDictionary[js.Any] = null,
    onCloseSuccess: (/* panel */ IPanelRef, /* closeReason */ String) => CallbackTo[js.Any] = null,
    onDomAdded: /* repeated */ js.Any => CallbackTo[js.Thenable[Unit] | Unit] = null,
    onDomRemoved: /* repeated */ js.Any => CallbackTo[js.Thenable[Unit] | Unit] = null,
    onOpenComplete: /* repeated */ js.Any => CallbackTo[js.Thenable[Unit] | Unit] = null,
    onRemoving: /* repeated */ js.Any => CallbackTo[js.Thenable[Unit] | Unit] = null,
    origin: String | JQuery | Element = null,
    panelClass: String = null,
    position: IPanelPosition = null,
    propagateContainerEvents: js.UndefOr[Boolean] = js.undefined,
    resolve: ResolveObject = null,
    template: String = null,
    templateUrl: String = null,
    trapFocus: js.UndefOr[Boolean] = js.undefined,
    zIndex: Int | Double = null
  ): IPanelConfig = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (attachTo != null) __obj.updateDynamic("attachTo")(attachTo.asInstanceOf[js.Any])
    if (!js.isUndefined(bindToController)) __obj.updateDynamic("bindToController")(bindToController.asInstanceOf[js.Any])
    if (!js.isUndefined(clickOutsideToClose)) __obj.updateDynamic("clickOutsideToClose")(clickOutsideToClose.asInstanceOf[js.Any])
    if (controller != null) __obj.updateDynamic("controller")(controller.asInstanceOf[js.Any])
    if (controllerAs != null) __obj.updateDynamic("controllerAs")(controllerAs.asInstanceOf[js.Any])
    if (!js.isUndefined(disableParentScroll)) __obj.updateDynamic("disableParentScroll")(disableParentScroll.asInstanceOf[js.Any])
    if (!js.isUndefined(escapeToClose)) __obj.updateDynamic("escapeToClose")(escapeToClose.asInstanceOf[js.Any])
    if (!js.isUndefined(focusOnOpen)) __obj.updateDynamic("focusOnOpen")(focusOnOpen.asInstanceOf[js.Any])
    if (!js.isUndefined(fullscreen)) __obj.updateDynamic("fullscreen")(fullscreen.asInstanceOf[js.Any])
    if (!js.isUndefined(hasBackdrop)) __obj.updateDynamic("hasBackdrop")(hasBackdrop.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (locals != null) __obj.updateDynamic("locals")(locals.asInstanceOf[js.Any])
    if (onCloseSuccess != null) __obj.updateDynamic("onCloseSuccess")(js.Any.fromFunction2((t0: /* panel */ typingsJapgolly.angularMaterial.mod.angularAugmentingMod.material.IPanelRef, t1: /* closeReason */ java.lang.String) => onCloseSuccess(t0, t1).runNow()))
    if (onDomAdded != null) __obj.updateDynamic("onDomAdded")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onDomAdded(t0).runNow()))
    if (onDomRemoved != null) __obj.updateDynamic("onDomRemoved")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onDomRemoved(t0).runNow()))
    if (onOpenComplete != null) __obj.updateDynamic("onOpenComplete")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onOpenComplete(t0).runNow()))
    if (onRemoving != null) __obj.updateDynamic("onRemoving")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onRemoving(t0).runNow()))
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (panelClass != null) __obj.updateDynamic("panelClass")(panelClass.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(propagateContainerEvents)) __obj.updateDynamic("propagateContainerEvents")(propagateContainerEvents.asInstanceOf[js.Any])
    if (resolve != null) __obj.updateDynamic("resolve")(resolve.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (templateUrl != null) __obj.updateDynamic("templateUrl")(templateUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(trapFocus)) __obj.updateDynamic("trapFocus")(trapFocus.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPanelConfig]
  }
}

