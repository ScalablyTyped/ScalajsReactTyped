package typingsJapgolly.trezorConnect.anon

import typingsJapgolly.trezorConnect.libTypescriptNetworksEosMod.EosTxAction
import typingsJapgolly.trezorConnect.libTypescriptTrezorProtobufMod.EosPermissionLevel
import typingsJapgolly.trezorConnect.trezorConnectStrings.transfer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined trezor-connect.trezor-connect/lib/typescript/networks/eos.EosTxActionCommon & {  name :'transfer',   data :{  from :string,   to :string,   quantity :string,   memo :string}} */
trait EosTxActionCommonnametran
  extends StObject
     with EosTxAction {
  
  var account: String
  
  var authorization: js.Array[EosPermissionLevel]
  
  var data: From
  
  var name: transfer
}
object EosTxActionCommonnametran {
  
  inline def apply(account: String, authorization: js.Array[EosPermissionLevel], data: From): EosTxActionCommonnametran = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], authorization = authorization.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], name = "transfer")
    __obj.asInstanceOf[EosTxActionCommonnametran]
  }
  
  extension [Self <: EosTxActionCommonnametran](x: Self) {
    
    inline def setAccount(value: String): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setAuthorization(value: js.Array[EosPermissionLevel]): Self = StObject.set(x, "authorization", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationVarargs(value: EosPermissionLevel*): Self = StObject.set(x, "authorization", js.Array(value*))
    
    inline def setData(value: From): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setName(value: transfer): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
