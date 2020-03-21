package typingsJapgolly.microgears.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Plugin extends js.Object {
  var name: String
  def afterChain[T, M /* <: MetaInformation */](result: T, metaInfo: M): T
  def beforeChain[M /* <: MetaInformation */](args: js.Array[_], metaInfo: M): js.Array[_]
}

object Plugin {
  @scala.inline
  def apply(
    afterChain: (js.Any, js.Any) => CallbackTo[js.Any],
    beforeChain: (js.Array[js.Any], js.Any) => CallbackTo[js.Array[js.Any]],
    name: String
  ): Plugin = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("afterChain")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => afterChain(t0, t1).runNow()))
    __obj.updateDynamic("beforeChain")(js.Any.fromFunction2((t0: js.Array[js.Any], t1: js.Any) => beforeChain(t0, t1).runNow()))
    __obj.asInstanceOf[Plugin]
  }
}

