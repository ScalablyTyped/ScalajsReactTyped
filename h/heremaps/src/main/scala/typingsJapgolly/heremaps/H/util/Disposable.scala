package typingsJapgolly.heremaps.H.util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Object which can be safely disposed.
  */
@JSGlobal("H.util.Disposable")
@js.native
/**
  * Constructor
  */
class Disposable () extends js.Object {
  /**
    * Method adds a callback which will be triggered when the object is disposed
    * @param callback {Function}
    * @param opt_scope {Object=}
    */
  def addOnDisposeCallback(callback: js.Function0[Unit]): Unit = js.native
  def addOnDisposeCallback(callback: js.Function0[Unit], opt_scope: js.Object): Unit = js.native
}

