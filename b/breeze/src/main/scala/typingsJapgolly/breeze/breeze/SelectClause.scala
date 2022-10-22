package typingsJapgolly.breeze.breeze

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectClause extends StObject {
  
  var propertyPaths: js.Array[String]
  
  def toFunction(config: js.Object): js.Function1[/* entity */ Entity, js.Object]
  
  def toJSONExt(context: js.Object): js.Array[String]
  
  def validate(entityType: EntityType): Unit
}
object SelectClause {
  
  inline def apply(
    propertyPaths: js.Array[String],
    toFunction: js.Object => js.Function1[/* entity */ Entity, js.Object],
    toJSONExt: js.Object => js.Array[String],
    validate: EntityType => Callback
  ): SelectClause = {
    val __obj = js.Dynamic.literal(propertyPaths = propertyPaths.asInstanceOf[js.Any], toFunction = js.Any.fromFunction1(toFunction), toJSONExt = js.Any.fromFunction1(toJSONExt), validate = js.Any.fromFunction1((t0: EntityType) => validate(t0).runNow()))
    __obj.asInstanceOf[SelectClause]
  }
  
  extension [Self <: SelectClause](x: Self) {
    
    inline def setPropertyPaths(value: js.Array[String]): Self = StObject.set(x, "propertyPaths", value.asInstanceOf[js.Any])
    
    inline def setPropertyPathsVarargs(value: String*): Self = StObject.set(x, "propertyPaths", js.Array(value*))
    
    inline def setToFunction(value: js.Object => js.Function1[/* entity */ Entity, js.Object]): Self = StObject.set(x, "toFunction", js.Any.fromFunction1(value))
    
    inline def setToJSONExt(value: js.Object => js.Array[String]): Self = StObject.set(x, "toJSONExt", js.Any.fromFunction1(value))
    
    inline def setValidate(value: EntityType => Callback): Self = StObject.set(x, "validate", js.Any.fromFunction1((t0: EntityType) => value(t0).runNow()))
  }
}
