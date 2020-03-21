package typingsJapgolly.reactNativeFirebase.mod.RNFirebase.links

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnalyticsParameters extends js.Object {
  def setCampaign(campaign: String): DynamicLink
  def setContent(content: String): DynamicLink
  def setMedium(medium: String): DynamicLink
  def setSource(source: String): DynamicLink
  def setTerm(term: String): DynamicLink
}

object AnalyticsParameters {
  @scala.inline
  def apply(
    setCampaign: String => CallbackTo[DynamicLink],
    setContent: String => CallbackTo[DynamicLink],
    setMedium: String => CallbackTo[DynamicLink],
    setSource: String => CallbackTo[DynamicLink],
    setTerm: String => CallbackTo[DynamicLink]
  ): AnalyticsParameters = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("setCampaign")(js.Any.fromFunction1((t0: java.lang.String) => setCampaign(t0).runNow()))
    __obj.updateDynamic("setContent")(js.Any.fromFunction1((t0: java.lang.String) => setContent(t0).runNow()))
    __obj.updateDynamic("setMedium")(js.Any.fromFunction1((t0: java.lang.String) => setMedium(t0).runNow()))
    __obj.updateDynamic("setSource")(js.Any.fromFunction1((t0: java.lang.String) => setSource(t0).runNow()))
    __obj.updateDynamic("setTerm")(js.Any.fromFunction1((t0: java.lang.String) => setTerm(t0).runNow()))
    __obj.asInstanceOf[AnalyticsParameters]
  }
}

