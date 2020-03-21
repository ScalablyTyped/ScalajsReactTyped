package typingsJapgolly.authmosphere

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object authenticationMiddlewareOptionsMod {
  type onNotAuthenticatedHandler = js.Function4[
    /* request */ typingsJapgolly.express.mod.Request_[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary], 
    /* resonse */ typingsJapgolly.express.mod.Response_, 
    /* next */ typingsJapgolly.express.mod.NextFunction, 
    /* logger */ typingsJapgolly.authmosphere.loggerMod.Logger, 
    scala.Unit
  ]
}
