package typingsJapgolly.typescriptServices.TypeScript

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHashTable[T] extends js.Object {
  def add(key: String, data: T): Boolean
  def addOrUpdate(key: String, data: T): Boolean
  def count(): Double
  def every(fn: js.Function3[/* k */ String, /* value */ T, /* context */ js.Any, Unit], context: js.Any): Boolean
  def getAllKeys(): js.Array[String]
  def lookup(key: String): T
  def map(fn: js.Function3[/* k */ String, /* value */ T, /* context */ js.Any, Unit], context: js.Any): Unit
  def some(fn: js.Function3[/* k */ String, /* value */ T, /* context */ js.Any, Unit], context: js.Any): Boolean
}

object IHashTable {
  @scala.inline
  def apply[T](
    add: (String, T) => CallbackTo[Boolean],
    addOrUpdate: (String, T) => CallbackTo[Boolean],
    count: CallbackTo[Double],
    every: (js.Function3[/* k */ String, /* value */ T, /* context */ js.Any, Unit], js.Any) => CallbackTo[Boolean],
    getAllKeys: CallbackTo[js.Array[String]],
    lookup: String => CallbackTo[T],
    map: (js.Function3[/* k */ String, /* value */ T, /* context */ js.Any, Unit], js.Any) => Callback,
    some: (js.Function3[/* k */ String, /* value */ T, /* context */ js.Any, Unit], js.Any) => CallbackTo[Boolean]
  ): IHashTable[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("add")(js.Any.fromFunction2((t0: java.lang.String, t1: T) => add(t0, t1).runNow()))
    __obj.updateDynamic("addOrUpdate")(js.Any.fromFunction2((t0: java.lang.String, t1: T) => addOrUpdate(t0, t1).runNow()))
    __obj.updateDynamic("count")(count.toJsFn)
    __obj.updateDynamic("every")(js.Any.fromFunction2((t0: js.Function3[/* k */ java.lang.String, /* value */ T, /* context */ js.Any, scala.Unit], t1: js.Any) => every(t0, t1).runNow()))
    __obj.updateDynamic("getAllKeys")(getAllKeys.toJsFn)
    __obj.updateDynamic("lookup")(js.Any.fromFunction1((t0: java.lang.String) => lookup(t0).runNow()))
    __obj.updateDynamic("map")(js.Any.fromFunction2((t0: js.Function3[/* k */ java.lang.String, /* value */ T, /* context */ js.Any, scala.Unit], t1: js.Any) => map(t0, t1).runNow()))
    __obj.updateDynamic("some")(js.Any.fromFunction2((t0: js.Function3[/* k */ java.lang.String, /* value */ T, /* context */ js.Any, scala.Unit], t1: js.Any) => some(t0, t1).runNow()))
    __obj.asInstanceOf[IHashTable[T]]
  }
}

