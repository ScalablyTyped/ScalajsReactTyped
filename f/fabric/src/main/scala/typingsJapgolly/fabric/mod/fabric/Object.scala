package typingsJapgolly.fabric.mod.fabric

import typingsJapgolly.fabric.fabricImplMod.IObjectOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fabric", "fabric.Object")
@js.native
class Object ()
  extends typingsJapgolly.fabric.fabricImplMod.Object {
  def this(options: IObjectOptions) = this()
}

/* static members */
@JSImport("fabric", "fabric.Object")
@js.native
object Object extends js.Object {
  /**
  	 * Defines the number of fraction digits to use when serializing object values.
  	 */
  var NUM_FRACTION_DIGITS: js.UndefOr[Double] = js.native
  /**
  	 * Creates fabric Object instance
  	 * @param {string} Class name
  	 * @param {fabric.Object} Original object
  	 * @param {Function} Callback when complete
  	 * @param {Object} Extra parameters for fabric.Object
  	 * @private
  	 * @return {fabric.Object}
  	 */
  def _fromObject(className: String, `object`: typingsJapgolly.fabric.fabricImplMod.Object): typingsJapgolly.fabric.fabricImplMod.Object = js.native
  def _fromObject(className: String, `object`: typingsJapgolly.fabric.fabricImplMod.Object, callback: js.Function): typingsJapgolly.fabric.fabricImplMod.Object = js.native
  def _fromObject(
    className: String,
    `object`: typingsJapgolly.fabric.fabricImplMod.Object,
    callback: js.Function,
    extraParam: js.Any
  ): typingsJapgolly.fabric.fabricImplMod.Object = js.native
}

