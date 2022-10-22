package typingsJapgolly.editly.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalajs.dom.SVGElement
import typingsJapgolly.fabric.fabricImplMod.IEllipseOptions
import typingsJapgolly.fabric.mod.fabric.Ellipse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofEllipse
  extends StObject
     with Instantiable0[Ellipse] {
  
  /**
    * List of attribute names to account for when parsing SVG element (used by {@link fabric.Ellipse.fromElement})
    */
  var ATTRIBUTE_NAMES: js.Array[String] = js.native
  
  /**
    * Returns Ellipse instance from an SVG element
    * @param element Element to parse
    * @param [options] Options object
    */
  def fromElement(element: SVGElement): typingsJapgolly.fabric.fabricImplMod.Ellipse = js.native
  def fromElement(element: SVGElement, options: IEllipseOptions): typingsJapgolly.fabric.fabricImplMod.Ellipse = js.native
  
  /**
    * Returns Ellipse instance from an object representation
    * @param object Object to create an instance from
    */
  def fromObject(`object`: Any): typingsJapgolly.fabric.fabricImplMod.Ellipse = js.native
}
