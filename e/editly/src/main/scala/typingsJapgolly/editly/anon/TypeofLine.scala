package typingsJapgolly.editly.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalajs.dom.SVGElement
import typingsJapgolly.fabric.fabricImplMod.ILineOptions
import typingsJapgolly.fabric.mod.fabric.Line
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofLine
  extends StObject
     with Instantiable0[Line] {
  
  var ATTRIBUTE_NAMES: js.Array[String] = js.native
  
  /**
    * Returns fabric.Line instance from an SVG element
    * @static
    * @memberOf fabric.Line
    * @param {SVGElement} element Element to parse
    * @param {Object} [options] Options object
    * @param {Function} [callback] callback function invoked after parsing
    */
  def fromElement(element: SVGElement): typingsJapgolly.fabric.fabricImplMod.Line = js.native
  def fromElement(element: SVGElement, callback: js.Function): typingsJapgolly.fabric.fabricImplMod.Line = js.native
  def fromElement(element: SVGElement, callback: js.Function, options: ILineOptions): typingsJapgolly.fabric.fabricImplMod.Line = js.native
  def fromElement(element: SVGElement, callback: Unit, options: ILineOptions): typingsJapgolly.fabric.fabricImplMod.Line = js.native
  
  /**
    * Returns fabric.Line instance from an object representation
    * @param object Object to create an instance from
    */
  def fromObject(`object`: Any): typingsJapgolly.fabric.fabricImplMod.Line = js.native
}
