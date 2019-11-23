package typingsJapgolly.atStorybookApi.distModulesUrlMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.atStorybookApi.Anon_Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubAPI extends js.Object {
  def getQueryParam(key: String): js.UndefOr[String]
  def getUrlState(): Anon_Path
  def setQueryParams(input: QueryParams): Unit
}

object SubAPI {
  @scala.inline
  def apply(
    getQueryParam: String => CallbackTo[js.UndefOr[String]],
    getUrlState: CallbackTo[Anon_Path],
    setQueryParams: QueryParams => Callback
  ): SubAPI = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getQueryParam")(js.Any.fromFunction1((t0: java.lang.String) => getQueryParam(t0).runNow()))
    __obj.updateDynamic("getUrlState")(getUrlState.toJsFn)
    __obj.updateDynamic("setQueryParams")(js.Any.fromFunction1((t0: typingsJapgolly.atStorybookApi.distModulesUrlMod.QueryParams) => setQueryParams(t0).runNow()))
    __obj.asInstanceOf[SubAPI]
  }
}

