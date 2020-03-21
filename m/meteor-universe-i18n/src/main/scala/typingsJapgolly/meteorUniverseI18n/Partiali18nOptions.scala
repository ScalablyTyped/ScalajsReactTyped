package typingsJapgolly.meteorUniverseI18n

import japgolly.scalajs.react.Callback
import typingsJapgolly.node.httpMod.OutgoingHttpHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<meteor-universe-i18n.meteor/universe:i18n.i18nOptions> */
trait Partiali18nOptions extends js.Object {
  var close: js.UndefOr[String] = js.undefined
  var defaultLocale: js.UndefOr[String] = js.undefined
  var hideMissing: js.UndefOr[Boolean] = js.undefined
  var hostUrl: js.UndefOr[String] = js.undefined
  var open: js.UndefOr[String] = js.undefined
  var purify: js.UndefOr[js.Function0[Unit]] = js.undefined
  var sameLocaleOnServerConnection: js.UndefOr[Boolean] = js.undefined
  var translationsHeaders: js.UndefOr[OutgoingHttpHeaders] = js.undefined
}

object Partiali18nOptions {
  @scala.inline
  def apply(
    close: String = null,
    defaultLocale: String = null,
    hideMissing: js.UndefOr[Boolean] = js.undefined,
    hostUrl: String = null,
    open: String = null,
    purify: js.UndefOr[Callback] = js.undefined,
    sameLocaleOnServerConnection: js.UndefOr[Boolean] = js.undefined,
    translationsHeaders: OutgoingHttpHeaders = null
  ): Partiali18nOptions = {
    val __obj = js.Dynamic.literal()
    if (close != null) __obj.updateDynamic("close")(close.asInstanceOf[js.Any])
    if (defaultLocale != null) __obj.updateDynamic("defaultLocale")(defaultLocale.asInstanceOf[js.Any])
    if (!js.isUndefined(hideMissing)) __obj.updateDynamic("hideMissing")(hideMissing.asInstanceOf[js.Any])
    if (hostUrl != null) __obj.updateDynamic("hostUrl")(hostUrl.asInstanceOf[js.Any])
    if (open != null) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    purify.foreach(p => __obj.updateDynamic("purify")(p.toJsFn))
    if (!js.isUndefined(sameLocaleOnServerConnection)) __obj.updateDynamic("sameLocaleOnServerConnection")(sameLocaleOnServerConnection.asInstanceOf[js.Any])
    if (translationsHeaders != null) __obj.updateDynamic("translationsHeaders")(translationsHeaders.asInstanceOf[js.Any])
    __obj.asInstanceOf[Partiali18nOptions]
  }
}

