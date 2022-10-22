package typingsJapgolly.yadda

import typingsJapgolly.yadda.libContextMod.Properties
import typingsJapgolly.yadda.libMod.Scenario
import typingsJapgolly.yadda.libMod.Step
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libYaddaMod {
  
  @JSImport("yadda/lib/Yadda", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Yadda {
    def this(libraries: js.Array[typingsJapgolly.yadda.libLibraryMod.^]) = this()
    def this(libraries: typingsJapgolly.yadda.libLibraryMod.^) = this()
    def this(libraries: js.Array[typingsJapgolly.yadda.libLibraryMod.^], interpreter_context: Properties) = this()
    def this(
      libraries: js.Array[typingsJapgolly.yadda.libLibraryMod.^],
      interpreter_context: typingsJapgolly.yadda.libContextMod.^
    ) = this()
    def this(libraries: typingsJapgolly.yadda.libLibraryMod.^, interpreter_context: Properties) = this()
    def this(
      libraries: typingsJapgolly.yadda.libLibraryMod.^,
      interpreter_context: typingsJapgolly.yadda.libContextMod.^
    ) = this()
  }
  
  @js.native
  trait Yadda extends StObject {
    
    var interpreter: typingsJapgolly.yadda.libInterpreterMod.^ = js.native
    
    def run(scenario: js.Array[Scenario | Step]): Unit = js.native
    def run(scenario: js.Array[Scenario | Step], next: js.Function1[js.Error | Null, Unit]): Unit = js.native
    def run(scenario: js.Array[Scenario | Step], scenario_context: Properties): Unit = js.native
    def run(
      scenario: js.Array[Scenario | Step],
      scenario_context: Properties,
      next: js.Function1[js.Error | Null, Unit]
    ): Unit = js.native
    def run(scenario: js.Array[Scenario | Step], scenario_context: typingsJapgolly.yadda.libContextMod.^): Unit = js.native
    def run(
      scenario: js.Array[Scenario | Step],
      scenario_context: typingsJapgolly.yadda.libContextMod.^,
      next: js.Function1[js.Error | Null, Unit]
    ): Unit = js.native
    def run(scenario: Scenario): Unit = js.native
    def run(scenario: Scenario, next: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
    def run(scenario: Scenario, scenario_context: Properties): Unit = js.native
    def run(
      scenario: Scenario,
      scenario_context: Properties,
      next: js.Function1[/* err */ js.Error | Null, Unit]
    ): Unit = js.native
    def run(scenario: Scenario, scenario_context: typingsJapgolly.yadda.libContextMod.^): Unit = js.native
    def run(
      scenario: Scenario,
      scenario_context: typingsJapgolly.yadda.libContextMod.^,
      next: js.Function1[/* err */ js.Error | Null, Unit]
    ): Unit = js.native
    def run(step: Step): Unit = js.native
    def run(step: Step, next: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
    def run(step: Step, scenario_context: Properties): Unit = js.native
    def run(step: Step, scenario_context: Properties, next: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
    def run(step: Step, scenario_context: typingsJapgolly.yadda.libContextMod.^): Unit = js.native
    def run(
      step: Step,
      scenario_context: typingsJapgolly.yadda.libContextMod.^,
      next: js.Function1[/* err */ js.Error | Null, Unit]
    ): Unit = js.native
    
    def yadda(scenario: js.Array[Scenario | Step]): Unit = js.native
    def yadda(scenario: js.Array[Scenario | Step], next: js.Function1[js.Error | Null, Unit]): Unit = js.native
    def yadda(scenario: js.Array[Scenario | Step], scenario_context: Properties): Unit = js.native
    def yadda(
      scenario: js.Array[Scenario | Step],
      scenario_context: Properties,
      next: js.Function1[js.Error | Null, Unit]
    ): Unit = js.native
    def yadda(scenario: js.Array[Scenario | Step], scenario_context: typingsJapgolly.yadda.libContextMod.^): Unit = js.native
    def yadda(
      scenario: js.Array[Scenario | Step],
      scenario_context: typingsJapgolly.yadda.libContextMod.^,
      next: js.Function1[js.Error | Null, Unit]
    ): Unit = js.native
    def yadda(scenario: Scenario): Unit = js.native
    def yadda(scenario: Scenario, next: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
    def yadda(scenario: Scenario, scenario_context: Properties): Unit = js.native
    def yadda(
      scenario: Scenario,
      scenario_context: Properties,
      next: js.Function1[/* err */ js.Error | Null, Unit]
    ): Unit = js.native
    def yadda(scenario: Scenario, scenario_context: typingsJapgolly.yadda.libContextMod.^): Unit = js.native
    def yadda(
      scenario: Scenario,
      scenario_context: typingsJapgolly.yadda.libContextMod.^,
      next: js.Function1[/* err */ js.Error | Null, Unit]
    ): Unit = js.native
    def yadda(step: Step): Unit = js.native
    def yadda(step: Step, next: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
    def yadda(step: Step, scenario_context: Properties): Unit = js.native
    def yadda(step: Step, scenario_context: Properties, next: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
    def yadda(step: Step, scenario_context: typingsJapgolly.yadda.libContextMod.^): Unit = js.native
    def yadda(
      step: Step,
      scenario_context: typingsJapgolly.yadda.libContextMod.^,
      next: js.Function1[/* err */ js.Error | Null, Unit]
    ): Unit = js.native
  }
}
