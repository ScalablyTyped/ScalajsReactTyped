package typingsJapgolly.monacoEditor.mod.languages

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompletionList extends StObject {
  
  var dispose: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var incomplete: js.UndefOr[Boolean] = js.undefined
  
  var suggestions: js.Array[CompletionItem]
}
object CompletionList {
  
  inline def apply(suggestions: js.Array[CompletionItem]): CompletionList = {
    val __obj = js.Dynamic.literal(suggestions = suggestions.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletionList]
  }
  
  extension [Self <: CompletionList](x: Self) {
    
    inline def setDispose(value: Callback): Self = StObject.set(x, "dispose", value.toJsFn)
    
    inline def setDisposeUndefined: Self = StObject.set(x, "dispose", js.undefined)
    
    inline def setIncomplete(value: Boolean): Self = StObject.set(x, "incomplete", value.asInstanceOf[js.Any])
    
    inline def setIncompleteUndefined: Self = StObject.set(x, "incomplete", js.undefined)
    
    inline def setSuggestions(value: js.Array[CompletionItem]): Self = StObject.set(x, "suggestions", value.asInstanceOf[js.Any])
    
    inline def setSuggestionsVarargs(value: CompletionItem*): Self = StObject.set(x, "suggestions", js.Array(value*))
  }
}
