package typingsJapgolly.passportAzureAd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object bearerStrategyMod {
  type VerifyBearerFunction = js.Function2[
    /* token */ typingsJapgolly.passportAzureAd.commonMod.ITokenPayload, 
    /* done */ typingsJapgolly.passportAzureAd.commonMod.VerifyCallback, 
    scala.Unit
  ]
  type VerifyBearerFunctionWithReq = js.Function3[
    /* req */ typingsJapgolly.express.mod.Request_[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary], 
    /* token */ typingsJapgolly.passportAzureAd.commonMod.ITokenPayload, 
    /* done */ typingsJapgolly.passportAzureAd.commonMod.VerifyCallback, 
    scala.Unit
  ]
}
