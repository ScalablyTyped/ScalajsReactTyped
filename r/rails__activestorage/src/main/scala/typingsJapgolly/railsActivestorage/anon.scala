package typingsJapgolly.railsActivestorage

import org.scalajs.dom.File
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait DirectUploadData extends StObject {
    
    var directUploadData: Headers
    
    var file: File
  }
  object DirectUploadData {
    
    inline def apply(directUploadData: Headers, file: File): DirectUploadData = {
      val __obj = js.Dynamic.literal(directUploadData = directUploadData.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectUploadData]
    }
    
    extension [Self <: DirectUploadData](x: Self) {
      
      inline def setDirectUploadData(value: Headers): Self = StObject.set(x, "directUploadData", value.asInstanceOf[js.Any])
      
      inline def setFile(value: File): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    }
  }
  
  trait Headers extends StObject {
    
    var headers: Record[String, String]
    
    var url: String
  }
  object Headers {
    
    inline def apply(headers: Record[String, String], url: String): Headers = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Headers]
    }
    
    extension [Self <: Headers](x: Self) {
      
      inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
