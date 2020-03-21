package typingsJapgolly.mjmlReact.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.mjmlReact.mjmlReactStrings.skip
import typingsJapgolly.mjmlReact.mjmlReactStrings.soft
import typingsJapgolly.mjmlReact.mjmlReactStrings.strict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mjml2HtmlOptions extends js.Object {
  var beautify: js.UndefOr[Boolean] = js.undefined
  var filePath: js.UndefOr[String] = js.undefined
  var fonts: js.UndefOr[StringDictionary[String]] = js.undefined
  var keepComments: js.UndefOr[Boolean] = js.undefined
  var minify: js.UndefOr[Boolean] = js.undefined
  var validationLevel: js.UndefOr[strict | soft | skip] = js.undefined
}

object Mjml2HtmlOptions {
  @scala.inline
  def apply(
    beautify: js.UndefOr[Boolean] = js.undefined,
    filePath: String = null,
    fonts: StringDictionary[String] = null,
    keepComments: js.UndefOr[Boolean] = js.undefined,
    minify: js.UndefOr[Boolean] = js.undefined,
    validationLevel: strict | soft | skip = null
  ): Mjml2HtmlOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(beautify)) __obj.updateDynamic("beautify")(beautify.asInstanceOf[js.Any])
    if (filePath != null) __obj.updateDynamic("filePath")(filePath.asInstanceOf[js.Any])
    if (fonts != null) __obj.updateDynamic("fonts")(fonts.asInstanceOf[js.Any])
    if (!js.isUndefined(keepComments)) __obj.updateDynamic("keepComments")(keepComments.asInstanceOf[js.Any])
    if (!js.isUndefined(minify)) __obj.updateDynamic("minify")(minify.asInstanceOf[js.Any])
    if (validationLevel != null) __obj.updateDynamic("validationLevel")(validationLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mjml2HtmlOptions]
  }
}

