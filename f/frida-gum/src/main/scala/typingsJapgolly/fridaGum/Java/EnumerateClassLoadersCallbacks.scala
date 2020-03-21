package typingsJapgolly.fridaGum.Java

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnumerateClassLoadersCallbacks extends js.Object {
  /**
    * Called when all class loaders have been enumerated.
    */
  def onComplete(): Unit
  /**
    * Called with a `java.lang.ClassLoader` wrapper for each class loader
    * found in the VM.
    */
  def onMatch(loader: Wrapper): Unit
}

object EnumerateClassLoadersCallbacks {
  @scala.inline
  def apply(onComplete: Callback, onMatch: Wrapper => Callback): EnumerateClassLoadersCallbacks = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onComplete")(onComplete.toJsFn)
    __obj.updateDynamic("onMatch")(js.Any.fromFunction1((t0: typingsJapgolly.fridaGum.Java.Wrapper) => onMatch(t0).runNow()))
    __obj.asInstanceOf[EnumerateClassLoadersCallbacks]
  }
}

