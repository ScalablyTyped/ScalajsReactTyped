package typingsJapgolly.expressJwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type GetTokenCallback = js.Function1[
    /* req */ typingsJapgolly.express.mod.Request_[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary], 
    js.Any
  ]
  type IsRevokedCallback = js.Function3[
    /* req */ typingsJapgolly.express.mod.Request_[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary], 
    /* payload */ js.Any, 
    /* done */ js.Function2[/* err */ js.Any, /* revoked */ js.UndefOr[scala.Boolean], scala.Unit], 
    scala.Unit
  ]
  type SecretCallback = js.Function3[
    /* req */ typingsJapgolly.express.mod.Request_[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary], 
    /* payload */ js.Any, 
    /* done */ js.Function2[
      /* err */ js.Any, 
      /* secret */ js.UndefOr[typingsJapgolly.expressJwt.mod.secretType], 
      scala.Unit
    ], 
    scala.Unit
  ]
  type SecretCallbackLong = js.Function4[
    /* req */ typingsJapgolly.express.mod.Request_[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary], 
    /* header */ js.Any, 
    /* payload */ js.Any, 
    /* done */ js.Function2[
      /* err */ js.Any, 
      /* secret */ js.UndefOr[typingsJapgolly.expressJwt.mod.secretType], 
      scala.Unit
    ], 
    scala.Unit
  ]
  type secretType = java.lang.String | typingsJapgolly.node.Buffer
}
