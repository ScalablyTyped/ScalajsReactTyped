package typingsJapgolly.servicenow.servicenow

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlideUser extends js.Object {
  def getCompanyID(): String
  def getDisplayName(): String
  def getID(): String
  def getName(): String
  def getPreference(name: String): String
  def hasRole(role: String): Boolean
  def isMemberOf(group: String): Boolean
  def savePreference(name: String, value: String): Unit
}

object GlideUser {
  @scala.inline
  def apply(
    getCompanyID: CallbackTo[String],
    getDisplayName: CallbackTo[String],
    getID: CallbackTo[String],
    getName: CallbackTo[String],
    getPreference: String => CallbackTo[String],
    hasRole: String => CallbackTo[Boolean],
    isMemberOf: String => CallbackTo[Boolean],
    savePreference: (String, String) => Callback
  ): GlideUser = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getCompanyID")(getCompanyID.toJsFn)
    __obj.updateDynamic("getDisplayName")(getDisplayName.toJsFn)
    __obj.updateDynamic("getID")(getID.toJsFn)
    __obj.updateDynamic("getName")(getName.toJsFn)
    __obj.updateDynamic("getPreference")(js.Any.fromFunction1((t0: java.lang.String) => getPreference(t0).runNow()))
    __obj.updateDynamic("hasRole")(js.Any.fromFunction1((t0: java.lang.String) => hasRole(t0).runNow()))
    __obj.updateDynamic("isMemberOf")(js.Any.fromFunction1((t0: java.lang.String) => isMemberOf(t0).runNow()))
    __obj.updateDynamic("savePreference")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => savePreference(t0, t1).runNow()))
    __obj.asInstanceOf[GlideUser]
  }
}

