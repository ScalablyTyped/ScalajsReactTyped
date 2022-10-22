package typingsJapgolly.editly.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalajs.dom.SVGElement
import typingsJapgolly.fabric.fabricImplMod.IPathOptions
import typingsJapgolly.fabric.mod.fabric.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofPath
  extends StObject
     with Instantiable0[Path] {
  
  /**
    * List of attribute names to account for when parsing SVG element (used by `fabric.Polygon.fromElement`)
    */
  var ATTRIBUTE_NAMES: js.Array[String] = js.native
  
  /**
    * Creates an instance of fabric.Path from an SVG <path> element
    * @param element to parse
    * @param callback Callback to invoke when an fabric.Path instance is created
    * @param [options] Options object
    */
  def fromElement(element: SVGElement, callback: js.Function): typingsJapgolly.fabric.fabricImplMod.Path = js.native
  def fromElement(element: SVGElement, callback: js.Function, options: IPathOptions): typingsJapgolly.fabric.fabricImplMod.Path = js.native
  
  /**
    * Creates an instance of fabric.Path from an object
    * @param callback Callback to invoke when an fabric.Path instance is created
    */
  def fromObject(`object`: Any, callback: js.Function): typingsJapgolly.fabric.fabricImplMod.Path = js.native
}
