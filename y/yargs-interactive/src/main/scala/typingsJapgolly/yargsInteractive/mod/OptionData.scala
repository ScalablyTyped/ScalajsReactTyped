package typingsJapgolly.yargsInteractive.mod

import typingsJapgolly.yargsInteractive.yargsInteractiveStrings.`if-empty`
import typingsJapgolly.yargsInteractive.yargsInteractiveStrings.`if-no-arg`
import typingsJapgolly.yargsInteractive.yargsInteractiveStrings.always
import typingsJapgolly.yargsInteractive.yargsInteractiveStrings.checkbox
import typingsJapgolly.yargsInteractive.yargsInteractiveStrings.confirm
import typingsJapgolly.yargsInteractive.yargsInteractiveStrings.editor
import typingsJapgolly.yargsInteractive.yargsInteractiveStrings.expand
import typingsJapgolly.yargsInteractive.yargsInteractiveStrings.input
import typingsJapgolly.yargsInteractive.yargsInteractiveStrings.list
import typingsJapgolly.yargsInteractive.yargsInteractiveStrings.never
import typingsJapgolly.yargsInteractive.yargsInteractiveStrings.number
import typingsJapgolly.yargsInteractive.yargsInteractiveStrings.password
import typingsJapgolly.yargsInteractive.yargsInteractiveStrings.rawlist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionData extends js.Object {
  var choices: js.UndefOr[js.Array[String]] = js.undefined
  var default: js.UndefOr[String | Double | Boolean | js.Array[_]] = js.undefined
  var describe: String
  var prompt: js.UndefOr[always | never | `if-no-arg` | `if-empty`] = js.undefined
  var `type`: input | number | confirm | list | rawlist | expand | checkbox | password | editor
}

object OptionData {
  @scala.inline
  def apply(
    describe: String,
    `type`: input | number | confirm | list | rawlist | expand | checkbox | password | editor,
    choices: js.Array[String] = null,
    default: String | Double | Boolean | js.Array[_] = null,
    prompt: always | never | `if-no-arg` | `if-empty` = null
  ): OptionData = {
    val __obj = js.Dynamic.literal(describe = describe.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (choices != null) __obj.updateDynamic("choices")(choices.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (prompt != null) __obj.updateDynamic("prompt")(prompt.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionData]
  }
}

