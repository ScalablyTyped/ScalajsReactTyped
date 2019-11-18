package typingsJapgolly.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The dimensions of a piece of text in the canvas, as created by the CanvasRenderingContext2D.measureText() method. */
trait TextMetrics extends js.Object {
  /**
    * Returns the measurement described below.
    */
  val actualBoundingBoxAscent: Double
  /**
    * Returns the measurement described below.
    */
  val actualBoundingBoxDescent: Double
  /**
    * Returns the measurement described below.
    */
  val actualBoundingBoxLeft: Double
  /**
    * Returns the measurement described below.
    */
  val actualBoundingBoxRight: Double
  /**
    * Returns the measurement described below.
    */
  val alphabeticBaseline: Double
  /**
    * Returns the measurement described below.
    */
  val emHeightAscent: Double
  /**
    * Returns the measurement described below.
    */
  val emHeightDescent: Double
  /**
    * Returns the measurement described below.
    */
  val fontBoundingBoxAscent: Double
  /**
    * Returns the measurement described below.
    */
  val fontBoundingBoxDescent: Double
  /**
    * Returns the measurement described below.
    */
  val hangingBaseline: Double
  /**
    * Returns the measurement described below.
    */
  val ideographicBaseline: Double
  /**
    * Returns the measurement described below.
    */
  val width: Double
}

@JSGlobal("TextMetrics")
@js.native
object TextMetrics extends Instantiable0[TextMetrics]

