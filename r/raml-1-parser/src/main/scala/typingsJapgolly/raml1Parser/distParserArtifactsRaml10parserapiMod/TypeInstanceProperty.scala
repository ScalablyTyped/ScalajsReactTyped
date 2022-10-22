package typingsJapgolly.raml1Parser.distParserArtifactsRaml10parserapiMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeInstanceProperty extends StObject {
  
  /**
    * Whether property has array as value
    **/
  def isArray(): Boolean
  
  /**
    * Property name
    **/
  def name(): String
  
  /**
    * Property value
    **/
  def value(): TypeInstance
  
  /**
    * Array of values if property value is array
    **/
  def values(): js.Array[TypeInstance]
}
object TypeInstanceProperty {
  
  inline def apply(
    isArray: CallbackTo[Boolean],
    name: CallbackTo[String],
    value: CallbackTo[TypeInstance],
    values: CallbackTo[js.Array[TypeInstance]]
  ): TypeInstanceProperty = {
    val __obj = js.Dynamic.literal(isArray = isArray.toJsFn, name = name.toJsFn, value = value.toJsFn, values = values.toJsFn)
    __obj.asInstanceOf[TypeInstanceProperty]
  }
  
  extension [Self <: TypeInstanceProperty](x: Self) {
    
    inline def setIsArray(value: CallbackTo[Boolean]): Self = StObject.set(x, "isArray", value.toJsFn)
    
    inline def setName(value: CallbackTo[String]): Self = StObject.set(x, "name", value.toJsFn)
    
    inline def setValue(value: CallbackTo[TypeInstance]): Self = StObject.set(x, "value", value.toJsFn)
    
    inline def setValues(value: CallbackTo[js.Array[TypeInstance]]): Self = StObject.set(x, "values", value.toJsFn)
  }
}
