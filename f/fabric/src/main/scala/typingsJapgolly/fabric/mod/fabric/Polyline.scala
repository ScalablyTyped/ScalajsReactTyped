package typingsJapgolly.fabric.mod.fabric

import org.scalajs.dom.SVGElement
import typingsJapgolly.fabric.anon.X
import typingsJapgolly.fabric.fabricImplMod.IPolylineOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fabric", "fabric.Polyline")
@js.native
open class Polyline protected ()
  extends typingsJapgolly.fabric.fabricImplMod.Polyline {
  /**
    * Constructor
    * @param points Array of points (where each point is an object with x and y)
    * @param [options] Options object
    * @param [skipOffset] Whether points offsetting should be skipped
    */
  def this(points: js.Array[X]) = this()
  def this(points: js.Array[X], options: IPolylineOptions) = this()
}
/* static members */
object Polyline {
  
  @JSImport("fabric", "fabric.Polyline")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * List of attribute names to account for when parsing SVG element (used by `fabric.Polygon.fromElement`)
    */
  @JSImport("fabric", "fabric.Polyline.ATTRIBUTE_NAMES")
  @js.native
  def ATTRIBUTE_NAMES: js.Array[String] = js.native
  inline def ATTRIBUTE_NAMES_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ATTRIBUTE_NAMES")(x.asInstanceOf[js.Any])
  
  /**
    * Returns Polyline  instance from an SVG element
    * @param element Element to parse
    * @param [options] Options object
    */
  inline def fromElement(element: SVGElement): typingsJapgolly.fabric.fabricImplMod.Polyline = ^.asInstanceOf[js.Dynamic].applyDynamic("fromElement")(element.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.fabric.fabricImplMod.Polyline]
  inline def fromElement(element: SVGElement, options: IPolylineOptions): typingsJapgolly.fabric.fabricImplMod.Polyline = (^.asInstanceOf[js.Dynamic].applyDynamic("fromElement")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.fabric.fabricImplMod.Polyline]
  
  /**
    * Returns fabric.Polyline instance from an object representation
    * @param object Object to create an instance from
    */
  inline def fromObject(`object`: Any): typingsJapgolly.fabric.fabricImplMod.Polyline = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.fabric.fabricImplMod.Polyline]
}
