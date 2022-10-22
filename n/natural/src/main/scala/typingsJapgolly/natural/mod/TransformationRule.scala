package typingsJapgolly.natural.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformationRule extends StObject {
  
  @JSName("apply")
  def apply(tagged_sentence: js.Array[js.Array[String]], position: Double): Unit
  
  var literal: js.Array[String]
  
  var new_category: String
  
  var old_category: String
  
  var predicate: Predicate
}
object TransformationRule {
  
  inline def apply(
    apply: (js.Array[js.Array[String]], Double) => Callback,
    literal: js.Array[String],
    new_category: String,
    old_category: String,
    predicate: Predicate
  ): TransformationRule = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction2((t0: js.Array[js.Array[String]], t1: Double) => (apply(t0, t1)).runNow()), literal = literal.asInstanceOf[js.Any], new_category = new_category.asInstanceOf[js.Any], old_category = old_category.asInstanceOf[js.Any], predicate = predicate.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformationRule]
  }
  
  extension [Self <: TransformationRule](x: Self) {
    
    inline def setApply(value: (js.Array[js.Array[String]], Double) => Callback): Self = StObject.set(x, "apply", js.Any.fromFunction2((t0: js.Array[js.Array[String]], t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setLiteral(value: js.Array[String]): Self = StObject.set(x, "literal", value.asInstanceOf[js.Any])
    
    inline def setLiteralVarargs(value: String*): Self = StObject.set(x, "literal", js.Array(value*))
    
    inline def setNew_category(value: String): Self = StObject.set(x, "new_category", value.asInstanceOf[js.Any])
    
    inline def setOld_category(value: String): Self = StObject.set(x, "old_category", value.asInstanceOf[js.Any])
    
    inline def setPredicate(value: Predicate): Self = StObject.set(x, "predicate", value.asInstanceOf[js.Any])
  }
}
