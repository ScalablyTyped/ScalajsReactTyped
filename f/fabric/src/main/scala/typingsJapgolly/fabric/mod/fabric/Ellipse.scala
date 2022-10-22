package typingsJapgolly.fabric.mod.fabric

import org.scalajs.dom.SVGElement
import typingsJapgolly.fabric.fabricImplMod.IEllipseOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fabric", "fabric.Ellipse")
@js.native
open class Ellipse ()
  extends typingsJapgolly.fabric.fabricImplMod.Ellipse {
  def this(options: IEllipseOptions) = this()
}
/* static members */
object Ellipse {
  
  @JSImport("fabric", "fabric.Ellipse")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * List of attribute names to account for when parsing SVG element (used by {@link fabric.Ellipse.fromElement})
    */
  @JSImport("fabric", "fabric.Ellipse.ATTRIBUTE_NAMES")
  @js.native
  def ATTRIBUTE_NAMES: js.Array[String] = js.native
  inline def ATTRIBUTE_NAMES_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ATTRIBUTE_NAMES")(x.asInstanceOf[js.Any])
  
  /**
    * Returns Ellipse instance from an SVG element
    * @param element Element to parse
    * @param [options] Options object
    */
  inline def fromElement(element: SVGElement): typingsJapgolly.fabric.fabricImplMod.Ellipse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromElement")(element.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.fabric.fabricImplMod.Ellipse]
  inline def fromElement(element: SVGElement, options: IEllipseOptions): typingsJapgolly.fabric.fabricImplMod.Ellipse = (^.asInstanceOf[js.Dynamic].applyDynamic("fromElement")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.fabric.fabricImplMod.Ellipse]
  
  /**
    * Returns Ellipse instance from an object representation
    * @param object Object to create an instance from
    */
  inline def fromObject(`object`: Any): typingsJapgolly.fabric.fabricImplMod.Ellipse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.fabric.fabricImplMod.Ellipse]
}
