package typingsJapgolly.beanstalkd.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasicReader extends js.Object {
  def handle(
    protocol: BeanstalkdProtocol,
    data: js.Any,
    resolve: js.Function1[/* data */ js.UndefOr[js.Any], Unit],
    reject: js.Function1[/* err */ js.UndefOr[js.Any], _]
  ): Buffer
  def parseData(data: String): js.Any
}

object BasicReader {
  @scala.inline
  def apply(
    handle: (BeanstalkdProtocol, js.Any, js.Function1[/* data */ js.UndefOr[js.Any], Unit], js.Function1[/* err */ js.UndefOr[js.Any], js.Any]) => CallbackTo[Buffer],
    parseData: String => CallbackTo[js.Any]
  ): BasicReader = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("handle")(js.Any.fromFunction4((t0: typingsJapgolly.beanstalkd.mod.BeanstalkdProtocol, t1: js.Any, t2: js.Function1[/* data */ js.UndefOr[js.Any], scala.Unit], t3: js.Function1[/* err */ js.UndefOr[js.Any], js.Any]) => handle(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("parseData")(js.Any.fromFunction1((t0: java.lang.String) => parseData(t0).runNow()))
    __obj.asInstanceOf[BasicReader]
  }
}

