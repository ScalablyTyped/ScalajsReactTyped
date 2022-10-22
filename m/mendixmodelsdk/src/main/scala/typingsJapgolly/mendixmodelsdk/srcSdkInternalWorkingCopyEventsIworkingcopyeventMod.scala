package typingsJapgolly.mendixmodelsdk

import typingsJapgolly.mendixmodelsdk.anon.EventId
import typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.buildResult
import typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.workingCopyData
import typingsJapgolly.mendixmodelsdk.srcSdkInternalTransportInterfacesMod.IWorkingCopy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcSdkInternalWorkingCopyEventsIworkingcopyeventMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.Failure
    - typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.Success
  */
  trait BuildResultStatus extends StObject
  object BuildResultStatus {
    
    inline def Failure: typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.Failure = "Failure".asInstanceOf[typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.Failure]
    
    inline def Success: typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.Success = "Success".asInstanceOf[typingsJapgolly.mendixmodelsdk.mendixmodelsdkStrings.Success]
  }
  
  trait IBuildResultEvent
    extends StObject
       with IWorkingCopyEvent {
    
    var data: EventId
    
    var `type`: buildResult
  }
  object IBuildResultEvent {
    
    inline def apply(data: EventId): IBuildResultEvent = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("buildResult")
      __obj.asInstanceOf[IBuildResultEvent]
    }
    
    extension [Self <: IBuildResultEvent](x: Self) {
      
      inline def setData(value: EventId): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setType(value: buildResult): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait IWorkingCopyDataEvent
    extends StObject
       with IWorkingCopyEvent {
    
    var data: IWorkingCopy
    
    var `type`: workingCopyData
  }
  object IWorkingCopyDataEvent {
    
    inline def apply(data: IWorkingCopy): IWorkingCopyDataEvent = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("workingCopyData")
      __obj.asInstanceOf[IWorkingCopyDataEvent]
    }
    
    extension [Self <: IWorkingCopyDataEvent](x: Self) {
      
      inline def setData(value: IWorkingCopy): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setType(value: workingCopyData): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.mendixmodelsdk.srcSdkInternalWorkingCopyEventsIworkingcopyeventMod.IWorkingCopyDataEvent
    - typingsJapgolly.mendixmodelsdk.srcSdkInternalWorkingCopyEventsIworkingcopyeventMod.IBuildResultEvent
  */
  trait IWorkingCopyEvent extends StObject
  object IWorkingCopyEvent {
    
    inline def IBuildResultEvent(data: EventId): typingsJapgolly.mendixmodelsdk.srcSdkInternalWorkingCopyEventsIworkingcopyeventMod.IBuildResultEvent = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("buildResult")
      __obj.asInstanceOf[typingsJapgolly.mendixmodelsdk.srcSdkInternalWorkingCopyEventsIworkingcopyeventMod.IBuildResultEvent]
    }
    
    inline def IWorkingCopyDataEvent(data: IWorkingCopy): typingsJapgolly.mendixmodelsdk.srcSdkInternalWorkingCopyEventsIworkingcopyeventMod.IWorkingCopyDataEvent = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("workingCopyData")
      __obj.asInstanceOf[typingsJapgolly.mendixmodelsdk.srcSdkInternalWorkingCopyEventsIworkingcopyeventMod.IWorkingCopyDataEvent]
    }
  }
}
