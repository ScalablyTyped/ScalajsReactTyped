package typingsJapgolly.servicenowLondon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlideUser extends js.Object {
  def getCompanyID(): String
  def getDisplayName(): String
  def getDomainID(): String
  def getEmail(): String
  def getFirstName(): String
  def getID(): String
  def getLastName(): String
  def getName(): String
  def getPreference(name: String): String
  def getRoles(): js.Array[String]
  def getUserRoles(): js.Array[String]
  def hasRole(role: String): Boolean
  def isMemberOf(group: String): Boolean
  def savePreference(name: String, value: String): Unit
}

object GlideUser {
  @scala.inline
  def apply(
    getCompanyID: CallbackTo[String],
    getDisplayName: CallbackTo[String],
    getDomainID: CallbackTo[String],
    getEmail: CallbackTo[String],
    getFirstName: CallbackTo[String],
    getID: CallbackTo[String],
    getLastName: CallbackTo[String],
    getName: CallbackTo[String],
    getPreference: String => CallbackTo[String],
    getRoles: CallbackTo[js.Array[String]],
    getUserRoles: CallbackTo[js.Array[String]],
    hasRole: String => CallbackTo[Boolean],
    isMemberOf: String => CallbackTo[Boolean],
    savePreference: (String, String) => Callback
  ): GlideUser = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getCompanyID")(getCompanyID.toJsFn)
    __obj.updateDynamic("getDisplayName")(getDisplayName.toJsFn)
    __obj.updateDynamic("getDomainID")(getDomainID.toJsFn)
    __obj.updateDynamic("getEmail")(getEmail.toJsFn)
    __obj.updateDynamic("getFirstName")(getFirstName.toJsFn)
    __obj.updateDynamic("getID")(getID.toJsFn)
    __obj.updateDynamic("getLastName")(getLastName.toJsFn)
    __obj.updateDynamic("getName")(getName.toJsFn)
    __obj.updateDynamic("getPreference")(js.Any.fromFunction1((t0: java.lang.String) => getPreference(t0).runNow()))
    __obj.updateDynamic("getRoles")(getRoles.toJsFn)
    __obj.updateDynamic("getUserRoles")(getUserRoles.toJsFn)
    __obj.updateDynamic("hasRole")(js.Any.fromFunction1((t0: java.lang.String) => hasRole(t0).runNow()))
    __obj.updateDynamic("isMemberOf")(js.Any.fromFunction1((t0: java.lang.String) => isMemberOf(t0).runNow()))
    __obj.updateDynamic("savePreference")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => savePreference(t0, t1).runNow()))
    __obj.asInstanceOf[GlideUser]
  }
}

