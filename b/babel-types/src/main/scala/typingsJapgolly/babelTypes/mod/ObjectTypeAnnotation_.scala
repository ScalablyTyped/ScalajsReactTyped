package typingsJapgolly.babelTypes.mod

import typingsJapgolly.babelTypes.babelTypesStrings.ObjectTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectTypeAnnotation_
  extends StObject
     with Node
     with Flow
     with FlowTypeAnnotation {
  
  var callProperties: js.Array[ObjectTypeCallProperty_]
  
  var indexers: js.Array[ObjectTypeIndexer_]
  
  var properties: js.Array[ObjectTypeProperty_]
  
  @JSName("type")
  var type_ObjectTypeAnnotation_ : ObjectTypeAnnotation
}
object ObjectTypeAnnotation_ {
  
  inline def apply(
    callProperties: js.Array[ObjectTypeCallProperty_],
    end: Double,
    indexers: js.Array[ObjectTypeIndexer_],
    loc: SourceLocation,
    properties: js.Array[ObjectTypeProperty_],
    start: Double
  ): ObjectTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(callProperties = callProperties.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], indexers = indexers.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ObjectTypeAnnotation")
    __obj.asInstanceOf[ObjectTypeAnnotation_]
  }
  
  extension [Self <: ObjectTypeAnnotation_](x: Self) {
    
    inline def setCallProperties(value: js.Array[ObjectTypeCallProperty_]): Self = StObject.set(x, "callProperties", value.asInstanceOf[js.Any])
    
    inline def setCallPropertiesVarargs(value: ObjectTypeCallProperty_ *): Self = StObject.set(x, "callProperties", js.Array(value*))
    
    inline def setIndexers(value: js.Array[ObjectTypeIndexer_]): Self = StObject.set(x, "indexers", value.asInstanceOf[js.Any])
    
    inline def setIndexersVarargs(value: ObjectTypeIndexer_ *): Self = StObject.set(x, "indexers", js.Array(value*))
    
    inline def setProperties(value: js.Array[ObjectTypeProperty_]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesVarargs(value: ObjectTypeProperty_ *): Self = StObject.set(x, "properties", js.Array(value*))
    
    inline def setType(value: ObjectTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
