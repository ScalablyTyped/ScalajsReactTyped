package typingsJapgolly.remarkable.libMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Convert "\n" in paragraphs into <br>.
    */
  var breaks: js.UndefOr[Boolean] = js.undefined
  /**
    * Highlighter function. Should return escaped HTML, or "" if the source
    * string is not changed.
    */
  var highlight: js.UndefOr[js.Function2[/* str */ String, /* lang */ String, String]] = js.undefined
  /**
    * Enable HTML tags in source.
    */
  var html: js.UndefOr[Boolean] = js.undefined
  /**
    * CSS language prefix for fenced blocks.
    */
  var langPrefix: js.UndefOr[String] = js.undefined
  /**
    * Set target to open link in
    */
  var linkTarget: js.UndefOr[String] = js.undefined
  /**
    * Autoconvert URL-like text to links.
    */
  var linkify: js.UndefOr[Boolean] = js.undefined
  /**
    * Double + single quotes replacement pairs, when typographer enabled,
    * and smartquotes on. Set doubles to "«»" for Russian, "„“" for German.
    */
  var quotes: js.UndefOr[String] = js.undefined
  /**
    * Enable some language-neutral replacement + quotes beautification.
    */
  var typographer: js.UndefOr[Boolean] = js.undefined
  /**
    * Use "/" to close single tags (<br />).
    */
  var xhtmlOut: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    breaks: js.UndefOr[Boolean] = js.undefined,
    highlight: (/* str */ String, /* lang */ String) => CallbackTo[String] = null,
    html: js.UndefOr[Boolean] = js.undefined,
    langPrefix: String = null,
    linkTarget: String = null,
    linkify: js.UndefOr[Boolean] = js.undefined,
    quotes: String = null,
    typographer: js.UndefOr[Boolean] = js.undefined,
    xhtmlOut: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(breaks)) __obj.updateDynamic("breaks")(breaks.asInstanceOf[js.Any])
    if (highlight != null) __obj.updateDynamic("highlight")(js.Any.fromFunction2((t0: /* str */ java.lang.String, t1: /* lang */ java.lang.String) => highlight(t0, t1).runNow()))
    if (!js.isUndefined(html)) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (langPrefix != null) __obj.updateDynamic("langPrefix")(langPrefix.asInstanceOf[js.Any])
    if (linkTarget != null) __obj.updateDynamic("linkTarget")(linkTarget.asInstanceOf[js.Any])
    if (!js.isUndefined(linkify)) __obj.updateDynamic("linkify")(linkify.asInstanceOf[js.Any])
    if (quotes != null) __obj.updateDynamic("quotes")(quotes.asInstanceOf[js.Any])
    if (!js.isUndefined(typographer)) __obj.updateDynamic("typographer")(typographer.asInstanceOf[js.Any])
    if (!js.isUndefined(xhtmlOut)) __obj.updateDynamic("xhtmlOut")(xhtmlOut.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

