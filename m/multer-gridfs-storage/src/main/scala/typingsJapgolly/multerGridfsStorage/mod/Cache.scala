package typingsJapgolly.multerGridfsStorage.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mongodb.mod.Db
import typingsJapgolly.mongodb.mod.MongoClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cache extends js.Object {
  def clear(): Unit
  def connections(): Double
  def findUri(cacheName: String, url: String): String
  def get(cacheIndex: js.Object): js.Object
  def has(cacheIndex: js.Object): Boolean
  def initialize(opts: js.Object): js.Object
  def isOpening(cacheIndex: js.Object): Boolean
  def isPending(cacheIndex: js.Object): Boolean
  def reject(cacheIndex: js.Object, err: js.Error): Unit
  def remove(cacheIndex: js.Object): Unit
  def resolve(cacheIndex: js.Object, db: Db, client: MongoClient): Unit
  def set(cacheIndex: js.Object, value: js.Object): Unit
  def waitFor(cacheIndex: js.Object): js.Promise[js.Object]
}

object Cache {
  @scala.inline
  def apply(
    clear: Callback,
    connections: CallbackTo[Double],
    findUri: (String, String) => CallbackTo[String],
    get: js.Object => CallbackTo[js.Object],
    has: js.Object => CallbackTo[Boolean],
    initialize: js.Object => CallbackTo[js.Object],
    isOpening: js.Object => CallbackTo[Boolean],
    isPending: js.Object => CallbackTo[Boolean],
    reject: (js.Object, js.Error) => Callback,
    remove: js.Object => Callback,
    resolve: (js.Object, Db, MongoClient) => Callback,
    set: (js.Object, js.Object) => Callback,
    waitFor: js.Object => CallbackTo[js.Promise[js.Object]]
  ): Cache = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clear")(clear.toJsFn)
    __obj.updateDynamic("connections")(connections.toJsFn)
    __obj.updateDynamic("findUri")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => findUri(t0, t1).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: js.Object) => get(t0).runNow()))
    __obj.updateDynamic("has")(js.Any.fromFunction1((t0: js.Object) => has(t0).runNow()))
    __obj.updateDynamic("initialize")(js.Any.fromFunction1((t0: js.Object) => initialize(t0).runNow()))
    __obj.updateDynamic("isOpening")(js.Any.fromFunction1((t0: js.Object) => isOpening(t0).runNow()))
    __obj.updateDynamic("isPending")(js.Any.fromFunction1((t0: js.Object) => isPending(t0).runNow()))
    __obj.updateDynamic("reject")(js.Any.fromFunction2((t0: js.Object, t1: js.Error) => reject(t0, t1).runNow()))
    __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: js.Object) => remove(t0).runNow()))
    __obj.updateDynamic("resolve")(js.Any.fromFunction3((t0: js.Object, t1: typingsJapgolly.mongodb.mod.Db, t2: typingsJapgolly.mongodb.mod.MongoClient) => resolve(t0, t1, t2).runNow()))
    __obj.updateDynamic("set")(js.Any.fromFunction2((t0: js.Object, t1: js.Object) => set(t0, t1).runNow()))
    __obj.updateDynamic("waitFor")(js.Any.fromFunction1((t0: js.Object) => waitFor(t0).runNow()))
    __obj.asInstanceOf[Cache]
  }
}

