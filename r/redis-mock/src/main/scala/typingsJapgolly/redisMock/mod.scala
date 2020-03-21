package typingsJapgolly.redisMock

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.redis.mod.ClientOpts
import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redis-mock", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class AbortError () extends Error {
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
  }
  
  @js.native
  class AggregateError () extends Error {
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
  }
  
  @js.native
  class ParserError ()
    extends typingsJapgolly.redis.mod.ParserError
  
  @js.native
  class RedisError () extends Error {
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
  }
  
  @js.native
  class ReplyError () extends Error {
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
  }
  
  val Multi: Instantiable0[typingsJapgolly.redis.mod.Multi] = js.native
  val RedisClient: Instantiable1[/* options */ ClientOpts, typingsJapgolly.redis.mod.RedisClient] = js.native
  @JSName("debug_mode")
  var debugMode: Boolean = js.native
  def createClient(): typingsJapgolly.redis.mod.RedisClient = js.native
  def createClient(options: ClientOpts): typingsJapgolly.redis.mod.RedisClient = js.native
  def createClient(port: Double): typingsJapgolly.redis.mod.RedisClient = js.native
  def createClient(port: Double, host: String): typingsJapgolly.redis.mod.RedisClient = js.native
  def createClient(port: Double, host: String, options: ClientOpts): typingsJapgolly.redis.mod.RedisClient = js.native
  def createClient(unix_socket: String): typingsJapgolly.redis.mod.RedisClient = js.native
  def createClient(unix_socket: String, options: ClientOpts): typingsJapgolly.redis.mod.RedisClient = js.native
  def print(err: Null, reply: js.Any): Unit = js.native
  def print(err: Error, reply: js.Any): Unit = js.native
}

