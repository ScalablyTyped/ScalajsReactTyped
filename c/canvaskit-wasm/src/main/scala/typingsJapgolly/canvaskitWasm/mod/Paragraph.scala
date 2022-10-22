package typingsJapgolly.canvaskitWasm.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Paragraph
  extends StObject
     with EmbindObject[Paragraph] {
  
  def didExceedMaxLines(): Boolean
  
  def getAlphabeticBaseline(): Double
  
  /**
    * Returns the index of the glyph that corresponds to the provided coordinate,
    * with the top left corner as the origin, and +y direction as down.
    */
  def getGlyphPositionAtCoordinate(dx: Double, dy: Double): PositionWithAffinity
  
  def getHeight(): Double
  
  def getIdeographicBaseline(): Double
  
  def getLineMetrics(): js.Array[LineMetrics]
  
  def getLongestLine(): Double
  
  def getMaxIntrinsicWidth(): Double
  
  def getMaxWidth(): Double
  
  def getMinIntrinsicWidth(): Double
  
  def getRectsForPlaceholders(): js.Array[js.typedarray.Float32Array]
  
  /**
    * Returns bounding boxes that enclose all text in the range of glpyh indexes [start, end).
    * @param start
    * @param end
    * @param hStyle
    * @param wStyle
    */
  def getRectsForRange(start: Double, end: Double, hStyle: RectHeightStyle, wStyle: RectWidthStyle): js.Array[js.typedarray.Float32Array]
  
  /**
    * Returns an array of ShapedLine objects, describing the paragraph.
    */
  def getShapedLines(): js.Array[ShapedLine]
  
  /**
    * Finds the first and last glyphs that define a word containing the glyph at index offset.
    * @param offset
    */
  def getWordBoundary(offset: Double): URange
  
  /**
    * Lays out the text in the paragraph so it is wrapped to the given width.
    * @param width
    */
  def layout(width: Double): Unit
}
object Paragraph {
  
  inline def apply(
    delete: Callback,
    deleteLater: Callback,
    didExceedMaxLines: CallbackTo[Boolean],
    getAlphabeticBaseline: CallbackTo[Double],
    getGlyphPositionAtCoordinate: (Double, Double) => PositionWithAffinity,
    getHeight: CallbackTo[Double],
    getIdeographicBaseline: CallbackTo[Double],
    getLineMetrics: CallbackTo[js.Array[LineMetrics]],
    getLongestLine: CallbackTo[Double],
    getMaxIntrinsicWidth: CallbackTo[Double],
    getMaxWidth: CallbackTo[Double],
    getMinIntrinsicWidth: CallbackTo[Double],
    getRectsForPlaceholders: CallbackTo[js.Array[js.typedarray.Float32Array]],
    getRectsForRange: (Double, Double, RectHeightStyle, RectWidthStyle) => js.Array[js.typedarray.Float32Array],
    getShapedLines: CallbackTo[js.Array[ShapedLine]],
    getWordBoundary: Double => URange,
    isAliasOf: Any => Boolean,
    isDeleted: CallbackTo[Boolean],
    layout: Double => Callback
  ): Paragraph = {
    val __obj = js.Dynamic.literal(delete = delete.toJsFn, deleteLater = deleteLater.toJsFn, didExceedMaxLines = didExceedMaxLines.toJsFn, getAlphabeticBaseline = getAlphabeticBaseline.toJsFn, getGlyphPositionAtCoordinate = js.Any.fromFunction2(getGlyphPositionAtCoordinate), getHeight = getHeight.toJsFn, getIdeographicBaseline = getIdeographicBaseline.toJsFn, getLineMetrics = getLineMetrics.toJsFn, getLongestLine = getLongestLine.toJsFn, getMaxIntrinsicWidth = getMaxIntrinsicWidth.toJsFn, getMaxWidth = getMaxWidth.toJsFn, getMinIntrinsicWidth = getMinIntrinsicWidth.toJsFn, getRectsForPlaceholders = getRectsForPlaceholders.toJsFn, getRectsForRange = js.Any.fromFunction4(getRectsForRange), getShapedLines = getShapedLines.toJsFn, getWordBoundary = js.Any.fromFunction1(getWordBoundary), isAliasOf = js.Any.fromFunction1(isAliasOf), isDeleted = isDeleted.toJsFn, layout = js.Any.fromFunction1((t0: Double) => layout(t0).runNow()))
    __obj.asInstanceOf[Paragraph]
  }
  
  extension [Self <: Paragraph](x: Self) {
    
    inline def setDidExceedMaxLines(value: CallbackTo[Boolean]): Self = StObject.set(x, "didExceedMaxLines", value.toJsFn)
    
    inline def setGetAlphabeticBaseline(value: CallbackTo[Double]): Self = StObject.set(x, "getAlphabeticBaseline", value.toJsFn)
    
    inline def setGetGlyphPositionAtCoordinate(value: (Double, Double) => PositionWithAffinity): Self = StObject.set(x, "getGlyphPositionAtCoordinate", js.Any.fromFunction2(value))
    
    inline def setGetHeight(value: CallbackTo[Double]): Self = StObject.set(x, "getHeight", value.toJsFn)
    
    inline def setGetIdeographicBaseline(value: CallbackTo[Double]): Self = StObject.set(x, "getIdeographicBaseline", value.toJsFn)
    
    inline def setGetLineMetrics(value: CallbackTo[js.Array[LineMetrics]]): Self = StObject.set(x, "getLineMetrics", value.toJsFn)
    
    inline def setGetLongestLine(value: CallbackTo[Double]): Self = StObject.set(x, "getLongestLine", value.toJsFn)
    
    inline def setGetMaxIntrinsicWidth(value: CallbackTo[Double]): Self = StObject.set(x, "getMaxIntrinsicWidth", value.toJsFn)
    
    inline def setGetMaxWidth(value: CallbackTo[Double]): Self = StObject.set(x, "getMaxWidth", value.toJsFn)
    
    inline def setGetMinIntrinsicWidth(value: CallbackTo[Double]): Self = StObject.set(x, "getMinIntrinsicWidth", value.toJsFn)
    
    inline def setGetRectsForPlaceholders(value: CallbackTo[js.Array[js.typedarray.Float32Array]]): Self = StObject.set(x, "getRectsForPlaceholders", value.toJsFn)
    
    inline def setGetRectsForRange(value: (Double, Double, RectHeightStyle, RectWidthStyle) => js.Array[js.typedarray.Float32Array]): Self = StObject.set(x, "getRectsForRange", js.Any.fromFunction4(value))
    
    inline def setGetShapedLines(value: CallbackTo[js.Array[ShapedLine]]): Self = StObject.set(x, "getShapedLines", value.toJsFn)
    
    inline def setGetWordBoundary(value: Double => URange): Self = StObject.set(x, "getWordBoundary", js.Any.fromFunction1(value))
    
    inline def setLayout(value: Double => Callback): Self = StObject.set(x, "layout", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
