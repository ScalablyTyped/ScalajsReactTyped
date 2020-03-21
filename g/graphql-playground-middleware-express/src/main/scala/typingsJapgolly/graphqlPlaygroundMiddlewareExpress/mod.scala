package typingsJapgolly.graphqlPlaygroundMiddlewareExpress

import typingsJapgolly.express.mod.Request_
import typingsJapgolly.express.mod.Response_
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import typingsJapgolly.graphqlPlaygroundHtml.renderPlaygroundPageMod.MiddlewareOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-playground-middleware-express", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val default: Register = js.native
  type ExpressPlaygroundMiddleware = js.Function3[
    /* req */ Request_[ParamsDictionary], 
    /* res */ Response_, 
    /* next */ js.Function0[Unit], 
    Unit
  ]
  type Register = js.Function1[/* options */ MiddlewareOptions, ExpressPlaygroundMiddleware]
}

