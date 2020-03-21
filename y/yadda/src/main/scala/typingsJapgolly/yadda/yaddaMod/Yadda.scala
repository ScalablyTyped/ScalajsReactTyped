package typingsJapgolly.yadda.yaddaMod

import typingsJapgolly.std.Error
import typingsJapgolly.yadda.contextMod.Properties
import typingsJapgolly.yadda.libMod.Scenario
import typingsJapgolly.yadda.libMod.Step
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Yadda extends js.Object {
  var interpreter: typingsJapgolly.yadda.interpreterMod.^ = js.native
  def run(scenario: js.Array[Scenario | Step]): Unit = js.native
  def run(scenario: js.Array[Scenario | Step], next: js.Function1[Error | Null, Unit]): Unit = js.native
  def run(scenario: js.Array[Scenario | Step], scenario_context: Properties): Unit = js.native
  def run(
    scenario: js.Array[Scenario | Step],
    scenario_context: Properties,
    next: js.Function1[js.Error | Null, Unit]
  ): Unit = js.native
  def run(scenario: js.Array[Scenario | Step], scenario_context: typingsJapgolly.yadda.contextMod.^): Unit = js.native
  def run(
    scenario: js.Array[Scenario | Step],
    scenario_context: typingsJapgolly.yadda.contextMod.^,
    next: js.Function1[js.Error | Null, Unit]
  ): Unit = js.native
  def run(scenario: Scenario): Unit = js.native
  def run(scenario: Scenario, next: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  def run(scenario: Scenario, scenario_context: Properties): Unit = js.native
  def run(
    scenario: Scenario,
    scenario_context: Properties,
    next: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  def run(scenario: Scenario, scenario_context: typingsJapgolly.yadda.contextMod.^): Unit = js.native
  def run(
    scenario: Scenario,
    scenario_context: typingsJapgolly.yadda.contextMod.^,
    next: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  def run(step: Step): Unit = js.native
  def run(step: Step, next: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  def run(step: Step, scenario_context: Properties): Unit = js.native
  def run(step: Step, scenario_context: Properties, next: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  def run(step: Step, scenario_context: typingsJapgolly.yadda.contextMod.^): Unit = js.native
  def run(
    step: Step,
    scenario_context: typingsJapgolly.yadda.contextMod.^,
    next: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  def yadda(scenario: js.Array[Scenario | Step]): Unit = js.native
  def yadda(scenario: js.Array[Scenario | Step], next: js.Function1[Error | Null, Unit]): Unit = js.native
  def yadda(scenario: js.Array[Scenario | Step], scenario_context: Properties): Unit = js.native
  def yadda(
    scenario: js.Array[Scenario | Step],
    scenario_context: Properties,
    next: js.Function1[js.Error | Null, Unit]
  ): Unit = js.native
  def yadda(scenario: js.Array[Scenario | Step], scenario_context: typingsJapgolly.yadda.contextMod.^): Unit = js.native
  def yadda(
    scenario: js.Array[Scenario | Step],
    scenario_context: typingsJapgolly.yadda.contextMod.^,
    next: js.Function1[js.Error | Null, Unit]
  ): Unit = js.native
  def yadda(scenario: Scenario): Unit = js.native
  def yadda(scenario: Scenario, next: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  def yadda(scenario: Scenario, scenario_context: Properties): Unit = js.native
  def yadda(
    scenario: Scenario,
    scenario_context: Properties,
    next: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  def yadda(scenario: Scenario, scenario_context: typingsJapgolly.yadda.contextMod.^): Unit = js.native
  def yadda(
    scenario: Scenario,
    scenario_context: typingsJapgolly.yadda.contextMod.^,
    next: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
  def yadda(step: Step): Unit = js.native
  def yadda(step: Step, next: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  def yadda(step: Step, scenario_context: Properties): Unit = js.native
  def yadda(step: Step, scenario_context: Properties, next: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
  def yadda(step: Step, scenario_context: typingsJapgolly.yadda.contextMod.^): Unit = js.native
  def yadda(
    step: Step,
    scenario_context: typingsJapgolly.yadda.contextMod.^,
    next: js.Function1[/* err */ js.Error | Null, Unit]
  ): Unit = js.native
}

