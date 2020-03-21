package typingsJapgolly.passportWindowsauth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Verified = js.Function3[
    /* err */ js.UndefOr[js.Error | scala.Null], 
    /* user */ js.UndefOr[js.Object], 
    /* info */ js.UndefOr[js.Object], 
    scala.Unit
  ]
  type Verify = js.Function2[
    /* profile */ typingsJapgolly.passport.mod.Profile, 
    /* done */ typingsJapgolly.passportWindowsauth.mod.Verified, 
    scala.Unit
  ]
  type VerifyWithReq = js.Function3[
    /* req */ typingsJapgolly.express.mod.Request_[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary], 
    /* profile */ typingsJapgolly.passport.mod.Profile, 
    /* done */ typingsJapgolly.passportWindowsauth.mod.Verified, 
    scala.Unit
  ]
  type windowsauth = typingsJapgolly.passport.mod.Strategy
}
