package typingsJapgolly.fabric.mod.fabric

import typingsJapgolly.fabric.fabricImplMod.ITextboxOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fabric", "fabric.Textbox")
@js.native
open class Textbox protected ()
  extends typingsJapgolly.fabric.fabricImplMod.Textbox {
  /**
    * Constructor
    * @param text Text string
    * @param [options] Options object
    */
  def this(text: String) = this()
  def this(text: String, options: ITextboxOptions) = this()
}
/* static members */
object Textbox {
  
  @JSImport("fabric", "fabric.Textbox")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns fabric.Textbox instance from an object representation
    * @static
    * @memberOf fabric.Textbox
    * @param {Object} object Object to create an instance from
    * @param {Function} [callback] Callback to invoke when an fabric.Textbox instance is created
    */
  inline def fromObject(`object`: Any): typingsJapgolly.fabric.fabricImplMod.Textbox = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.fabric.fabricImplMod.Textbox]
  inline def fromObject(`object`: Any, callback: js.Function): typingsJapgolly.fabric.fabricImplMod.Textbox = (^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.fabric.fabricImplMod.Textbox]
}
