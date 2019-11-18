package typingsJapgolly.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Implemented by elements that support rendering child text content. It is inherited by various text-related interfaces, such as SVGTextElement, SVGTSpanElement, SVGTRefElement, SVGAltGlyphElement and SVGTextPathElement. */
@js.native
trait SVGTextContentElement extends SVGGraphicsElement {
  val LENGTHADJUST_SPACING: Double = js.native
  val LENGTHADJUST_SPACINGANDGLYPHS: Double = js.native
  val LENGTHADJUST_UNKNOWN: Double = js.native
  val lengthAdjust: org.scalajs.dom.raw.SVGAnimatedEnumeration = js.native
  val textLength: org.scalajs.dom.raw.SVGAnimatedLength = js.native
  def getCharNumAtPosition(point: org.scalajs.dom.raw.SVGPoint): Double = js.native
  def getComputedTextLength(): Double = js.native
  def getEndPositionOfChar(charnum: Double): org.scalajs.dom.raw.SVGPoint = js.native
  def getExtentOfChar(charnum: Double): org.scalajs.dom.raw.SVGRect = js.native
  def getNumberOfChars(): Double = js.native
  def getRotationOfChar(charnum: Double): Double = js.native
  def getStartPositionOfChar(charnum: Double): org.scalajs.dom.raw.SVGPoint = js.native
  def getSubStringLength(charnum: Double, nchars: Double): Double = js.native
  def selectSubString(charnum: Double, nchars: Double): Unit = js.native
}

@JSGlobal("SVGTextContentElement")
@js.native
object SVGTextContentElement extends Instantiable0[SVGTextContentElement] {
  val LENGTHADJUST_SPACING: Double = js.native
  val LENGTHADJUST_SPACINGANDGLYPHS: Double = js.native
  val LENGTHADJUST_UNKNOWN: Double = js.native
}

