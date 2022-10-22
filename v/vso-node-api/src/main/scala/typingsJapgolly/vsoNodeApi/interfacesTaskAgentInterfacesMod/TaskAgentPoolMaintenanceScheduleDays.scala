package typingsJapgolly.vsoNodeApi.interfacesTaskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TaskAgentPoolMaintenanceScheduleDays extends StObject
@JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TaskAgentPoolMaintenanceScheduleDays")
@js.native
object TaskAgentPoolMaintenanceScheduleDays extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TaskAgentPoolMaintenanceScheduleDays & Double] = js.native
  
  /**
    * Run on all days of the week.
    */
  @js.native
  sealed trait All
    extends StObject
       with TaskAgentPoolMaintenanceScheduleDays
  /* 127 */ val All: typingsJapgolly.vsoNodeApi.interfacesTaskAgentInterfacesMod.TaskAgentPoolMaintenanceScheduleDays.All & Double = js.native
  
  /**
    * Run on Friday.
    */
  @js.native
  sealed trait Friday
    extends StObject
       with TaskAgentPoolMaintenanceScheduleDays
  /* 16 */ val Friday: typingsJapgolly.vsoNodeApi.interfacesTaskAgentInterfacesMod.TaskAgentPoolMaintenanceScheduleDays.Friday & Double = js.native
  
  /**
    * Run on Monday.
    */
  @js.native
  sealed trait Monday
    extends StObject
       with TaskAgentPoolMaintenanceScheduleDays
  /* 1 */ val Monday: typingsJapgolly.vsoNodeApi.interfacesTaskAgentInterfacesMod.TaskAgentPoolMaintenanceScheduleDays.Monday & Double = js.native
  
  /**
    * Do not run.
    */
  @js.native
  sealed trait None
    extends StObject
       with TaskAgentPoolMaintenanceScheduleDays
  /* 0 */ val None: typingsJapgolly.vsoNodeApi.interfacesTaskAgentInterfacesMod.TaskAgentPoolMaintenanceScheduleDays.None & Double = js.native
  
  /**
    * Run on Saturday.
    */
  @js.native
  sealed trait Saturday
    extends StObject
       with TaskAgentPoolMaintenanceScheduleDays
  /* 32 */ val Saturday: typingsJapgolly.vsoNodeApi.interfacesTaskAgentInterfacesMod.TaskAgentPoolMaintenanceScheduleDays.Saturday & Double = js.native
  
  /**
    * Run on Sunday.
    */
  @js.native
  sealed trait Sunday
    extends StObject
       with TaskAgentPoolMaintenanceScheduleDays
  /* 64 */ val Sunday: typingsJapgolly.vsoNodeApi.interfacesTaskAgentInterfacesMod.TaskAgentPoolMaintenanceScheduleDays.Sunday & Double = js.native
  
  /**
    * Run on Thursday.
    */
  @js.native
  sealed trait Thursday
    extends StObject
       with TaskAgentPoolMaintenanceScheduleDays
  /* 8 */ val Thursday: typingsJapgolly.vsoNodeApi.interfacesTaskAgentInterfacesMod.TaskAgentPoolMaintenanceScheduleDays.Thursday & Double = js.native
  
  /**
    * Run on Tuesday.
    */
  @js.native
  sealed trait Tuesday
    extends StObject
       with TaskAgentPoolMaintenanceScheduleDays
  /* 2 */ val Tuesday: typingsJapgolly.vsoNodeApi.interfacesTaskAgentInterfacesMod.TaskAgentPoolMaintenanceScheduleDays.Tuesday & Double = js.native
  
  /**
    * Run on Wednesday.
    */
  @js.native
  sealed trait Wednesday
    extends StObject
       with TaskAgentPoolMaintenanceScheduleDays
  /* 4 */ val Wednesday: typingsJapgolly.vsoNodeApi.interfacesTaskAgentInterfacesMod.TaskAgentPoolMaintenanceScheduleDays.Wednesday & Double = js.native
}
