package typingsJapgolly.elasticsearch.httpMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpConnector extends js.Object {
  // onStatusSet(handler: (status: any) => void): void;
  def createAgent(config: js.Any): js.Any
  def makeAgentConfig(config: js.Any): js.Any
  def makeReqParams(params: js.Any): js.Any
  def request(
    params: js.Any,
    callback: js.Function4[
      /* error */ js.Any, 
      /* response */ js.Any, 
      /* status */ js.Any, 
      /* headers */ js.Any, 
      Unit
    ]
  ): Unit
}

object HttpConnector {
  @scala.inline
  def apply(
    createAgent: js.Any => CallbackTo[js.Any],
    makeAgentConfig: js.Any => CallbackTo[js.Any],
    makeReqParams: js.Any => CallbackTo[js.Any],
    request: (js.Any, js.Function4[
      /* error */ js.Any, 
      /* response */ js.Any, 
      /* status */ js.Any, 
      /* headers */ js.Any, 
      Unit
    ]) => Callback
  ): HttpConnector = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createAgent")(js.Any.fromFunction1((t0: js.Any) => createAgent(t0).runNow()))
    __obj.updateDynamic("makeAgentConfig")(js.Any.fromFunction1((t0: js.Any) => makeAgentConfig(t0).runNow()))
    __obj.updateDynamic("makeReqParams")(js.Any.fromFunction1((t0: js.Any) => makeReqParams(t0).runNow()))
    __obj.updateDynamic("request")(js.Any.fromFunction2((t0: js.Any, t1: js.Function4[
  /* error */ js.Any, 
  /* response */ js.Any, 
  /* status */ js.Any, 
  /* headers */ js.Any, 
  scala.Unit]) => request(t0, t1).runNow()))
    __obj.asInstanceOf[HttpConnector]
  }
}

