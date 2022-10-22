package typingsJapgolly.vscodeLanguageserverProtocol.anon

import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.TextDocumentFilter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LanguagePattern
  extends StObject
     with TextDocumentFilter {
  
  /** A language id, like `typescript`. */
  var language: js.UndefOr[String] = js.undefined
  
  /** A glob pattern, like `*.{ts,js}`. */
  var pattern: js.UndefOr[String] = js.undefined
  
  /** A Uri [scheme](#Uri.scheme), like `file` or `untitled`. */
  var scheme: String
}
object LanguagePattern {
  
  inline def apply(scheme: String): LanguagePattern = {
    val __obj = js.Dynamic.literal(scheme = scheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[LanguagePattern]
  }
  
  extension [Self <: LanguagePattern](x: Self) {
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    
    inline def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
  }
}
