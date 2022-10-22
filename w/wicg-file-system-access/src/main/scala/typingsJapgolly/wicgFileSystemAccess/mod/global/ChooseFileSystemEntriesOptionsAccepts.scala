package typingsJapgolly.wicgFileSystemAccess.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Old methods available on Chromium 85 instead of the ones above.
trait ChooseFileSystemEntriesOptionsAccepts extends StObject {
  
  var description: js.UndefOr[String] = js.undefined
  
  var extensions: js.UndefOr[js.Array[String]] = js.undefined
  
  var mimeTypes: js.UndefOr[js.Array[String]] = js.undefined
}
object ChooseFileSystemEntriesOptionsAccepts {
  
  inline def apply(): ChooseFileSystemEntriesOptionsAccepts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChooseFileSystemEntriesOptionsAccepts]
  }
  
  extension [Self <: ChooseFileSystemEntriesOptionsAccepts](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value*))
    
    inline def setMimeTypes(value: js.Array[String]): Self = StObject.set(x, "mimeTypes", value.asInstanceOf[js.Any])
    
    inline def setMimeTypesUndefined: Self = StObject.set(x, "mimeTypes", js.undefined)
    
    inline def setMimeTypesVarargs(value: String*): Self = StObject.set(x, "mimeTypes", js.Array(value*))
  }
}
