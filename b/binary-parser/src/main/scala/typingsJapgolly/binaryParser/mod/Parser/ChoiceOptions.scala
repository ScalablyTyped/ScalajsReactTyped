package typingsJapgolly.binaryParser.mod.Parser

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChoiceOptions extends Options {
  var choices: NumberDictionary[typingsJapgolly.binaryParser.mod.Parser[_] | String]
  var defaultChoice: js.UndefOr[typingsJapgolly.binaryParser.mod.Parser[_] | String] = js.undefined
  var tag: String | (js.ThisFunction0[/* this */ typingsJapgolly.binaryParser.mod.Parser[_], Double])
}

object ChoiceOptions {
  @scala.inline
  def apply(
    choices: NumberDictionary[typingsJapgolly.binaryParser.mod.Parser[_] | String],
    tag: String | (js.ThisFunction0[/* this */ typingsJapgolly.binaryParser.mod.Parser[_], Double]),
    assert: String | Double | (js.Function1[/* value */ Data, Boolean]) = null,
    defaultChoice: typingsJapgolly.binaryParser.mod.Parser[_] | String = null,
    formatter: /* value */ Data => CallbackTo[js.Any] = null
  ): ChoiceOptions = {
    val __obj = js.Dynamic.literal(choices = choices.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    if (assert != null) __obj.updateDynamic("assert")(assert.asInstanceOf[js.Any])
    if (defaultChoice != null) __obj.updateDynamic("defaultChoice")(defaultChoice.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(js.Any.fromFunction1((t0: /* value */ typingsJapgolly.binaryParser.mod.Parser.Data) => formatter(t0).runNow()))
    __obj.asInstanceOf[ChoiceOptions]
  }
}

