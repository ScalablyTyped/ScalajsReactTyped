package typingsJapgolly.googleAppsScript.GoogleAppsScript.Language

import typingsJapgolly.googleAppsScript.googleAppsScriptStrings.html
import typingsJapgolly.googleAppsScript.googleAppsScriptStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LanguageAdvancedParameters extends js.Object {
  /** the content type of the text; supported values are 'text' (default) and 'html' */
  var contentType: js.UndefOr[html | text] = js.undefined
}

object LanguageAdvancedParameters {
  @scala.inline
  def apply(contentType: html | text = null): LanguageAdvancedParameters = {
    val __obj = js.Dynamic.literal()
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[LanguageAdvancedParameters]
  }
}

