package typingsJapgolly.krakenJs.mod

import typingsJapgolly.expressServeStaticCore.mod.Express
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import typingsJapgolly.expressServeStaticCore.mod.Request
import typingsJapgolly.expressServeStaticCore.mod.Response
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Kraken extends Express {
  @JSName("kraken")
  var kraken_Original: Kraken = js.native
  /**
    * Express instance itself is a request handler, which could be invoked without
    * third argument.
    */
  def kraken(req: Request[ParamsDictionary, _, _], res: Response[_]): js.Any = js.native
  def kraken(req: Request[ParamsDictionary, _, _], res: ServerResponse): js.Any = js.native
  def kraken(req: IncomingMessage, res: Response[_]): js.Any = js.native
  def kraken(req: IncomingMessage, res: ServerResponse): js.Any = js.native
}

