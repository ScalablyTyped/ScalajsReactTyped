package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** used to specify how two conditions in a filter descriptor are connected. */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
*/
trait FilterConnection extends StObject
object FilterConnection {
  
  /** both conditions have to be fulfilled. */
  inline def AND: `0` = 0.asInstanceOf[`0`]
  
  /** at least one of the conditions has to be fulfilled. */
  inline def OR: `1` = 1.asInstanceOf[`1`]
}
