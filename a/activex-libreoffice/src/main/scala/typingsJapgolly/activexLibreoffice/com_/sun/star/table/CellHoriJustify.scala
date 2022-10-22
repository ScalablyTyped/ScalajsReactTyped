package typingsJapgolly.activexLibreoffice.com_.sun.star.table

import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`3`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`4`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`5`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies how cell contents are aligned horizontally. */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`4`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`5`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`3`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
*/
trait CellHoriJustify extends StObject
object CellHoriJustify {
  
  /** contents are justified to the cell width. */
  inline def BLOCK: `4` = 4.asInstanceOf[`4`]
  
  /**
    * contents are horizontally centered.
    *
    * contents are aligned to the vertical middle of the cell.
    */
  inline def CENTER: `2` = 2.asInstanceOf[`2`]
  
  /** contents are aligned to the left edge of the cell. */
  inline def LEFT: `1` = 1.asInstanceOf[`1`]
  
  /** contents are repeated to fill the cell. */
  inline def REPEAT: `5` = 5.asInstanceOf[`5`]
  
  /** contents are aligned to the right edge of the cell. */
  inline def RIGHT: `3` = 3.asInstanceOf[`3`]
  
  /**
    * default alignment is used (left for numbers, right for text).
    *
    * contents are printed from left to right.
    *
    * default alignment is used.
    */
  inline def STANDARD: `0` = 0.asInstanceOf[`0`]
}
