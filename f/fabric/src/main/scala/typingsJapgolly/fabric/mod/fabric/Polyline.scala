package typingsJapgolly.fabric.mod.fabric

import org.scalajs.dom.raw.SVGElement
import typingsJapgolly.fabric.AnonX
import typingsJapgolly.fabric.fabricImplMod.IPolylineOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fabric", "fabric.Polyline")
@js.native
class Polyline protected ()
  extends typingsJapgolly.fabric.fabricImplMod.Polyline {
  /**
  	 * Constructor
  	 * @param points Array of points (where each point is an object with x and y)
  	 * @param [options] Options object
  	 * @param [skipOffset] Whether points offsetting should be skipped
  	 */
  def this(points: js.Array[AnonX]) = this()
  def this(points: js.Array[AnonX], options: IPolylineOptions) = this()
}

/* static members */
@JSImport("fabric", "fabric.Polyline")
@js.native
object Polyline extends js.Object {
  /**
  	 * List of attribute names to account for when parsing SVG element (used by `fabric.Polygon.fromElement`)
  	 */
  var ATTRIBUTE_NAMES: js.Array[String] = js.native
  /**
  	 * Returns Polyline  instance from an SVG element
  	 * @param element Element to parse
  	 * @param [options] Options object
  	 */
  def fromElement(element: SVGElement): typingsJapgolly.fabric.fabricImplMod.Polyline = js.native
  def fromElement(element: SVGElement, options: IPolylineOptions): typingsJapgolly.fabric.fabricImplMod.Polyline = js.native
  /**
  	 * Returns fabric.Polyline instance from an object representation
  	 * @param object Object to create an instance from
  	 */
  def fromObject(`object`: js.Any): typingsJapgolly.fabric.fabricImplMod.Polyline = js.native
}

