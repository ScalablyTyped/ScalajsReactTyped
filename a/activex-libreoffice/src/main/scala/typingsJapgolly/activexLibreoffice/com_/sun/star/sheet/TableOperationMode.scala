package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** used to specify if a table operation is applied to columns, rows, or both columns and rows. */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
*/
trait TableOperationMode extends StObject
object TableOperationMode {
  
  /**
    * is applied to rows and columns. <p>In this mode, the row and the column contain values. A formula
    *
    * using both row and column values is specified separately.</p>
    */
  inline def BOTH: `2` = 2.asInstanceOf[`2`]
  
  /**
    * the field is used as a column field.
    *
    * is applied to the columns. <p>In this mode, the column contains values and the row
    *
    * contains formulas.</p>
    */
  inline def COLUMN: `0` = 0.asInstanceOf[`0`]
  
  /**
    * the field is used as a row field.
    *
    * is applied to the rows. <p>In this mode, the row contains values and the column
    *
    * contains formulas.</p>
    */
  inline def ROW: `1` = 1.asInstanceOf[`1`]
}
