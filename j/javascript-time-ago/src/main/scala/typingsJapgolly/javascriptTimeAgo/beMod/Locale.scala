package typingsJapgolly.javascriptTimeAgo.beMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.be
import typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.few
import typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.one
import typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.other
import typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.two
import typingsJapgolly.javascriptTimeAgo.localeMod.Duration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Locale extends js.Object {
  var locale: be
  var long: Duration
  var narrow: Duration
  var short: Duration
  def quantify(n: Double): one | two | few | other
}

object Locale {
  @scala.inline
  def apply(
    locale: be,
    long: Duration,
    narrow: Duration,
    quantify: Double => CallbackTo[one | two | few | other],
    short: Duration
  ): Locale = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], long = long.asInstanceOf[js.Any], narrow = narrow.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any])
    __obj.updateDynamic("quantify")(js.Any.fromFunction1((t0: scala.Double) => quantify(t0).runNow()))
    __obj.asInstanceOf[Locale]
  }
}

