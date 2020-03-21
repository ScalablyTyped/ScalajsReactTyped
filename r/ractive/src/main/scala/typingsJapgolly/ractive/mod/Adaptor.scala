package typingsJapgolly.ractive.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Adaptor extends js.Object {
  /** Called when Ractive gets a new value to see if the adaptor should be applied.
  	 * @param value the value to evaluate
  	 * @param keypath the keypath of the value in the Ractive data
  	 * @param ractive the Ractive instance that is applying the value to the given keypath
  	 * @returns true if the adaptor should be applied, false otherwisej
  	 */
  def filter(value: js.Any, keypath: String, ractive: Ractive[Ractive[_]]): Boolean
  /** Called when Ractive is applying the adaptor to a value
  	 * @param ractive the Ractive instance that is applying the adaptor
  	 * @param value the value to which the value is being applied
  	 * @param keypath the keypath of the value to which the adaptor is being applied
  	 * @param prefixer a helper function to prefix a value map with the current keypath
  	 * @returns the adaptor
  	 */
  def wrap(ractive: Ractive[Ractive[_]], value: js.Any, keypath: String, prefixer: AdaptorPrefixer): AdaptorHandle
}

object Adaptor {
  @scala.inline
  def apply(
    filter: (js.Any, String, Ractive[Ractive[js.Any]]) => CallbackTo[Boolean],
    wrap: (Ractive[Ractive[js.Any]], js.Any, String, AdaptorPrefixer) => CallbackTo[AdaptorHandle]
  ): Adaptor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("filter")(js.Any.fromFunction3((t0: js.Any, t1: java.lang.String, t2: typingsJapgolly.ractive.mod.Ractive[typingsJapgolly.ractive.mod.Ractive[js.Any]]) => filter(t0, t1, t2).runNow()))
    __obj.updateDynamic("wrap")(js.Any.fromFunction4((t0: typingsJapgolly.ractive.mod.Ractive[typingsJapgolly.ractive.mod.Ractive[js.Any]], t1: js.Any, t2: java.lang.String, t3: typingsJapgolly.ractive.mod.AdaptorPrefixer) => wrap(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[Adaptor]
  }
}

