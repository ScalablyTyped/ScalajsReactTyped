package typingsJapgolly.linkifyjs

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Record<linkifyjs.linkifyjs.LinkEntityType, (href : string): string>> */
trait PartialRecordLinkEntityTyEmail extends js.Object {
  var email: js.UndefOr[js.Function1[/* value */ String, String]] = js.undefined
  var hashtag: js.UndefOr[js.Function1[/* value */ String, String]] = js.undefined
  var mention: js.UndefOr[js.Function1[/* value */ String, String]] = js.undefined
  var url: js.UndefOr[js.Function1[/* value */ String, String]] = js.undefined
}

object PartialRecordLinkEntityTyEmail {
  @scala.inline
  def apply(
    email: /* value */ String => CallbackTo[String] = null,
    hashtag: /* value */ String => CallbackTo[String] = null,
    mention: /* value */ String => CallbackTo[String] = null,
    url: /* value */ String => CallbackTo[String] = null
  ): PartialRecordLinkEntityTyEmail = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(js.Any.fromFunction1((t0: /* value */ java.lang.String) => email(t0).runNow()))
    if (hashtag != null) __obj.updateDynamic("hashtag")(js.Any.fromFunction1((t0: /* value */ java.lang.String) => hashtag(t0).runNow()))
    if (mention != null) __obj.updateDynamic("mention")(js.Any.fromFunction1((t0: /* value */ java.lang.String) => mention(t0).runNow()))
    if (url != null) __obj.updateDynamic("url")(js.Any.fromFunction1((t0: /* value */ java.lang.String) => url(t0).runNow()))
    __obj.asInstanceOf[PartialRecordLinkEntityTyEmail]
  }
}

