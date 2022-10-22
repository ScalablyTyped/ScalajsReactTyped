package typingsJapgolly.fabric.mod.fabric

import org.scalajs.dom.SVGElement
import typingsJapgolly.fabric.fabricImplMod.TextOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fabric", "fabric.Text")
@js.native
open class Text protected ()
  extends typingsJapgolly.fabric.fabricImplMod.Text {
  /**
    * Constructor
    * @param text Text string
    * @param [options] Options object
    */
  def this(text: String) = this()
  def this(text: String, options: TextOptions) = this()
}
/* static members */
object Text {
  
  @JSImport("fabric", "fabric.Text")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fabric", "fabric.Text.DEFAULT_SVG_FONT_SIZE")
  @js.native
  def DEFAULT_SVG_FONT_SIZE: Double = js.native
  inline def DEFAULT_SVG_FONT_SIZE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_SVG_FONT_SIZE")(x.asInstanceOf[js.Any])
  
  /**
    * Returns fabric.Text instance from an SVG element (<b>not yet implemented</b>)
    * @static
    * @memberOf fabric.Text
    * @param {SVGElement} element Element to parse
    * @param {Function} callback callback function invoked after parsing
    * @param {Object} [options] Options object
    */
  inline def fromElement(element: SVGElement): typingsJapgolly.fabric.fabricImplMod.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("fromElement")(element.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.fabric.fabricImplMod.Text]
  inline def fromElement(element: SVGElement, callback: js.Function): typingsJapgolly.fabric.fabricImplMod.Text = (^.asInstanceOf[js.Dynamic].applyDynamic("fromElement")(element.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.fabric.fabricImplMod.Text]
  inline def fromElement(element: SVGElement, callback: js.Function, options: TextOptions): typingsJapgolly.fabric.fabricImplMod.Text = (^.asInstanceOf[js.Dynamic].applyDynamic("fromElement")(element.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.fabric.fabricImplMod.Text]
  inline def fromElement(element: SVGElement, callback: Unit, options: TextOptions): typingsJapgolly.fabric.fabricImplMod.Text = (^.asInstanceOf[js.Dynamic].applyDynamic("fromElement")(element.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.fabric.fabricImplMod.Text]
  
  /**
    * Returns fabric.Text instance from an object representation
    * @static
    * @memberOf fabric.Text
    * @param {Object} object Object to create an instance from
    * @param {Function} [callback] Callback to invoke when an fabric.Text instance is created
    */
  inline def fromObject(`object`: Any): typingsJapgolly.fabric.fabricImplMod.Text = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.fabric.fabricImplMod.Text]
  inline def fromObject(`object`: Any, callback: js.Function): typingsJapgolly.fabric.fabricImplMod.Text = (^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.fabric.fabricImplMod.Text]
}
