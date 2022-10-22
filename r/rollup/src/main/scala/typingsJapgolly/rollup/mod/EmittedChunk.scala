package typingsJapgolly.rollup.mod

import typingsJapgolly.rollup.rollupStrings.chunk
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmittedChunk
  extends StObject
     with EmittedFile {
  
  var fileName: js.UndefOr[String] = js.undefined
  
  var id: String
  
  var implicitlyLoadedAfterOneOf: js.UndefOr[js.Array[String]] = js.undefined
  
  var importer: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var preserveSignature: js.UndefOr[PreserveEntrySignaturesOption] = js.undefined
  
  var `type`: chunk
}
object EmittedChunk {
  
  inline def apply(id: String): EmittedChunk = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("chunk")
    __obj.asInstanceOf[EmittedChunk]
  }
  
  extension [Self <: EmittedChunk](x: Self) {
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setImplicitlyLoadedAfterOneOf(value: js.Array[String]): Self = StObject.set(x, "implicitlyLoadedAfterOneOf", value.asInstanceOf[js.Any])
    
    inline def setImplicitlyLoadedAfterOneOfUndefined: Self = StObject.set(x, "implicitlyLoadedAfterOneOf", js.undefined)
    
    inline def setImplicitlyLoadedAfterOneOfVarargs(value: String*): Self = StObject.set(x, "implicitlyLoadedAfterOneOf", js.Array(value*))
    
    inline def setImporter(value: String): Self = StObject.set(x, "importer", value.asInstanceOf[js.Any])
    
    inline def setImporterUndefined: Self = StObject.set(x, "importer", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPreserveSignature(value: PreserveEntrySignaturesOption): Self = StObject.set(x, "preserveSignature", value.asInstanceOf[js.Any])
    
    inline def setPreserveSignatureUndefined: Self = StObject.set(x, "preserveSignature", js.undefined)
    
    inline def setType(value: chunk): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
