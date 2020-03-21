package typingsJapgolly.opticsAgent.mod

import typingsJapgolly.express.mod.Request_
import typingsJapgolly.express.mod.Response_
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import typingsJapgolly.graphql.mod.GraphQLSchema
import typingsJapgolly.hapi.mod.Server
import typingsJapgolly.koa.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("optics-agent", "Agent")
@js.native
class Agent protected () extends js.Object {
  def this(options: Options) = this()
  def configureAgent(options: Options): Agent = js.native
  def context(req: Request_[ParamsDictionary]): js.Any = js.native
  def instrumentHapiServer(server: Server): Unit = js.native
  def instrumentSchema(schema: GraphQLSchema): Unit = js.native
  def koaMiddleware(): js.Function2[/* context */ Context, /* next */ js.Function0[js.Promise[_]], Unit] = js.native
  def middleware(): js.Function3[
    /* req */ Request_[ParamsDictionary], 
    /* res */ Response_, 
    /* next */ js.UndefOr[js.Any], 
    Unit
  ] = js.native
}

