package typingsJapgolly.nodeRal.mod

import typingsJapgolly.express.mod.NextFunction
import typingsJapgolly.express.mod.Request_
import typingsJapgolly.express.mod.Response_
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-ral", "Middleware")
@js.native
object Middleware extends js.Object {
  def apply(): js.Function3[
    /* req */ Request_[ParamsDictionary], 
    /* resp */ Response_, 
    /* next */ NextFunction, 
    Unit
  ] = js.native
  def apply(options: Service): js.Function3[
    /* req */ Request_[ParamsDictionary], 
    /* resp */ Response_, 
    /* next */ NextFunction, 
    Unit
  ] = js.native
}

