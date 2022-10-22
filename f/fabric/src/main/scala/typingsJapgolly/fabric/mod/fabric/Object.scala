package typingsJapgolly.fabric.mod.fabric

import typingsJapgolly.fabric.fabricImplMod.IObjectOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fabric", "fabric.Object")
@js.native
open class Object ()
  extends typingsJapgolly.fabric.fabricImplMod.Object {
  def this(options: IObjectOptions) = this()
}
/* static members */
object Object {
  
  @JSImport("fabric", "fabric.Object")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Defines the number of fraction digits to use when serializing object values.
    */
  @JSImport("fabric", "fabric.Object.NUM_FRACTION_DIGITS")
  @js.native
  def NUM_FRACTION_DIGITS: js.UndefOr[Double] = js.native
  inline def NUM_FRACTION_DIGITS_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NUM_FRACTION_DIGITS")(x.asInstanceOf[js.Any])
  
  /**
    * Creates fabric Object instance
    * @param {string} Class name
    * @param {fabric.Object} Original object
    * @param {Function} Callback when complete
    * @param {Object} Extra parameters for fabric.Object
    * @private
    * @return {fabric.Object}
    */
  inline def _fromObject(className: String, `object`: typingsJapgolly.fabric.fabricImplMod.Object): typingsJapgolly.fabric.fabricImplMod.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("_fromObject")(className.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.fabric.fabricImplMod.Object]
  inline def _fromObject(className: String, `object`: typingsJapgolly.fabric.fabricImplMod.Object, callback: js.Function): typingsJapgolly.fabric.fabricImplMod.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("_fromObject")(className.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.fabric.fabricImplMod.Object]
  inline def _fromObject(
    className: String,
    `object`: typingsJapgolly.fabric.fabricImplMod.Object,
    callback: js.Function,
    extraParam: Any
  ): typingsJapgolly.fabric.fabricImplMod.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("_fromObject")(className.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], extraParam.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.fabric.fabricImplMod.Object]
  inline def _fromObject(
    className: String,
    `object`: typingsJapgolly.fabric.fabricImplMod.Object,
    callback: Unit,
    extraParam: Any
  ): typingsJapgolly.fabric.fabricImplMod.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("_fromObject")(className.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], extraParam.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.fabric.fabricImplMod.Object]
}
