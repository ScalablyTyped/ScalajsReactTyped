package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IServerLicenseManagementOperations extends StObject {
  
  def GetLicenseStatus(): ILicenseStatus
  
  def SetLicenseCodeAndSerialNumber(SerialNumber: String, LicenseCode: String): Unit
}
object IServerLicenseManagementOperations {
  
  inline def apply(
    GetLicenseStatus: CallbackTo[ILicenseStatus],
    SetLicenseCodeAndSerialNumber: (String, String) => Callback
  ): IServerLicenseManagementOperations = {
    val __obj = js.Dynamic.literal(GetLicenseStatus = GetLicenseStatus.toJsFn, SetLicenseCodeAndSerialNumber = js.Any.fromFunction2((t0: String, t1: String) => (SetLicenseCodeAndSerialNumber(t0, t1)).runNow()))
    __obj.asInstanceOf[IServerLicenseManagementOperations]
  }
  
  extension [Self <: IServerLicenseManagementOperations](x: Self) {
    
    inline def setGetLicenseStatus(value: CallbackTo[ILicenseStatus]): Self = StObject.set(x, "GetLicenseStatus", value.toJsFn)
    
    inline def setSetLicenseCodeAndSerialNumber(value: (String, String) => Callback): Self = StObject.set(x, "SetLicenseCodeAndSerialNumber", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
  }
}
