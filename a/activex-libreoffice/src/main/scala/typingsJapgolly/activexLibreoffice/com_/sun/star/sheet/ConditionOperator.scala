package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
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

/** is used to specify the type of {@link XSheetCondition} . */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`7`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`9`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`3`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`4`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`5`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`6`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`8`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
*/
trait ConditionOperator extends StObject
object ConditionOperator {
  
  /** the value has to be between the two specified values. */
  inline def BETWEEN: `7` = 7.asInstanceOf[`7`]
  
  /** value has to be equal to the specified value. */
  inline def EQUAL: `1` = 1.asInstanceOf[`1`]
  
  /** the specified formula has to give a non-zero result. */
  inline def FORMULA: `9` = 9.asInstanceOf[`9`]
  
  /**
    * the value has to be greater than the specified value.
    *
    * value has to be greater than the specified value.
    */
  inline def GREATER: `3` = 3.asInstanceOf[`3`]
  
  /**
    * the value has to be greater than or equal to the specified value.
    *
    * value has to be greater than or equal to the specified value.
    */
  inline def GREATER_EQUAL: `4` = 4.asInstanceOf[`4`]
  
  /**
    * the value has to be less than the specified value.
    *
    * value has to be less than the specified value.
    */
  inline def LESS: `5` = 5.asInstanceOf[`5`]
  
  /**
    * the value has to be less than or equal to the specified value.
    *
    * value has to be less than or equal to the specified value.
    */
  inline def LESS_EQUAL: `6` = 6.asInstanceOf[`6`]
  
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
  
  /** the value has to be outside of the two specified values. */
  inline def NOT_BETWEEN: `8` = 8.asInstanceOf[`8`]
  
  /**
    * the value must not be equal to the specified value.
    *
    * value must not be equal to the specified value.
    */
  inline def NOT_EQUAL: `2` = 2.asInstanceOf[`2`]
}
