package typingsJapgolly.fabric.fabricImplMod

import org.scalajs.dom.CanvasPattern
import org.scalajs.dom.CanvasRenderingContext2D
import org.scalajs.dom.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fabric/fabric-impl", "Pattern")
@js.native
open class Pattern ()
  extends StObject
     with IPatternOptions {
  def this(options: IPatternOptions) = this()
  
  /**
    * Unique identifier
    */
  var id: Double = js.native
  
  def setOptions(options: IPatternOptions): Unit = js.native
  
  /**
    * The source for the pattern
    */
  /* CompleteClass */
  var source: String | HTMLImageElement = js.native
  
  /**
    * Returns an instance of CanvasPattern
    * @param {CanvasRenderingContext2D} ctx Context to create pattern
    * @return {CanvasPattern}
    */
  def toLive(ctx: CanvasRenderingContext2D): CanvasPattern = js.native
  
  /**
    * Returns object representation of a pattern
    * @param {Array} [propertiesToInclude] Any properties that you might want to additionally include in the output
    * @return {Object} Object representation of a pattern instance
    */
  def toObject(propertiesToInclude: Any): Any = js.native
  
  /**
    * Returns SVG representation of a pattern
    * @param {fabric.Object} object
    * @return {String} SVG representation of a pattern
    */
  def toSVG(`object`: Object): String = js.native
}
