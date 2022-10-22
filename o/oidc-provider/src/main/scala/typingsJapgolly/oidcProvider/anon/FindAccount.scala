package typingsJapgolly.oidcProvider.anon

import typingsJapgolly.oidcProvider.mod.Account
import typingsJapgolly.oidcProvider.mod.AuthorizationCode
import typingsJapgolly.oidcProvider.mod.BackchannelAuthenticationRequest
import typingsJapgolly.oidcProvider.mod.CanBePromise
import typingsJapgolly.oidcProvider.mod.DeviceCode
import typingsJapgolly.oidcProvider.mod.KoaContextWithOIDC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FindAccount extends StObject {
  
  def findAccount(ctx: KoaContextWithOIDC, sub: String): CanBePromise[js.UndefOr[Account]]
  def findAccount(ctx: KoaContextWithOIDC, sub: String, token: typingsJapgolly.oidcProvider.mod.AccessToken): CanBePromise[js.UndefOr[Account]]
  def findAccount(ctx: KoaContextWithOIDC, sub: String, token: AuthorizationCode): CanBePromise[js.UndefOr[Account]]
  def findAccount(ctx: KoaContextWithOIDC, sub: String, token: BackchannelAuthenticationRequest): CanBePromise[js.UndefOr[Account]]
  def findAccount(ctx: KoaContextWithOIDC, sub: String, token: DeviceCode): CanBePromise[js.UndefOr[Account]]
  @JSName("findAccount")
  var findAccount_Original: typingsJapgolly.oidcProvider.mod.FindAccount
}
object FindAccount {
  
  inline def apply(
    findAccount: (/* ctx */ KoaContextWithOIDC, /* sub */ String, /* token */ js.UndefOr[
      AuthorizationCode | typingsJapgolly.oidcProvider.mod.AccessToken | DeviceCode | BackchannelAuthenticationRequest
    ]) => CanBePromise[js.UndefOr[Account]]
  ): FindAccount = {
    val __obj = js.Dynamic.literal(findAccount = js.Any.fromFunction3(findAccount))
    __obj.asInstanceOf[FindAccount]
  }
  
  extension [Self <: FindAccount](x: Self) {
    
    inline def setFindAccount(
      value: (/* ctx */ KoaContextWithOIDC, /* sub */ String, /* token */ js.UndefOr[
          AuthorizationCode | typingsJapgolly.oidcProvider.mod.AccessToken | DeviceCode | BackchannelAuthenticationRequest
        ]) => CanBePromise[js.UndefOr[Account]]
    ): Self = StObject.set(x, "findAccount", js.Any.fromFunction3(value))
  }
}
