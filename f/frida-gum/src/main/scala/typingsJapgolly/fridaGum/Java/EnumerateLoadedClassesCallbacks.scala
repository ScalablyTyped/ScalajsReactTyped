package typingsJapgolly.fridaGum.Java

import japgolly.scalajs.react.Callback
import typingsJapgolly.fridaGum.NativePointer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnumerateLoadedClassesCallbacks extends js.Object {
  /**
    * Called when all loaded classes have been enumerated.
    */
  def onComplete(): Unit
  /**
    * Called with the name of each currently loaded class, and a JNI
    * reference for its Java Class object.
    *
    * Pass the `name` to `Java.use()` to get a JavaScript wrapper.
    * You may also `Java.cast()` the `handle` to `java.lang.Class`.
    */
  def onMatch(name: String, handle: NativePointer): Unit
}

object EnumerateLoadedClassesCallbacks {
  @scala.inline
  def apply(onComplete: Callback, onMatch: (String, NativePointer) => Callback): EnumerateLoadedClassesCallbacks = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onComplete")(onComplete.toJsFn)
    __obj.updateDynamic("onMatch")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.fridaGum.NativePointer) => onMatch(t0, t1).runNow()))
    __obj.asInstanceOf[EnumerateLoadedClassesCallbacks]
  }
}

