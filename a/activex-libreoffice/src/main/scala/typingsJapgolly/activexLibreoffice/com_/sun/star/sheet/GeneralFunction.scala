package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`10`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`11`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`12`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`3`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`4`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`5`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`6`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`7`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`8`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`9`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** used to specify a function to be calculated from values. */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`4`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`3`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`8`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`5`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`6`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`7`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`9`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`10`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`11`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`12`
*/
trait GeneralFunction extends StObject
object GeneralFunction {
  
  /**
    * specifies the use of a user-defined list. <p>The cells are filled using a user-defined series.</p>
    *
    *
    *
    * function is determined automatically. <p>If the values are all numerical, SUM is used, otherwise COUNT.</p>
    */
  inline def AUTO: `1` = 1.asInstanceOf[`1`]
  
  /** average of all numerical values is calculated. */
  inline def AVERAGE: `4` = 4.asInstanceOf[`4`]
  
  /** all values, including non-numerical values, are counted. */
  inline def COUNT: `3` = 3.asInstanceOf[`3`]
  
  /** numerical values are counted. */
  inline def COUNTNUMS: `8` = 8.asInstanceOf[`8`]
  
  /** maximum value of all numerical values is calculated. */
  inline def MAX: `5` = 5.asInstanceOf[`5`]
  
  /** minimum value of all numerical values is calculated. */
  inline def MIN: `6` = 6.asInstanceOf[`6`]
  
  /**
    * no cells are moved.
    *
    * no condition is specified.
    *
    * nothing is imported.
    *
    * nothing is calculated.
    *
    * new values are used without changes.
    *
    * sheet is not linked.
    */
  inline def NONE: `0` = 0.asInstanceOf[`0`]
  
  /** product of all numerical values is calculated. */
  inline def PRODUCT: `7` = 7.asInstanceOf[`7`]
  
  /** standard deviation is calculated based on a sample. */
  inline def STDEV: `9` = 9.asInstanceOf[`9`]
  
  /** standard deviation is calculated based on the entire population. */
  inline def STDEVP: `10` = 10.asInstanceOf[`10`]
  
  /** sum of all numerical values is calculated. */
  inline def SUM: `2` = 2.asInstanceOf[`2`]
  
  /** variance is calculated based on a sample. */
  inline def VAR: `11` = 11.asInstanceOf[`11`]
  
  /** variance is calculated based on the entire population. */
  inline def VARP: `12` = 12.asInstanceOf[`12`]
}
