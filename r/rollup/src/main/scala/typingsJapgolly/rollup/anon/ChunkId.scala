package typingsJapgolly.rollup.anon

import typingsJapgolly.rollup.mod.InternalModuleFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChunkId extends StObject {
  
  var chunkId: String
  
  var fileName: String
  
  var format: InternalModuleFormat
  
  var moduleId: String
  
  var referenceId: String
  
  var relativePath: String
}
object ChunkId {
  
  inline def apply(
    chunkId: String,
    fileName: String,
    format: InternalModuleFormat,
    moduleId: String,
    referenceId: String,
    relativePath: String
  ): ChunkId = {
    val __obj = js.Dynamic.literal(chunkId = chunkId.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], moduleId = moduleId.asInstanceOf[js.Any], referenceId = referenceId.asInstanceOf[js.Any], relativePath = relativePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChunkId]
  }
  
  extension [Self <: ChunkId](x: Self) {
    
    inline def setChunkId(value: String): Self = StObject.set(x, "chunkId", value.asInstanceOf[js.Any])
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: InternalModuleFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setModuleId(value: String): Self = StObject.set(x, "moduleId", value.asInstanceOf[js.Any])
    
    inline def setReferenceId(value: String): Self = StObject.set(x, "referenceId", value.asInstanceOf[js.Any])
    
    inline def setRelativePath(value: String): Self = StObject.set(x, "relativePath", value.asInstanceOf[js.Any])
  }
}
