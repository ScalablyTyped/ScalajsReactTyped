package typingsJapgolly.nginstackEngine

import japgolly.scalajs.react.Callback
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMultipartMultipartFormDataMod {
  
  inline def apply(reader: MultipartFormDataReader): Unit = ^.asInstanceOf[js.Dynamic].apply(reader.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(
    reader: MultipartFormDataReader,
    options: typingsJapgolly.nginstackEngine.libMultipartMultipartFormDataOptionsMod.^
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(reader.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(reader: MultipartFormDataReader, options: Record[Any, Any]): Unit = (^.asInstanceOf[js.Dynamic].apply(reader.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/multipart/MultipartFormData", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with MultipartFormData {
    def this(reader: MultipartFormDataReader) = this()
    def this(
      reader: MultipartFormDataReader,
      options: typingsJapgolly.nginstackEngine.libMultipartMultipartFormDataOptionsMod.^
    ) = this()
    def this(reader: MultipartFormDataReader, options: Record[Any, Any]) = this()
    
    /* private */ /* CompleteClass */
    var addFile_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var addValue_ : Any = js.native
    
    /* CompleteClass */
    var files: Any = js.native
    
    /* private */ /* CompleteClass */
    var filesDirName_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var logger_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var options_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var populateForm_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var reader_ : Any = js.native
    
    /* CompleteClass */
    override def removeAll(): Unit = js.native
    
    /* private */ /* CompleteClass */
    var totalSize_ : Any = js.native
    
    /* CompleteClass */
    var values: Any = js.native
  }
  @JSImport("@nginstack/engine/lib/multipart/MultipartFormData", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait MultipartFormData extends StObject {
    
    /* private */ var addFile_ : Any
    
    /* private */ var addValue_ : Any
    
    var files: Any
    
    /* private */ var filesDirName_ : Any
    
    /* private */ var logger_ : Any
    
    /* private */ var options_ : Any
    
    /* private */ var populateForm_ : Any
    
    /* private */ var reader_ : Any
    
    def removeAll(): Unit
    
    /* private */ var totalSize_ : Any
    
    var values: Any
  }
  object MultipartFormData {
    
    inline def apply(
      addFile_ : Any,
      addValue_ : Any,
      files: Any,
      filesDirName_ : Any,
      logger_ : Any,
      options_ : Any,
      populateForm_ : Any,
      reader_ : Any,
      removeAll: Callback,
      totalSize_ : Any,
      values: Any
    ): MultipartFormData = {
      val __obj = js.Dynamic.literal(addFile_ = addFile_.asInstanceOf[js.Any], addValue_ = addValue_.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], filesDirName_ = filesDirName_.asInstanceOf[js.Any], logger_ = logger_.asInstanceOf[js.Any], options_ = options_.asInstanceOf[js.Any], populateForm_ = populateForm_.asInstanceOf[js.Any], reader_ = reader_.asInstanceOf[js.Any], removeAll = removeAll.toJsFn, totalSize_ = totalSize_.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[MultipartFormData]
    }
    
    extension [Self <: MultipartFormData](x: Self) {
      
      inline def setAddFile_(value: Any): Self = StObject.set(x, "addFile_", value.asInstanceOf[js.Any])
      
      inline def setAddValue_(value: Any): Self = StObject.set(x, "addValue_", value.asInstanceOf[js.Any])
      
      inline def setFiles(value: Any): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesDirName_(value: Any): Self = StObject.set(x, "filesDirName_", value.asInstanceOf[js.Any])
      
      inline def setLogger_(value: Any): Self = StObject.set(x, "logger_", value.asInstanceOf[js.Any])
      
      inline def setOptions_(value: Any): Self = StObject.set(x, "options_", value.asInstanceOf[js.Any])
      
      inline def setPopulateForm_(value: Any): Self = StObject.set(x, "populateForm_", value.asInstanceOf[js.Any])
      
      inline def setReader_(value: Any): Self = StObject.set(x, "reader_", value.asInstanceOf[js.Any])
      
      inline def setRemoveAll(value: Callback): Self = StObject.set(x, "removeAll", value.toJsFn)
      
      inline def setTotalSize_(value: Any): Self = StObject.set(x, "totalSize_", value.asInstanceOf[js.Any])
      
      inline def setValues(value: Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
  
  type MultipartFormDataReader = typingsJapgolly.nginstackEngine.libMultipartMultipartFormDataReaderMod.^
}
