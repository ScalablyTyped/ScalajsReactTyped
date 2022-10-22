package typingsJapgolly.ramlTypesystem.distSrcTypesystemInterfacesMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAnnotationInstance extends StObject {
  
  /**
    * Annotation definition type
    */
  def definition(): IParsedType
  
  /**
    * Annotation name
    */
  def name(): String
  
  /**
    * Annotation value
    */
  def value(): Any
}
object IAnnotationInstance {
  
  inline def apply(definition: CallbackTo[IParsedType], name: CallbackTo[String], value: CallbackTo[Any]): IAnnotationInstance = {
    val __obj = js.Dynamic.literal(definition = definition.toJsFn, name = name.toJsFn, value = value.toJsFn)
    __obj.asInstanceOf[IAnnotationInstance]
  }
  
  extension [Self <: IAnnotationInstance](x: Self) {
    
    inline def setDefinition(value: CallbackTo[IParsedType]): Self = StObject.set(x, "definition", value.toJsFn)
    
    inline def setName(value: CallbackTo[String]): Self = StObject.set(x, "name", value.toJsFn)
    
    inline def setValue(value: CallbackTo[Any]): Self = StObject.set(x, "value", value.toJsFn)
  }
}
