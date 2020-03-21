package typingsJapgolly.passportSaml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CertCallback = js.Function1[
    /* callback */ js.Function2[
      /* err */ js.Error | scala.Null, 
      /* cert */ js.UndefOr[java.lang.String | js.Array[java.lang.String]], 
      scala.Unit
    ], 
    scala.Unit
  ]
  type VerifiedCallback = js.Function3[
    /* err */ js.Error | scala.Null, 
    /* user */ js.UndefOr[js.Object], 
    /* info */ js.UndefOr[js.Object], 
    scala.Unit
  ]
  type VerifyWithRequest = js.Function3[
    /* req */ typingsJapgolly.express.mod.Request_[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary], 
    /* profile */ typingsJapgolly.passportSaml.mod.Profile, 
    /* done */ typingsJapgolly.passportSaml.mod.VerifiedCallback, 
    scala.Unit
  ]
  type VerifyWithoutRequest = js.Function2[
    /* profile */ typingsJapgolly.passportSaml.mod.Profile, 
    /* done */ typingsJapgolly.passportSaml.mod.VerifiedCallback, 
    scala.Unit
  ]
}
