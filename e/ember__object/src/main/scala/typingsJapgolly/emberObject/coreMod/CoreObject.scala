package typingsJapgolly.emberObject.coreMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoreObject extends js.Object {
  /**
    * Defines the properties that will be concatenated from the superclass (instead of overridden).
    * @default null
    */
  var concatenatedProperties: js.Array[_]
  /**
    * Destroyed object property flag. If this property is true the observers and bindings were
    * already removed by the effect of calling the destroy() method.
    * @default false
    */
  var isDestroyed: Boolean
  /**
    * Destruction scheduled flag. The destroy() method has been called. The object stays intact
    * until the end of the run loop at which point the isDestroyed flag is set.
    * @default false
    */
  var isDestroying: Boolean
  def _super(args: js.Any*): js.Any
  /**
    * Destroys an object by setting the `isDestroyed` flag and removing its
    * metadata, which effectively destroys observers and bindings.
    * If you try to set a property on a destroyed object, an exception will be
    * raised.
    * Note that destruction is scheduled for the end of the run loop and does not
    * happen immediately.  It will set an isDestroying flag immediately.
    * @return receiver
    */
  def destroy(): CoreObject
  /**
    * An overridable method called when objects are instantiated. By default,
    * does nothing unless it is overridden during class definition.
    */
  def init(): Unit
  /**
    * Override to implement teardown.
    */
  def willDestroy(): Unit
}

object CoreObject {
  @scala.inline
  def apply(
    _super: /* repeated */ js.Any => CallbackTo[js.Any],
    concatenatedProperties: js.Array[_],
    destroy: CallbackTo[CoreObject],
    init: Callback,
    isDestroyed: Boolean,
    isDestroying: Boolean,
    willDestroy: Callback
  ): CoreObject = {
    val __obj = js.Dynamic.literal(concatenatedProperties = concatenatedProperties.asInstanceOf[js.Any], isDestroyed = isDestroyed.asInstanceOf[js.Any], isDestroying = isDestroying.asInstanceOf[js.Any])
    __obj.updateDynamic("_super")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => _super(t0).runNow()))
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("init")(init.toJsFn)
    __obj.updateDynamic("willDestroy")(willDestroy.toJsFn)
    __obj.asInstanceOf[CoreObject]
  }
}

