package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** is used to select one of the four borders of a cell range. */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`3`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
*/
trait Border extends StObject
object Border {
  
  /** selects the bottom border. */
  inline def BOTTOM: `1` = 1.asInstanceOf[`1`]
  
  /**
    * selects the left border.
    *
    * the cells to the right of the deleted cells are moved left.
    */
  inline def LEFT: `3` = 3.asInstanceOf[`3`]
  
  /**
    * selects the right border.
    *
    * the cells to the right of the inserted cells are moved right.
    */
  inline def RIGHT: `2` = 2.asInstanceOf[`2`]
  
  /** selects the top border. */
  inline def TOP: `0` = 0.asInstanceOf[`0`]
}
