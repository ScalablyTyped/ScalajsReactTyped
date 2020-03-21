package typingsJapgolly.observeJs.mod.observejs

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*----------------------
		Path
	----------------------*/
trait Path extends js.Object {
  /**
  		 * Returns the current value of the path from the provided object. If eval() is available,
    		 * a compiled getter will be used for better performance. Like PathObserver above, undefined
    		 * is returned unless you provide an overriding defaultValue.
  		 */
  def getValueFrom(`object`: js.Any, defaultValue: js.Any): js.Any
}

object Path {
  @scala.inline
  def apply(getValueFrom: (js.Any, js.Any) => CallbackTo[js.Any]): Path = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getValueFrom")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => getValueFrom(t0, t1).runNow()))
    __obj.asInstanceOf[Path]
  }
}

