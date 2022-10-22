package typingsJapgolly.activexLibreoffice.com_.sun.star.chart

import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies the position of the axis on the scale of the crossing axis. When the property is set at a x-axis it indicates a position on the scale of the
  * primary y-axis. When the property is set at a y-axis it indicates a position on the scale of the primary x-axis.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`3`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
*/
trait ChartAxisPosition extends StObject
object ChartAxisPosition {
  
  /** Cross the other axes at their maximum scale value. */
  inline def END: `2` = 2.asInstanceOf[`2`]
  
  /** Cross the other axes at their minimum scale value. */
  inline def START: `1` = 1.asInstanceOf[`1`]
  
  /** Cross the other axes at the value specified in the property CrossoverValue. */
  inline def VALUE: `3` = 3.asInstanceOf[`3`]
  
  /** Cross the other axes at zero. If zero is not contained in the current scale the value is used which is nearest to zero. */
  inline def ZERO: `0` = 0.asInstanceOf[`0`]
}
