package typingsJapgolly.angularStrap.mgcrea.ngStrap.aside

import japgolly.scalajs.react.Callback
import typingsJapgolly.angular.mod.IScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAsideOptions extends js.Object {
  var animation: js.UndefOr[String] = js.undefined
  var backdrop: js.UndefOr[Boolean | String] = js.undefined
  var container: js.UndefOr[String | Boolean] = js.undefined
  var content: js.UndefOr[String] = js.undefined
  var contentTemplate: js.UndefOr[String] = js.undefined
  var controller: js.UndefOr[js.Any] = js.undefined
  var controllerAs: js.UndefOr[String] = js.undefined
  var html: js.UndefOr[Boolean] = js.undefined
  var keyboard: js.UndefOr[Boolean] = js.undefined
  var onBeforeHide: js.UndefOr[js.Function1[/* aside */ IAside, Unit]] = js.undefined
  var onBeforeShow: js.UndefOr[js.Function1[/* aside */ IAside, Unit]] = js.undefined
  var onHide: js.UndefOr[js.Function1[/* aside */ IAside, Unit]] = js.undefined
  var onShow: js.UndefOr[js.Function1[/* aside */ IAside, Unit]] = js.undefined
  var placement: js.UndefOr[String] = js.undefined
  var scope: js.UndefOr[IScope] = js.undefined
  var show: js.UndefOr[Boolean] = js.undefined
  var template: js.UndefOr[String] = js.undefined
  var templateUrl: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object IAsideOptions {
  @scala.inline
  def apply(
    animation: String = null,
    backdrop: Boolean | String = null,
    container: String | Boolean = null,
    content: String = null,
    contentTemplate: String = null,
    controller: js.Any = null,
    controllerAs: String = null,
    html: js.UndefOr[Boolean] = js.undefined,
    keyboard: js.UndefOr[Boolean] = js.undefined,
    onBeforeHide: /* aside */ IAside => Callback = null,
    onBeforeShow: /* aside */ IAside => Callback = null,
    onHide: /* aside */ IAside => Callback = null,
    onShow: /* aside */ IAside => Callback = null,
    placement: String = null,
    scope: IScope = null,
    show: js.UndefOr[Boolean] = js.undefined,
    template: String = null,
    templateUrl: String = null,
    title: String = null
  ): IAsideOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (backdrop != null) __obj.updateDynamic("backdrop")(backdrop.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (contentTemplate != null) __obj.updateDynamic("contentTemplate")(contentTemplate.asInstanceOf[js.Any])
    if (controller != null) __obj.updateDynamic("controller")(controller.asInstanceOf[js.Any])
    if (controllerAs != null) __obj.updateDynamic("controllerAs")(controllerAs.asInstanceOf[js.Any])
    if (!js.isUndefined(html)) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboard)) __obj.updateDynamic("keyboard")(keyboard.asInstanceOf[js.Any])
    if (onBeforeHide != null) __obj.updateDynamic("onBeforeHide")(js.Any.fromFunction1((t0: /* aside */ typingsJapgolly.angularStrap.mgcrea.ngStrap.aside.IAside) => onBeforeHide(t0).runNow()))
    if (onBeforeShow != null) __obj.updateDynamic("onBeforeShow")(js.Any.fromFunction1((t0: /* aside */ typingsJapgolly.angularStrap.mgcrea.ngStrap.aside.IAside) => onBeforeShow(t0).runNow()))
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction1((t0: /* aside */ typingsJapgolly.angularStrap.mgcrea.ngStrap.aside.IAside) => onHide(t0).runNow()))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction1((t0: /* aside */ typingsJapgolly.angularStrap.mgcrea.ngStrap.aside.IAside) => onShow(t0).runNow()))
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (templateUrl != null) __obj.updateDynamic("templateUrl")(templateUrl.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAsideOptions]
  }
}

