package typingsJapgolly.angularCompiler

import typingsJapgolly.angularCompiler.outputAstMod.JSDocTag
import typingsJapgolly.angularCompiler.outputAstMod.JSDocTagName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTagName extends JSDocTag {
  var tagName: JSDocTagName | String
  var text: js.UndefOr[String] = js.undefined
}

object AnonTagName {
  @scala.inline
  def apply(tagName: JSDocTagName | String, text: String = null): AnonTagName = {
    val __obj = js.Dynamic.literal(tagName = tagName.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTagName]
  }
}

