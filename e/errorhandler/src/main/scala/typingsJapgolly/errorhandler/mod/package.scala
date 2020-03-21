package typingsJapgolly.errorhandler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type LoggingCallback = js.Function4[
    /* err */ js.Error, 
    /* str */ java.lang.String, 
    /* req */ typingsJapgolly.express.mod.Request_[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary], 
    /* res */ typingsJapgolly.express.mod.Response_, 
    scala.Unit
  ]
}
