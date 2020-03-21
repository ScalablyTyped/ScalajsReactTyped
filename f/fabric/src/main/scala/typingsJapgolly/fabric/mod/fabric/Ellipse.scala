package typingsJapgolly.fabric.mod.fabric

import org.scalajs.dom.raw.SVGElement
import typingsJapgolly.fabric.fabricImplMod.IEllipseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fabric", "fabric.Ellipse")
@js.native
class Ellipse ()
  extends typingsJapgolly.fabric.fabricImplMod.Ellipse {
  def this(options: IEllipseOptions) = this()
}

/* static members */
@JSImport("fabric", "fabric.Ellipse")
@js.native
object Ellipse extends js.Object {
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
  def fromObject(`object`: js.Any): typingsJapgolly.fabric.fabricImplMod.Ellipse = js.native
}

