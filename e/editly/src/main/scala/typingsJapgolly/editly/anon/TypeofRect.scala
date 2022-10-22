package typingsJapgolly.editly.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalajs.dom.SVGElement
import typingsJapgolly.fabric.fabricImplMod.IRectOptions
import typingsJapgolly.fabric.mod.fabric.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofRect
  extends StObject
     with Instantiable0[Rect] {
  
  /**
    * List of attribute names to account for when parsing SVG element (used by `fabric.Rect.fromElement`)
    */
  var ATTRIBUTE_NAMES: js.Array[String] = js.native
  
  /**
    * Returns Rect instance from an SVG element
    * @param element Element to parse
    * @param [options] Options object
    */
  def fromElement(element: SVGElement): typingsJapgolly.fabric.fabricImplMod.Rect = js.native
  def fromElement(element: SVGElement, options: IRectOptions): typingsJapgolly.fabric.fabricImplMod.Rect = js.native
  
  /**
    * Returns Rect instance from an object representation
    * @param object Object to create an instance from
    */
  def fromObject(`object`: Any): typingsJapgolly.fabric.fabricImplMod.Rect = js.native
}
