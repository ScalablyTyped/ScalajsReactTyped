package typingsJapgolly.inquirer.inquirerMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.inquirer.inquirerStrings.editor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides options for a question for the `EditorPrompt`.
  *
  * @template T
  * The type of the answers.
  */
trait EditorQuestion[T /* <: Answers */]
  extends Question[T]
     with DistinctQuestion[T] {
  /**
    * @inheritdoc
    */
  @JSName("type")
  var type_EditorQuestion: editor
}

object EditorQuestion {
  @scala.inline
  def apply[T /* <: Answers */](
    `type`: editor,
    default: AsyncDynamicQuestionProperty[_, T] = null,
    filter: /* input */ js.Any => CallbackTo[js.Any] = null,
    message: AsyncDynamicQuestionProperty[String, T] = null,
    name: KeyUnion[T] = null,
    prefix: String = null,
    suffix: String = null,
    validate: (/* input */ js.Any, /* answers */ js.UndefOr[T]) => CallbackTo[Boolean | String | (js.Promise[Boolean | String])] = null,
    when: AsyncDynamicQuestionProperty[Boolean, T] = null
  ): EditorQuestion[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1((t0: /* input */ js.Any) => filter(t0).runNow()))
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction2((t0: /* input */ js.Any, t1: /* answers */ js.UndefOr[T]) => validate(t0, t1).runNow()))
    if (when != null) __obj.updateDynamic("when")(when.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorQuestion[T]]
  }
}

