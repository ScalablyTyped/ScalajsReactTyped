package typingsJapgolly.passportAzureAd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object oidcStrategyMod {
  type VerifyOIDCFunction = (js.Function2[
    /* profile */ typingsJapgolly.passportAzureAd.oidcStrategyMod.IProfile, 
    /* done */ typingsJapgolly.passportAzureAd.commonMod.VerifyCallback, 
    scala.Unit
  ]) | (js.Function3[
    /* iss */ java.lang.String, 
    /* sub */ java.lang.String, 
    /* done */ typingsJapgolly.passportAzureAd.commonMod.VerifyCallback, 
    scala.Unit
  ]) | (js.Function4[
    /* iss */ java.lang.String, 
    /* sub */ java.lang.String, 
    /* profile */ typingsJapgolly.passportAzureAd.oidcStrategyMod.IProfile, 
    /* done */ typingsJapgolly.passportAzureAd.commonMod.VerifyCallback, 
    scala.Unit
  ]) | (js.Function6[
    /* iss */ java.lang.String, 
    /* sub */ java.lang.String, 
    /* profile */ typingsJapgolly.passportAzureAd.oidcStrategyMod.IProfile, 
    /* access_token */ java.lang.String, 
    /* refresh_token */ java.lang.String, 
    /* done */ typingsJapgolly.passportAzureAd.commonMod.VerifyCallback, 
    scala.Unit
  ]) | (js.Function7[
    /* iss */ java.lang.String, 
    /* sub */ java.lang.String, 
    /* profile */ typingsJapgolly.passportAzureAd.oidcStrategyMod.IProfile, 
    /* access_token */ java.lang.String, 
    /* refresh_token */ java.lang.String, 
    /* params */ js.Any, 
    /* done */ typingsJapgolly.passportAzureAd.commonMod.VerifyCallback, 
    scala.Unit
  ]) | (js.Function8[
    /* iss */ java.lang.String, 
    /* sub */ java.lang.String, 
    /* profile */ typingsJapgolly.passportAzureAd.oidcStrategyMod.IProfile, 
    /* jwtClaims */ js.Any, 
    /* access_token */ java.lang.String, 
    /* refresh_token */ java.lang.String, 
    /* params */ js.Any, 
    /* done */ typingsJapgolly.passportAzureAd.commonMod.VerifyCallback, 
    scala.Unit
  ])
  type VerifyOIDCFunctionWithReq = (js.Function3[
    /* req */ typingsJapgolly.express.mod.Request_[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary], 
    /* profile */ typingsJapgolly.passportAzureAd.oidcStrategyMod.IProfile, 
    /* done */ typingsJapgolly.passportAzureAd.commonMod.VerifyCallback, 
    scala.Unit
  ]) | (js.Function4[
    /* req */ typingsJapgolly.express.mod.Request_[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary], 
    /* iss */ java.lang.String, 
    /* sub */ java.lang.String, 
    /* done */ typingsJapgolly.passportAzureAd.commonMod.VerifyCallback, 
    scala.Unit
  ]) | (js.Function5[
    /* req */ typingsJapgolly.express.mod.Request_[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary], 
    /* iss */ java.lang.String, 
    /* sub */ java.lang.String, 
    /* profile */ typingsJapgolly.passportAzureAd.oidcStrategyMod.IProfile, 
    /* done */ typingsJapgolly.passportAzureAd.commonMod.VerifyCallback, 
    scala.Unit
  ]) | (js.Function7[
    /* req */ typingsJapgolly.express.mod.Request_[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary], 
    /* iss */ java.lang.String, 
    /* sub */ java.lang.String, 
    /* profile */ typingsJapgolly.passportAzureAd.oidcStrategyMod.IProfile, 
    /* access_token */ java.lang.String, 
    /* refresh_token */ java.lang.String, 
    /* done */ typingsJapgolly.passportAzureAd.commonMod.VerifyCallback, 
    scala.Unit
  ]) | (js.Function8[
    /* req */ typingsJapgolly.express.mod.Request_[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary], 
    /* iss */ java.lang.String, 
    /* sub */ java.lang.String, 
    /* profile */ typingsJapgolly.passportAzureAd.oidcStrategyMod.IProfile, 
    /* access_token */ java.lang.String, 
    /* refresh_token */ java.lang.String, 
    /* params */ js.Any, 
    /* done */ typingsJapgolly.passportAzureAd.commonMod.VerifyCallback, 
    scala.Unit
  ]) | (js.Function9[
    /* req */ typingsJapgolly.express.mod.Request_[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary], 
    /* iss */ java.lang.String, 
    /* sub */ java.lang.String, 
    /* profile */ typingsJapgolly.passportAzureAd.oidcStrategyMod.IProfile, 
    /* jwtClaims */ js.Any, 
    /* access_token */ java.lang.String, 
    /* refresh_token */ java.lang.String, 
    /* params */ js.Any, 
    /* done */ typingsJapgolly.passportAzureAd.commonMod.VerifyCallback, 
    scala.Unit
  ])
}
