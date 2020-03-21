package typingsJapgolly.linkifyjs

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Record<linkifyjs.linkifyjs.LinkEntityType, (href : string): boolean>> */
trait PartialRecordLinkEntityTyMention extends js.Object {
  var email: js.UndefOr[js.Function1[/* href */ String, Boolean]] = js.undefined
  var hashtag: js.UndefOr[js.Function1[/* href */ String, Boolean]] = js.undefined
  var mention: js.UndefOr[js.Function1[/* href */ String, Boolean]] = js.undefined
  var url: js.UndefOr[js.Function1[/* href */ String, Boolean]] = js.undefined
}

object PartialRecordLinkEntityTyMention {
  @scala.inline
  def apply(
    email: /* href */ String => CallbackTo[Boolean] = null,
    hashtag: /* href */ String => CallbackTo[Boolean] = null,
    mention: /* href */ String => CallbackTo[Boolean] = null,
    url: /* href */ String => CallbackTo[Boolean] = null
  ): PartialRecordLinkEntityTyMention = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(js.Any.fromFunction1((t0: /* href */ java.lang.String) => email(t0).runNow()))
    if (hashtag != null) __obj.updateDynamic("hashtag")(js.Any.fromFunction1((t0: /* href */ java.lang.String) => hashtag(t0).runNow()))
    if (mention != null) __obj.updateDynamic("mention")(js.Any.fromFunction1((t0: /* href */ java.lang.String) => mention(t0).runNow()))
    if (url != null) __obj.updateDynamic("url")(js.Any.fromFunction1((t0: /* href */ java.lang.String) => url(t0).runNow()))
    __obj.asInstanceOf[PartialRecordLinkEntityTyMention]
  }
}

