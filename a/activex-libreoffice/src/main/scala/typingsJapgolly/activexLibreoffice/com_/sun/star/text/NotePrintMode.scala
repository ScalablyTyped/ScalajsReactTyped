package typingsJapgolly.activexLibreoffice.com_.sun.star.text

import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** enumeration values are used to define the printing of notes in a document. */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`3`
*/
trait NotePrintMode extends StObject
object NotePrintMode {
  
  /** Notes are collected at the end of the document. */
  inline def DOC_END: `2` = 2.asInstanceOf[`2`]
  
  /** Notes are not printed. */
  inline def NOT: `0` = 0.asInstanceOf[`0`]
  
  /** Only notes are printed. */
  inline def ONLY: `1` = 1.asInstanceOf[`1`]
  
  /** Notes are collected at the end of a page and printed on an inserted page. */
  inline def PAGE_END: `3` = 3.asInstanceOf[`3`]
}
