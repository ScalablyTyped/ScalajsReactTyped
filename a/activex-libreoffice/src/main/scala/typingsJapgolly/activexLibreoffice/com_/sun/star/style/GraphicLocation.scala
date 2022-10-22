package typingsJapgolly.activexLibreoffice.com_.sun.star.style

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

/** These enumeration values are used to specify the location of a graphic object within its surroundings. */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`10`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`7`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`4`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`8`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`5`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`9`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`6`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`3`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`11`
*/
trait GraphicLocation extends StObject
object GraphicLocation {
  
  /** The graphic is scaled to fill the whole surrounding area. */
  inline def AREA: `10` = 10.asInstanceOf[`10`]
  
  /** The graphic is located in the bottom left corner. */
  inline def LEFT_BOTTOM: `7` = 7.asInstanceOf[`7`]
  
  /** The graphic is located in the middle of the left edge. */
  inline def LEFT_MIDDLE: `4` = 4.asInstanceOf[`4`]
  
  /** The graphic is located in the top left corner. */
  inline def LEFT_TOP: `1` = 1.asInstanceOf[`1`]
  
  /** The graphic is located in the middle of the bottom edge. */
  inline def MIDDLE_BOTTOM: `8` = 8.asInstanceOf[`8`]
  
  /** The graphic is located at the center of the surrounding object. */
  inline def MIDDLE_MIDDLE: `5` = 5.asInstanceOf[`5`]
  
  /** The graphic is located in the middle of the top edge. */
  inline def MIDDLE_TOP: `2` = 2.asInstanceOf[`2`]
  
  /**
    * No column or page break is applied.
    *
    * This value specifies that a location is not yet assigned.
    */
  inline def NONE: `0` = 0.asInstanceOf[`0`]
  
  /** The graphic is located in the bottom right corner. */
  inline def RIGHT_BOTTOM: `9` = 9.asInstanceOf[`9`]
  
  /** The graphic is located in the middle of the right edge. */
  inline def RIGHT_MIDDLE: `6` = 6.asInstanceOf[`6`]
  
  /** The graphic is located in the top right corner. */
  inline def RIGHT_TOP: `3` = 3.asInstanceOf[`3`]
  
  /** The graphic is repeatedly spread over the surrounding object like tiles. */
  inline def TILED: `11` = 11.asInstanceOf[`11`]
}
