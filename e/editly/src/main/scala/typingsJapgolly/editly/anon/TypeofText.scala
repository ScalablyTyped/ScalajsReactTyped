package typingsJapgolly.editly.anon

import org.scalablytyped.runtime.Instantiable1
import org.scalajs.dom.SVGElement
import typingsJapgolly.fabric.fabricImplMod.TextOptions
import typingsJapgolly.fabric.mod.fabric.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofText
  extends StObject
     with Instantiable1[/* text */ String, Text] {
  
  var DEFAULT_SVG_FONT_SIZE: Double = js.native
  
  /**
    * Returns fabric.Text instance from an SVG element (<b>not yet implemented</b>)
    * @static
    * @memberOf fabric.Text
    * @param {SVGElement} element Element to parse
    * @param {Function} callback callback function invoked after parsing
    * @param {Object} [options] Options object
    */
  def fromElement(element: SVGElement): typingsJapgolly.fabric.fabricImplMod.Text = js.native
  def fromElement(element: SVGElement, callback: js.Function): typingsJapgolly.fabric.fabricImplMod.Text = js.native
  def fromElement(element: SVGElement, callback: js.Function, options: TextOptions): typingsJapgolly.fabric.fabricImplMod.Text = js.native
  def fromElement(element: SVGElement, callback: Unit, options: TextOptions): typingsJapgolly.fabric.fabricImplMod.Text = js.native
  
  /**
    * Returns fabric.Text instance from an object representation
    * @static
    * @memberOf fabric.Text
    * @param {Object} object Object to create an instance from
    * @param {Function} [callback] Callback to invoke when an fabric.Text instance is created
    */
  def fromObject(`object`: Any): typingsJapgolly.fabric.fabricImplMod.Text = js.native
  def fromObject(`object`: Any, callback: js.Function): typingsJapgolly.fabric.fabricImplMod.Text = js.native
}
