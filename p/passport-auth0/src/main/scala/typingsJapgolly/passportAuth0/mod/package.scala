package typingsJapgolly.passportAuth0

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type VerifyFunction = js.Function5[
    /* accessToken */ java.lang.String, 
    /* refreshToken */ java.lang.String, 
    /* extraParams */ typingsJapgolly.passportAuth0.mod.ExtraVerificationParams, 
    /* profile */ typingsJapgolly.passportAuth0.mod.Profile, 
    /* done */ js.Function3[
      /* error */ js.Any, 
      /* user */ js.UndefOr[js.Any], 
      /* info */ js.UndefOr[js.Any], 
      scala.Unit
    ], 
    scala.Unit
  ]
  type VerifyFunctionWithRequest = js.Function6[
    /* req */ typingsJapgolly.express.mod.Request_[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary], 
    /* accessToken */ java.lang.String, 
    /* refreshToken */ java.lang.String, 
    /* extraParams */ typingsJapgolly.passportAuth0.mod.ExtraVerificationParams, 
    /* profile */ typingsJapgolly.passportAuth0.mod.Profile, 
    /* done */ js.Function3[
      /* error */ js.Any, 
      /* user */ js.UndefOr[js.Any], 
      /* info */ js.UndefOr[js.Any], 
      scala.Unit
    ], 
    scala.Unit
  ]
}
