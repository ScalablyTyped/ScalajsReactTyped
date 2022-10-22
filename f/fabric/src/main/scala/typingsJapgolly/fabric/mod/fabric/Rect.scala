package typingsJapgolly.fabric.mod.fabric

import org.scalajs.dom.SVGElement
import typingsJapgolly.fabric.fabricImplMod.IRectOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fabric", "fabric.Rect")
@js.native
/**
  * Constructor
  * @param [options] Options object
  */
open class Rect ()
  extends typingsJapgolly.fabric.fabricImplMod.Rect {
  def this(options: IRectOptions) = this()
}
/* static members */
object Rect {
  
  @JSImport("fabric", "fabric.Rect")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * List of attribute names to account for when parsing SVG element (used by `fabric.Rect.fromElement`)
    */
  @JSImport("fabric", "fabric.Rect.ATTRIBUTE_NAMES")
  @js.native
  def ATTRIBUTE_NAMES: js.Array[String] = js.native
  inline def ATTRIBUTE_NAMES_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ATTRIBUTE_NAMES")(x.asInstanceOf[js.Any])
  
  /**
    * Returns Rect instance from an SVG element
    * @param element Element to parse
    * @param [options] Options object
    */
  inline def fromElement(element: SVGElement): typingsJapgolly.fabric.fabricImplMod.Rect = ^.asInstanceOf[js.Dynamic].applyDynamic("fromElement")(element.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.fabric.fabricImplMod.Rect]
  inline def fromElement(element: SVGElement, options: IRectOptions): typingsJapgolly.fabric.fabricImplMod.Rect = (^.asInstanceOf[js.Dynamic].applyDynamic("fromElement")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.fabric.fabricImplMod.Rect]
  
  /**
    * Returns Rect instance from an object representation
    * @param object Object to create an instance from
    */
  inline def fromObject(`object`: Any): typingsJapgolly.fabric.fabricImplMod.Rect = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.fabric.fabricImplMod.Rect]
}
