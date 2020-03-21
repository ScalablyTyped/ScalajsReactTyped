package typingsJapgolly.durandal

import typingsJapgolly.knockout.KnockoutComputed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DurandalRouteConfiguration extends js.Object {
  var hasChildRoutes: js.UndefOr[Boolean] = js.undefined
  var hash: js.UndefOr[String] = js.undefined
  var isActive: js.UndefOr[KnockoutComputed[Boolean]] = js.undefined
  var moduleId: js.UndefOr[String] = js.undefined
  var nav: js.UndefOr[js.Any] = js.undefined
  var route: js.UndefOr[String | js.Array[String]] = js.undefined
  var routePattern: js.UndefOr[js.RegExp] = js.undefined
  var title: js.UndefOr[js.Any] = js.undefined
  var viewUrl: js.UndefOr[String] = js.undefined
}

object DurandalRouteConfiguration {
  @scala.inline
  def apply(
    hasChildRoutes: js.UndefOr[Boolean] = js.undefined,
    hash: String = null,
    isActive: KnockoutComputed[Boolean] = null,
    moduleId: String = null,
    nav: js.Any = null,
    route: String | js.Array[String] = null,
    routePattern: js.RegExp = null,
    title: js.Any = null,
    viewUrl: String = null
  ): DurandalRouteConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hasChildRoutes)) __obj.updateDynamic("hasChildRoutes")(hasChildRoutes.asInstanceOf[js.Any])
    if (hash != null) __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    if (isActive != null) __obj.updateDynamic("isActive")(isActive.asInstanceOf[js.Any])
    if (moduleId != null) __obj.updateDynamic("moduleId")(moduleId.asInstanceOf[js.Any])
    if (nav != null) __obj.updateDynamic("nav")(nav.asInstanceOf[js.Any])
    if (route != null) __obj.updateDynamic("route")(route.asInstanceOf[js.Any])
    if (routePattern != null) __obj.updateDynamic("routePattern")(routePattern.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (viewUrl != null) __obj.updateDynamic("viewUrl")(viewUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[DurandalRouteConfiguration]
  }
}

