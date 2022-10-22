package typingsJapgolly.classTransformer

import typingsJapgolly.classTransformer.classTransformerStrings.excludeAll
import typingsJapgolly.classTransformer.classTransformerStrings.exposeAll
import typingsJapgolly.classTransformer.classTransformerStrings.none
import typingsJapgolly.classTransformer.typesEnumsTransformationTypeDotenumMod.TransformationType
import typingsJapgolly.classTransformer.typesInterfacesMetadataExcludeMetadataDotinterfaceMod.ExcludeMetadata
import typingsJapgolly.classTransformer.typesInterfacesMetadataExposeMetadataDotinterfaceMod.ExposeMetadata
import typingsJapgolly.classTransformer.typesInterfacesMetadataTransformMetadataDotinterfaceMod.TransformMetadata
import typingsJapgolly.classTransformer.typesInterfacesMetadataTypeMetadataDotinterfaceMod.TypeMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMetadataStorageMod {
  
  @JSImport("class-transformer/types/MetadataStorage", "MetadataStorage")
  @js.native
  open class MetadataStorage () extends StObject {
    
    /* private */ var _ancestorsMap: Any = js.native
    
    /* private */ var _excludeMetadatas: Any = js.native
    
    /* private */ var _exposeMetadatas: Any = js.native
    
    /* private */ var _transformMetadatas: Any = js.native
    
    /* private */ var _typeMetadatas: Any = js.native
    
    def addExcludeMetadata(metadata: ExcludeMetadata): Unit = js.native
    
    def addExposeMetadata(metadata: ExposeMetadata): Unit = js.native
    
    def addTransformMetadata(metadata: TransformMetadata): Unit = js.native
    
    def addTypeMetadata(metadata: TypeMetadata): Unit = js.native
    
    def clear(): Unit = js.native
    
    def findExcludeMetadata(target: js.Function, propertyName: String): ExcludeMetadata = js.native
    
    def findExposeMetadata(target: js.Function, propertyName: String): ExposeMetadata = js.native
    
    def findExposeMetadataByCustomName(target: js.Function, name: String): ExposeMetadata = js.native
    
    /* private */ var findMetadata: Any = js.native
    
    /* private */ var findMetadatas: Any = js.native
    
    def findTransformMetadatas(target: js.Function, propertyName: String, transformationType: TransformationType): js.Array[TransformMetadata] = js.native
    
    def findTypeMetadata(target: js.Function, propertyName: String): TypeMetadata = js.native
    
    /* private */ var getAncestors: Any = js.native
    
    def getExcludedMetadatas(target: js.Function): js.Array[ExcludeMetadata] = js.native
    
    def getExcludedProperties(target: js.Function, transformationType: TransformationType): js.Array[String] = js.native
    
    def getExposedMetadatas(target: js.Function): js.Array[ExposeMetadata] = js.native
    
    def getExposedProperties(target: js.Function, transformationType: TransformationType): js.Array[String] = js.native
    
    /* private */ var getMetadata: Any = js.native
    
    def getStrategy(target: js.Function): excludeAll | exposeAll | none = js.native
  }
}
