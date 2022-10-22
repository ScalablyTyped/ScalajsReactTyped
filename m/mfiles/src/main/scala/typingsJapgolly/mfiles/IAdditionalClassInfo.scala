package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFAdditionalClassInfoType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAdditionalClassInfo extends StObject {
  
  var AssignmentClassInfo: IAssignmentClassInfo
  
  def Clear(): Unit
  
  def Clone(): IAdditionalClassInfo
  
  val InfoType: MFAdditionalClassInfoType
}
object IAdditionalClassInfo {
  
  inline def apply(
    AssignmentClassInfo: IAssignmentClassInfo,
    Clear: Callback,
    Clone: CallbackTo[IAdditionalClassInfo],
    InfoType: MFAdditionalClassInfoType
  ): IAdditionalClassInfo = {
    val __obj = js.Dynamic.literal(AssignmentClassInfo = AssignmentClassInfo.asInstanceOf[js.Any], Clear = Clear.toJsFn, Clone = Clone.toJsFn, InfoType = InfoType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAdditionalClassInfo]
  }
  
  extension [Self <: IAdditionalClassInfo](x: Self) {
    
    inline def setAssignmentClassInfo(value: IAssignmentClassInfo): Self = StObject.set(x, "AssignmentClassInfo", value.asInstanceOf[js.Any])
    
    inline def setClear(value: Callback): Self = StObject.set(x, "Clear", value.toJsFn)
    
    inline def setClone(value: CallbackTo[IAdditionalClassInfo]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setInfoType(value: MFAdditionalClassInfoType): Self = StObject.set(x, "InfoType", value.asInstanceOf[js.Any])
  }
}
