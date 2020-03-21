package typingsJapgolly.firefoxWebextBrowser.browser.contentScripts

import typingsJapgolly.firefoxWebextBrowser.browser.extensionTypes.ExtensionFileOrCode
import typingsJapgolly.firefoxWebextBrowser.browser.extensionTypes.RunAt
import typingsJapgolly.firefoxWebextBrowser.browser.manifest.MatchPattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* contentScripts types */
/** Details of a content script registered programmatically */
trait RegisteredContentScriptOptions extends js.Object {
  /**
    * If allFrames is `true`, implies that the JavaScript or CSS should be injected into all frames of current
    * page. By default, it's `false` and is only injected into the top frame.
    */
  var allFrames: js.UndefOr[Boolean] = js.undefined
  /** The list of CSS files to inject */
  var css: js.UndefOr[js.Array[ExtensionFileOrCode]] = js.undefined
  var excludeGlobs: js.UndefOr[js.Array[String]] = js.undefined
  var excludeMatches: js.UndefOr[js.Array[MatchPattern]] = js.undefined
  var includeGlobs: js.UndefOr[js.Array[String]] = js.undefined
  /** The list of JS files to inject */
  @JSName("js")
  var js_ : js.UndefOr[js.Array[ExtensionFileOrCode]] = js.undefined
  /**
    * If matchAboutBlank is true, then the code is also injected in about:blank and about:srcdoc frames if your
    * extension has access to its parent document. Code cannot be inserted in top-level about:-frames. By default
    * it is `false`.
    */
  var matchAboutBlank: js.UndefOr[Boolean] = js.undefined
  var matches: js.Array[MatchPattern]
  /** The soonest that the JavaScript or CSS will be injected into the tab. Defaults to "document_idle". */
  var runAt: js.UndefOr[RunAt] = js.undefined
}

object RegisteredContentScriptOptions {
  @scala.inline
  def apply(
    matches: js.Array[MatchPattern],
    allFrames: js.UndefOr[Boolean] = js.undefined,
    css: js.Array[ExtensionFileOrCode] = null,
    excludeGlobs: js.Array[String] = null,
    excludeMatches: js.Array[MatchPattern] = null,
    includeGlobs: js.Array[String] = null,
    js_ : js.Array[ExtensionFileOrCode] = null,
    matchAboutBlank: js.UndefOr[Boolean] = js.undefined,
    runAt: RunAt = null
  ): RegisteredContentScriptOptions = {
    val __obj = js.Dynamic.literal(matches = matches.asInstanceOf[js.Any])
    if (!js.isUndefined(allFrames)) __obj.updateDynamic("allFrames")(allFrames.asInstanceOf[js.Any])
    if (css != null) __obj.updateDynamic("css")(css.asInstanceOf[js.Any])
    if (excludeGlobs != null) __obj.updateDynamic("excludeGlobs")(excludeGlobs.asInstanceOf[js.Any])
    if (excludeMatches != null) __obj.updateDynamic("excludeMatches")(excludeMatches.asInstanceOf[js.Any])
    if (includeGlobs != null) __obj.updateDynamic("includeGlobs")(includeGlobs.asInstanceOf[js.Any])
    if (js_ != null) __obj.updateDynamic("js")(js_.asInstanceOf[js.Any])
    if (!js.isUndefined(matchAboutBlank)) __obj.updateDynamic("matchAboutBlank")(matchAboutBlank.asInstanceOf[js.Any])
    if (runAt != null) __obj.updateDynamic("runAt")(runAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisteredContentScriptOptions]
  }
}

