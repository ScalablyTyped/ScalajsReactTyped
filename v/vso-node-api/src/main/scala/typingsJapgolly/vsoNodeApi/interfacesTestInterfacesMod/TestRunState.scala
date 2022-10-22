package typingsJapgolly.vsoNodeApi.interfacesTestInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TestRunState extends StObject
@JSImport("vso-node-api/interfaces/TestInterfaces", "TestRunState")
@js.native
object TestRunState extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TestRunState & Double] = js.native
  
  /**
    * Run is stopped and remaing tests have been aborted
    */
  @js.native
  sealed trait Aborted
    extends StObject
       with TestRunState
  /* 4 */ val Aborted: typingsJapgolly.vsoNodeApi.interfacesTestInterfacesMod.TestRunState.Aborted & Double = js.native
  
  /**
    * All tests have completed or been skipped.
    */
  @js.native
  sealed trait Completed
    extends StObject
       with TestRunState
  /* 3 */ val Completed: typingsJapgolly.vsoNodeApi.interfacesTestInterfacesMod.TestRunState.Completed & Double = js.native
  
  /**
    * Tests are running.
    */
  @js.native
  sealed trait InProgress
    extends StObject
       with TestRunState
  /* 2 */ val InProgress: typingsJapgolly.vsoNodeApi.interfacesTestInterfacesMod.TestRunState.InProgress & Double = js.native
  
  /**
    * Run requires investigation because of a test point failure This is a legacy state and should not be used any more
    */
  @js.native
  sealed trait NeedsInvestigation
    extends StObject
       with TestRunState
  /* 6 */ val NeedsInvestigation: typingsJapgolly.vsoNodeApi.interfacesTestInterfacesMod.TestRunState.NeedsInvestigation & Double = js.native
  
  /**
    * The run is still being created.  No tests have started yet.
    */
  @js.native
  sealed trait NotStarted
    extends StObject
       with TestRunState
  /* 1 */ val NotStarted: typingsJapgolly.vsoNodeApi.interfacesTestInterfacesMod.TestRunState.NotStarted & Double = js.native
  
  /**
    * Only used during an update to preserve the existing value.
    */
  @js.native
  sealed trait Unspecified
    extends StObject
       with TestRunState
  /* 0 */ val Unspecified: typingsJapgolly.vsoNodeApi.interfacesTestInterfacesMod.TestRunState.Unspecified & Double = js.native
  
  /**
    * Run is currently initializing This is a legacy state and should not be used any more
    */
  @js.native
  sealed trait Waiting
    extends StObject
       with TestRunState
  /* 5 */ val Waiting: typingsJapgolly.vsoNodeApi.interfacesTestInterfacesMod.TestRunState.Waiting & Double = js.native
}
