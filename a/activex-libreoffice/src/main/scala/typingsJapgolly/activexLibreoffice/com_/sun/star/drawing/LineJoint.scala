package typingsJapgolly.activexLibreoffice.com_.sun.star.drawing

import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`3`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The LineJoint defines rendering of joints between thick lines */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`3`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`4`
*/
trait LineJoint extends StObject
object LineJoint {
  
  /** the edges of the thick lines will be joined by lines */
  inline def BEVEL: `2` = 2.asInstanceOf[`2`]
  
  /** the middle value between the joints is used */
  inline def MIDDLE: `1` = 1.asInstanceOf[`1`]
  
  /** the lines join at intersections */
  inline def MITER: `3` = 3.asInstanceOf[`3`]
  
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
    * the dash is a point
    *
    * the line will get a half circle as additional cap
    *
    * the lines join with an arc
    */
  inline def ROUND: `4` = 4.asInstanceOf[`4`]
}
