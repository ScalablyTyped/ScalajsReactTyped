package typingsJapgolly.authmosphere

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object scopeMiddlewareOptionsMod {
  type onAuthorizationFailedHandler = js.Function5[
    /* request */ typingsJapgolly.express.mod.Request_[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary], 
    /* resonse */ typingsJapgolly.express.mod.Response_, 
    /* next */ typingsJapgolly.express.mod.NextFunction, 
    /* scopes */ js.Array[java.lang.String], 
    /* logger */ typingsJapgolly.authmosphere.loggerMod.Logger, 
    scala.Unit
  ]
}
