package typingsJapgolly.angularCore.timingStrategyMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.angularCore.queryDefinitionMod.NgQueryDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimingStrategy extends js.Object {
  /** Detects the timing result for a given query. */
  def detectTiming(query: NgQueryDefinition): TimingResult
  /** Sets up the given strategy. Throws if the strategy could not be set up. */
  def setup(): Unit
}

object TimingStrategy {
  @scala.inline
  def apply(detectTiming: NgQueryDefinition => CallbackTo[TimingResult], setup: Callback): TimingStrategy = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("detectTiming")(js.Any.fromFunction1((t0: typingsJapgolly.angularCore.queryDefinitionMod.NgQueryDefinition) => detectTiming(t0).runNow()))
    __obj.updateDynamic("setup")(setup.toJsFn)
    __obj.asInstanceOf[TimingStrategy]
  }
}

