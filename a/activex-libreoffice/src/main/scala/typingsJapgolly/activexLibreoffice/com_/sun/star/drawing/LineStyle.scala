package typingsJapgolly.activexLibreoffice.com_.sun.star.drawing

import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies the appearance of the lines of a shape. */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
*/
trait LineStyle extends StObject
object LineStyle {
  
  /** the line use dashes. */
  inline def DASH: `2` = 2.asInstanceOf[`2`]
  
  /**
    * the area is not filled.
    *
    * the line has no special end.
    *
    * the joint between lines will not be connected
    *
    * the line is hidden.
    *
    * Don't animate this text.
    *
    * the text size is only defined by the font properties
    */
  inline def NONE: `0` = 0.asInstanceOf[`0`]
  
  /**
    * use a solid color to fill the area.
    *
    * the line is solid.
    */
  inline def SOLID: `1` = 1.asInstanceOf[`1`]
}
