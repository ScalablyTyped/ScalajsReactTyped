package typingsJapgolly.apolloEngineReporting

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.apolloEngineReporting.agentMod.VariableValueOptions
import typingsJapgolly.apolloEngineReporting.agentMod.VariableValueTransformOptions
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTransform extends VariableValueOptions {
  def transform(options: VariableValueTransformOptions): Record[String, _]
}

object AnonTransform {
  @scala.inline
  def apply(transform: VariableValueTransformOptions => CallbackTo[Record[String, js.Any]]): AnonTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("transform")(js.Any.fromFunction1((t0: typingsJapgolly.apolloEngineReporting.agentMod.VariableValueTransformOptions) => transform(t0).runNow()))
    __obj.asInstanceOf[AnonTransform]
  }
}

