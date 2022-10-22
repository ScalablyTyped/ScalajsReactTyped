package typingsJapgolly.vsoNodeApi.interfacesTestInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TestSessionState extends StObject
@JSImport("vso-node-api/interfaces/TestInterfaces", "TestSessionState")
@js.native
object TestSessionState extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TestSessionState & Double] = js.native
  
  /**
    * The session has completed.
    */
  @js.native
  sealed trait Completed
    extends StObject
       with TestSessionState
  /* 4 */ val Completed: typingsJapgolly.vsoNodeApi.interfacesTestInterfacesMod.TestSessionState.Completed & Double = js.native
  
  /**
    * This is required for Feedback session which are declined
    */
  @js.native
  sealed trait Declined
    extends StObject
       with TestSessionState
  /* 5 */ val Declined: typingsJapgolly.vsoNodeApi.interfacesTestInterfacesMod.TestSessionState.Declined & Double = js.native
  
  /**
    * The session is running.
    */
  @js.native
  sealed trait InProgress
    extends StObject
       with TestSessionState
  /* 2 */ val InProgress: typingsJapgolly.vsoNodeApi.interfacesTestInterfacesMod.TestSessionState.InProgress & Double = js.native
  
  /**
    * The session is still being created.
    */
  @js.native
  sealed trait NotStarted
    extends StObject
       with TestSessionState
  /* 1 */ val NotStarted: typingsJapgolly.vsoNodeApi.interfacesTestInterfacesMod.TestSessionState.NotStarted & Double = js.native
  
  /**
    * The session has paused.
    */
  @js.native
  sealed trait Paused
    extends StObject
       with TestSessionState
  /* 3 */ val Paused: typingsJapgolly.vsoNodeApi.interfacesTestInterfacesMod.TestSessionState.Paused & Double = js.native
  
  /**
    * Only used during an update to preserve the existing value.
    */
  @js.native
  sealed trait Unspecified
    extends StObject
       with TestSessionState
  /* 0 */ val Unspecified: typingsJapgolly.vsoNodeApi.interfacesTestInterfacesMod.TestSessionState.Unspecified & Double = js.native
}
