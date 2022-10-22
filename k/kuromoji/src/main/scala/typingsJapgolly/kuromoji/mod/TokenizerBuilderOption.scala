package typingsJapgolly.kuromoji.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TokenizerBuilderOption extends StObject {
  
  var dicPath: js.UndefOr[String] = js.undefined
}
object TokenizerBuilderOption {
  
  inline def apply(): TokenizerBuilderOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TokenizerBuilderOption]
  }
  
  extension [Self <: TokenizerBuilderOption](x: Self) {
    
    inline def setDicPath(value: String): Self = StObject.set(x, "dicPath", value.asInstanceOf[js.Any])
    
    inline def setDicPathUndefined: Self = StObject.set(x, "dicPath", js.undefined)
  }
}
