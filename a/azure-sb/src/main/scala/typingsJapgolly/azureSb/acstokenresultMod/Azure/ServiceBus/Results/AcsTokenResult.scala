package typingsJapgolly.azureSb.acstokenresultMod.Azure.ServiceBus.Results

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AcsTokenResult extends js.Object {
  def parse(acsTokenQueryString: String): AcsTokenResponse
}

object AcsTokenResult {
  @scala.inline
  def apply(parse: String => CallbackTo[AcsTokenResponse]): AcsTokenResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("parse")(js.Any.fromFunction1((t0: java.lang.String) => parse(t0).runNow()))
    __obj.asInstanceOf[AcsTokenResult]
  }
}

