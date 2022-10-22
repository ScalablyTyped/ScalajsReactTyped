package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFImpersonationType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IImpersonation extends StObject {
  
  var Account: String
  
  def Clone(): IImpersonation
  
  var ImpersonationType: MFImpersonationType
  
  var Password: String
}
object IImpersonation {
  
  inline def apply(
    Account: String,
    Clone: CallbackTo[IImpersonation],
    ImpersonationType: MFImpersonationType,
    Password: String
  ): IImpersonation = {
    val __obj = js.Dynamic.literal(Account = Account.asInstanceOf[js.Any], Clone = Clone.toJsFn, ImpersonationType = ImpersonationType.asInstanceOf[js.Any], Password = Password.asInstanceOf[js.Any])
    __obj.asInstanceOf[IImpersonation]
  }
  
  extension [Self <: IImpersonation](x: Self) {
    
    inline def setAccount(value: String): Self = StObject.set(x, "Account", value.asInstanceOf[js.Any])
    
    inline def setClone(value: CallbackTo[IImpersonation]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setImpersonationType(value: MFImpersonationType): Self = StObject.set(x, "ImpersonationType", value.asInstanceOf[js.Any])
    
    inline def setPassword(value: String): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
  }
}
