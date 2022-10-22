package typingsJapgolly.vsoNodeApi.interfacesBuildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TimelineRecordState extends StObject
@JSImport("vso-node-api/interfaces/BuildInterfaces", "TimelineRecordState")
@js.native
object TimelineRecordState extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TimelineRecordState & Double] = js.native
  
  @js.native
  sealed trait Completed
    extends StObject
       with TimelineRecordState
  /* 2 */ val Completed: typingsJapgolly.vsoNodeApi.interfacesBuildInterfacesMod.TimelineRecordState.Completed & Double = js.native
  
  @js.native
  sealed trait InProgress
    extends StObject
       with TimelineRecordState
  /* 1 */ val InProgress: typingsJapgolly.vsoNodeApi.interfacesBuildInterfacesMod.TimelineRecordState.InProgress & Double = js.native
  
  @js.native
  sealed trait Pending
    extends StObject
       with TimelineRecordState
  /* 0 */ val Pending: typingsJapgolly.vsoNodeApi.interfacesBuildInterfacesMod.TimelineRecordState.Pending & Double = js.native
}
