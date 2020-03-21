package typingsJapgolly.yaml.mod.cst

import typingsJapgolly.yaml.yamlStrings.Colon
import typingsJapgolly.yaml.yamlStrings.Comma
import typingsJapgolly.yaml.yamlStrings.Leftcurlybracket
import typingsJapgolly.yaml.yamlStrings.Questionmark
import typingsJapgolly.yaml.yamlStrings.Rightcurlybracket
import typingsJapgolly.yaml.yamlStrings.`[`
import typingsJapgolly.yaml.yamlStrings.`]`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlowChar extends js.Object {
  var char: Leftcurlybracket | Rightcurlybracket | `[` | `]` | Comma | Questionmark | Colon
  var offset: Double
  var origOffset: js.UndefOr[Double] = js.undefined
}

object FlowChar {
  @scala.inline
  def apply(
    char: Leftcurlybracket | Rightcurlybracket | `[` | `]` | Comma | Questionmark | Colon,
    offset: Double,
    origOffset: Int | Double = null
  ): FlowChar = {
    val __obj = js.Dynamic.literal(char = char.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    if (origOffset != null) __obj.updateDynamic("origOffset")(origOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowChar]
  }
}

