package typingsJapgolly.pgPromise.pgSubsetMod

import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IClient extends EventEmitter {
  var activeQuery: IQuery = js.native
  var binary: Boolean = js.native
  //////////////////////////////////////////////////////////////
  // Properties below are not available within Native Bindings:
  var connection: IConnection = js.native
  var connectionParameters: IConnectionParameters[IClient] = js.native
  var database: String = js.native
  var encoding: String = js.native
  var host: String = js.native
  var password: DynamicPassword = js.native
  var port: Double = js.native
  var processID: Double = js.native
  var queryQueue: js.Array[IQuery] = js.native
  var readyForQuery: Boolean = js.native
  var secretKey: Double = js.native
  var ssl: Boolean | ISSLConfig = js.native
  var user: String = js.native
  def query(config: js.Any): js.Promise[IResult] = js.native
  def query(config: js.Any, callback: js.Function2[/* err */ Error, /* result */ IResult, Unit]): js.UndefOr[scala.Nothing] = js.native
  def query(config: js.Any, values: js.Array[_]): js.Promise[IResult] = js.native
  def query(
    config: js.Any,
    values: js.Array[_],
    callback: js.Function2[/* err */ js.Error, /* result */ IResult, Unit]
  ): js.UndefOr[scala.Nothing] = js.native
}

