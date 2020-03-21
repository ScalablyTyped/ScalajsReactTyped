package typingsJapgolly.passportVkontakte

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type VerifyCallback = js.Function3[
    /* error */ js.Any, 
    /* user */ js.UndefOr[js.Any], 
    /* info */ js.UndefOr[js.Any], 
    scala.Unit
  ]
  type VerifyFunction = js.Function4[
    /* accessToken */ java.lang.String, 
    /* refreshToken */ java.lang.String, 
    /* profile */ typingsJapgolly.passportVkontakte.mod.Profile, 
    /* done */ typingsJapgolly.passportVkontakte.mod.VerifyCallback, 
    scala.Unit
  ]
  type VerifyFunctionWithParams = js.Function5[
    /* accessToken */ java.lang.String, 
    /* refreshToken */ java.lang.String, 
    /* params */ typingsJapgolly.passportVkontakte.mod.Params, 
    /* profile */ typingsJapgolly.passportVkontakte.mod.Profile, 
    /* done */ typingsJapgolly.passportVkontakte.mod.VerifyCallback, 
    scala.Unit
  ]
}
