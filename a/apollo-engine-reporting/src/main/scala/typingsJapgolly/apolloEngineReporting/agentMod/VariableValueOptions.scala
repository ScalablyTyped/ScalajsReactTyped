package typingsJapgolly.apolloEngineReporting.agentMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.apolloEngineReporting.apolloEngineReportingBooleans.`true`
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.apolloEngineReporting.AnonTransform
  - typingsJapgolly.apolloEngineReporting.agentMod.SendValuesBaseOptions
*/
trait VariableValueOptions extends js.Object

object VariableValueOptions {
  @scala.inline
  def AnonOnlyNames(onlyNames: js.Array[String]): VariableValueOptions = {
    val __obj = js.Dynamic.literal(onlyNames = onlyNames.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VariableValueOptions]
  }
  @scala.inline
  def AnonExceptNames(exceptNames: js.Array[String]): VariableValueOptions = {
    val __obj = js.Dynamic.literal(exceptNames = exceptNames.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VariableValueOptions]
  }
  @scala.inline
  def AnonAll(all: `true`): VariableValueOptions = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VariableValueOptions]
  }
  @scala.inline
  def AnonTransform(transform: VariableValueTransformOptions => CallbackTo[Record[String, js.Any]]): VariableValueOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("transform")(js.Any.fromFunction1((t0: typingsJapgolly.apolloEngineReporting.agentMod.VariableValueTransformOptions) => transform(t0).runNow()))
    __obj.asInstanceOf[VariableValueOptions]
  }
  @scala.inline
  def AnonNone(none: `true`): VariableValueOptions = {
    val __obj = js.Dynamic.literal(none = none.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VariableValueOptions]
  }
}

