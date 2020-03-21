package typingsJapgolly.i18next.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InterpolationOptions extends js.Object {
  /**
    * Global variables to use in interpolation replacements
    * @default undefined
    */
  var defaultVariables: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /**
    * Escape function
    * @default str => str
    */
  var escape: js.UndefOr[js.Function1[/* str */ String, String]] = js.undefined
  /**
    * Escape passed in values to avoid xss injection
    * @default true
    */
  var escapeValue: js.UndefOr[Boolean] = js.undefined
  /**
    * Format function see formatting for details
    * @default noop
    */
  var format: js.UndefOr[FormatFunction] = js.undefined
  /**
    * Used to separate format from interpolation value
    * @default ','
    */
  var formatSeparator: js.UndefOr[String] = js.undefined
  /**
    * After how many interpolation runs to break out before throwing a stack overflow
    * @default 1000
    */
  var maxReplaces: js.UndefOr[Double] = js.undefined
  /**
    * Prefix for nesting
    * @default '$t('
    */
  var nestingPrefix: js.UndefOr[String] = js.undefined
  /**
    * Escaped prefix for nesting (regexSafe)
    * @default undefined
    */
  var nestingPrefixEscaped: js.UndefOr[String] = js.undefined
  /**
    * Suffix for nesting
    * @default ')'
    */
  var nestingSuffix: js.UndefOr[String] = js.undefined
  /**
    * Escaped suffix for nesting (regexSafe)
    * @default undefined
    */
  var nestingSuffixEscaped: js.UndefOr[String] = js.undefined
  /**
    * Prefix for interpolation
    * @default '{{'
    */
  var prefix: js.UndefOr[String] = js.undefined
  /**
    * Escaped prefix for interpolation (regexSafe)
    * @default undefined
    */
  var prefixEscaped: js.UndefOr[String] = js.undefined
  /**
    * Suffix for interpolation
    * @default '}}'
    */
  var suffix: js.UndefOr[String] = js.undefined
  /**
    * Escaped suffix for interpolation (regexSafe)
    * @default undefined
    */
  var suffixEscaped: js.UndefOr[String] = js.undefined
  /**
    * Prefix to unescaped mode
    * @default '-'
    */
  var unescapePrefix: js.UndefOr[String] = js.undefined
  /**
    * Suffix to unescaped mode
    * @default undefined
    */
  var unescapeSuffix: js.UndefOr[String] = js.undefined
  /**
    * If true, then value passed into escape function is not casted to string, use with custom escape function that does its own type check
    * @default false
    */
  var useRawValueToEscape: js.UndefOr[Boolean] = js.undefined
}

object InterpolationOptions {
  @scala.inline
  def apply(
    defaultVariables: StringDictionary[js.Any] = null,
    escape: /* str */ String => CallbackTo[String] = null,
    escapeValue: js.UndefOr[Boolean] = js.undefined,
    format: (/* value */ js.Any, /* format */ js.UndefOr[String], /* lng */ js.UndefOr[String]) => CallbackTo[String] = null,
    formatSeparator: String = null,
    maxReplaces: Int | Double = null,
    nestingPrefix: String = null,
    nestingPrefixEscaped: String = null,
    nestingSuffix: String = null,
    nestingSuffixEscaped: String = null,
    prefix: String = null,
    prefixEscaped: String = null,
    suffix: String = null,
    suffixEscaped: String = null,
    unescapePrefix: String = null,
    unescapeSuffix: String = null,
    useRawValueToEscape: js.UndefOr[Boolean] = js.undefined
  ): InterpolationOptions = {
    val __obj = js.Dynamic.literal()
    if (defaultVariables != null) __obj.updateDynamic("defaultVariables")(defaultVariables.asInstanceOf[js.Any])
    if (escape != null) __obj.updateDynamic("escape")(js.Any.fromFunction1((t0: /* str */ java.lang.String) => escape(t0).runNow()))
    if (!js.isUndefined(escapeValue)) __obj.updateDynamic("escapeValue")(escapeValue.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(js.Any.fromFunction3((t0: /* value */ js.Any, t1: /* format */ js.UndefOr[java.lang.String], t2: /* lng */ js.UndefOr[java.lang.String]) => format(t0, t1, t2).runNow()))
    if (formatSeparator != null) __obj.updateDynamic("formatSeparator")(formatSeparator.asInstanceOf[js.Any])
    if (maxReplaces != null) __obj.updateDynamic("maxReplaces")(maxReplaces.asInstanceOf[js.Any])
    if (nestingPrefix != null) __obj.updateDynamic("nestingPrefix")(nestingPrefix.asInstanceOf[js.Any])
    if (nestingPrefixEscaped != null) __obj.updateDynamic("nestingPrefixEscaped")(nestingPrefixEscaped.asInstanceOf[js.Any])
    if (nestingSuffix != null) __obj.updateDynamic("nestingSuffix")(nestingSuffix.asInstanceOf[js.Any])
    if (nestingSuffixEscaped != null) __obj.updateDynamic("nestingSuffixEscaped")(nestingSuffixEscaped.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (prefixEscaped != null) __obj.updateDynamic("prefixEscaped")(prefixEscaped.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    if (suffixEscaped != null) __obj.updateDynamic("suffixEscaped")(suffixEscaped.asInstanceOf[js.Any])
    if (unescapePrefix != null) __obj.updateDynamic("unescapePrefix")(unescapePrefix.asInstanceOf[js.Any])
    if (unescapeSuffix != null) __obj.updateDynamic("unescapeSuffix")(unescapeSuffix.asInstanceOf[js.Any])
    if (!js.isUndefined(useRawValueToEscape)) __obj.updateDynamic("useRawValueToEscape")(useRawValueToEscape.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterpolationOptions]
  }
}

