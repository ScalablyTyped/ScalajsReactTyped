package typingsJapgolly.vsoNodeApi.buildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VariableMultipliersAgentExecutionOptions extends AgentTargetExecutionOptions {
  /**
    * Indicates whether failure on one agent should prevent the phase from running on other agents.
    */
  var continueOnError: Boolean
  /**
    * The maximum number of agents to use in parallel.
    */
  var maxConcurrency: Double
  var multipliers: js.Array[String]
}

object VariableMultipliersAgentExecutionOptions {
  @scala.inline
  def apply(continueOnError: Boolean, maxConcurrency: Double, multipliers: js.Array[String], `type`: Double): VariableMultipliersAgentExecutionOptions = {
    val __obj = js.Dynamic.literal(continueOnError = continueOnError.asInstanceOf[js.Any], maxConcurrency = maxConcurrency.asInstanceOf[js.Any], multipliers = multipliers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariableMultipliersAgentExecutionOptions]
  }
}

