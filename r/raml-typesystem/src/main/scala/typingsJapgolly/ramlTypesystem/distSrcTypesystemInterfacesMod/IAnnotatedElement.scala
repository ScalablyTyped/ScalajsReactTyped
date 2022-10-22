package typingsJapgolly.ramlTypesystem.distSrcTypesystemInterfacesMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAnnotatedElement extends StObject {
  
  /**
    * Array view on the annotations applied
    */
  def annotations(): js.Array[IAnnotationInstance]
  
  /**
    * Map view on the annotations applied
    */
  def annotationsMap(): StringDictionary[IAnnotationInstance]
  
  /**
    * The element itself
    */
  def entry(): Any
  
  /**
    * Element kind
    */
  def kind(): String
  
  /**
    * Element name
    */
  def name(): String
  
  /**
    * JSON representation of the entry
    */
  def value(): Any
}
object IAnnotatedElement {
  
  inline def apply(
    annotations: CallbackTo[js.Array[IAnnotationInstance]],
    annotationsMap: CallbackTo[StringDictionary[IAnnotationInstance]],
    entry: CallbackTo[Any],
    kind: CallbackTo[String],
    name: CallbackTo[String],
    value: CallbackTo[Any]
  ): IAnnotatedElement = {
    val __obj = js.Dynamic.literal(annotations = annotations.toJsFn, annotationsMap = annotationsMap.toJsFn, entry = entry.toJsFn, kind = kind.toJsFn, name = name.toJsFn, value = value.toJsFn)
    __obj.asInstanceOf[IAnnotatedElement]
  }
  
  extension [Self <: IAnnotatedElement](x: Self) {
    
    inline def setAnnotations(value: CallbackTo[js.Array[IAnnotationInstance]]): Self = StObject.set(x, "annotations", value.toJsFn)
    
    inline def setAnnotationsMap(value: CallbackTo[StringDictionary[IAnnotationInstance]]): Self = StObject.set(x, "annotationsMap", value.toJsFn)
    
    inline def setEntry(value: CallbackTo[Any]): Self = StObject.set(x, "entry", value.toJsFn)
    
    inline def setKind(value: CallbackTo[String]): Self = StObject.set(x, "kind", value.toJsFn)
    
    inline def setName(value: CallbackTo[String]): Self = StObject.set(x, "name", value.toJsFn)
    
    inline def setValue(value: CallbackTo[Any]): Self = StObject.set(x, "value", value.toJsFn)
  }
}
