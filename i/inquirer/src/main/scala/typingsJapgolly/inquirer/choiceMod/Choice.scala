package typingsJapgolly.inquirer.choiceMod

import typingsJapgolly.inquirer.inquirerStrings.choice
import typingsJapgolly.inquirer.mod.Answers
import typingsJapgolly.inquirer.mod.CheckboxChoiceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a choice for several question-types.
  *
  * @template T
  * The type of the answers.
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.inquirer.mod.ChoiceBase because Already inherited
- typingsJapgolly.inquirer.mod.ChoiceOptions because Already inherited
- typingsJapgolly.inquirer.mod.ExpandChoiceOptions because var conflicts: extra, name, short, `type`, value. Inlined key */ trait Choice[T /* <: Answers */] extends CheckboxChoiceOptions[T] {
  /**
    * @inheritdoc
    */
  @JSName("disabled")
  var disabled_Choice: Boolean
  /**
    * The key to press for selecting the choice.
    *
    * @inheritdoc
    */
  var key: js.UndefOr[String] = js.undefined
  /**
    * @inheritdoc
    */
  @JSName("name")
  var name_Choice: String
  /**
    * @inheritdoc
    */
  @JSName("short")
  var short_Choice: String
}

object Choice {
  @scala.inline
  def apply[T /* <: Answers */](
    disabled: Boolean,
    name: String,
    short: String,
    checked: js.UndefOr[Boolean] = js.undefined,
    extra: js.Any = null,
    key: String = null,
    `type`: choice = null,
    value: js.Any = null
  ): Choice[T] = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any])
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Choice[T]]
  }
}

