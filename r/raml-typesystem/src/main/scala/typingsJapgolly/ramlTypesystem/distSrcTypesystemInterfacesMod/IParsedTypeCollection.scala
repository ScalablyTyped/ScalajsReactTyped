package typingsJapgolly.ramlTypesystem.distSrcTypesystemInterfacesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IParsedTypeCollection extends StObject {
  
  /**
    * adds a type to collection
    * @param t
    */
  def add(t: IParsedType): Unit
  
  /**
    * adds annotation type
    * @param t
    */
  def addAnnotationType(t: IParsedType): Unit
  
  def addLibrary(namespace: String, lib: IParsedTypeCollection): Unit
  
  /**
    * lists annotation types defined in this collection
    */
  def annotationTypes(): js.Array[IParsedType]
  
  /**
    * returns annotation type for a given name
    * @param name
    */
  def getAnnotationType(name: String): IParsedType
  
  def getAnnotationTypeRegistry(): ITypeRegistry
  
  /**
    * returns a type for a given name
    * @param name
    */
  def getType(name: String): IParsedType
  
  def getTypeRegistry(): ITypeRegistry
  
  def id(): String
  
  def libraries(): StringDictionary[IParsedTypeCollection]
  
  def library(name: String): IParsedTypeCollection
  
  /**
    * lists the types defined in this collection
    */
  def types(): js.Array[IParsedType]
}
object IParsedTypeCollection {
  
  inline def apply(
    add: IParsedType => Callback,
    addAnnotationType: IParsedType => Callback,
    addLibrary: (String, IParsedTypeCollection) => Callback,
    annotationTypes: CallbackTo[js.Array[IParsedType]],
    getAnnotationType: String => IParsedType,
    getAnnotationTypeRegistry: CallbackTo[ITypeRegistry],
    getType: String => IParsedType,
    getTypeRegistry: CallbackTo[ITypeRegistry],
    id: CallbackTo[String],
    libraries: CallbackTo[StringDictionary[IParsedTypeCollection]],
    library: String => IParsedTypeCollection,
    types: CallbackTo[js.Array[IParsedType]]
  ): IParsedTypeCollection = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1((t0: IParsedType) => add(t0).runNow()), addAnnotationType = js.Any.fromFunction1((t0: IParsedType) => addAnnotationType(t0).runNow()), addLibrary = js.Any.fromFunction2((t0: String, t1: IParsedTypeCollection) => (addLibrary(t0, t1)).runNow()), annotationTypes = annotationTypes.toJsFn, getAnnotationType = js.Any.fromFunction1(getAnnotationType), getAnnotationTypeRegistry = getAnnotationTypeRegistry.toJsFn, getType = js.Any.fromFunction1(getType), getTypeRegistry = getTypeRegistry.toJsFn, id = id.toJsFn, libraries = libraries.toJsFn, library = js.Any.fromFunction1(library), types = types.toJsFn)
    __obj.asInstanceOf[IParsedTypeCollection]
  }
  
  extension [Self <: IParsedTypeCollection](x: Self) {
    
    inline def setAdd(value: IParsedType => Callback): Self = StObject.set(x, "add", js.Any.fromFunction1((t0: IParsedType) => value(t0).runNow()))
    
    inline def setAddAnnotationType(value: IParsedType => Callback): Self = StObject.set(x, "addAnnotationType", js.Any.fromFunction1((t0: IParsedType) => value(t0).runNow()))
    
    inline def setAddLibrary(value: (String, IParsedTypeCollection) => Callback): Self = StObject.set(x, "addLibrary", js.Any.fromFunction2((t0: String, t1: IParsedTypeCollection) => (value(t0, t1)).runNow()))
    
    inline def setAnnotationTypes(value: CallbackTo[js.Array[IParsedType]]): Self = StObject.set(x, "annotationTypes", value.toJsFn)
    
    inline def setGetAnnotationType(value: String => IParsedType): Self = StObject.set(x, "getAnnotationType", js.Any.fromFunction1(value))
    
    inline def setGetAnnotationTypeRegistry(value: CallbackTo[ITypeRegistry]): Self = StObject.set(x, "getAnnotationTypeRegistry", value.toJsFn)
    
    inline def setGetType(value: String => IParsedType): Self = StObject.set(x, "getType", js.Any.fromFunction1(value))
    
    inline def setGetTypeRegistry(value: CallbackTo[ITypeRegistry]): Self = StObject.set(x, "getTypeRegistry", value.toJsFn)
    
    inline def setId(value: CallbackTo[String]): Self = StObject.set(x, "id", value.toJsFn)
    
    inline def setLibraries(value: CallbackTo[StringDictionary[IParsedTypeCollection]]): Self = StObject.set(x, "libraries", value.toJsFn)
    
    inline def setLibrary(value: String => IParsedTypeCollection): Self = StObject.set(x, "library", js.Any.fromFunction1(value))
    
    inline def setTypes(value: CallbackTo[js.Array[IParsedType]]): Self = StObject.set(x, "types", value.toJsFn)
  }
}
