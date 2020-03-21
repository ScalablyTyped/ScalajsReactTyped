package typingsJapgolly.sendgrid.mod.SendGrid.Helpers.Mail

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.sendgrid.AnonUtmcampaign
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ganalytics extends js.Object {
  def getContent(): String
  def getEnable(): Boolean
  def getUrmMedium(): String
  def getUrmTerm(): String
  def getUtmCampaign(): String
  def getUtmSource(): String
  def setContent(content: String): Unit
  def setEnable(enabled: Boolean): Unit
  def setUrmMedium(medium: String): Unit
  def setUrmTerm(term: String): Unit
  def setUtmCampaign(campaign: String): Unit
  def setUtmSource(source: String): Unit
  def toJSON(): AnonUtmcampaign
}

object Ganalytics {
  @scala.inline
  def apply(
    getContent: CallbackTo[String],
    getEnable: CallbackTo[Boolean],
    getUrmMedium: CallbackTo[String],
    getUrmTerm: CallbackTo[String],
    getUtmCampaign: CallbackTo[String],
    getUtmSource: CallbackTo[String],
    setContent: String => Callback,
    setEnable: Boolean => Callback,
    setUrmMedium: String => Callback,
    setUrmTerm: String => Callback,
    setUtmCampaign: String => Callback,
    setUtmSource: String => Callback,
    toJSON: CallbackTo[AnonUtmcampaign]
  ): Ganalytics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getContent")(getContent.toJsFn)
    __obj.updateDynamic("getEnable")(getEnable.toJsFn)
    __obj.updateDynamic("getUrmMedium")(getUrmMedium.toJsFn)
    __obj.updateDynamic("getUrmTerm")(getUrmTerm.toJsFn)
    __obj.updateDynamic("getUtmCampaign")(getUtmCampaign.toJsFn)
    __obj.updateDynamic("getUtmSource")(getUtmSource.toJsFn)
    __obj.updateDynamic("setContent")(js.Any.fromFunction1((t0: java.lang.String) => setContent(t0).runNow()))
    __obj.updateDynamic("setEnable")(js.Any.fromFunction1((t0: scala.Boolean) => setEnable(t0).runNow()))
    __obj.updateDynamic("setUrmMedium")(js.Any.fromFunction1((t0: java.lang.String) => setUrmMedium(t0).runNow()))
    __obj.updateDynamic("setUrmTerm")(js.Any.fromFunction1((t0: java.lang.String) => setUrmTerm(t0).runNow()))
    __obj.updateDynamic("setUtmCampaign")(js.Any.fromFunction1((t0: java.lang.String) => setUtmCampaign(t0).runNow()))
    __obj.updateDynamic("setUtmSource")(js.Any.fromFunction1((t0: java.lang.String) => setUtmSource(t0).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.asInstanceOf[Ganalytics]
  }
}

