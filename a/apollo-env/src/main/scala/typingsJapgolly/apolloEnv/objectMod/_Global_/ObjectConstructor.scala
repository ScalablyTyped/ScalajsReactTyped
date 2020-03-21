package typingsJapgolly.apolloEnv.objectMod._Global_

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.apolloEnv.arrayMod._Global_.Array
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectConstructor extends js.Object {
  def fromEntries[K /* <: String */, V](map: Array[js.Tuple2[K, V]]): Record[K, V]
}

object ObjectConstructor {
  @scala.inline
  def apply(fromEntries: Array[js.Tuple2[js.Any, js.Any]] => CallbackTo[Record[js.Any, js.Any]]): ObjectConstructor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fromEntries")(js.Any.fromFunction1((t0: typingsJapgolly.apolloEnv.arrayMod._Global_.Array[js.Tuple2[js.Any, js.Any]]) => fromEntries(t0).runNow()))
    __obj.asInstanceOf[ObjectConstructor]
  }
}

