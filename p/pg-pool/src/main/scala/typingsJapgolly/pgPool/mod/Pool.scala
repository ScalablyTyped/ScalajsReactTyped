package typingsJapgolly.pgPool.mod

import typingsJapgolly.pg.mod.PoolClient
import typingsJapgolly.pgPool.pgPoolStrings.acquire
import typingsJapgolly.pgPool.pgPoolStrings.connect
import typingsJapgolly.pgPool.pgPoolStrings.error
import typingsJapgolly.pgPool.pgPoolStrings.remove
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pool[T /* <: typingsJapgolly.pg.mod.Client */]
  extends typingsJapgolly.pg.mod.Pool {
  val Client: ClientLikeCtr[T] = js.native
  @JSName("on")
  def on_acquire(event: acquire, listener: js.Function1[/* client */ T with PoolClient, Unit]): this.type = js.native
  @JSName("on")
  def on_connect(event: connect, listener: js.Function1[/* client */ T with PoolClient, Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function2[/* err */ js.Error, /* client */ T with PoolClient, Unit]): this.type = js.native
  @JSName("on")
  def on_remove(event: remove, listener: js.Function1[/* client */ T with PoolClient, Unit]): this.type = js.native
}

