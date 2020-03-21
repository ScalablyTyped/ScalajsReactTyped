package typingsJapgolly.webpack.mod.Stats

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reason extends js.Object {
  var explanation: js.UndefOr[String] = js.undefined
  var loc: String
  var module: String | Null
  var moduleId: Double | String | Null
  var moduleIdentifier: String | Null
  var moduleName: String | Null
  var `type`: ReasonType
  var userRequest: String
}

object Reason {
  @scala.inline
  def apply(
    loc: String,
    `type`: ReasonType,
    userRequest: String,
    explanation: String = null,
    module: String = null,
    moduleId: Double | String = null,
    moduleIdentifier: String = null,
    moduleName: String = null
  ): Reason = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any], userRequest = userRequest.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (explanation != null) __obj.updateDynamic("explanation")(explanation.asInstanceOf[js.Any])
    if (module != null) __obj.updateDynamic("module")(module.asInstanceOf[js.Any])
    if (moduleId != null) __obj.updateDynamic("moduleId")(moduleId.asInstanceOf[js.Any])
    if (moduleIdentifier != null) __obj.updateDynamic("moduleIdentifier")(moduleIdentifier.asInstanceOf[js.Any])
    if (moduleName != null) __obj.updateDynamic("moduleName")(moduleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reason]
  }
}

