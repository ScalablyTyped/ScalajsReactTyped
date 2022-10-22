package typingsJapgolly.vsoNodeApi.interfacesTestInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TestOutcome extends StObject
@JSImport("vso-node-api/interfaces/TestInterfaces", "TestOutcome")
@js.native
object TestOutcome extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TestOutcome & Double] = js.native
  
  /**
    * Test was aborted. This was not caused by a user gesture, but rather by a framework decision.
    */
  @js.native
  sealed trait Aborted
    extends StObject
       with TestOutcome
  /* 6 */ val Aborted: typingsJapgolly.vsoNodeApi.interfacesTestInterfacesMod.TestOutcome.Aborted & Double = js.native
  
  /**
    * Test had it chance for been executed but was not, as ITestElement.IsRunnable == false.
    */
  @js.native
  sealed trait Blocked
    extends StObject
       with TestOutcome
  /* 7 */ val Blocked: typingsJapgolly.vsoNodeApi.interfacesTestInterfacesMod.TestOutcome.Blocked & Double = js.native
  
  /**
    * There was a system error while we were trying to execute a test.
    */
  @js.native
  sealed trait Error
    extends StObject
       with TestOutcome
  /* 10 */ val Error: typingsJapgolly.vsoNodeApi.interfacesTestInterfacesMod.TestOutcome.Error & Double = js.native
  
  /**
    * Test was executed, but there were issues. Issues may involve exceptions or failed assertions.
    */
  @js.native
  sealed trait Failed
    extends StObject
       with TestOutcome
  /* 3 */ val Failed: typingsJapgolly.vsoNodeApi.interfacesTestInterfacesMod.TestOutcome.Failed & Double = js.native
  
  /**
    * Test is currently executing. Added this for TCM charts
    */
  @js.native
  sealed trait InProgress
    extends StObject
       with TestOutcome
  /* 13 */ val InProgress: typingsJapgolly.vsoNodeApi.interfacesTestInterfacesMod.TestOutcome.InProgress & Double = js.native
  
  /**
    * Test has completed, but we can't say if it passed or failed. May be used for aborted tests...
    */
  @js.native
  sealed trait Inconclusive
    extends StObject
       with TestOutcome
  /* 4 */ val Inconclusive: typingsJapgolly.vsoNodeApi.interfacesTestInterfacesMod.TestOutcome.Inconclusive & Double = js.native
  
  @js.native
  sealed trait MaxValue
    extends StObject
       with TestOutcome
  /* 14 */ val MaxValue: typingsJapgolly.vsoNodeApi.interfacesTestInterfacesMod.TestOutcome.MaxValue & Double = js.native
  
  /**
    * Test has not been completed, or the test type does not report pass/failure.
    */
  @js.native
  sealed trait None
    extends StObject
       with TestOutcome
  /* 1 */ val None: typingsJapgolly.vsoNodeApi.interfacesTestInterfacesMod.TestOutcome.None & Double = js.native
  
  /**
    * Test is Not Applicable for execution.
    */
  @js.native
  sealed trait NotApplicable
    extends StObject
       with TestOutcome
  /* 11 */ val NotApplicable: typingsJapgolly.vsoNodeApi.interfacesTestInterfacesMod.TestOutcome.NotApplicable & Double = js.native
  
  /**
    * Test was not executed. This was caused by a user gesture - e.g. user hit stop button.
    */
  @js.native
  sealed trait NotExecuted
    extends StObject
       with TestOutcome
  /* 8 */ val NotExecuted: typingsJapgolly.vsoNodeApi.interfacesTestInterfacesMod.TestOutcome.NotExecuted & Double = js.native
  
  /**
    * Test is not impacted. Added fot TIA.
    */
  @js.native
  sealed trait NotImpacted
    extends StObject
       with TestOutcome
  /* 14 */ val NotImpacted: typingsJapgolly.vsoNodeApi.interfacesTestInterfacesMod.TestOutcome.NotImpacted & Double = js.native
  
  /**
    * Test was executed w/o any issues.
    */
  @js.native
  sealed trait Passed
    extends StObject
       with TestOutcome
  /* 2 */ val Passed: typingsJapgolly.vsoNodeApi.interfacesTestInterfacesMod.TestOutcome.Passed & Double = js.native
  
  /**
    * Test is paused.
    */
  @js.native
  sealed trait Paused
    extends StObject
       with TestOutcome
  /* 12 */ val Paused: typingsJapgolly.vsoNodeApi.interfacesTestInterfacesMod.TestOutcome.Paused & Double = js.native
  
  /**
    * The test timed out
    */
  @js.native
  sealed trait Timeout
    extends StObject
       with TestOutcome
  /* 5 */ val Timeout: typingsJapgolly.vsoNodeApi.interfacesTestInterfacesMod.TestOutcome.Timeout & Double = js.native
  
  /**
    * Only used during an update to preserve the existing value.
    */
  @js.native
  sealed trait Unspecified
    extends StObject
       with TestOutcome
  /* 0 */ val Unspecified: typingsJapgolly.vsoNodeApi.interfacesTestInterfacesMod.TestOutcome.Unspecified & Double = js.native
  
  /**
    * To be used by Run level results. This is not a failure.
    */
  @js.native
  sealed trait Warning
    extends StObject
       with TestOutcome
  /* 9 */ val Warning: typingsJapgolly.vsoNodeApi.interfacesTestInterfacesMod.TestOutcome.Warning & Double = js.native
}
