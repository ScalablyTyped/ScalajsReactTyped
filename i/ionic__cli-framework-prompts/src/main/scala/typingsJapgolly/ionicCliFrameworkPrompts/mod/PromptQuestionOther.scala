package typingsJapgolly.ionicCliFrameworkPrompts.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.inquirer.mod.Answers
import typingsJapgolly.inquirer.mod.AsyncDynamicQuestionProperty
import typingsJapgolly.inquirer.mod.KeyUnion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromptQuestionOther
  extends PromptQuestionBase
     with PromptQuestion {
  @JSName("default")
  var default_PromptQuestionOther: js.UndefOr[PromptValueOther] = js.undefined
  @JSName("fallback")
  var fallback_PromptQuestionOther: js.UndefOr[PromptValueOther] = js.undefined
  @JSName("type")
  var type_PromptQuestionOther: PromptTypeOther
}

object PromptQuestionOther {
  @scala.inline
  def apply(
    message: String,
    `type`: PromptTypeOther,
    default: PromptValueOther = null,
    fallback: PromptValueOther = null,
    filter: /* input */ js.Any => CallbackTo[js.Any] = null,
    name: KeyUnion[Answers] = null,
    prefix: String = null,
    suffix: String = null,
    validate: (/* input */ js.Any, /* answers */ js.UndefOr[Answers]) => CallbackTo[Boolean | String | (js.Promise[Boolean | String])] = null,
    when: AsyncDynamicQuestionProperty[Boolean, Answers] = null
  ): PromptQuestionOther = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (fallback != null) __obj.updateDynamic("fallback")(fallback.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1((t0: /* input */ js.Any) => filter(t0).runNow()))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction2((t0: /* input */ js.Any, t1: /* answers */ js.UndefOr[typingsJapgolly.inquirer.mod.Answers]) => validate(t0, t1).runNow()))
    if (when != null) __obj.updateDynamic("when")(when.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromptQuestionOther]
  }
}

