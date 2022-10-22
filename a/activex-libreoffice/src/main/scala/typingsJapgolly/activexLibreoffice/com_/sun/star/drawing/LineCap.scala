package typingsJapgolly.activexLibreoffice.com_.sun.star.drawing

import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The LineCap defines rendering of ends of thick lines */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
*/
trait LineCap extends StObject
object LineCap {
  
  /** the line will end without any additional shape */
  inline def BUTT: `0` = 0.asInstanceOf[`0`]
  
  /**
    * the dash is a point
    *
    * the line will get a half circle as additional cap
    *
    * the lines join with an arc
    */
  inline def ROUND: `1` = 1.asInstanceOf[`1`]
  
  /**
    * the line will get a half square as additional cap
    *
    * the line uses a square for the line end.
    */
  inline def SQUARE: `2` = 2.asInstanceOf[`2`]
}
