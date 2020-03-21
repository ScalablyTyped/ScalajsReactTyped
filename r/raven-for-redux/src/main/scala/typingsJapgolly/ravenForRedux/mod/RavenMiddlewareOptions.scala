package typingsJapgolly.ravenForRedux.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.redux.mod.Action
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RavenMiddlewareOptions[T] extends js.Object {
  var actionTransformer: js.UndefOr[js.Function1[/* action */ Action[_], Action[_]]] = js.undefined
  var breadcrumbCategory: js.UndefOr[String] = js.undefined
  var breadcrumbDataFromAction: js.UndefOr[js.Function1[/* action */ Action[_], _]] = js.undefined
  var filterBreadcrumbActions: js.UndefOr[js.Function1[/* action */ Action[_], Boolean]] = js.undefined
  var getUserContext: js.UndefOr[js.Function1[/* state */ T, RavenUserContext]] = js.undefined
  var stateTransformer: js.UndefOr[js.Function1[/* state */ T, T]] = js.undefined
}

object RavenMiddlewareOptions {
  @scala.inline
  def apply[T](
    actionTransformer: /* action */ Action[js.Any] => CallbackTo[Action[js.Any]] = null,
    breadcrumbCategory: String = null,
    breadcrumbDataFromAction: /* action */ Action[js.Any] => CallbackTo[js.Any] = null,
    filterBreadcrumbActions: /* action */ Action[js.Any] => CallbackTo[Boolean] = null,
    getUserContext: /* state */ T => CallbackTo[RavenUserContext] = null,
    stateTransformer: /* state */ T => CallbackTo[T] = null
  ): RavenMiddlewareOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (actionTransformer != null) __obj.updateDynamic("actionTransformer")(js.Any.fromFunction1((t0: /* action */ typingsJapgolly.redux.mod.Action[js.Any]) => actionTransformer(t0).runNow()))
    if (breadcrumbCategory != null) __obj.updateDynamic("breadcrumbCategory")(breadcrumbCategory.asInstanceOf[js.Any])
    if (breadcrumbDataFromAction != null) __obj.updateDynamic("breadcrumbDataFromAction")(js.Any.fromFunction1((t0: /* action */ typingsJapgolly.redux.mod.Action[js.Any]) => breadcrumbDataFromAction(t0).runNow()))
    if (filterBreadcrumbActions != null) __obj.updateDynamic("filterBreadcrumbActions")(js.Any.fromFunction1((t0: /* action */ typingsJapgolly.redux.mod.Action[js.Any]) => filterBreadcrumbActions(t0).runNow()))
    if (getUserContext != null) __obj.updateDynamic("getUserContext")(js.Any.fromFunction1((t0: /* state */ T) => getUserContext(t0).runNow()))
    if (stateTransformer != null) __obj.updateDynamic("stateTransformer")(js.Any.fromFunction1((t0: /* state */ T) => stateTransformer(t0).runNow()))
    __obj.asInstanceOf[RavenMiddlewareOptions[T]]
  }
}

