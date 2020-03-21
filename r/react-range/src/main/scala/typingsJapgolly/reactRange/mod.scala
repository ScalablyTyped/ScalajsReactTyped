package typingsJapgolly.reactRange

import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactRange.rangeMod.default
import typingsJapgolly.reactRange.typesMod.IProps
import typingsJapgolly.reactRange.typesMod.ITrackBackground
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-range", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Range protected () extends default {
    def this(props: IProps) = this()
  }
  
  def getTrackBackground(hasValuesColorsMinMaxDirectionRtl: ITrackBackground): String = js.native
  def relativeValue(value: Double, min: Double, max: Double): Double = js.native
  def useThumbOverlap(rangeRef: Null, values: js.Array[Double], index: Double): js.Array[String | CSSProperties] = js.native
  def useThumbOverlap(rangeRef: Null, values: js.Array[Double], index: Double, step: Double): js.Array[String | CSSProperties] = js.native
  def useThumbOverlap(rangeRef: Null, values: js.Array[Double], index: Double, step: Double, separator: String): js.Array[String | CSSProperties] = js.native
  def useThumbOverlap(rangeRef: default, values: js.Array[Double], index: Double): js.Array[String | CSSProperties] = js.native
  def useThumbOverlap(rangeRef: default, values: js.Array[Double], index: Double, step: Double): js.Array[String | CSSProperties] = js.native
  def useThumbOverlap(rangeRef: default, values: js.Array[Double], index: Double, step: Double, separator: String): js.Array[String | CSSProperties] = js.native
  @js.native
  object Direction extends js.Object {
    /* "to bottom" */ val Down: typingsJapgolly.reactRange.typesMod.Direction.Down with String = js.native
    /* "to left" */ val Left: typingsJapgolly.reactRange.typesMod.Direction.Left with String = js.native
    /* "to right" */ val Right: typingsJapgolly.reactRange.typesMod.Direction.Right with String = js.native
    /* "to top" */ val Up: typingsJapgolly.reactRange.typesMod.Direction.Up with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.reactRange.typesMod.Direction with String] = js.native
  }
  
  /* static members */
  @js.native
  object Range extends js.Object {
    var defaultProps: AnonAllowOverlap = js.native
  }
  
}

