package typingsJapgolly.activexLibreoffice.com_.sun.star.text

import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** determines which page number is displayed in a page number text field. */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
*/
trait PageNumberType extends StObject
object PageNumberType {
  
  /** The number of the current page is displayed. */
  inline def CURRENT: `1` = 1.asInstanceOf[`1`]
  
  /** The number of the next page is displayed if there is any, otherwise the field is empty. */
  inline def NEXT: `2` = 2.asInstanceOf[`2`]
  
  /** The number of the previous page is displayed if there is any, otherwise the field is empty. */
  inline def PREV: `0` = 0.asInstanceOf[`0`]
}
