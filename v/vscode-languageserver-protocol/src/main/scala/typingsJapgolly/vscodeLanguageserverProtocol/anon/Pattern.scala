package typingsJapgolly.vscodeLanguageserverProtocol.anon

import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.NotebookDocumentFilter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pattern
  extends StObject
     with NotebookDocumentFilter {
  
  /** The type of the enclosing notebook. */
  var notebookType: js.UndefOr[String] = js.undefined
  
  /** A glob pattern. */
  var pattern: js.UndefOr[String] = js.undefined
  
  /** A Uri [scheme](#Uri.scheme), like `file` or `untitled`.*/
  var scheme: String
}
object Pattern {
  
  inline def apply(scheme: String): Pattern = {
    val __obj = js.Dynamic.literal(scheme = scheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pattern]
  }
  
  extension [Self <: Pattern](x: Self) {
    
    inline def setNotebookType(value: String): Self = StObject.set(x, "notebookType", value.asInstanceOf[js.Any])
    
    inline def setNotebookTypeUndefined: Self = StObject.set(x, "notebookType", js.undefined)
    
    inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    
    inline def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
  }
}
