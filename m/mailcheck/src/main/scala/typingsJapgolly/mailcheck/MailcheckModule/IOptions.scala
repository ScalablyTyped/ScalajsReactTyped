package typingsJapgolly.mailcheck.MailcheckModule

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptions extends js.Object {
  var distanceFunction: js.UndefOr[IDistanceFunction] = js.undefined
  var domains: js.UndefOr[js.Array[String]] = js.undefined
  var email: String
  var empty: js.UndefOr[IEmpty | IJQueryEmpty] = js.undefined
  var secondLevelDomains: js.UndefOr[js.Array[String]] = js.undefined
  var suggested: js.UndefOr[ISuggested | IJQuerySuggested] = js.undefined
  var topLevelDomains: js.UndefOr[js.Array[String]] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    email: String,
    distanceFunction: (/* s1 */ String, /* s2 */ String) => CallbackTo[Double] = null,
    domains: js.Array[String] = null,
    empty: IEmpty | IJQueryEmpty = null,
    secondLevelDomains: js.Array[String] = null,
    suggested: ISuggested | IJQuerySuggested = null,
    topLevelDomains: js.Array[String] = null
  ): IOptions = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
    if (distanceFunction != null) __obj.updateDynamic("distanceFunction")(js.Any.fromFunction2((t0: /* s1 */ java.lang.String, t1: /* s2 */ java.lang.String) => distanceFunction(t0, t1).runNow()))
    if (domains != null) __obj.updateDynamic("domains")(domains.asInstanceOf[js.Any])
    if (empty != null) __obj.updateDynamic("empty")(empty.asInstanceOf[js.Any])
    if (secondLevelDomains != null) __obj.updateDynamic("secondLevelDomains")(secondLevelDomains.asInstanceOf[js.Any])
    if (suggested != null) __obj.updateDynamic("suggested")(suggested.asInstanceOf[js.Any])
    if (topLevelDomains != null) __obj.updateDynamic("topLevelDomains")(topLevelDomains.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

