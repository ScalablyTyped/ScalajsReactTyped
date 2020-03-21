package typingsJapgolly.cypress.Chai_

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssertionPrototype extends js.Object {
  var _obj: js.Any
  def assert(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type AssertionArgs is not an array type */ args: AssertionArgs
  ): Unit
}

object AssertionPrototype {
  @scala.inline
  def apply(_obj: js.Any, assert: AssertionArgs => Callback): AssertionPrototype = {
    val __obj = js.Dynamic.literal(_obj = _obj.asInstanceOf[js.Any])
    __obj.updateDynamic("assert")(js.Any.fromFunction1((t0: typingsJapgolly.cypress.Chai_.AssertionArgs) => assert(t0).runNow()))
    __obj.asInstanceOf[AssertionPrototype]
  }
}

