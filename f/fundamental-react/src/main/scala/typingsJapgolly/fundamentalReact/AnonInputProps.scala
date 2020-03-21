package typingsJapgolly.fundamentalReact

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInputProps extends js.Object {
  var inputProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var language: js.UndefOr[String] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
}

object AnonInputProps {
  @scala.inline
  def apply(inputProps: StringDictionary[js.Any] = null, language: String = null, placeholder: String = null): AnonInputProps = {
    val __obj = js.Dynamic.literal()
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInputProps]
  }
}

