package typingsJapgolly.reactFileUtils

import org.scalajs.dom.Blob
import org.scalajs.dom.File
import typingsJapgolly.reactFileUtils.anon.Height
import typingsJapgolly.reactFileUtils.anon.LastModified
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMod {
  
  type FileLike = Blob | File
  
  trait FileUpload
    extends StObject
       with UploadInfo {
    
    var file: LastModified
  }
  object FileUpload {
    
    inline def apply(file: LastModified, id: String, state: UploadState): FileUpload = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileUpload]
    }
    
    extension [Self <: FileUpload](x: Self) {
      
      inline def setFile(value: LastModified): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    }
  }
  
  trait ImageUpload
    extends StObject
       with UploadInfo {
    
    var file: Height
    
    var previewUri: js.UndefOr[String] = js.undefined
  }
  object ImageUpload {
    
    inline def apply(file: Height, id: String, state: UploadState): ImageUpload = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageUpload]
    }
    
    extension [Self <: ImageUpload](x: Self) {
      
      inline def setFile(value: Height): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setPreviewUri(value: String): Self = StObject.set(x, "previewUri", value.asInstanceOf[js.Any])
      
      inline def setPreviewUriUndefined: Self = StObject.set(x, "previewUri", js.undefined)
    }
  }
  
  trait UploadInfo extends StObject {
    
    var id: String
    
    var state: UploadState
    
    var url: js.UndefOr[String] = js.undefined
  }
  object UploadInfo {
    
    inline def apply(id: String, state: UploadState): UploadInfo = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[UploadInfo]
    }
    
    extension [Self <: UploadInfo](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setState(value: UploadState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactFileUtils.reactFileUtilsStrings.uploading
    - typingsJapgolly.reactFileUtils.reactFileUtilsStrings.finished
    - typingsJapgolly.reactFileUtils.reactFileUtilsStrings.failed
  */
  trait UploadState extends StObject
  object UploadState {
    
    inline def failed: typingsJapgolly.reactFileUtils.reactFileUtilsStrings.failed = "failed".asInstanceOf[typingsJapgolly.reactFileUtils.reactFileUtilsStrings.failed]
    
    inline def finished: typingsJapgolly.reactFileUtils.reactFileUtilsStrings.finished = "finished".asInstanceOf[typingsJapgolly.reactFileUtils.reactFileUtilsStrings.finished]
    
    inline def uploading: typingsJapgolly.reactFileUtils.reactFileUtilsStrings.uploading = "uploading".asInstanceOf[typingsJapgolly.reactFileUtils.reactFileUtilsStrings.uploading]
  }
}
