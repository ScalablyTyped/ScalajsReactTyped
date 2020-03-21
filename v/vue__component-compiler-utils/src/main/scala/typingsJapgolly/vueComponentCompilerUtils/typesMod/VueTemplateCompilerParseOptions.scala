package typingsJapgolly.vueComponentCompilerUtils.typesMod

import typingsJapgolly.vueComponentCompilerUtils.vueComponentCompilerUtilsStrings.line
import typingsJapgolly.vueComponentCompilerUtils.vueComponentCompilerUtilsStrings.space
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VueTemplateCompilerParseOptions extends js.Object {
  var pad: js.UndefOr[line | space] = js.undefined
}

object VueTemplateCompilerParseOptions {
  @scala.inline
  def apply(pad: line | space = null): VueTemplateCompilerParseOptions = {
    val __obj = js.Dynamic.literal()
    if (pad != null) __obj.updateDynamic("pad")(pad.asInstanceOf[js.Any])
    __obj.asInstanceOf[VueTemplateCompilerParseOptions]
  }
}

