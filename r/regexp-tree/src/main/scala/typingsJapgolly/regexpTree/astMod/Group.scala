package typingsJapgolly.regexpTree.astMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.regexpTree.astMod.CapturingGroup
  - typingsJapgolly.regexpTree.astMod.NoncapturingGroup
*/
trait Group
  extends StObject
     with Expression
object Group {
  
  inline def CapturingGroup(number: Double): typingsJapgolly.regexpTree.astMod.CapturingGroup = {
    val __obj = js.Dynamic.literal(capturing = true, number = number.asInstanceOf[js.Any], expression = null)
    __obj.updateDynamic("type")("Group")
    __obj.asInstanceOf[typingsJapgolly.regexpTree.astMod.CapturingGroup]
  }
  
  inline def NoncapturingGroup(): typingsJapgolly.regexpTree.astMod.NoncapturingGroup = {
    val __obj = js.Dynamic.literal(capturing = false, expression = null)
    __obj.updateDynamic("type")("Group")
    __obj.asInstanceOf[typingsJapgolly.regexpTree.astMod.NoncapturingGroup]
  }
}
