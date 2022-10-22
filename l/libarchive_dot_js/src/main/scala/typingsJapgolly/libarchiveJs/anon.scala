package typingsJapgolly.libarchiveJs

import typingsJapgolly.libarchiveJs.srcCompressedFileMod.CompressedFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait File extends StObject {
    
    var file: org.scalajs.dom.File | CompressedFile
    
    var path: String
  }
  object File {
    
    inline def apply(file: org.scalajs.dom.File | CompressedFile, path: String): File = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[File]
    }
    
    extension [Self <: File](x: Self) {
      
      inline def setFile(value: org.scalajs.dom.File | CompressedFile): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait Path extends StObject {
    
    var file: org.scalajs.dom.File
    
    var path: String
  }
  object Path {
    
    inline def apply(file: org.scalajs.dom.File, path: String): Path = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Path]
    }
    
    extension [Self <: Path](x: Self) {
      
      inline def setFile(value: org.scalajs.dom.File): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait WorkerUrl extends StObject {
    
    var workerUrl: String
  }
  object WorkerUrl {
    
    inline def apply(workerUrl: String): WorkerUrl = {
      val __obj = js.Dynamic.literal(workerUrl = workerUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkerUrl]
    }
    
    extension [Self <: WorkerUrl](x: Self) {
      
      inline def setWorkerUrl(value: String): Self = StObject.set(x, "workerUrl", value.asInstanceOf[js.Any])
    }
  }
}
