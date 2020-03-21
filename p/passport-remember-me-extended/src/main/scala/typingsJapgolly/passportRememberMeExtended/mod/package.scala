package typingsJapgolly.passportRememberMeExtended

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type IssueFunction = js.Function2[
    /* user */ js.Any, 
    /* done */ js.Function2[/* err */ js.Any, /* token */ js.UndefOr[js.Any], scala.Unit], 
    scala.Unit
  ]
  type IssueFunctionWithRequest = js.Function3[
    /* req */ typingsJapgolly.express.mod.Request_[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary], 
    /* user */ js.Any, 
    /* done */ js.Function2[/* err */ js.Any, /* token */ js.UndefOr[js.Any], scala.Unit], 
    scala.Unit
  ]
  type VerifyFunction = js.Function2[
    /* token */ js.Any, 
    /* done */ js.Function3[
      /* err */ js.Any, 
      /* user */ js.UndefOr[js.Any], 
      /* info */ js.UndefOr[js.Any], 
      scala.Unit
    ], 
    scala.Unit
  ]
  type VerifyFunctionWithRequest = js.Function3[
    /* req */ typingsJapgolly.express.mod.Request_[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary], 
    /* token */ js.Any, 
    /* done */ js.Function3[
      /* err */ js.Any, 
      /* user */ js.UndefOr[js.Any], 
      /* info */ js.UndefOr[js.Any], 
      scala.Unit
    ], 
    scala.Unit
  ]
}
