package typingsJapgolly.javascriptTimeAgo.ruMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.few
import typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.one
import typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.other
import typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.ru
import typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.two
import typingsJapgolly.javascriptTimeAgo.localeMod.Duration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Locale extends js.Object {
  var locale: ru
  var long: Duration
  var `long-convenient`: Duration
  var `long-time`: Duration
  var narrow: Duration
  var short: Duration
  var `short-convenient`: Duration
  var `short-time`: Duration
  var tiny: Duration
  def quantify(n: Double): one | two | few | other
}

object Locale {
  @scala.inline
  def apply(
    locale: ru,
    long: Duration,
    `long-convenient`: Duration,
    `long-time`: Duration,
    narrow: Duration,
    quantify: Double => CallbackTo[one | two | few | other],
    short: Duration,
    `short-convenient`: Duration,
    `short-time`: Duration,
    tiny: Duration
  ): Locale = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], long = long.asInstanceOf[js.Any], narrow = narrow.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any], tiny = tiny.asInstanceOf[js.Any])
    __obj.updateDynamic("long-convenient")(`long-convenient`.asInstanceOf[js.Any])
    __obj.updateDynamic("long-time")(`long-time`.asInstanceOf[js.Any])
    __obj.updateDynamic("quantify")(js.Any.fromFunction1((t0: scala.Double) => quantify(t0).runNow()))
    __obj.updateDynamic("short-convenient")(`short-convenient`.asInstanceOf[js.Any])
    __obj.updateDynamic("short-time")(`short-time`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Locale]
  }
}

