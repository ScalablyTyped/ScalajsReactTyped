package typingsJapgolly.ngDialog.mod.angularAugmentingMod.dialog

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.angular.mod._Global_.Function
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDialogOpenConfirmOptions extends IDialogOpenOptions {
  @JSName("scope")
  var scope_IDialogOpenConfirmOptions: js.UndefOr[IDialogConfirmScope] = js.undefined
}

object IDialogOpenConfirmOptions {
  @scala.inline
  def apply(
    template: String,
    appendClassName: String = null,
    appendTo: String = null,
    ariaAuto: js.UndefOr[Boolean] = js.undefined,
    ariaDescribedById: String = null,
    ariaDescribedBySelector: String = null,
    ariaLabelledById: String = null,
    ariaLabelledBySelector: String = null,
    ariaRole: String = null,
    bindToController: js.UndefOr[Boolean] = js.undefined,
    cache: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    closeByDocument: js.UndefOr[Boolean] = js.undefined,
    closeByEscape: js.UndefOr[Boolean] = js.undefined,
    closeByNavigation: js.UndefOr[Boolean] = js.undefined,
    controller: String | js.Array[_] | js.Any = null,
    controllerAs: String = null,
    data: String | js.Object | js.Array[_] = null,
    disableAnimation: js.UndefOr[Boolean] = js.undefined,
    height: String | Double = null,
    name: String | Double = null,
    overlay: js.UndefOr[Boolean] = js.undefined,
    plain: js.UndefOr[Boolean] = js.undefined,
    preCloseCallback: String | Function = null,
    preserveFocus: js.UndefOr[Boolean] = js.undefined,
    resolve: StringDictionary[String | Function] = null,
    scope: IDialogConfirmScope = null,
    showClose: js.UndefOr[Boolean] = js.undefined,
    trapFocus: js.UndefOr[Boolean] = js.undefined,
    width: String | Double = null
  ): IDialogOpenConfirmOptions = {
    val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
    if (appendClassName != null) __obj.updateDynamic("appendClassName")(appendClassName.asInstanceOf[js.Any])
    if (appendTo != null) __obj.updateDynamic("appendTo")(appendTo.asInstanceOf[js.Any])
    if (!js.isUndefined(ariaAuto)) __obj.updateDynamic("ariaAuto")(ariaAuto.asInstanceOf[js.Any])
    if (ariaDescribedById != null) __obj.updateDynamic("ariaDescribedById")(ariaDescribedById.asInstanceOf[js.Any])
    if (ariaDescribedBySelector != null) __obj.updateDynamic("ariaDescribedBySelector")(ariaDescribedBySelector.asInstanceOf[js.Any])
    if (ariaLabelledById != null) __obj.updateDynamic("ariaLabelledById")(ariaLabelledById.asInstanceOf[js.Any])
    if (ariaLabelledBySelector != null) __obj.updateDynamic("ariaLabelledBySelector")(ariaLabelledBySelector.asInstanceOf[js.Any])
    if (ariaRole != null) __obj.updateDynamic("ariaRole")(ariaRole.asInstanceOf[js.Any])
    if (!js.isUndefined(bindToController)) __obj.updateDynamic("bindToController")(bindToController.asInstanceOf[js.Any])
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(closeByDocument)) __obj.updateDynamic("closeByDocument")(closeByDocument.asInstanceOf[js.Any])
    if (!js.isUndefined(closeByEscape)) __obj.updateDynamic("closeByEscape")(closeByEscape.asInstanceOf[js.Any])
    if (!js.isUndefined(closeByNavigation)) __obj.updateDynamic("closeByNavigation")(closeByNavigation.asInstanceOf[js.Any])
    if (controller != null) __obj.updateDynamic("controller")(controller.asInstanceOf[js.Any])
    if (controllerAs != null) __obj.updateDynamic("controllerAs")(controllerAs.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(disableAnimation)) __obj.updateDynamic("disableAnimation")(disableAnimation.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(overlay)) __obj.updateDynamic("overlay")(overlay.asInstanceOf[js.Any])
    if (!js.isUndefined(plain)) __obj.updateDynamic("plain")(plain.asInstanceOf[js.Any])
    if (preCloseCallback != null) __obj.updateDynamic("preCloseCallback")(preCloseCallback.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveFocus)) __obj.updateDynamic("preserveFocus")(preserveFocus.asInstanceOf[js.Any])
    if (resolve != null) __obj.updateDynamic("resolve")(resolve.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (!js.isUndefined(showClose)) __obj.updateDynamic("showClose")(showClose.asInstanceOf[js.Any])
    if (!js.isUndefined(trapFocus)) __obj.updateDynamic("trapFocus")(trapFocus.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDialogOpenConfirmOptions]
  }
}

