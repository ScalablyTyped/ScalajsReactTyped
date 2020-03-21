package typingsJapgolly.javascriptTimeAgo.zhHansMOMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.`zh-Hans-MO`
import typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.few
import typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.one
import typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.other
import typingsJapgolly.javascriptTimeAgo.javascriptTimeAgoStrings.two
import typingsJapgolly.javascriptTimeAgo.localeMod.Duration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Locale extends js.Object {
  var locale: `zh-Hans-MO`
  var long: Duration
  def quantify(n: Double): one | two | few | other
}

object Locale {
  @scala.inline
  def apply(locale: `zh-Hans-MO`, long: Duration, quantify: Double => CallbackTo[one | two | few | other]): Locale = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], long = long.asInstanceOf[js.Any])
    __obj.updateDynamic("quantify")(js.Any.fromFunction1((t0: scala.Double) => quantify(t0).runNow()))
    __obj.asInstanceOf[Locale]
  }
}

