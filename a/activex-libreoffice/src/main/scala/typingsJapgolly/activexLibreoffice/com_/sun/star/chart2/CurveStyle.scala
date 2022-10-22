package typingsJapgolly.activexLibreoffice.com_.sun.star.chart2

import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`3`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`4`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`5`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`6`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`7`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Sets the type of curves that are drawn for line charts. */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`3`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`6`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`7`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`5`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`4`
*/
trait CurveStyle extends StObject
object CurveStyle {
  
  /** Data points are connected via a parametric, interpolating B-spline curve. */
  inline def B_SPLINES: `2` = 2.asInstanceOf[`2`]
  
  /** Data points are connected via a smoothed cubic spline curve. The data points themselves are part of to the curve. */
  inline def CUBIC_SPLINES: `1` = 1.asInstanceOf[`1`]
  
  /** Lines between data points are not smoothed */
  inline def LINES: `0` = 0.asInstanceOf[`0`]
  
  inline def NURBS: `3` = 3.asInstanceOf[`3`]
  
  /**
    * Data points are connected via a 3-segmented stepped line. The lines is horizontal till the center of the X values.
    *
    * +--O
    *
    *             |
    *
    *             |
    *
    *             |
    *
    *          O--+
    */
  inline def STEP_CENTER_X: `6` = 6.asInstanceOf[`6`]
  
  /**
    * Data points are connected via a 3-segmented stepped line. The lines is horizontal at the center of the Y values.
    *
    * O
    *
    *                |
    *
    *          +-----+
    *
    *          |
    *
    *          O
    */
  inline def STEP_CENTER_Y: `7` = 7.asInstanceOf[`7`]
  
  /**
    * Data points are connected via a 2-segmented stepped line. The line ends horizontally.
    *
    * +------O
    *
    *         |
    *
    *         |
    *
    *         |
    *
    *         O
    */
  inline def STEP_END: `5` = 5.asInstanceOf[`5`]
  
  /**
    * Data points are connected via a 2-segmented stepped line. The line starts horizontally.
    *
    * O
    *
    *                |
    *
    *                |
    *
    *                |
    *
    *          O-----+
    */
  inline def STEP_START: `4` = 4.asInstanceOf[`4`]
}
