package typingsJapgolly.vsoNodeApi.interfacesBuildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TaskResult extends StObject
@JSImport("vso-node-api/interfaces/BuildInterfaces", "TaskResult")
@js.native
object TaskResult extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TaskResult & Double] = js.native
  
  @js.native
  sealed trait Abandoned
    extends StObject
       with TaskResult
  /* 5 */ val Abandoned: typingsJapgolly.vsoNodeApi.interfacesBuildInterfacesMod.TaskResult.Abandoned & Double = js.native
  
  @js.native
  sealed trait Canceled
    extends StObject
       with TaskResult
  /* 3 */ val Canceled: typingsJapgolly.vsoNodeApi.interfacesBuildInterfacesMod.TaskResult.Canceled & Double = js.native
  
  @js.native
  sealed trait Failed
    extends StObject
       with TaskResult
  /* 2 */ val Failed: typingsJapgolly.vsoNodeApi.interfacesBuildInterfacesMod.TaskResult.Failed & Double = js.native
  
  @js.native
  sealed trait Skipped
    extends StObject
       with TaskResult
  /* 4 */ val Skipped: typingsJapgolly.vsoNodeApi.interfacesBuildInterfacesMod.TaskResult.Skipped & Double = js.native
  
  @js.native
  sealed trait Succeeded
    extends StObject
       with TaskResult
  /* 0 */ val Succeeded: typingsJapgolly.vsoNodeApi.interfacesBuildInterfacesMod.TaskResult.Succeeded & Double = js.native
  
  @js.native
  sealed trait SucceededWithIssues
    extends StObject
       with TaskResult
  /* 1 */ val SucceededWithIssues: typingsJapgolly.vsoNodeApi.interfacesBuildInterfacesMod.TaskResult.SucceededWithIssues & Double = js.native
}
