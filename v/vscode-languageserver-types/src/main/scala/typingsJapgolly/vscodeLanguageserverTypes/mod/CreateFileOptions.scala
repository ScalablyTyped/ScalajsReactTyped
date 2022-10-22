package typingsJapgolly.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFileOptions extends StObject {
  
  /**
    * Ignore if exists.
    */
  var ignoreIfExists: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Overwrite existing file. Overwrite wins over `ignoreIfExists`
    */
  var overwrite: js.UndefOr[Boolean] = js.undefined
}
object CreateFileOptions {
  
  inline def apply(): CreateFileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFileOptions]
  }
  
  extension [Self <: CreateFileOptions](x: Self) {
    
    inline def setIgnoreIfExists(value: Boolean): Self = StObject.set(x, "ignoreIfExists", value.asInstanceOf[js.Any])
    
    inline def setIgnoreIfExistsUndefined: Self = StObject.set(x, "ignoreIfExists", js.undefined)
    
    inline def setOverwrite(value: Boolean): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
    
    inline def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
  }
}
