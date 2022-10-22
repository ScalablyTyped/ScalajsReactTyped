package typingsJapgolly.raml1Parser.distParserArtifactsRaml08parserapiMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeInstance extends StObject {
  
  /**
    * Whether the type is scalar
    **/
  def isScalar(): Boolean
  
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
    isScalar: CallbackTo[Boolean],
    properties: CallbackTo[js.Array[TypeInstanceProperty]],
    value: CallbackTo[Any]
  ): TypeInstance = {
    val __obj = js.Dynamic.literal(isScalar = isScalar.toJsFn, properties = properties.toJsFn, value = value.toJsFn)
    __obj.asInstanceOf[TypeInstance]
  }
  
  extension [Self <: TypeInstance](x: Self) {
    
    inline def setIsScalar(value: CallbackTo[Boolean]): Self = StObject.set(x, "isScalar", value.toJsFn)
    
    inline def setProperties(value: CallbackTo[js.Array[TypeInstanceProperty]]): Self = StObject.set(x, "properties", value.toJsFn)
    
    inline def setValue(value: CallbackTo[Any]): Self = StObject.set(x, "value", value.toJsFn)
  }
}
