package typingsJapgolly.ramlTypesystem.distSrcTypesystemInterfacesMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPropertyInfo extends StObject {
  
  def annotations(): js.Array[IAnnotation]
  
  def declaredAt(): IParsedType
  
  def isAdditional(): Boolean
  
  def isPattern(): Boolean
  
  def name(): String
  
  def range(): IParsedType
  
  def required(): Boolean
}
object IPropertyInfo {
  
  inline def apply(
    annotations: CallbackTo[js.Array[IAnnotation]],
    declaredAt: CallbackTo[IParsedType],
    isAdditional: CallbackTo[Boolean],
    isPattern: CallbackTo[Boolean],
    name: CallbackTo[String],
    range: CallbackTo[IParsedType],
    required: CallbackTo[Boolean]
  ): IPropertyInfo = {
    val __obj = js.Dynamic.literal(annotations = annotations.toJsFn, declaredAt = declaredAt.toJsFn, isAdditional = isAdditional.toJsFn, isPattern = isPattern.toJsFn, name = name.toJsFn, range = range.toJsFn, required = required.toJsFn)
    __obj.asInstanceOf[IPropertyInfo]
  }
  
  extension [Self <: IPropertyInfo](x: Self) {
    
    inline def setAnnotations(value: CallbackTo[js.Array[IAnnotation]]): Self = StObject.set(x, "annotations", value.toJsFn)
    
    inline def setDeclaredAt(value: CallbackTo[IParsedType]): Self = StObject.set(x, "declaredAt", value.toJsFn)
    
    inline def setIsAdditional(value: CallbackTo[Boolean]): Self = StObject.set(x, "isAdditional", value.toJsFn)
    
    inline def setIsPattern(value: CallbackTo[Boolean]): Self = StObject.set(x, "isPattern", value.toJsFn)
    
    inline def setName(value: CallbackTo[String]): Self = StObject.set(x, "name", value.toJsFn)
    
    inline def setRange(value: CallbackTo[IParsedType]): Self = StObject.set(x, "range", value.toJsFn)
    
    inline def setRequired(value: CallbackTo[Boolean]): Self = StObject.set(x, "required", value.toJsFn)
  }
}
