package typingsJapgolly.vueCompilerCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.vueCompilerCore.mod.SlotsObjectExpression
  - typingsJapgolly.vueCompilerCore.mod.DynamicSlotsExpression
*/
trait SlotsExpression extends StObject
object SlotsExpression {
  
  inline def DynamicSlotsExpression(
    arguments: js.Tuple2[SlotsObjectExpression, DynamicSlotEntries],
    callee: js.Symbol,
    loc: SourceLocation
  ): typingsJapgolly.vueCompilerCore.mod.DynamicSlotsExpression = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(14)
    __obj.asInstanceOf[typingsJapgolly.vueCompilerCore.mod.DynamicSlotsExpression]
  }
  
  inline def SlotsObjectExpression(loc: SourceLocation, properties: js.Array[SlotsObjectProperty]): typingsJapgolly.vueCompilerCore.mod.SlotsObjectExpression = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(15)
    __obj.asInstanceOf[typingsJapgolly.vueCompilerCore.mod.SlotsObjectExpression]
  }
}
