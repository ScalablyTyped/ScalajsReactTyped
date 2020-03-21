package typingsJapgolly.shrinkRay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type FilterFunction = js.Function2[
    /* req */ typingsJapgolly.express.mod.Request_[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary], 
    /* res */ typingsJapgolly.express.mod.Response_, 
    scala.Boolean
  ]
}
