package typingsJapgolly.keya.storeMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.keya.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Store extends js.Object {
  var name: String
  var store: StringDictionary[js.Any]
  var version: Double
  def all(): js.Promise[js.Array[AnonKey]]
  def clear(): js.Promise[Unit]
  def delete(key: String): js.Promise[Boolean]
  def find(finder: js.Function2[/* value */ js.Any, /* name */ String, js.Promise[Boolean] | Boolean]): js.Promise[js.Array[AnonKey]]
  def get(key: String): js.Promise[_]
  def initalize(): js.Promise[Unit]
  def load(): js.Promise[Unit]
  def save(): js.Promise[Unit]
  def set(key: String, value: js.Any): js.Promise[Boolean]
}

object Store {
  @scala.inline
  def apply(
    all: CallbackTo[js.Promise[js.Array[AnonKey]]],
    clear: CallbackTo[js.Promise[Unit]],
    delete: String => CallbackTo[js.Promise[Boolean]],
    find: js.Function2[/* value */ js.Any, /* name */ String, js.Promise[Boolean] | Boolean] => CallbackTo[js.Promise[js.Array[AnonKey]]],
    get: String => CallbackTo[js.Promise[js.Any]],
    initalize: CallbackTo[js.Promise[Unit]],
    load: CallbackTo[js.Promise[Unit]],
    name: String,
    save: CallbackTo[js.Promise[Unit]],
    set: (String, js.Any) => CallbackTo[js.Promise[Boolean]],
    store: StringDictionary[js.Any],
    version: Double
  ): Store = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("all")(all.toJsFn)
    __obj.updateDynamic("clear")(clear.toJsFn)
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: java.lang.String) => delete(t0).runNow()))
    __obj.updateDynamic("find")(js.Any.fromFunction1((t0: js.Function2[
  /* value */ js.Any, 
  /* name */ java.lang.String, 
  js.Promise[scala.Boolean] | scala.Boolean]) => find(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: java.lang.String) => get(t0).runNow()))
    __obj.updateDynamic("initalize")(initalize.toJsFn)
    __obj.updateDynamic("load")(load.toJsFn)
    __obj.updateDynamic("save")(save.toJsFn)
    __obj.updateDynamic("set")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => set(t0, t1).runNow()))
    __obj.asInstanceOf[Store]
  }
}

