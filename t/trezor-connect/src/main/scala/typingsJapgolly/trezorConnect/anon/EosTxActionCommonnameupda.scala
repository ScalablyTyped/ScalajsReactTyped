package typingsJapgolly.trezorConnect.anon

import typingsJapgolly.trezorConnect.libTypescriptNetworksEosMod.EosTxAction
import typingsJapgolly.trezorConnect.libTypescriptTrezorProtobufMod.EosPermissionLevel
import typingsJapgolly.trezorConnect.trezorConnectStrings.updateauth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined trezor-connect.trezor-connect/lib/typescript/networks/eos.EosTxActionCommon & {  name :'updateauth',   data :{  account :string,   permission :string,   parent :string,   auth :trezor-connect.trezor-connect/lib/typescript/networks/eos.EosAuthorization}} */
trait EosTxActionCommonnameupda
  extends StObject
     with EosTxAction {
  
  var account: String
  
  var authorization: js.Array[EosPermissionLevel]
  
  var data: Account
  
  var name: updateauth
}
object EosTxActionCommonnameupda {
  
  inline def apply(account: String, authorization: js.Array[EosPermissionLevel], data: Account): EosTxActionCommonnameupda = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], authorization = authorization.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], name = "updateauth")
    __obj.asInstanceOf[EosTxActionCommonnameupda]
  }
  
  extension [Self <: EosTxActionCommonnameupda](x: Self) {
    
    inline def setAccount(value: String): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setAuthorization(value: js.Array[EosPermissionLevel]): Self = StObject.set(x, "authorization", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationVarargs(value: EosPermissionLevel*): Self = StObject.set(x, "authorization", js.Array(value*))
    
    inline def setData(value: Account): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setName(value: updateauth): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
