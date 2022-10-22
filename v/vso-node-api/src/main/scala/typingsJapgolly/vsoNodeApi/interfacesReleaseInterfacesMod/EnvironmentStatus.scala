package typingsJapgolly.vsoNodeApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnvironmentStatus extends StObject
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "EnvironmentStatus")
@js.native
object EnvironmentStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnvironmentStatus & Double] = js.native
  
  @js.native
  sealed trait Canceled
    extends StObject
       with EnvironmentStatus
  /* 8 */ val Canceled: typingsJapgolly.vsoNodeApi.interfacesReleaseInterfacesMod.EnvironmentStatus.Canceled & Double = js.native
  
  @js.native
  sealed trait InProgress
    extends StObject
       with EnvironmentStatus
  /* 2 */ val InProgress: typingsJapgolly.vsoNodeApi.interfacesReleaseInterfacesMod.EnvironmentStatus.InProgress & Double = js.native
  
  @js.native
  sealed trait NotStarted
    extends StObject
       with EnvironmentStatus
  /* 1 */ val NotStarted: typingsJapgolly.vsoNodeApi.interfacesReleaseInterfacesMod.EnvironmentStatus.NotStarted & Double = js.native
  
  @js.native
  sealed trait PartiallySucceeded
    extends StObject
       with EnvironmentStatus
  /* 128 */ val PartiallySucceeded: typingsJapgolly.vsoNodeApi.interfacesReleaseInterfacesMod.EnvironmentStatus.PartiallySucceeded & Double = js.native
  
  @js.native
  sealed trait Queued
    extends StObject
       with EnvironmentStatus
  /* 32 */ val Queued: typingsJapgolly.vsoNodeApi.interfacesReleaseInterfacesMod.EnvironmentStatus.Queued & Double = js.native
  
  @js.native
  sealed trait Rejected
    extends StObject
       with EnvironmentStatus
  /* 16 */ val Rejected: typingsJapgolly.vsoNodeApi.interfacesReleaseInterfacesMod.EnvironmentStatus.Rejected & Double = js.native
  
  @js.native
  sealed trait Scheduled
    extends StObject
       with EnvironmentStatus
  /* 64 */ val Scheduled: typingsJapgolly.vsoNodeApi.interfacesReleaseInterfacesMod.EnvironmentStatus.Scheduled & Double = js.native
  
  @js.native
  sealed trait Succeeded
    extends StObject
       with EnvironmentStatus
  /* 4 */ val Succeeded: typingsJapgolly.vsoNodeApi.interfacesReleaseInterfacesMod.EnvironmentStatus.Succeeded & Double = js.native
  
  @js.native
  sealed trait Undefined
    extends StObject
       with EnvironmentStatus
  /* 0 */ val Undefined: typingsJapgolly.vsoNodeApi.interfacesReleaseInterfacesMod.EnvironmentStatus.Undefined & Double = js.native
}
