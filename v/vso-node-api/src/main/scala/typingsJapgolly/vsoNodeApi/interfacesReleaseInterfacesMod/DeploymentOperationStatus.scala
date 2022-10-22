package typingsJapgolly.vsoNodeApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DeploymentOperationStatus extends StObject
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "DeploymentOperationStatus")
@js.native
object DeploymentOperationStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeploymentOperationStatus & Double] = js.native
  
  /**
    * The deployment operation status is all.
    */
  @js.native
  sealed trait All
    extends StObject
       with DeploymentOperationStatus
  /* 258047 */ val All: typingsJapgolly.vsoNodeApi.interfacesReleaseInterfacesMod.DeploymentOperationStatus.All & Double = js.native
  
  /**
    * The deployment operation status is approved.
    */
  @js.native
  sealed trait Approved
    extends StObject
       with DeploymentOperationStatus
  /* 8 */ val Approved: typingsJapgolly.vsoNodeApi.interfacesReleaseInterfacesMod.DeploymentOperationStatus.Approved & Double = js.native
  
  /**
    * The deployment operation status is canceled.
    */
  @js.native
  sealed trait Canceled
    extends StObject
       with DeploymentOperationStatus
  /* 2048 */ val Canceled: typingsJapgolly.vsoNodeApi.interfacesReleaseInterfacesMod.DeploymentOperationStatus.Canceled & Double = js.native
  
  /**
    * The deployment operation status is cancelling.
    */
  @js.native
  sealed trait Cancelling
    extends StObject
       with DeploymentOperationStatus
  /* 32768 */ val Cancelling: typingsJapgolly.vsoNodeApi.interfacesReleaseInterfacesMod.DeploymentOperationStatus.Cancelling & Double = js.native
  
  /**
    * The deployment operation status is deferred.
    */
  @js.native
  sealed trait Deferred
    extends StObject
       with DeploymentOperationStatus
  /* 32 */ val Deferred: typingsJapgolly.vsoNodeApi.interfacesReleaseInterfacesMod.DeploymentOperationStatus.Deferred & Double = js.native
  
  /**
    * The deployment operation status is EvaluatingGates.
    */
  @js.native
  sealed trait EvaluatingGates
    extends StObject
       with DeploymentOperationStatus
  /* 65536 */ val EvaluatingGates: typingsJapgolly.vsoNodeApi.interfacesReleaseInterfacesMod.DeploymentOperationStatus.EvaluatingGates & Double = js.native
  
  /**
    * The deployment operation status is GateFailed.
    */
  @js.native
  sealed trait GateFailed
    extends StObject
       with DeploymentOperationStatus
  /* 131072 */ val GateFailed: typingsJapgolly.vsoNodeApi.interfacesReleaseInterfacesMod.DeploymentOperationStatus.GateFailed & Double = js.native
  
  /**
    * The deployment operation status is manualintervention pending.
    */
  @js.native
  sealed trait ManualInterventionPending
    extends StObject
       with DeploymentOperationStatus
  /* 8192 */ val ManualInterventionPending: typingsJapgolly.vsoNodeApi.interfacesReleaseInterfacesMod.DeploymentOperationStatus.ManualInterventionPending & Double = js.native
  
  /**
    * The deployment operation status is pending.
    */
  @js.native
  sealed trait Pending
    extends StObject
       with DeploymentOperationStatus
  /* 4 */ val Pending: typingsJapgolly.vsoNodeApi.interfacesReleaseInterfacesMod.DeploymentOperationStatus.Pending & Double = js.native
  
  /**
    * The deployment operation status is phase canceled.
    */
  @js.native
  sealed trait PhaseCanceled
    extends StObject
       with DeploymentOperationStatus
  /* 4096 */ val PhaseCanceled: typingsJapgolly.vsoNodeApi.interfacesReleaseInterfacesMod.DeploymentOperationStatus.PhaseCanceled & Double = js.native
  
  /**
    * The deployment operation status is phase failed.
    */
  @js.native
  sealed trait PhaseFailed
    extends StObject
       with DeploymentOperationStatus
  /* 1024 */ val PhaseFailed: typingsJapgolly.vsoNodeApi.interfacesReleaseInterfacesMod.DeploymentOperationStatus.PhaseFailed & Double = js.native
  
  /**
    * The deployment operation status is phase inprogress.
    */
  @js.native
  sealed trait PhaseInProgress
    extends StObject
       with DeploymentOperationStatus
  /* 128 */ val PhaseInProgress: typingsJapgolly.vsoNodeApi.interfacesReleaseInterfacesMod.DeploymentOperationStatus.PhaseInProgress & Double = js.native
  
  /**
    * The deployment operation status is phase partially succeeded.
    */
  @js.native
  sealed trait PhasePartiallySucceeded
    extends StObject
       with DeploymentOperationStatus
  /* 512 */ val PhasePartiallySucceeded: typingsJapgolly.vsoNodeApi.interfacesReleaseInterfacesMod.DeploymentOperationStatus.PhasePartiallySucceeded & Double = js.native
  
  /**
    * The deployment operation status is phase succeeded.
    */
  @js.native
  sealed trait PhaseSucceeded
    extends StObject
       with DeploymentOperationStatus
  /* 256 */ val PhaseSucceeded: typingsJapgolly.vsoNodeApi.interfacesReleaseInterfacesMod.DeploymentOperationStatus.PhaseSucceeded & Double = js.native
  
  /**
    * The deployment operation status is queued.
    */
  @js.native
  sealed trait Queued
    extends StObject
       with DeploymentOperationStatus
  /* 1 */ val Queued: typingsJapgolly.vsoNodeApi.interfacesReleaseInterfacesMod.DeploymentOperationStatus.Queued & Double = js.native
  
  /**
    * The deployment operation status is queued for agent.
    */
  @js.native
  sealed trait QueuedForAgent
    extends StObject
       with DeploymentOperationStatus
  /* 64 */ val QueuedForAgent: typingsJapgolly.vsoNodeApi.interfacesReleaseInterfacesMod.DeploymentOperationStatus.QueuedForAgent & Double = js.native
  
  /**
    * The deployment operation status is queued for pipeline.
    */
  @js.native
  sealed trait QueuedForPipeline
    extends StObject
       with DeploymentOperationStatus
  /* 16384 */ val QueuedForPipeline: typingsJapgolly.vsoNodeApi.interfacesReleaseInterfacesMod.DeploymentOperationStatus.QueuedForPipeline & Double = js.native
  
  /**
    * The deployment operation status is rejected.
    */
  @js.native
  sealed trait Rejected
    extends StObject
       with DeploymentOperationStatus
  /* 16 */ val Rejected: typingsJapgolly.vsoNodeApi.interfacesReleaseInterfacesMod.DeploymentOperationStatus.Rejected & Double = js.native
  
  /**
    * The deployment operation status is scheduled.
    */
  @js.native
  sealed trait Scheduled
    extends StObject
       with DeploymentOperationStatus
  /* 2 */ val Scheduled: typingsJapgolly.vsoNodeApi.interfacesReleaseInterfacesMod.DeploymentOperationStatus.Scheduled & Double = js.native
  
  /**
    * The deployment operation status is undefined.
    */
  @js.native
  sealed trait Undefined
    extends StObject
       with DeploymentOperationStatus
  /* 0 */ val Undefined: typingsJapgolly.vsoNodeApi.interfacesReleaseInterfacesMod.DeploymentOperationStatus.Undefined & Double = js.native
}
