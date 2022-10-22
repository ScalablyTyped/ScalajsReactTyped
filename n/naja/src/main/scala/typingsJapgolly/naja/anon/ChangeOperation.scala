package typingsJapgolly.naja.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.naja.distCoreSnippetHandlerMod.SnippetUpdateOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeOperation extends StObject {
  
  def changeOperation(value: SnippetUpdateOperation): Unit
  
  var content: String
  
  var fromCache: Boolean
  
  def operation(snippet: org.scalajs.dom.Element, content: String): Unit
  @JSName("operation")
  var operation_Original: SnippetUpdateOperation
  
  var options: typingsJapgolly.naja.distNajaMod.Options
  
  var snippet: org.scalajs.dom.Element
}
object ChangeOperation {
  
  inline def apply(
    changeOperation: SnippetUpdateOperation => Callback,
    content: String,
    fromCache: Boolean,
    operation: (/* snippet */ org.scalajs.dom.Element, /* content */ String) => Callback,
    options: typingsJapgolly.naja.distNajaMod.Options,
    snippet: org.scalajs.dom.Element
  ): ChangeOperation = {
    val __obj = js.Dynamic.literal(changeOperation = js.Any.fromFunction1((t0: SnippetUpdateOperation) => changeOperation(t0).runNow()), content = content.asInstanceOf[js.Any], fromCache = fromCache.asInstanceOf[js.Any], operation = js.Any.fromFunction2((t0: /* snippet */ org.scalajs.dom.Element, t1: /* content */ String) => (operation(t0, t1)).runNow()), options = options.asInstanceOf[js.Any], snippet = snippet.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeOperation]
  }
  
  extension [Self <: ChangeOperation](x: Self) {
    
    inline def setChangeOperation(value: SnippetUpdateOperation => Callback): Self = StObject.set(x, "changeOperation", js.Any.fromFunction1((t0: SnippetUpdateOperation) => value(t0).runNow()))
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setFromCache(value: Boolean): Self = StObject.set(x, "fromCache", value.asInstanceOf[js.Any])
    
    inline def setOperation(value: (/* snippet */ org.scalajs.dom.Element, /* content */ String) => Callback): Self = StObject.set(x, "operation", js.Any.fromFunction2((t0: /* snippet */ org.scalajs.dom.Element, t1: /* content */ String) => (value(t0, t1)).runNow()))
    
    inline def setOptions(value: typingsJapgolly.naja.distNajaMod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setSnippet(value: org.scalajs.dom.Element): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
  }
}
