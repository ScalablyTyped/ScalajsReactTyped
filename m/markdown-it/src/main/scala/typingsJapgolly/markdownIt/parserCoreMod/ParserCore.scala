package typingsJapgolly.markdownIt.parserCoreMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParserCore extends js.Object {
  var State: typingsJapgolly.markdownIt.stateCoreMod.^
  var ruler: typingsJapgolly.markdownIt.rulerMod.^[typingsJapgolly.markdownIt.stateCoreMod.^]
  def process(state: js.Any): Unit
}

object ParserCore {
  @scala.inline
  def apply(
    State: typingsJapgolly.markdownIt.stateCoreMod.^,
    process: js.Any => Callback,
    ruler: typingsJapgolly.markdownIt.rulerMod.^[typingsJapgolly.markdownIt.stateCoreMod.^]
  ): ParserCore = {
    val __obj = js.Dynamic.literal(State = State.asInstanceOf[js.Any], ruler = ruler.asInstanceOf[js.Any])
    __obj.updateDynamic("process")(js.Any.fromFunction1((t0: js.Any) => process(t0).runNow()))
    __obj.asInstanceOf[ParserCore]
  }
}

