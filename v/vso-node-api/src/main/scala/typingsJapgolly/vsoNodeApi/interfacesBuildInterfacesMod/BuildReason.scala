package typingsJapgolly.vsoNodeApi.interfacesBuildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BuildReason extends StObject
@JSImport("vso-node-api/interfaces/BuildInterfaces", "BuildReason")
@js.native
object BuildReason extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BuildReason & Double] = js.native
  
  /**
    * All reasons.
    */
  @js.native
  sealed trait All
    extends StObject
       with BuildReason
  /* 495 */ val All: typingsJapgolly.vsoNodeApi.interfacesBuildInterfacesMod.BuildReason.All & Double = js.native
  
  /**
    * The build was started for the trigger TriggerType.BatchedContinuousIntegration.
    */
  @js.native
  sealed trait BatchedCI
    extends StObject
       with BuildReason
  /* 4 */ val BatchedCI: typingsJapgolly.vsoNodeApi.interfacesBuildInterfacesMod.BuildReason.BatchedCI & Double = js.native
  
  /**
    * The build was started for the trigger ContinuousIntegrationType.Gated.
    */
  @js.native
  sealed trait CheckInShelveset
    extends StObject
       with BuildReason
  /* 128 */ val CheckInShelveset: typingsJapgolly.vsoNodeApi.interfacesBuildInterfacesMod.BuildReason.CheckInShelveset & Double = js.native
  
  /**
    * The build was started for the trigger TriggerType.ContinuousIntegration.
    */
  @js.native
  sealed trait IndividualCI
    extends StObject
       with BuildReason
  /* 2 */ val IndividualCI: typingsJapgolly.vsoNodeApi.interfacesBuildInterfacesMod.BuildReason.IndividualCI & Double = js.native
  
  /**
    * The build was started manually.
    */
  @js.native
  sealed trait Manual
    extends StObject
       with BuildReason
  /* 1 */ val Manual: typingsJapgolly.vsoNodeApi.interfacesBuildInterfacesMod.BuildReason.Manual & Double = js.native
  
  /**
    * No reason. This value should not be used.
    */
  @js.native
  sealed trait None
    extends StObject
       with BuildReason
  /* 0 */ val None: typingsJapgolly.vsoNodeApi.interfacesBuildInterfacesMod.BuildReason.None & Double = js.native
  
  /**
    * The build was started by a pull request. Added in resource version 3.
    */
  @js.native
  sealed trait PullRequest
    extends StObject
       with BuildReason
  /* 256 */ val PullRequest: typingsJapgolly.vsoNodeApi.interfacesBuildInterfacesMod.BuildReason.PullRequest & Double = js.native
  
  /**
    * The build was started for the trigger TriggerType.Schedule.
    */
  @js.native
  sealed trait Schedule
    extends StObject
       with BuildReason
  /* 8 */ val Schedule: typingsJapgolly.vsoNodeApi.interfacesBuildInterfacesMod.BuildReason.Schedule & Double = js.native
  
  /**
    * The build was triggered for retention policy purposes.
    */
  @js.native
  sealed trait Triggered
    extends StObject
       with BuildReason
  /* 431 */ val Triggered: typingsJapgolly.vsoNodeApi.interfacesBuildInterfacesMod.BuildReason.Triggered & Double = js.native
  
  /**
    * The build was created by a user.
    */
  @js.native
  sealed trait UserCreated
    extends StObject
       with BuildReason
  /* 32 */ val UserCreated: typingsJapgolly.vsoNodeApi.interfacesBuildInterfacesMod.BuildReason.UserCreated & Double = js.native
  
  /**
    * The build was started manually for private validation.
    */
  @js.native
  sealed trait ValidateShelveset
    extends StObject
       with BuildReason
  /* 64 */ val ValidateShelveset: typingsJapgolly.vsoNodeApi.interfacesBuildInterfacesMod.BuildReason.ValidateShelveset & Double = js.native
}
