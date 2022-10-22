package typingsJapgolly.awsSdk.clientsWorkspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkspaceProperties extends StObject {
  
  /**
    * The compute type. For more information, see Amazon WorkSpaces Bundles.
    */
  var ComputeTypeName: js.UndefOr[Compute] = js.undefined
  
  /**
    * The size of the root volume. For important information about how to modify the size of the root and user volumes, see Modify a WorkSpace.
    */
  var RootVolumeSizeGib: js.UndefOr[typingsJapgolly.awsSdk.clientsWorkspacesMod.RootVolumeSizeGib] = js.undefined
  
  /**
    * The running mode. For more information, see Manage the WorkSpace Running Mode.
    */
  var RunningMode: js.UndefOr[typingsJapgolly.awsSdk.clientsWorkspacesMod.RunningMode] = js.undefined
  
  /**
    * The time after a user logs off when WorkSpaces are automatically stopped. Configured in 60-minute intervals.
    */
  var RunningModeAutoStopTimeoutInMinutes: js.UndefOr[typingsJapgolly.awsSdk.clientsWorkspacesMod.RunningModeAutoStopTimeoutInMinutes] = js.undefined
  
  /**
    * The size of the user storage. For important information about how to modify the size of the root and user volumes, see Modify a WorkSpace.
    */
  var UserVolumeSizeGib: js.UndefOr[typingsJapgolly.awsSdk.clientsWorkspacesMod.UserVolumeSizeGib] = js.undefined
}
object WorkspaceProperties {
  
  inline def apply(): WorkspaceProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceProperties]
  }
  
  extension [Self <: WorkspaceProperties](x: Self) {
    
    inline def setComputeTypeName(value: Compute): Self = StObject.set(x, "ComputeTypeName", value.asInstanceOf[js.Any])
    
    inline def setComputeTypeNameUndefined: Self = StObject.set(x, "ComputeTypeName", js.undefined)
    
    inline def setRootVolumeSizeGib(value: RootVolumeSizeGib): Self = StObject.set(x, "RootVolumeSizeGib", value.asInstanceOf[js.Any])
    
    inline def setRootVolumeSizeGibUndefined: Self = StObject.set(x, "RootVolumeSizeGib", js.undefined)
    
    inline def setRunningMode(value: RunningMode): Self = StObject.set(x, "RunningMode", value.asInstanceOf[js.Any])
    
    inline def setRunningModeAutoStopTimeoutInMinutes(value: RunningModeAutoStopTimeoutInMinutes): Self = StObject.set(x, "RunningModeAutoStopTimeoutInMinutes", value.asInstanceOf[js.Any])
    
    inline def setRunningModeAutoStopTimeoutInMinutesUndefined: Self = StObject.set(x, "RunningModeAutoStopTimeoutInMinutes", js.undefined)
    
    inline def setRunningModeUndefined: Self = StObject.set(x, "RunningMode", js.undefined)
    
    inline def setUserVolumeSizeGib(value: UserVolumeSizeGib): Self = StObject.set(x, "UserVolumeSizeGib", value.asInstanceOf[js.Any])
    
    inline def setUserVolumeSizeGibUndefined: Self = StObject.set(x, "UserVolumeSizeGib", js.undefined)
  }
}
