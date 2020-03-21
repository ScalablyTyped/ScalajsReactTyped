package typingsJapgolly.phosphorDisposable.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDisposable extends js.Object {
  /**
    * Test whether the object has been disposed.
    *
    * #### Notes
    * This property is always safe to access.
    */
  val isDisposed: Boolean
  /**
    * Dispose of the resources held by the object.
    *
    * #### Notes
    * If the object's `dispose` method is called more than once, all
    * calls made after the first will be a no-op.
    *
    * #### Undefined Behavior
    * It is undefined behavior to use any functionality of the object
    * after it has been disposed unless otherwise explicitly noted.
    */
  def dispose(): Unit
}

object IDisposable {
  @scala.inline
  def apply(dispose: Callback, isDisposed: Boolean): IDisposable = {
    val __obj = js.Dynamic.literal(isDisposed = isDisposed.asInstanceOf[js.Any])
    __obj.updateDynamic("dispose")(dispose.toJsFn)
    __obj.asInstanceOf[IDisposable]
  }
}

