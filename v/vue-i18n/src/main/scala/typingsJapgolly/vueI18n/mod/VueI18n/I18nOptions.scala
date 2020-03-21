package typingsJapgolly.vueI18n.mod.VueI18n

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.vue.vueMod.Vue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line:interface-name
trait I18nOptions extends js.Object {
  var dateTimeFormats: js.UndefOr[DateTimeFormats] = js.undefined
  var fallbackLocale: js.UndefOr[Locale] = js.undefined
  var fallbackRoot: js.UndefOr[Boolean] = js.undefined
  var formatFallbackMessages: js.UndefOr[Boolean] = js.undefined
  var formatter: js.UndefOr[Formatter] = js.undefined
  var locale: js.UndefOr[Locale] = js.undefined
  var messages: js.UndefOr[LocaleMessages] = js.undefined
  var missing: js.UndefOr[MissingHandler] = js.undefined
  var modifiers: js.UndefOr[Modifiers] = js.undefined
  var numberFormats: js.UndefOr[NumberFormats] = js.undefined
  var pluralizationRules: js.UndefOr[PluralizationRulesMap] = js.undefined
  var preserveDirectiveContent: js.UndefOr[Boolean] = js.undefined
  var sharedMessages: js.UndefOr[LocaleMessages] = js.undefined
  var silentFallbackWarn: js.UndefOr[Boolean | js.RegExp] = js.undefined
  var silentTranslationWarn: js.UndefOr[Boolean | js.RegExp] = js.undefined
  var sync: js.UndefOr[Boolean] = js.undefined
  var warnHtmlInMessage: js.UndefOr[WarnHtmlInMessageLevel] = js.undefined
}

object I18nOptions {
  @scala.inline
  def apply(
    dateTimeFormats: DateTimeFormats = null,
    fallbackLocale: Locale = null,
    fallbackRoot: js.UndefOr[Boolean] = js.undefined,
    formatFallbackMessages: js.UndefOr[Boolean] = js.undefined,
    formatter: Formatter = null,
    locale: Locale = null,
    messages: LocaleMessages = null,
    missing: (/* locale */ Locale, /* key */ Path, /* vm */ Vue | Null, /* values */ js.Any) => CallbackTo[String | Unit] = null,
    modifiers: Modifiers = null,
    numberFormats: NumberFormats = null,
    pluralizationRules: PluralizationRulesMap = null,
    preserveDirectiveContent: js.UndefOr[Boolean] = js.undefined,
    sharedMessages: LocaleMessages = null,
    silentFallbackWarn: Boolean | js.RegExp = null,
    silentTranslationWarn: Boolean | js.RegExp = null,
    sync: js.UndefOr[Boolean] = js.undefined,
    warnHtmlInMessage: WarnHtmlInMessageLevel = null
  ): I18nOptions = {
    val __obj = js.Dynamic.literal()
    if (dateTimeFormats != null) __obj.updateDynamic("dateTimeFormats")(dateTimeFormats.asInstanceOf[js.Any])
    if (fallbackLocale != null) __obj.updateDynamic("fallbackLocale")(fallbackLocale.asInstanceOf[js.Any])
    if (!js.isUndefined(fallbackRoot)) __obj.updateDynamic("fallbackRoot")(fallbackRoot.asInstanceOf[js.Any])
    if (!js.isUndefined(formatFallbackMessages)) __obj.updateDynamic("formatFallbackMessages")(formatFallbackMessages.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(formatter.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (missing != null) __obj.updateDynamic("missing")(js.Any.fromFunction4((t0: /* locale */ typingsJapgolly.vueI18n.mod.VueI18n.Locale, t1: /* key */ typingsJapgolly.vueI18n.mod.VueI18n.Path, t2: /* vm */ typingsJapgolly.vue.vueMod.Vue | scala.Null, t3: /* values */ js.Any) => missing(t0, t1, t2, t3).runNow()))
    if (modifiers != null) __obj.updateDynamic("modifiers")(modifiers.asInstanceOf[js.Any])
    if (numberFormats != null) __obj.updateDynamic("numberFormats")(numberFormats.asInstanceOf[js.Any])
    if (pluralizationRules != null) __obj.updateDynamic("pluralizationRules")(pluralizationRules.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveDirectiveContent)) __obj.updateDynamic("preserveDirectiveContent")(preserveDirectiveContent.asInstanceOf[js.Any])
    if (sharedMessages != null) __obj.updateDynamic("sharedMessages")(sharedMessages.asInstanceOf[js.Any])
    if (silentFallbackWarn != null) __obj.updateDynamic("silentFallbackWarn")(silentFallbackWarn.asInstanceOf[js.Any])
    if (silentTranslationWarn != null) __obj.updateDynamic("silentTranslationWarn")(silentTranslationWarn.asInstanceOf[js.Any])
    if (!js.isUndefined(sync)) __obj.updateDynamic("sync")(sync.asInstanceOf[js.Any])
    if (warnHtmlInMessage != null) __obj.updateDynamic("warnHtmlInMessage")(warnHtmlInMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[I18nOptions]
  }
}

