package typingsJapgolly.jupyterlabServices

import typingsJapgolly.phosphorCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCommid extends js.Object {
  var comm_id: String
  var data: JSONObject
  var target_module: js.UndefOr[String] = js.undefined
  var target_name: String
}

object AnonCommid {
  @scala.inline
  def apply(comm_id: String, data: JSONObject, target_name: String, target_module: String = null): AnonCommid = {
    val __obj = js.Dynamic.literal(comm_id = comm_id.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], target_name = target_name.asInstanceOf[js.Any])
    if (target_module != null) __obj.updateDynamic("target_module")(target_module.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCommid]
  }
}

