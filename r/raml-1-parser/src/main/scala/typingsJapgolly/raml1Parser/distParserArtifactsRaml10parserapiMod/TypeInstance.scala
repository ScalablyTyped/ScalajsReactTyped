package typingsJapgolly.raml1Parser.distParserArtifactsRaml10parserapiMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeInstance extends StObject {
  
  /**
    * Indicates whether the instance is array
    **/
  def isArray(): Boolean
  
  /**
    * Whether the type is scalar
    **/
  def isScalar(): Boolean
  
  /**
    * Returns components of array instances
    **/
  def items(): js.Array[TypeInstance]
  
  /**
    * Array of instance properties
    **/
  def properties(): js.Array[TypeInstanceProperty]
  
  /**
    * For instances of scalar types returns scalar value
    **/
  def value(): Any
}
object TypeInstance {
  
  inline def apply(
    isArray: CallbackTo[Boolean],
    isScalar: CallbackTo[Boolean],
    items: CallbackTo[js.Array[TypeInstance]],
    properties: CallbackTo[js.Array[TypeInstanceProperty]],
    value: CallbackTo[Any]
  ): TypeInstance = {
    val __obj = js.Dynamic.literal(isArray = isArray.toJsFn, isScalar = isScalar.toJsFn, items = items.toJsFn, properties = properties.toJsFn, value = value.toJsFn)
    __obj.asInstanceOf[TypeInstance]
  }
  
  extension [Self <: TypeInstance](x: Self) {
    
    inline def setIsArray(value: CallbackTo[Boolean]): Self = StObject.set(x, "isArray", value.toJsFn)
    
    inline def setIsScalar(value: CallbackTo[Boolean]): Self = StObject.set(x, "isScalar", value.toJsFn)
    
    inline def setItems(value: CallbackTo[js.Array[TypeInstance]]): Self = StObject.set(x, "items", value.toJsFn)
    
    inline def setProperties(value: CallbackTo[js.Array[TypeInstanceProperty]]): Self = StObject.set(x, "properties", value.toJsFn)
    
    inline def setValue(value: CallbackTo[Any]): Self = StObject.set(x, "value", value.toJsFn)
  }
}
