package typingsJapgolly.ionic.definitionsMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.ionic.AnonReq
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClient extends js.Object {
  var config: IConfig
  def `do`(req: SuperAgentRequest): js.Promise[APIResponseSuccess]
  def make(method: HttpMethod, path: String): js.Promise[AnonReq]
  def paginate[T /* <: Response[js.Array[js.Object]] */](args: PaginateArgs[T]): IPaginator[T, PaginatorState]
}

object IClient {
  @scala.inline
  def apply(
    config: IConfig,
    `do`: SuperAgentRequest => CallbackTo[js.Promise[APIResponseSuccess]],
    make: (HttpMethod, String) => CallbackTo[js.Promise[AnonReq]],
    paginate: PaginateArgs[js.Any] => CallbackTo[IPaginator[js.Any, PaginatorState]]
  ): IClient = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
    __obj.updateDynamic("do")(js.Any.fromFunction1((t0: typingsJapgolly.ionic.definitionsMod.SuperAgentRequest) => `do`(t0).runNow()))
    __obj.updateDynamic("make")(js.Any.fromFunction2((t0: typingsJapgolly.ionic.definitionsMod.HttpMethod, t1: java.lang.String) => make(t0, t1).runNow()))
    __obj.updateDynamic("paginate")(js.Any.fromFunction1((t0: typingsJapgolly.ionic.definitionsMod.PaginateArgs[js.Any]) => paginate(t0).runNow()))
    __obj.asInstanceOf[IClient]
  }
}

