package typingsJapgolly.angularCompiler.mod

import typingsJapgolly.angularCompiler.angularCompilerInts.`0`
import typingsJapgolly.angularCompiler.angularCompilerInts.`1`
import typingsJapgolly.angularCompiler.angularCompilerInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.angularCompiler.angularCompilerInts.`0`
  - typingsJapgolly.angularCompiler.angularCompilerInts.`1`
  - typingsJapgolly.angularCompiler.angularCompilerInts.`2`
*/
trait ParseFlags extends StObject
object ParseFlags {
  
  /**
    * Whether an output binding is being parsed.
    */
  inline def Action: `1` = 1.asInstanceOf[`1`]
  
  /**
    * Whether an assignment event is being parsed, i.e. an expression originating from
    * two-way-binding aka banana-in-a-box syntax.
    */
  inline def AssignmentEvent: `2` = 2.asInstanceOf[`2`]
  
  inline def None: `0` = 0.asInstanceOf[`0`]
}
