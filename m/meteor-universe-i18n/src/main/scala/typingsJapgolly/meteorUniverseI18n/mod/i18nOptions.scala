package typingsJapgolly.meteorUniverseI18n.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.node.httpMod.OutgoingHttpHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait i18nOptions extends js.Object {
  var close: String
  var defaultLocale: String
  var hideMissing: Boolean
  var hostUrl: String
  var open: String
  var purify: js.UndefOr[js.Function0[Unit]] = js.undefined
  var sameLocaleOnServerConnection: Boolean
  var translationsHeaders: js.UndefOr[OutgoingHttpHeaders] = js.undefined
}

object i18nOptions {
  @scala.inline
  def apply(
    close: String,
    defaultLocale: String,
    hideMissing: Boolean,
    hostUrl: String,
    open: String,
    sameLocaleOnServerConnection: Boolean,
    purify: js.UndefOr[Callback] = js.undefined,
    translationsHeaders: OutgoingHttpHeaders = null
  ): i18nOptions = {
    val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], defaultLocale = defaultLocale.asInstanceOf[js.Any], hideMissing = hideMissing.asInstanceOf[js.Any], hostUrl = hostUrl.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], sameLocaleOnServerConnection = sameLocaleOnServerConnection.asInstanceOf[js.Any])
    purify.foreach(p => __obj.updateDynamic("purify")(p.toJsFn))
    if (translationsHeaders != null) __obj.updateDynamic("translationsHeaders")(translationsHeaders.asInstanceOf[js.Any])
    __obj.asInstanceOf[i18nOptions]
  }
}

