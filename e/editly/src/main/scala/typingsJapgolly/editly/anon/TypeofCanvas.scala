package typingsJapgolly.editly.anon

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.editly.editlyStrings.getImageData
import typingsJapgolly.editly.editlyStrings.setLineDash
import typingsJapgolly.editly.editlyStrings.toDataURL
import typingsJapgolly.editly.editlyStrings.toDataURLWithQuality
import typingsJapgolly.fabric.mod.fabric.Canvas
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofCanvas
  extends StObject
     with Instantiable0[Canvas] {
  
  var EMPTY_JSON: String = js.native
  
  /**
    * Provides a way to check support of some of the canvas methods
    * (either those of HTMLCanvasElement itself, or rendering context)
    * @param methodName Method to check support for; Could be one of "getImageData", "toDataURL", "toDataURLWithQuality" or "setLineDash"
    */
  def supports(methodName: getImageData | toDataURL | toDataURLWithQuality | setLineDash): Boolean = js.native
  
  /**
    * Returns JSON representation of canvas
    * @param [propertiesToInclude] Any properties that you might want to additionally include in the output
    */
  def toJSON(): String = js.native
  def toJSON(propertiesToInclude: js.Array[String]): String = js.native
}
