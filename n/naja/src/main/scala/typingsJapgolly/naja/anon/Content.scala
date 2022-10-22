package typingsJapgolly.naja.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.naja.distCoreSnippetHandlerMod.SnippetUpdateOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content extends StObject {
  
  var content: String
  
  var fromCache: Boolean
  
  def operation(snippet: org.scalajs.dom.Element, content: String): Unit
  @JSName("operation")
  var operation_Original: SnippetUpdateOperation
  
  var options: typingsJapgolly.naja.distNajaMod.Options
  
  var snippet: org.scalajs.dom.Element
}
object Content {
  
  inline def apply(
    content: String,
    fromCache: Boolean,
    operation: (/* snippet */ org.scalajs.dom.Element, /* content */ String) => Callback,
    options: typingsJapgolly.naja.distNajaMod.Options,
    snippet: org.scalajs.dom.Element
  ): Content = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], fromCache = fromCache.asInstanceOf[js.Any], operation = js.Any.fromFunction2((t0: /* snippet */ org.scalajs.dom.Element, t1: /* content */ String) => (operation(t0, t1)).runNow()), options = options.asInstanceOf[js.Any], snippet = snippet.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content]
  }
  
  extension [Self <: Content](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setFromCache(value: Boolean): Self = StObject.set(x, "fromCache", value.asInstanceOf[js.Any])
    
    inline def setOperation(value: (/* snippet */ org.scalajs.dom.Element, /* content */ String) => Callback): Self = StObject.set(x, "operation", js.Any.fromFunction2((t0: /* snippet */ org.scalajs.dom.Element, t1: /* content */ String) => (value(t0, t1)).runNow()))
    
    inline def setOptions(value: typingsJapgolly.naja.distNajaMod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setSnippet(value: org.scalajs.dom.Element): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
  }
}
