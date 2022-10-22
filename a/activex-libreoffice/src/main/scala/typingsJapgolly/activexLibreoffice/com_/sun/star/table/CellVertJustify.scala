package typingsJapgolly.activexLibreoffice.com_.sun.star.table

import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies how cell contents are aligned vertically. */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`3`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
*/
trait CellVertJustify extends StObject
object CellVertJustify {
  
  /** contents are aligned to the lower edge of the cell. */
  inline def BOTTOM: `3` = 3.asInstanceOf[`3`]
  
  /**
    * contents are horizontally centered.
    *
    * contents are aligned to the vertical middle of the cell.
    */
  inline def CENTER: `2` = 2.asInstanceOf[`2`]
  
  /**
    * default alignment is used (left for numbers, right for text).
    *
    * contents are printed from left to right.
    *
    * default alignment is used.
    */
  inline def STANDARD: `0` = 0.asInstanceOf[`0`]
  
  /** contents are aligned with the upper edge of the cell. */
  inline def TOP: `1` = 1.asInstanceOf[`1`]
}
