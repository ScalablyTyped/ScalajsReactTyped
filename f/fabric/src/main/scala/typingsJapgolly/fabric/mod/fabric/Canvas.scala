package typingsJapgolly.fabric.mod.fabric

import org.scalajs.dom.raw.HTMLCanvasElement
import typingsJapgolly.fabric.fabricImplMod.ICanvasOptions
import typingsJapgolly.fabric.fabricStrings.getImageData
import typingsJapgolly.fabric.fabricStrings.setLineDash
import typingsJapgolly.fabric.fabricStrings.toDataURL
import typingsJapgolly.fabric.fabricStrings.toDataURLWithQuality
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fabric", "fabric.Canvas")
@js.native
class Canvas protected ()
  extends typingsJapgolly.fabric.fabricImplMod.Canvas {
  def this(element: String) = this()
  /**
  	 * Constructor
  	 * @param element <canvas> element to initialize instance on
  	 * @param [options] Options object
  	 */
  def this(element: HTMLCanvasElement) = this()
  def this(element: String, options: ICanvasOptions) = this()
  def this(element: HTMLCanvasElement, options: ICanvasOptions) = this()
}

/* static members */
@JSImport("fabric", "fabric.Canvas")
@js.native
object Canvas extends js.Object {
  var EMPTY_JSON: String = js.native
  /**
  	 * Provides a way to check support of some of the canvas methods
  	 * (either those of HTMLCanvasElement itself, or rendering context)
  	 * @param methodName Method to check support for; Could be one of "getImageData", "toDataURL", "toDataURLWithQuality" or "setLineDash"
  	 */
  @JSName("supports")
  def supports_getImageData(methodName: getImageData): Boolean = js.native
  @JSName("supports")
  def supports_setLineDash(methodName: setLineDash): Boolean = js.native
  @JSName("supports")
  def supports_toDataURL(methodName: toDataURL): Boolean = js.native
  @JSName("supports")
  def supports_toDataURLWithQuality(methodName: toDataURLWithQuality): Boolean = js.native
  /**
  	 * Returns JSON representation of canvas
  	 * @param [propertiesToInclude] Any properties that you might want to additionally include in the output
  	 */
  def toJSON(): String = js.native
  def toJSON(propertiesToInclude: js.Array[String]): String = js.native
}

