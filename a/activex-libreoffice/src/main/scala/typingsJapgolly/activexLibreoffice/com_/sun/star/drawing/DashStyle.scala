package typingsJapgolly.activexLibreoffice.com_.sun.star.drawing

import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This enumeration defines the style of a dash on a line. */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`3`
*/
trait DashStyle extends StObject
object DashStyle {
  
  /** the dash is a rectangle */
  inline def RECT: `0` = 0.asInstanceOf[`0`]
  
  /** the dash is a rectangle, with the size of the dash given in relation to the length of the line */
  inline def RECTRELATIVE: `2` = 2.asInstanceOf[`2`]
  
  /**
    * the dash is a point
    *
    * the line will get a half circle as additional cap
    *
    * the lines join with an arc
    */
  inline def ROUND: `1` = 1.asInstanceOf[`1`]
  
  /** the dash is a point, with the size of the dash given in relation to the length of the line */
  inline def ROUNDRELATIVE: `3` = 3.asInstanceOf[`3`]
}
