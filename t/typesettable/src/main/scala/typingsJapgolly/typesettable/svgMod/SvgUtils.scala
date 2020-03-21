package typingsJapgolly.typesettable.svgMod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.SVGElement
import typingsJapgolly.std.SVGGraphicsElement
import typingsJapgolly.typesettable.abstractMeasurerMod.IDimensions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesettable/build/src/contexts/svg", "SvgUtils")
@js.native
class SvgUtils () extends js.Object

/* static members */
@JSImport("typesettable/build/src/contexts/svg", "SvgUtils")
@js.native
object SvgUtils extends js.Object {
  var SVG_NS: String = js.native
  /**
    * Appends an SVG element with the specified tag name to the provided element.
    * The variadic classnames are added to the new element.
    *
    * Returns the new element.
    */
  def append(element: Element, tagName: String, classNames: String*): SVGElement = js.native
  /**
    * Creates and returns a new SVGElement with the attached classnames.
    */
  def create(tagName: String, classNames: String*): SVGElement = js.native
  /**
    * Returns the width/height of svg element's bounding box
    */
  def getDimensions(element: SVGGraphicsElement): IDimensions = js.native
}

