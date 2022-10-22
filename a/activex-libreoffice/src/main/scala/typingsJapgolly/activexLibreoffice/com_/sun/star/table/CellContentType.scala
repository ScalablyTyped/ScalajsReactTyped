package typingsJapgolly.activexLibreoffice.com_.sun.star.table

import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** is used to determine the type of contents in a cell. */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`3`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
*/
trait CellContentType extends StObject
object CellContentType {
  
  /** cell is empty. */
  inline def EMPTY: `0` = 0.asInstanceOf[`0`]
  
  /** cell contains a formula. */
  inline def FORMULA: `3` = 3.asInstanceOf[`3`]
  
  /** cell contains text. */
  inline def TEXT: `2` = 2.asInstanceOf[`2`]
  
  /** cell contains a constant value. */
  inline def VALUE: `1` = 1.asInstanceOf[`1`]
}
