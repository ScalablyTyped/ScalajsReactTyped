package typingsJapgolly.reactCodesandboxer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Content extends StObject {
    
    var content: String
  }
  object Content {
    
    inline def apply(content: String): Content = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[Content]
    }
    
    extension [Self <: Content](x: Self) {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    }
  }
  
  trait Error extends StObject {
    
    var error: Any
  }
  object Error {
    
    inline def apply(error: Any): Error = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error]
    }
    
    extension [Self <: Error](x: Self) {
      
      inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    }
  }
  
  trait Files extends StObject {
    
    var files: typingsJapgolly.reactCodesandboxer.mod.Files
    
    var parameters: String
  }
  object Files {
    
    inline def apply(files: typingsJapgolly.reactCodesandboxer.mod.Files, parameters: String): Files = {
      val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
      __obj.asInstanceOf[Files]
    }
    
    extension [Self <: Files](x: Self) {
      
      inline def setFiles(value: typingsJapgolly.reactCodesandboxer.mod.Files): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setParameters(value: String): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    }
  }
  
  trait IsLoading extends StObject {
    
    var files: js.UndefOr[typingsJapgolly.reactCodesandboxer.mod.Files] = js.undefined
    
    var isLoading: Boolean
    
    var sandboxId: js.UndefOr[String] = js.undefined
    
    var sandboxUrl: js.UndefOr[String] = js.undefined
  }
  object IsLoading {
    
    inline def apply(isLoading: Boolean): IsLoading = {
      val __obj = js.Dynamic.literal(isLoading = isLoading.asInstanceOf[js.Any])
      __obj.asInstanceOf[IsLoading]
    }
    
    extension [Self <: IsLoading](x: Self) {
      
      inline def setFiles(value: typingsJapgolly.reactCodesandboxer.mod.Files): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      inline def setIsLoading(value: Boolean): Self = StObject.set(x, "isLoading", value.asInstanceOf[js.Any])
      
      inline def setSandboxId(value: String): Self = StObject.set(x, "sandboxId", value.asInstanceOf[js.Any])
      
      inline def setSandboxIdUndefined: Self = StObject.set(x, "sandboxId", js.undefined)
      
      inline def setSandboxUrl(value: String): Self = StObject.set(x, "sandboxUrl", value.asInstanceOf[js.Any])
      
      inline def setSandboxUrlUndefined: Self = StObject.set(x, "sandboxUrl", js.undefined)
    }
  }
}
