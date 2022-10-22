package typingsJapgolly.fastifyBusboy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait FieldNameSize extends StObject {
    
    /**
      * Max field name size (in bytes)
      * @default 100 bytes
      */
    var fieldNameSize: js.UndefOr[Double] = js.undefined
    
    /**
      * Max field value size (in bytes)
      * @default 1MB
      */
    var fieldSize: js.UndefOr[Double] = js.undefined
    
    /**
      * Max number of non-file fields
      * @default Infinity
      */
    var fields: js.UndefOr[Double] = js.undefined
    
    /**
      * For multipart forms, the max file size (in bytes)
      * @default Infinity
      */
    var fileSize: js.UndefOr[Double] = js.undefined
    
    /**
      * For multipart forms, the max number of file fields
      * @default Infinity
      */
    var files: js.UndefOr[Double] = js.undefined
    
    /**
      * For multipart forms, the max number of header key=>value pairs to parse
      * @default 2000
      */
    var headerPairs: js.UndefOr[Double] = js.undefined
    
    /**
      * For multipart forms, the max size of a header part
      * @default 81920
      */
    var headerSize: js.UndefOr[Double] = js.undefined
    
    /**
      * For multipart forms, the max number of parts (fields + files)
      * @default Infinity
      */
    var parts: js.UndefOr[Double] = js.undefined
  }
  object FieldNameSize {
    
    inline def apply(): FieldNameSize = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FieldNameSize]
    }
    
    extension [Self <: FieldNameSize](x: Self) {
      
      inline def setFieldNameSize(value: Double): Self = StObject.set(x, "fieldNameSize", value.asInstanceOf[js.Any])
      
      inline def setFieldNameSizeUndefined: Self = StObject.set(x, "fieldNameSize", js.undefined)
      
      inline def setFieldSize(value: Double): Self = StObject.set(x, "fieldSize", value.asInstanceOf[js.Any])
      
      inline def setFieldSizeUndefined: Self = StObject.set(x, "fieldSize", js.undefined)
      
      inline def setFields(value: Double): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setFileSize(value: Double): Self = StObject.set(x, "fileSize", value.asInstanceOf[js.Any])
      
      inline def setFileSizeUndefined: Self = StObject.set(x, "fileSize", js.undefined)
      
      inline def setFiles(value: Double): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      inline def setHeaderPairs(value: Double): Self = StObject.set(x, "headerPairs", value.asInstanceOf[js.Any])
      
      inline def setHeaderPairsUndefined: Self = StObject.set(x, "headerPairs", js.undefined)
      
      inline def setHeaderSize(value: Double): Self = StObject.set(x, "headerSize", value.asInstanceOf[js.Any])
      
      inline def setHeaderSizeUndefined: Self = StObject.set(x, "headerSize", js.undefined)
      
      inline def setParts(value: Double): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
      
      inline def setPartsUndefined: Self = StObject.set(x, "parts", js.undefined)
    }
  }
}
