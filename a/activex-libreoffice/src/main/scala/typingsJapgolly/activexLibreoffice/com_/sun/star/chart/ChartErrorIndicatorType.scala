package typingsJapgolly.activexLibreoffice.com_.sun.star.chart

import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies how the error is indicated. */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`3`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
*/
trait ChartErrorIndicatorType extends StObject
object ChartErrorIndicatorType {
  
  /** displays only the lower value. */
  inline def LOWER: `3` = 3.asInstanceOf[`3`]
  
  /**
    * error indicators are not displayed.
    *
    * displays no error indicators.
    *
    * no chart legend is displayed. <p>To disable the legend you should set the property
    *
    * ChartDocument::HasLegend to `FALSE` instead
    *
    * of setting this value.</p>
    *
    *
    *
    * displays no regression curve.
    */
  inline def NONE: `0` = 0.asInstanceOf[`0`]
  
  /** displays both the upper and lower values. */
  inline def TOP_AND_BOTTOM: `1` = 1.asInstanceOf[`1`]
  
  /** displays only the upper value. */
  inline def UPPER: `2` = 2.asInstanceOf[`2`]
}
