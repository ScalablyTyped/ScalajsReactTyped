package typingsJapgolly.ramlTypesystem.distSrcTypesystemInterfacesMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IExample extends StObject {
  
  def annotations(): js.Array[IAnnotation]
  
  def annotationsMap(): StringDictionary[js.Array[IAnnotation]]
  
  def description(): String
  
  def displayName(): String
  
  def name(): String
  
  def strict(): Boolean
  
  def value(): Any
}
object IExample {
  
  inline def apply(
    annotations: CallbackTo[js.Array[IAnnotation]],
    annotationsMap: CallbackTo[StringDictionary[js.Array[IAnnotation]]],
    description: CallbackTo[String],
    displayName: CallbackTo[String],
    name: CallbackTo[String],
    strict: CallbackTo[Boolean],
    value: CallbackTo[Any]
  ): IExample = {
    val __obj = js.Dynamic.literal(annotations = annotations.toJsFn, annotationsMap = annotationsMap.toJsFn, description = description.toJsFn, displayName = displayName.toJsFn, name = name.toJsFn, strict = strict.toJsFn, value = value.toJsFn)
    __obj.asInstanceOf[IExample]
  }
  
  extension [Self <: IExample](x: Self) {
    
    inline def setAnnotations(value: CallbackTo[js.Array[IAnnotation]]): Self = StObject.set(x, "annotations", value.toJsFn)
    
    inline def setAnnotationsMap(value: CallbackTo[StringDictionary[js.Array[IAnnotation]]]): Self = StObject.set(x, "annotationsMap", value.toJsFn)
    
    inline def setDescription(value: CallbackTo[String]): Self = StObject.set(x, "description", value.toJsFn)
    
    inline def setDisplayName(value: CallbackTo[String]): Self = StObject.set(x, "displayName", value.toJsFn)
    
    inline def setName(value: CallbackTo[String]): Self = StObject.set(x, "name", value.toJsFn)
    
    inline def setStrict(value: CallbackTo[Boolean]): Self = StObject.set(x, "strict", value.toJsFn)
    
    inline def setValue(value: CallbackTo[Any]): Self = StObject.set(x, "value", value.toJsFn)
  }
}
