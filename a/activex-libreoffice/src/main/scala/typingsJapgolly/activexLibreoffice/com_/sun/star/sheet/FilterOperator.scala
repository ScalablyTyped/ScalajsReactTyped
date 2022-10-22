package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`10`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`11`
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

/** specifies the type of a single condition in a filter descriptor. */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`11`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`10`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`4`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`5`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`6`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`7`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`3`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`9`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`8`
*/
trait FilterOperator extends StObject
object FilterOperator {
  
  /** selects a specified percentage of entries with the lowest values. */
  inline def BOTTOM_PERCENT: `11` = 11.asInstanceOf[`11`]
  
  /** selects a specified number of entries with the lowest values. */
  inline def BOTTOM_VALUES: `10` = 10.asInstanceOf[`10`]
  
  /** selects empty entries. */
  inline def EMPTY: `0` = 0.asInstanceOf[`0`]
  
  /** value has to be equal to the specified value. */
  inline def EQUAL: `2` = 2.asInstanceOf[`2`]
  
  /**
    * the value has to be greater than the specified value.
    *
    * value has to be greater than the specified value.
    */
  inline def GREATER: `4` = 4.asInstanceOf[`4`]
  
  /**
    * the value has to be greater than or equal to the specified value.
    *
    * value has to be greater than or equal to the specified value.
    */
  inline def GREATER_EQUAL: `5` = 5.asInstanceOf[`5`]
  
  /**
    * the value has to be less than the specified value.
    *
    * value has to be less than the specified value.
    */
  inline def LESS: `6` = 6.asInstanceOf[`6`]
  
  /**
    * the value has to be less than or equal to the specified value.
    *
    * value has to be less than or equal to the specified value.
    */
  inline def LESS_EQUAL: `7` = 7.asInstanceOf[`7`]
  
  /** selects non-empty entries. */
  inline def NOT_EMPTY: `1` = 1.asInstanceOf[`1`]
  
  /**
    * the value must not be equal to the specified value.
    *
    * value must not be equal to the specified value.
    */
  inline def NOT_EQUAL: `3` = 3.asInstanceOf[`3`]
  
  /** selects a specified percentage of entries with the greatest values. */
  inline def TOP_PERCENT: `9` = 9.asInstanceOf[`9`]
  
  /** selects a specified number of entries with the greatest values. */
  inline def TOP_VALUES: `8` = 8.asInstanceOf[`8`]
}
