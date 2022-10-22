package typingsJapgolly.yadda

import typingsJapgolly.yadda.libMod.Scenario
import typingsJapgolly.yadda.libMod.Step
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInterpreterMod {
  
  @JSImport("yadda/lib/Interpreter", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Interpreter {
    def this(libraries: js.Array[typingsJapgolly.yadda.libLibraryMod.^]) = this()
    def this(libraries: typingsJapgolly.yadda.libLibraryMod.^) = this()
  }
  
  @js.native
  trait Interpreter extends StObject {
    
    def interpret(scenario: js.Array[Scenario], scenario_context: typingsJapgolly.yadda.libContextMod.^): Unit = js.native
    def interpret(
      scenario: js.Array[Scenario],
      scenario_context: typingsJapgolly.yadda.libContextMod.^,
      next: js.Function2[/* err */ js.Error | Null, /* result */ js.UndefOr[Scenario], Unit]
    ): Unit = js.native
    def interpret(scenario: Scenario, scenario_context: typingsJapgolly.yadda.libContextMod.^): Unit = js.native
    def interpret(
      scenario: Scenario,
      scenario_context: typingsJapgolly.yadda.libContextMod.^,
      next: js.Function2[/* err */ js.Error | Null, /* result */ js.UndefOr[Scenario], Unit]
    ): Unit = js.native
    
    def interpret_step(step: js.Array[Step], scenario_context: typingsJapgolly.yadda.libContextMod.^): Unit = js.native
    def interpret_step(
      step: js.Array[Step],
      scenario_context: typingsJapgolly.yadda.libContextMod.^,
      next: js.Function2[/* err */ js.Error | Null, /* result */ js.UndefOr[Step], Unit]
    ): Unit = js.native
    def interpret_step(step: Step, scenario_context: typingsJapgolly.yadda.libContextMod.^): Unit = js.native
    def interpret_step(
      step: Step,
      scenario_context: typingsJapgolly.yadda.libContextMod.^,
      next: js.Function2[/* err */ js.Error | Null, /* result */ js.UndefOr[Step], Unit]
    ): Unit = js.native
    
    def requires(libs: js.Array[typingsJapgolly.yadda.libLibraryMod.^]): this.type = js.native
    def requires(libs: typingsJapgolly.yadda.libLibraryMod.^): this.type = js.native
    
    def validate(scenario: Scenario): Unit = js.native
  }
}
