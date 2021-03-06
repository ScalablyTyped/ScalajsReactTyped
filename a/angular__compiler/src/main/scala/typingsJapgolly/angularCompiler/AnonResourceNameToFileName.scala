package typingsJapgolly.angularCompiler

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonResourceNameToFileName extends js.Object {
  def resourceNameToFileName(resourceName: String, containingFileName: String): String | Null
}

object AnonResourceNameToFileName {
  @scala.inline
  def apply(resourceNameToFileName: (String, String) => CallbackTo[String | Null]): AnonResourceNameToFileName = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("resourceNameToFileName")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => resourceNameToFileName(t0, t1).runNow()))
    __obj.asInstanceOf[AnonResourceNameToFileName]
  }
}

