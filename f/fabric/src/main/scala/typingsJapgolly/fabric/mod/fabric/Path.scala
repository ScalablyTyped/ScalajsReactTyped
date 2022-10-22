package typingsJapgolly.fabric.mod.fabric

import org.scalajs.dom.SVGElement
import typingsJapgolly.fabric.fabricImplMod.IPathOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fabric", "fabric.Path")
@js.native
/**
  * Constructor
  * @param path Path data (sequence of coordinates and corresponding "command" tokens)
  * @param [options] Options object
  */
open class Path ()
  extends typingsJapgolly.fabric.fabricImplMod.Path {
  def this(path: String) = this()
  def this(path: js.Array[typingsJapgolly.fabric.fabricImplMod.Point]) = this()
  def this(path: String, options: IPathOptions) = this()
  def this(path: js.Array[typingsJapgolly.fabric.fabricImplMod.Point], options: IPathOptions) = this()
  def this(path: Unit, options: IPathOptions) = this()
}
/* static members */
object Path {
  
  @JSImport("fabric", "fabric.Path")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * List of attribute names to account for when parsing SVG element (used by `fabric.Polygon.fromElement`)
    */
  @JSImport("fabric", "fabric.Path.ATTRIBUTE_NAMES")
  @js.native
  def ATTRIBUTE_NAMES: js.Array[String] = js.native
  inline def ATTRIBUTE_NAMES_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ATTRIBUTE_NAMES")(x.asInstanceOf[js.Any])
  
  /**
    * Creates an instance of fabric.Path from an SVG <path> element
    * @param element to parse
    * @param callback Callback to invoke when an fabric.Path instance is created
    * @param [options] Options object
    */
  inline def fromElement(element: SVGElement, callback: js.Function): typingsJapgolly.fabric.fabricImplMod.Path = (^.asInstanceOf[js.Dynamic].applyDynamic("fromElement")(element.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.fabric.fabricImplMod.Path]
  inline def fromElement(element: SVGElement, callback: js.Function, options: IPathOptions): typingsJapgolly.fabric.fabricImplMod.Path = (^.asInstanceOf[js.Dynamic].applyDynamic("fromElement")(element.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.fabric.fabricImplMod.Path]
  
  /**
    * Creates an instance of fabric.Path from an object
    * @param callback Callback to invoke when an fabric.Path instance is created
    */
  inline def fromObject(`object`: Any, callback: js.Function): typingsJapgolly.fabric.fabricImplMod.Path = (^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.fabric.fabricImplMod.Path]
}
