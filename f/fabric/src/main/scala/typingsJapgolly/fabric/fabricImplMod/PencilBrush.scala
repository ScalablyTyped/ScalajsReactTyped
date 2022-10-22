package typingsJapgolly.fabric.fabricImplMod

import typingsJapgolly.fabric.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fabric/fabric-impl", "PencilBrush")
@js.native
open class PencilBrush protected () extends BaseBrush {
  /**
    * Constructor
    * @param {Canvas} canvas
    */
  def this(canvas: Canvas) = this()
  
  /**
    * Converts points to SVG path
    * @param points Array of points
    */
  def convertPointsToSVGPath(points: js.Array[X]): js.Array[String] = js.native
  def convertPointsToSVGPath(points: js.Array[X], minX: Double): js.Array[String] = js.native
  def convertPointsToSVGPath(points: js.Array[X], minX: Double, minY: Double): js.Array[String] = js.native
  def convertPointsToSVGPath(points: js.Array[X], minX: Unit, minY: Double): js.Array[String] = js.native
  
  /**
    * Creates fabric.Path object to add on canvas
    * @param pathData Path data
    */
  def createPath(pathData: String): Path = js.native
  
  /**
    * Constructor
    * @param {Canvas} canvas
    * @return {PencilBrush} Instance of a pencil brush
    */
  def initialize(canvas: Canvas): PencilBrush = js.native
}
