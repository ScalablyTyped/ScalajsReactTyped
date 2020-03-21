package typingsJapgolly.less.Less_

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreProcessor extends js.Object {
  def process(src: String, extra: PreProcessorExtraInfo): String
}

object PreProcessor {
  @scala.inline
  def apply(process: (String, PreProcessorExtraInfo) => CallbackTo[String]): PreProcessor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("process")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.less.Less_.PreProcessorExtraInfo) => process(t0, t1).runNow()))
    __obj.asInstanceOf[PreProcessor]
  }
}

