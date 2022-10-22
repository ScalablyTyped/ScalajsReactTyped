package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies the adjustment type. */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
*/
trait AdjustmentType extends StObject
object AdjustmentType {
  
  /** adjustment is originated by dragging the thumb. */
  inline def ADJUST_ABS: `2` = 2.asInstanceOf[`2`]
  
  /**
    * adjustment is originated by a line jump. <p>A line jump can, for example, be caused by a click on
    *
    * one of the pointer buttons.</p>
    */
  inline def ADJUST_LINE: `0` = 0.asInstanceOf[`0`]
  
  /**
    * adjustment is originated by a page jump. <p>A page jump can, for example, be caused by a click in the
    *
    * background area of the scrollbar (neither one of the pointer
    *
    * buttons, nor the thumb).</p>
    */
  inline def ADJUST_PAGE: `1` = 1.asInstanceOf[`1`]
}
