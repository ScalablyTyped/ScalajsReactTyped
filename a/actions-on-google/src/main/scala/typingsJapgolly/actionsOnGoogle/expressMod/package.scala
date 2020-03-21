package typingsJapgolly.actionsOnGoogle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object expressMod {
  type ExpressHandler = js.Function2[
    /* request */ typingsJapgolly.express.mod.Request_[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary], 
    /* response */ typingsJapgolly.express.mod.Response_, 
    scala.Unit
  ]
}
