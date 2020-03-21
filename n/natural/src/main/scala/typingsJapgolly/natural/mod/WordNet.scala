package typingsJapgolly.natural.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WordNet extends js.Object {
  def get(synsetOffset: Double, pos: String, callback: WordNetGetCallback): Unit
  def lookup(word: String, callback: WordNetLookupCallback): Unit
}

object WordNet {
  @scala.inline
  def apply(
    get: (Double, String, WordNetGetCallback) => Callback,
    lookup: (String, WordNetLookupCallback) => Callback
  ): WordNet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction3((t0: scala.Double, t1: java.lang.String, t2: typingsJapgolly.natural.mod.WordNetGetCallback) => get(t0, t1, t2).runNow()))
    __obj.updateDynamic("lookup")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.natural.mod.WordNetLookupCallback) => lookup(t0, t1).runNow()))
    __obj.asInstanceOf[WordNet]
  }
}

