package typingsJapgolly.riotjsDomBindings.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _ExpressionData[Scope] extends StObject
object _ExpressionData {
  
  inline def AttributeExpressionData[Scope](evaluate: Scope => Any, name: String, `type`: ExpressionType): typingsJapgolly.riotjsDomBindings.mod.AttributeExpressionData[Scope] = {
    val __obj = js.Dynamic.literal(evaluate = js.Any.fromFunction1(evaluate), name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.riotjsDomBindings.mod.AttributeExpressionData[Scope]]
  }
  
  inline def EventExpressionData[Scope](evaluate: Scope => Any, name: String, `type`: ExpressionType): typingsJapgolly.riotjsDomBindings.mod.EventExpressionData[Scope] = {
    val __obj = js.Dynamic.literal(evaluate = js.Any.fromFunction1(evaluate), name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.riotjsDomBindings.mod.EventExpressionData[Scope]]
  }
  
  inline def TextExpressionData[Scope](childNodeIndex: Double, evaluate: Scope => Any, `type`: ExpressionType): typingsJapgolly.riotjsDomBindings.mod.TextExpressionData[Scope] = {
    val __obj = js.Dynamic.literal(childNodeIndex = childNodeIndex.asInstanceOf[js.Any], evaluate = js.Any.fromFunction1(evaluate))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.riotjsDomBindings.mod.TextExpressionData[Scope]]
  }
}
