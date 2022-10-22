package typingsJapgolly.editly.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalajs.dom.SVGElement
import typingsJapgolly.fabric.fabricImplMod.ICircleOptions
import typingsJapgolly.fabric.mod.fabric.Circle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofCircle
  extends StObject
     with Instantiable0[Circle] {
  
  /**
    * List of attribute names to account for when parsing SVG element (used by {@link fabric.Circle.fromElement})
    */
  var ATTRIBUTE_NAMES: js.Array[String] = js.native
  
  /**
    * Returns Circle instance from an SVG element
    * @param element Element to parse
    * @param [options] Options object
    */
  def fromElement(element: SVGElement, options: ICircleOptions): typingsJapgolly.fabric.fabricImplMod.Circle = js.native
  
  /**
    * Returns Circle instance from an object representation
    * @param object Object to create an instance from
    */
  def fromObject(`object`: Any): typingsJapgolly.fabric.fabricImplMod.Circle = js.native
}
