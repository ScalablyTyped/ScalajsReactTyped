package typingsJapgolly.vsoNodeApi.interfacesNotificationInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EvaluationOperationStatus extends StObject
@JSImport("vso-node-api/interfaces/NotificationInterfaces", "EvaluationOperationStatus")
@js.native
object EvaluationOperationStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EvaluationOperationStatus & Double] = js.native
  
  /**
    * The operation was cancelled by the user.
    */
  @js.native
  sealed trait Cancelled
    extends StObject
       with EvaluationOperationStatus
  /* 3 */ val Cancelled: typingsJapgolly.vsoNodeApi.interfacesNotificationInterfacesMod.EvaluationOperationStatus.Cancelled & Double = js.native
  
  /**
    * The operation completed with a failure.
    */
  @js.native
  sealed trait Failed
    extends StObject
       with EvaluationOperationStatus
  /* 5 */ val Failed: typingsJapgolly.vsoNodeApi.interfacesNotificationInterfacesMod.EvaluationOperationStatus.Failed & Double = js.native
  
  /**
    * The operation is in progress.
    */
  @js.native
  sealed trait InProgress
    extends StObject
       with EvaluationOperationStatus
  /* 2 */ val InProgress: typingsJapgolly.vsoNodeApi.interfacesNotificationInterfacesMod.EvaluationOperationStatus.InProgress & Double = js.native
  
  /**
    * The operation could not be found.
    */
  @js.native
  sealed trait NotFound
    extends StObject
       with EvaluationOperationStatus
  /* 7 */ val NotFound: typingsJapgolly.vsoNodeApi.interfacesNotificationInterfacesMod.EvaluationOperationStatus.NotFound & Double = js.native
  
  /**
    * The operation object does not have the status set.
    */
  @js.native
  sealed trait NotSet
    extends StObject
       with EvaluationOperationStatus
  /* 0 */ val NotSet: typingsJapgolly.vsoNodeApi.interfacesNotificationInterfacesMod.EvaluationOperationStatus.NotSet & Double = js.native
  
  /**
    * The operation has been queued.
    */
  @js.native
  sealed trait Queued
    extends StObject
       with EvaluationOperationStatus
  /* 1 */ val Queued: typingsJapgolly.vsoNodeApi.interfacesNotificationInterfacesMod.EvaluationOperationStatus.Queued & Double = js.native
  
  /**
    * The operation completed successfully.
    */
  @js.native
  sealed trait Succeeded
    extends StObject
       with EvaluationOperationStatus
  /* 4 */ val Succeeded: typingsJapgolly.vsoNodeApi.interfacesNotificationInterfacesMod.EvaluationOperationStatus.Succeeded & Double = js.native
  
  /**
    * The operation timed out.
    */
  @js.native
  sealed trait TimedOut
    extends StObject
       with EvaluationOperationStatus
  /* 6 */ val TimedOut: typingsJapgolly.vsoNodeApi.interfacesNotificationInterfacesMod.EvaluationOperationStatus.TimedOut & Double = js.native
}
