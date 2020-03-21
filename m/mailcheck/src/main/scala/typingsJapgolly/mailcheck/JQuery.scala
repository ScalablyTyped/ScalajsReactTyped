package typingsJapgolly.mailcheck

import japgolly.scalajs.react.Callback
import typingsJapgolly.mailcheck.MailcheckModule.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQuery extends js.Object {
  def mailcheck(opts: IOptions): Unit
}

object JQuery {
  @scala.inline
  def apply(mailcheck: IOptions => Callback): JQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("mailcheck")(js.Any.fromFunction1((t0: typingsJapgolly.mailcheck.MailcheckModule.IOptions) => mailcheck(t0).runNow()))
    __obj.asInstanceOf[JQuery]
  }
}

