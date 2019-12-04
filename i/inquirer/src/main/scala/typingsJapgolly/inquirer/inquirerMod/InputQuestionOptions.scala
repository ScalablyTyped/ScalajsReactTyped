package typingsJapgolly.inquirer.inquirerMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.inquirer.Anon_IsFinal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides options for a question for the `InputPrompt`.
  *
  * @template T
  * The type of the answers.
  */
trait InputQuestionOptions[T /* <: Answers */] extends Question[T] {
  /**
    * Transforms the value to display to the user.
    *
    * @param input
    * The input provided by the user.
    *
    * @param answers
    * The answers provided by the users.
    *
    * @param flags
    * Additional information about the value.
    *
    * @returns
    * The value to display to the user.
    */
  var transformer: js.UndefOr[
    js.Function3[
      /* input */ js.Any, 
      /* answers */ T, 
      /* flags */ Anon_IsFinal, 
      String | js.Promise[String]
    ]
  ] = js.undefined
}

object InputQuestionOptions {
  @scala.inline
  def apply[T /* <: Answers */](
    default: AsyncDynamicQuestionProperty[_, T] = null,
    filter: /* input */ js.Any => CallbackTo[js.Any] = null,
    message: AsyncDynamicQuestionProperty[String, T] = null,
    name: KeyUnion[T] = null,
    prefix: String = null,
    suffix: String = null,
    transformer: (/* input */ js.Any, /* answers */ T, /* flags */ Anon_IsFinal) => CallbackTo[String | js.Promise[String]] = null,
    `type`: String = null,
    validate: (/* input */ js.Any, /* answers */ js.UndefOr[T]) => CallbackTo[Boolean | String | (js.Promise[Boolean | String])] = null,
    when: AsyncDynamicQuestionProperty[Boolean, T] = null
  ): InputQuestionOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1((t0: /* input */ js.Any) => filter(t0).runNow()))
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    if (transformer != null) __obj.updateDynamic("transformer")(js.Any.fromFunction3((t0: /* input */ js.Any, t1: /* answers */ T, t2: /* flags */ typingsJapgolly.inquirer.Anon_IsFinal) => transformer(t0, t1, t2).runNow()))
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction2((t0: /* input */ js.Any, t1: /* answers */ js.UndefOr[T]) => validate(t0, t1).runNow()))
    if (when != null) __obj.updateDynamic("when")(when.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputQuestionOptions[T]]
  }
}

