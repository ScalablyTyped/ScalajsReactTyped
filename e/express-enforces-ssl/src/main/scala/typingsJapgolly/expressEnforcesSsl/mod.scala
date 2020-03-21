package typingsJapgolly.expressEnforcesSsl

import typingsJapgolly.express.mod.NextFunction
import typingsJapgolly.express.mod.Request_
import typingsJapgolly.express.mod.Response_
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-enforces-ssl", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /**
    * Enforces HTTPS connections on any incoming requests.
    */
  def apply(): js.Function3[
    /* req */ Request_[ParamsDictionary], 
    /* res */ Response_, 
    /* next */ NextFunction, 
    Unit
  ] = js.native
}

