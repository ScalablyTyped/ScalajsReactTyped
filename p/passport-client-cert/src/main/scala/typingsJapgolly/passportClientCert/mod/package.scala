package typingsJapgolly.passportClientCert

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type VerifyCallback = js.Function3[
    /* error */ js.Any, 
    /* user */ js.UndefOr[js.Any], 
    /* options */ js.UndefOr[typingsJapgolly.passportClientCert.mod.VerifyOptions], 
    scala.Unit
  ]
  type VerifyFunction = js.Function2[
    /* clientCert */ typingsJapgolly.passportClientCert.mod.PeerCertificate, 
    /* done */ typingsJapgolly.passportClientCert.mod.VerifyCallback, 
    scala.Unit
  ]
  type VerifyFunctionWithRequest = js.Function3[
    /* clientCert */ typingsJapgolly.passportClientCert.mod.PeerCertificate, 
    /* req */ typingsJapgolly.express.mod.Request_[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary], 
    /* done */ typingsJapgolly.passportClientCert.mod.VerifyCallback, 
    scala.Unit
  ]
}
