package typingsJapgolly.fabric.mod.fabric

import org.scalajs.dom.raw.SVGElement
import typingsJapgolly.fabric.fabricImplMod.IRectOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fabric", "fabric.Rect")
@js.native
/**
	 * Constructor
	 * @param [options] Options object
	 */
class Rect ()
  extends typingsJapgolly.fabric.fabricImplMod.Rect {
  def this(options: IRectOptions) = this()
}

/* static members */
@JSImport("fabric", "fabric.Rect")
@js.native
object Rect extends js.Object {
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
  def fromObject(`object`: js.Any): typingsJapgolly.fabric.fabricImplMod.Rect = js.native
}

