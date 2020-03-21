package typingsJapgolly.yawnYaml.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YAWN extends js.Object {
  var json: js.Any
  var yaml: String
  def getRemark(path: String): String
  def setRemark(path: String, remark: String): Boolean
}

object YAWN {
  @scala.inline
  def apply(
    getRemark: String => CallbackTo[String],
    json: js.Any,
    setRemark: (String, String) => CallbackTo[Boolean],
    yaml: String
  ): YAWN = {
    val __obj = js.Dynamic.literal(json = json.asInstanceOf[js.Any], yaml = yaml.asInstanceOf[js.Any])
    __obj.updateDynamic("getRemark")(js.Any.fromFunction1((t0: java.lang.String) => getRemark(t0).runNow()))
    __obj.updateDynamic("setRemark")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => setRemark(t0, t1).runNow()))
    __obj.asInstanceOf[YAWN]
  }
}

