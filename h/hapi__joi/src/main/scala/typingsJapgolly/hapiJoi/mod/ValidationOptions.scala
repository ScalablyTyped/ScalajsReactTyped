package typingsJapgolly.hapiJoi.mod

import typingsJapgolly.hapiJoi.AnonArrays
import typingsJapgolly.hapiJoi.hapiJoiStrings.date
import typingsJapgolly.hapiJoi.hapiJoiStrings.iso
import typingsJapgolly.hapiJoi.hapiJoiStrings.string
import typingsJapgolly.hapiJoi.hapiJoiStrings.time
import typingsJapgolly.hapiJoi.hapiJoiStrings.utc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationOptions extends BaseValidationOptions {
  /**
    * overrides individual error messages. Defaults to no override (`{}`).
    * Messages use the same rules as templates.
    * Variables in double braces `{{var}}` are HTML escaped if the option `errors.escapeHtml` is set to true.
    *
    * @default {}
    */
  var messages: js.UndefOr[LanguageMessages] = js.undefined
}

object ValidationOptions {
  @scala.inline
  def apply(
    abortEarly: js.UndefOr[Boolean] = js.undefined,
    allowUnknown: js.UndefOr[Boolean] = js.undefined,
    cache: js.UndefOr[Boolean] = js.undefined,
    context: Context = null,
    convert: js.UndefOr[Boolean] = js.undefined,
    dateFormat: date | iso | string | time | utc = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    errors: ErrorFormattingOptions = null,
    externals: js.UndefOr[Boolean] = js.undefined,
    messages: LanguageMessages = null,
    noDefaults: js.UndefOr[Boolean] = js.undefined,
    nonEnumerables: js.UndefOr[Boolean] = js.undefined,
    presence: PresenceMode = null,
    skipFunctions: js.UndefOr[Boolean] = js.undefined,
    stripUnknown: Boolean | AnonArrays = null
  ): ValidationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(abortEarly)) __obj.updateDynamic("abortEarly")(abortEarly.asInstanceOf[js.Any])
    if (!js.isUndefined(allowUnknown)) __obj.updateDynamic("allowUnknown")(allowUnknown.asInstanceOf[js.Any])
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (!js.isUndefined(convert)) __obj.updateDynamic("convert")(convert.asInstanceOf[js.Any])
    if (dateFormat != null) __obj.updateDynamic("dateFormat")(dateFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (!js.isUndefined(externals)) __obj.updateDynamic("externals")(externals.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (!js.isUndefined(noDefaults)) __obj.updateDynamic("noDefaults")(noDefaults.asInstanceOf[js.Any])
    if (!js.isUndefined(nonEnumerables)) __obj.updateDynamic("nonEnumerables")(nonEnumerables.asInstanceOf[js.Any])
    if (presence != null) __obj.updateDynamic("presence")(presence.asInstanceOf[js.Any])
    if (!js.isUndefined(skipFunctions)) __obj.updateDynamic("skipFunctions")(skipFunctions.asInstanceOf[js.Any])
    if (stripUnknown != null) __obj.updateDynamic("stripUnknown")(stripUnknown.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationOptions]
  }
}

