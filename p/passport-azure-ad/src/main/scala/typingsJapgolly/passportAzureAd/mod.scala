package typingsJapgolly.passportAzureAd

import typingsJapgolly.passportAzureAd.bearerStrategyMod.IBearerStrategyOption
import typingsJapgolly.passportAzureAd.bearerStrategyMod.IBearerStrategyOptionWithRequest
import typingsJapgolly.passportAzureAd.bearerStrategyMod.VerifyBearerFunction
import typingsJapgolly.passportAzureAd.bearerStrategyMod.VerifyBearerFunctionWithReq
import typingsJapgolly.passportAzureAd.oidcStrategyMod.IOIDCStrategyOptionWithRequest
import typingsJapgolly.passportAzureAd.oidcStrategyMod.IOIDCStrategyOptionWithoutRequest
import typingsJapgolly.passportAzureAd.oidcStrategyMod.VerifyOIDCFunction
import typingsJapgolly.passportAzureAd.oidcStrategyMod.VerifyOIDCFunctionWithReq
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("passport-azure-ad", "BearerStrategy")
  @js.native
  open class BearerStrategy protected ()
    extends typingsJapgolly.passportAzureAd.bearerStrategyMod.BearerStrategy {
    def this(options: IBearerStrategyOptionWithRequest, verify: VerifyBearerFunctionWithReq) = this()
    def this(options: IBearerStrategyOption, verify: VerifyBearerFunction) = this()
  }
  
  @JSImport("passport-azure-ad", "OIDCStrategy")
  @js.native
  open class OIDCStrategy protected ()
    extends typingsJapgolly.passportAzureAd.oidcStrategyMod.OIDCStrategy {
    def this(options: IOIDCStrategyOptionWithRequest, verify: VerifyOIDCFunctionWithReq) = this()
    def this(options: IOIDCStrategyOptionWithoutRequest, verify: VerifyOIDCFunction) = this()
  }
}
