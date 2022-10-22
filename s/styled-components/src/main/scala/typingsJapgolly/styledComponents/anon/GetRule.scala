package typingsJapgolly.styledComponents.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRule extends StObject {
  
  def deleteRule(index: Double): Unit
  
  def getRule(index: Double): String
  
  def insertRule(index: Double, rule: String): Boolean
  
  var length: Double
  
  var rules: js.Array[String]
}
object GetRule {
  
  inline def apply(
    deleteRule: Double => Callback,
    getRule: Double => String,
    insertRule: (Double, String) => Boolean,
    length: Double,
    rules: js.Array[String]
  ): GetRule = {
    val __obj = js.Dynamic.literal(deleteRule = js.Any.fromFunction1((t0: Double) => deleteRule(t0).runNow()), getRule = js.Any.fromFunction1(getRule), insertRule = js.Any.fromFunction2(insertRule), length = length.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRule]
  }
  
  extension [Self <: GetRule](x: Self) {
    
    inline def setDeleteRule(value: Double => Callback): Self = StObject.set(x, "deleteRule", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setGetRule(value: Double => String): Self = StObject.set(x, "getRule", js.Any.fromFunction1(value))
    
    inline def setInsertRule(value: (Double, String) => Boolean): Self = StObject.set(x, "insertRule", js.Any.fromFunction2(value))
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setRules(value: js.Array[String]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesVarargs(value: String*): Self = StObject.set(x, "rules", js.Array(value*))
  }
}
