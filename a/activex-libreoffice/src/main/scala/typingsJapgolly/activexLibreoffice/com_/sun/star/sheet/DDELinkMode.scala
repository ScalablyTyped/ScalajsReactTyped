package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * used to specify how the DDE server application converts its data into numbers.
  * @see com.sun.star.sheet.XDDELinks
  * @since OOo 3.0
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
*/
trait DDELinkMode extends StObject
object DDELinkMode {
  
  /** numbers are converted into the default format. */
  inline def DEFAULT: `0` = 0.asInstanceOf[`0`]
  
  /** numbers are converted into the English default format. */
  inline def ENGLISH: `1` = 1.asInstanceOf[`1`]
  
  /** numbers are not converted, but treated as text. */
  inline def TEXT: `2` = 2.asInstanceOf[`2`]
}
