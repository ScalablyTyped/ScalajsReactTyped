package typingsJapgolly.prosemirrorInputrules

import typingsJapgolly.prosemirrorInputrules.mod.InputRule
import typingsJapgolly.prosemirrorModel.mod.Schema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Rules[S /* <: Schema[Any, Any] */] extends StObject {
    
    var rules: js.Array[InputRule[S]]
  }
  object Rules {
    
    inline def apply[S /* <: Schema[Any, Any] */](rules: js.Array[InputRule[S]]): Rules[S] = {
      val __obj = js.Dynamic.literal(rules = rules.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rules[S]]
    }
    
    extension [Self <: Rules[?], S /* <: Schema[Any, Any] */](x: Self & Rules[S]) {
      
      inline def setRules(value: js.Array[InputRule[S]]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      inline def setRulesVarargs(value: InputRule[S]*): Self = StObject.set(x, "rules", js.Array(value*))
    }
  }
}
