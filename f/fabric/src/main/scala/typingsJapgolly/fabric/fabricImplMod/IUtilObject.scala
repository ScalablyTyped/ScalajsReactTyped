package typingsJapgolly.fabric.fabricImplMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUtilObject extends js.Object {
  /**
  	 * Creates an empty object and copies all enumerable properties of another object to it
  	 * @param object Object to clone
  	 */
  def clone(`object`: js.Any): js.Any
  /**
  	 * Copies all enumerable properties of one object to another
  	 * @param destination Where to copy to
  	 * @param source Where to copy from
  	 */
  def extend(destination: js.Any, source: js.Any): js.Any
}

object IUtilObject {
  @scala.inline
  def apply(clone: js.Any => CallbackTo[js.Any], extend: (js.Any, js.Any) => CallbackTo[js.Any]): IUtilObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clone")(js.Any.fromFunction1((t0: js.Any) => clone(t0).runNow()))
    __obj.updateDynamic("extend")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => extend(t0, t1).runNow()))
    __obj.asInstanceOf[IUtilObject]
  }
}

