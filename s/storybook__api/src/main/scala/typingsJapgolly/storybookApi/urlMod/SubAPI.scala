package typingsJapgolly.storybookApi.urlMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reachRouter.mod.NavigateOptions
import typingsJapgolly.storybookApi.AnonPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubAPI extends js.Object {
  def getQueryParam(key: String): js.UndefOr[String]
  def getUrlState(): AnonPath
  def navigateUrl(url: String, options: NavigateOptions[js.Object]): Unit
  def setQueryParams(input: QueryParams): Unit
}

object SubAPI {
  @scala.inline
  def apply(
    getQueryParam: String => CallbackTo[js.UndefOr[String]],
    getUrlState: CallbackTo[AnonPath],
    navigateUrl: (String, NavigateOptions[js.Object]) => Callback,
    setQueryParams: QueryParams => Callback
  ): SubAPI = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getQueryParam")(js.Any.fromFunction1((t0: java.lang.String) => getQueryParam(t0).runNow()))
    __obj.updateDynamic("getUrlState")(getUrlState.toJsFn)
    __obj.updateDynamic("navigateUrl")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.reachRouter.mod.NavigateOptions[js.Object]) => navigateUrl(t0, t1).runNow()))
    __obj.updateDynamic("setQueryParams")(js.Any.fromFunction1((t0: typingsJapgolly.storybookApi.urlMod.QueryParams) => setQueryParams(t0).runNow()))
    __obj.asInstanceOf[SubAPI]
  }
}

