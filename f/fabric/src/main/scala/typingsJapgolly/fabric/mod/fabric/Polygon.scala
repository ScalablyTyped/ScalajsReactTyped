package typingsJapgolly.fabric.mod.fabric

import org.scalajs.dom.raw.SVGElement
import typingsJapgolly.fabric.AnonX
import typingsJapgolly.fabric.fabricImplMod.IPolylineOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fabric", "fabric.Polygon")
@js.native
class Polygon protected ()
  extends typingsJapgolly.fabric.fabricImplMod.Polygon {
  /**
  	 * Constructor
  	 * @param points Array of points
  	 * @param [options] Options object
  	 */
  def this(points: js.Array[AnonX]) = this()
  def this(points: js.Array[AnonX], options: IPolylineOptions) = this()
}

/* static members */
@JSImport("fabric", "fabric.Polygon")
@js.native
object Polygon extends js.Object {
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
  def fromObject(`object`: js.Any): typingsJapgolly.fabric.fabricImplMod.Polygon = js.native
}

