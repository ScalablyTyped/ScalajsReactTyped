package typingsJapgolly.kue.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.redis.mod.RedisClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Redis extends js.Object {
  def client(): RedisClient
  def configureFactory(options: js.Object, queue: Queue): Unit
  def createClient(): RedisClient
  def createClientFactory(options: js.Object): RedisClient
  def pubsubClient(): RedisClient
  def reset(): Unit
}

object Redis {
  @scala.inline
  def apply(
    client: CallbackTo[RedisClient],
    configureFactory: (js.Object, Queue) => Callback,
    createClient: CallbackTo[RedisClient],
    createClientFactory: js.Object => CallbackTo[RedisClient],
    pubsubClient: CallbackTo[RedisClient],
    reset: Callback
  ): Redis = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("client")(client.toJsFn)
    __obj.updateDynamic("configureFactory")(js.Any.fromFunction2((t0: js.Object, t1: typingsJapgolly.kue.mod.Queue) => configureFactory(t0, t1).runNow()))
    __obj.updateDynamic("createClient")(createClient.toJsFn)
    __obj.updateDynamic("createClientFactory")(js.Any.fromFunction1((t0: js.Object) => createClientFactory(t0).runNow()))
    __obj.updateDynamic("pubsubClient")(pubsubClient.toJsFn)
    __obj.updateDynamic("reset")(reset.toJsFn)
    __obj.asInstanceOf[Redis]
  }
}

