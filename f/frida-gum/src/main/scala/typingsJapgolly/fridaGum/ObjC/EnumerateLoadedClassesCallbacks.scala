package typingsJapgolly.fridaGum.ObjC

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnumerateLoadedClassesCallbacks extends js.Object {
  def onComplete(): Unit
  def onMatch(name: String, owner: String): Unit
}

object EnumerateLoadedClassesCallbacks {
  @scala.inline
  def apply(onComplete: Callback, onMatch: (String, String) => Callback): EnumerateLoadedClassesCallbacks = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onComplete")(onComplete.toJsFn)
    __obj.updateDynamic("onMatch")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => onMatch(t0, t1).runNow()))
    __obj.asInstanceOf[EnumerateLoadedClassesCallbacks]
  }
}

