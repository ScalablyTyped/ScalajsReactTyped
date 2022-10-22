package typingsJapgolly.pixiJs.mod

import typingsJapgolly.pixiMath.mod.IShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pixi.js", "GraphicsData")
@js.native
open class GraphicsData protected ()
  extends typingsJapgolly.pixiGraphics.mod.GraphicsData {
  /**
    * @param {PIXI.Circle|PIXI.Ellipse|PIXI.Polygon|PIXI.Rectangle|PIXI.RoundedRectangle} shape - The shape object to draw.
    * @param fillStyle - the width of the line to draw
    * @param lineStyle - the color of the line to draw
    * @param matrix - Transform matrix
    */
  def this(shape: IShape) = this()
  def this(shape: IShape, fillStyle: typingsJapgolly.pixiGraphics.mod.FillStyle) = this()
  def this(shape: IShape, fillStyle: Unit, lineStyle: typingsJapgolly.pixiGraphics.mod.LineStyle) = this()
  def this(
    shape: IShape,
    fillStyle: typingsJapgolly.pixiGraphics.mod.FillStyle,
    lineStyle: typingsJapgolly.pixiGraphics.mod.LineStyle
  ) = this()
  def this(shape: IShape, fillStyle: Unit, lineStyle: Unit, matrix: typingsJapgolly.pixiMath.mod.Matrix) = this()
  def this(
    shape: IShape,
    fillStyle: Unit,
    lineStyle: typingsJapgolly.pixiGraphics.mod.LineStyle,
    matrix: typingsJapgolly.pixiMath.mod.Matrix
  ) = this()
  def this(
    shape: IShape,
    fillStyle: typingsJapgolly.pixiGraphics.mod.FillStyle,
    lineStyle: Unit,
    matrix: typingsJapgolly.pixiMath.mod.Matrix
  ) = this()
  def this(
    shape: IShape,
    fillStyle: typingsJapgolly.pixiGraphics.mod.FillStyle,
    lineStyle: typingsJapgolly.pixiGraphics.mod.LineStyle,
    matrix: typingsJapgolly.pixiMath.mod.Matrix
  ) = this()
}
