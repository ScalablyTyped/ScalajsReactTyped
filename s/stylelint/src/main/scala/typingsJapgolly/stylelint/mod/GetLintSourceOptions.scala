package typingsJapgolly.stylelint.mod

import typingsJapgolly.postcss.mod.Result
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLintSourceOptions
  extends StObject
     with GetPostcssOptions {
  
  var cache: js.UndefOr[Boolean] = js.undefined
  
  var existingPostcssResult: js.UndefOr[Result] = js.undefined
}
object GetLintSourceOptions {
  
  inline def apply(): GetLintSourceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLintSourceOptions]
  }
  
  extension [Self <: GetLintSourceOptions](x: Self) {
    
    inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    
    inline def setExistingPostcssResult(value: Result): Self = StObject.set(x, "existingPostcssResult", value.asInstanceOf[js.Any])
    
    inline def setExistingPostcssResultUndefined: Self = StObject.set(x, "existingPostcssResult", js.undefined)
  }
}
