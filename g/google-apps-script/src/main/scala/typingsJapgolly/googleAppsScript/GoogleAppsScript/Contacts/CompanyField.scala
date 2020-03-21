package typingsJapgolly.googleAppsScript.GoogleAppsScript.Contacts

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Company field in a Contact.
  */
trait CompanyField extends js.Object {
  def deleteCompanyField(): Unit
  def getCompanyName(): String
  def getJobTitle(): String
  def isPrimary(): Boolean
  def setAsPrimary(): CompanyField
  def setCompanyName(company: String): CompanyField
  def setJobTitle(title: String): CompanyField
}

object CompanyField {
  @scala.inline
  def apply(
    deleteCompanyField: Callback,
    getCompanyName: CallbackTo[String],
    getJobTitle: CallbackTo[String],
    isPrimary: CallbackTo[Boolean],
    setAsPrimary: CallbackTo[CompanyField],
    setCompanyName: String => CallbackTo[CompanyField],
    setJobTitle: String => CallbackTo[CompanyField]
  ): CompanyField = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("deleteCompanyField")(deleteCompanyField.toJsFn)
    __obj.updateDynamic("getCompanyName")(getCompanyName.toJsFn)
    __obj.updateDynamic("getJobTitle")(getJobTitle.toJsFn)
    __obj.updateDynamic("isPrimary")(isPrimary.toJsFn)
    __obj.updateDynamic("setAsPrimary")(setAsPrimary.toJsFn)
    __obj.updateDynamic("setCompanyName")(js.Any.fromFunction1((t0: java.lang.String) => setCompanyName(t0).runNow()))
    __obj.updateDynamic("setJobTitle")(js.Any.fromFunction1((t0: java.lang.String) => setJobTitle(t0).runNow()))
    __obj.asInstanceOf[CompanyField]
  }
}

