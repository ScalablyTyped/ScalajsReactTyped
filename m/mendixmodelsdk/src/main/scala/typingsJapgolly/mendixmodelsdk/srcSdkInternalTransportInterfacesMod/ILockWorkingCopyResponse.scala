package typingsJapgolly.mendixmodelsdk.srcSdkInternalTransportInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILockWorkingCopyResponse extends StObject {
  
  var merge: ILockData
  
  var previousMerge: ILockData | Null
}
object ILockWorkingCopyResponse {
  
  inline def apply(merge: ILockData): ILockWorkingCopyResponse = {
    val __obj = js.Dynamic.literal(merge = merge.asInstanceOf[js.Any], previousMerge = null)
    __obj.asInstanceOf[ILockWorkingCopyResponse]
  }
  
  extension [Self <: ILockWorkingCopyResponse](x: Self) {
    
    inline def setMerge(value: ILockData): Self = StObject.set(x, "merge", value.asInstanceOf[js.Any])
    
    inline def setPreviousMerge(value: ILockData): Self = StObject.set(x, "previousMerge", value.asInstanceOf[js.Any])
    
    inline def setPreviousMergeNull: Self = StObject.set(x, "previousMerge", null)
  }
}
