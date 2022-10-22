package typingsJapgolly.activexLibreoffice.com_.sun.star.chart

import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`3`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`4`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`5`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies the type of change that was applied to the data. */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`4`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`5`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`3`
*/
trait ChartDataChangeType extends StObject
object ChartDataChangeType {
  
  /** Major changes were applied to the data. */
  inline def ALL: `0` = 0.asInstanceOf[`0`]
  
  /** The column given in the {@link ChartDataChangeEvent} , was deleted. */
  inline def COLUMN_DELETED: `4` = 4.asInstanceOf[`4`]
  
  /** The column given in the {@link ChartDataChangeEvent} , was inserted. */
  inline def COLUMN_INSERTED: `2` = 2.asInstanceOf[`2`]
  
  /** The range of columns and rows, given in the {@link ChartDataChangeEvent} , has changed. */
  inline def DATA_RANGE: `1` = 1.asInstanceOf[`1`]
  
  /** The row given in the {@link ChartDataChangeEvent} , was deleted. */
  inline def ROW_DELETED: `5` = 5.asInstanceOf[`5`]
  
  /** The row given in the {@link ChartDataChangeEvent} , was inserted. */
  inline def ROW_INSERTED: `3` = 3.asInstanceOf[`3`]
}
