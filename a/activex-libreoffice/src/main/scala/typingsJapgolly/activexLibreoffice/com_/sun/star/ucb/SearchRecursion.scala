package typingsJapgolly.activexLibreoffice.com_.sun.star.ucb

import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * the various modes of recursion when searching through a hierarchical object.
  * @see SearchInfo
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
  - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
*/
trait SearchRecursion extends StObject
object SearchRecursion {
  
  /** Searches through the complete hierarchy of all sub-objects. */
  inline def DEEP: `2` = 2.asInstanceOf[`2`]
  
  /** Does not search through any sub-objects. */
  inline def NONE: `0` = 0.asInstanceOf[`0`]
  
  /** Only searches through sub-objects of the first hierarchy level. */
  inline def ONE_LEVEL: `1` = 1.asInstanceOf[`1`]
}
