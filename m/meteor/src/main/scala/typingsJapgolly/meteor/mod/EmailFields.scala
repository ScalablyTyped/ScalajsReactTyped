package typingsJapgolly.meteor.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.meteor.Meteor.User_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailFields extends js.Object {
  var from: js.UndefOr[js.Function0[String]] = js.undefined
  var html: js.UndefOr[js.Function2[/* user */ User_, /* url */ String, String]] = js.undefined
  var subject: js.UndefOr[js.Function1[/* user */ User_, String]] = js.undefined
  var text: js.UndefOr[js.Function2[/* user */ User_, /* url */ String, String]] = js.undefined
}

object EmailFields {
  @scala.inline
  def apply(
    from: js.UndefOr[CallbackTo[String]] = js.undefined,
    html: (/* user */ User_, /* url */ String) => CallbackTo[String] = null,
    subject: /* user */ User_ => CallbackTo[String] = null,
    text: (/* user */ User_, /* url */ String) => CallbackTo[String] = null
  ): EmailFields = {
    val __obj = js.Dynamic.literal()
    from.foreach(p => __obj.updateDynamic("from")(p.toJsFn))
    if (html != null) __obj.updateDynamic("html")(js.Any.fromFunction2((t0: /* user */ typingsJapgolly.meteor.Meteor.User_, t1: /* url */ java.lang.String) => html(t0, t1).runNow()))
    if (subject != null) __obj.updateDynamic("subject")(js.Any.fromFunction1((t0: /* user */ typingsJapgolly.meteor.Meteor.User_) => subject(t0).runNow()))
    if (text != null) __obj.updateDynamic("text")(js.Any.fromFunction2((t0: /* user */ typingsJapgolly.meteor.Meteor.User_, t1: /* url */ java.lang.String) => text(t0, t1).runNow()))
    __obj.asInstanceOf[EmailFields]
  }
}

