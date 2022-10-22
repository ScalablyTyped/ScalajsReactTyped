package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * used to specify how an arithmetic date series is calculated.
  * @see com.sun.star.sheet.FillMode
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`3`
*/
trait FillDateMode extends StObject
object FillDateMode {
  
  /** for every new value a single day is added. */
  inline def FILL_DATE_DAY: `0` = 0.asInstanceOf[`0`]
  
  /** for every new value one month is added (day keeps unchanged). */
  inline def FILL_DATE_MONTH: `2` = 2.asInstanceOf[`2`]
  
  /** for every new value a single day is added, but Saturdays and Sundays are skipped. */
  inline def FILL_DATE_WEEKDAY: `1` = 1.asInstanceOf[`1`]
  
  /** for every new value one year is added (day and month keep unchanged). */
  inline def FILL_DATE_YEAR: `3` = 3.asInstanceOf[`3`]
}
