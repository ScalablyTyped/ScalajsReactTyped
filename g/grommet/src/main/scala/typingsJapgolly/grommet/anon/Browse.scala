package typingsJapgolly.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Browse extends StObject {
  
  var browse: js.UndefOr[String] = js.undefined
  
  var dropPrompt: js.UndefOr[String] = js.undefined
  
  var dropPromptMultiple: js.UndefOr[String] = js.undefined
  
  var files: js.UndefOr[String] = js.undefined
  
  var maxFile: js.UndefOr[String] = js.undefined
  
  var remove: js.UndefOr[String] = js.undefined
  
  var removeAll: js.UndefOr[String] = js.undefined
}
object Browse {
  
  inline def apply(): Browse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Browse]
  }
  
  extension [Self <: Browse](x: Self) {
    
    inline def setBrowse(value: String): Self = StObject.set(x, "browse", value.asInstanceOf[js.Any])
    
    inline def setBrowseUndefined: Self = StObject.set(x, "browse", js.undefined)
    
    inline def setDropPrompt(value: String): Self = StObject.set(x, "dropPrompt", value.asInstanceOf[js.Any])
    
    inline def setDropPromptMultiple(value: String): Self = StObject.set(x, "dropPromptMultiple", value.asInstanceOf[js.Any])
    
    inline def setDropPromptMultipleUndefined: Self = StObject.set(x, "dropPromptMultiple", js.undefined)
    
    inline def setDropPromptUndefined: Self = StObject.set(x, "dropPrompt", js.undefined)
    
    inline def setFiles(value: String): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    inline def setMaxFile(value: String): Self = StObject.set(x, "maxFile", value.asInstanceOf[js.Any])
    
    inline def setMaxFileUndefined: Self = StObject.set(x, "maxFile", js.undefined)
    
    inline def setRemove(value: String): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
    
    inline def setRemoveAll(value: String): Self = StObject.set(x, "removeAll", value.asInstanceOf[js.Any])
    
    inline def setRemoveAllUndefined: Self = StObject.set(x, "removeAll", js.undefined)
    
    inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
  }
}
