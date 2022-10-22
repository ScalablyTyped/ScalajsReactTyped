package typingsJapgolly.angularCore.mod

import typingsJapgolly.angularCore.angularCoreInts.`1`
import typingsJapgolly.angularCore.angularCoreInts.`2`
import typingsJapgolly.angularCore.angularCoreInts.`4`
import typingsJapgolly.angularCore.angularCoreInts.`8`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Flags used to build up CssSelectors */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.angularCore.angularCoreInts.`1`
  - typingsJapgolly.angularCore.angularCoreInts.`2`
  - typingsJapgolly.angularCore.angularCoreInts.`4`
  - typingsJapgolly.angularCore.angularCoreInts.`8`
*/
trait SelectorFlags extends StObject
object SelectorFlags {
  
  /** Mode for matching attributes */
  inline def ATTRIBUTE: `2` = 2.asInstanceOf[`2`]
  
  /** Mode for matching class names */
  inline def CLASS: `8` = 8.asInstanceOf[`8`]
  
  /** Mode for matching tag names */
  inline def ELEMENT: `4` = 4.asInstanceOf[`4`]
  
  /** Indicates this is the beginning of a new negative selector */
  inline def NOT: `1` = 1.asInstanceOf[`1`]
}
