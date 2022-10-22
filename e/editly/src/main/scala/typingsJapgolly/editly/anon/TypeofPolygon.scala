package typingsJapgolly.editly.anon

import org.scalablytyped.runtime.Instantiable1
import org.scalajs.dom.SVGElement
import typingsJapgolly.fabric.anon.X
import typingsJapgolly.fabric.fabricImplMod.IPolylineOptions
import typingsJapgolly.fabric.mod.fabric.Polygon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofPolygon
  extends StObject
     with Instantiable1[/* points */ js.Array[X], Polygon] {
  
  /**
    * Returns Polygon instance from an SVG element
    * @param element Element to parse
    * @param [options] Options object
    */
  def fromElement(element: SVGElement): typingsJapgolly.fabric.fabricImplMod.Polygon = js.native
  def fromElement(element: SVGElement, options: IPolylineOptions): typingsJapgolly.fabric.fabricImplMod.Polygon = js.native
  
  /**
    * Returns fabric.Polygon instance from an object representation
    * @param object Object to create an instance from
    */
  def fromObject(`object`: Any): typingsJapgolly.fabric.fabricImplMod.Polygon = js.native
}
