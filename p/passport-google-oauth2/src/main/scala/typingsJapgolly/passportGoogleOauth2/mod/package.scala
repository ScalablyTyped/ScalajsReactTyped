package typingsJapgolly.passportGoogleOauth2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type VerifyCallback = js.Function3[
    /* error */ js.Any, 
    /* user */ js.UndefOr[js.Any], 
    /* options */ js.UndefOr[typingsJapgolly.passportGoogleOauth2.mod.VerifyOptions], 
    scala.Unit
  ]
  type VerifyFunction = js.Function4[
    /* accessToken */ java.lang.String, 
    /* refreshToken */ java.lang.String, 
    /* profile */ js.Any, 
    /* done */ typingsJapgolly.passportGoogleOauth2.mod.VerifyCallback, 
    scala.Unit
  ]
  type VerifyFunctionWithRequest = js.Function5[
    /* req */ typingsJapgolly.express.mod.Request_[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary], 
    /* accessToken */ java.lang.String, 
    /* refreshToken */ java.lang.String, 
    /* profile */ js.Any, 
    /* done */ typingsJapgolly.passportGoogleOauth2.mod.VerifyCallback, 
    scala.Unit
  ]
  type VerifyFunctionWithRequestAndParams = js.Function6[
    /* req */ typingsJapgolly.express.mod.Request_[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary], 
    /* accessToken */ java.lang.String, 
    /* refreshToken */ java.lang.String, 
    /* params */ typingsJapgolly.passportGoogleOauth2.AnonAccesstoken, 
    /* profile */ js.Any, 
    /* done */ typingsJapgolly.passportGoogleOauth2.mod.VerifyCallback, 
    scala.Unit
  ]
}
