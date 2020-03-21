package typingsJapgolly.reduxSentryMiddleware.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.redux.mod.Action
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options[T] extends js.Object {
  var actionTransformer: js.UndefOr[js.Function1[/* action */ Action[_], _]] = js.undefined
  var breadcrumbCategory: js.UndefOr[String] = js.undefined
  var breadcrumbDataFromAction: js.UndefOr[js.Function1[/* action */ Action[_], _]] = js.undefined
  var filterBreadcrumbActions: js.UndefOr[js.Function1[/* action */ Action[_], Boolean]] = js.undefined
  var getTags: js.UndefOr[
    js.Function1[
      /* state */ T, 
      /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Sentry.Event * / any['tags'] */ js.Any
    ]
  ] = js.undefined
  var getUserContext: js.UndefOr[
    js.Function1[
      /* state */ T, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Sentry.User */ _
    ]
  ] = js.undefined
  var stateTransformer: js.UndefOr[js.Function1[/* state */ T, _]] = js.undefined
}

object Options {
  @scala.inline
  def apply[T](
    actionTransformer: /* action */ Action[js.Any] => CallbackTo[js.Any] = null,
    breadcrumbCategory: String = null,
    breadcrumbDataFromAction: /* action */ Action[js.Any] => CallbackTo[js.Any] = null,
    filterBreadcrumbActions: /* action */ Action[js.Any] => CallbackTo[Boolean] = null,
    getTags: /* state */ T => CallbackTo[
      /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Sentry.Event * / any['tags'] */ js.Any
    ] = null,
    getUserContext: /* state */ T => CallbackTo[js.Any] = null,
    stateTransformer: /* state */ T => CallbackTo[js.Any] = null
  ): Options[T] = {
    val __obj = js.Dynamic.literal()
    if (actionTransformer != null) __obj.updateDynamic("actionTransformer")(js.Any.fromFunction1((t0: /* action */ typingsJapgolly.redux.mod.Action[js.Any]) => actionTransformer(t0).runNow()))
    if (breadcrumbCategory != null) __obj.updateDynamic("breadcrumbCategory")(breadcrumbCategory.asInstanceOf[js.Any])
    if (breadcrumbDataFromAction != null) __obj.updateDynamic("breadcrumbDataFromAction")(js.Any.fromFunction1((t0: /* action */ typingsJapgolly.redux.mod.Action[js.Any]) => breadcrumbDataFromAction(t0).runNow()))
    if (filterBreadcrumbActions != null) __obj.updateDynamic("filterBreadcrumbActions")(js.Any.fromFunction1((t0: /* action */ typingsJapgolly.redux.mod.Action[js.Any]) => filterBreadcrumbActions(t0).runNow()))
    if (getTags != null) __obj.updateDynamic("getTags")(js.Any.fromFunction1((t0: /* state */ T) => getTags(t0).runNow()))
    if (getUserContext != null) __obj.updateDynamic("getUserContext")(js.Any.fromFunction1((t0: /* state */ T) => getUserContext(t0).runNow()))
    if (stateTransformer != null) __obj.updateDynamic("stateTransformer")(js.Any.fromFunction1((t0: /* state */ T) => stateTransformer(t0).runNow()))
    __obj.asInstanceOf[Options[T]]
  }
}

