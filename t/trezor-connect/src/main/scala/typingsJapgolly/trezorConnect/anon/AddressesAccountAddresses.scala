package typingsJapgolly.trezorConnect.anon

import typingsJapgolly.trezorConnect.libTypescriptAccountMod.AccountAddresses
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddressesAccountAddresses extends StObject {
  
  var addresses: AccountAddresses
}
object AddressesAccountAddresses {
  
  inline def apply(addresses: AccountAddresses): AddressesAccountAddresses = {
    val __obj = js.Dynamic.literal(addresses = addresses.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddressesAccountAddresses]
  }
  
  extension [Self <: AddressesAccountAddresses](x: Self) {
    
    inline def setAddresses(value: AccountAddresses): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
  }
}
