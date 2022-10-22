package typingsJapgolly.naja.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.naja.distCoreSnippetHandlerMod.SnippetUpdateOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<'replace' | 'prepend' | 'append', naja.naja/dist/core/SnippetHandler.SnippetUpdateOperation> */
trait Recordreplaceprependappen extends StObject {
  
  def append(snippet: org.scalajs.dom.Element, content: String): Unit
  @JSName("append")
  var append_Original: SnippetUpdateOperation
  
  def prepend(snippet: org.scalajs.dom.Element, content: String): Unit
  @JSName("prepend")
  var prepend_Original: SnippetUpdateOperation
  
  def replace(snippet: org.scalajs.dom.Element, content: String): Unit
  @JSName("replace")
  var replace_Original: SnippetUpdateOperation
}
object Recordreplaceprependappen {
  
  inline def apply(
    append: (/* snippet */ org.scalajs.dom.Element, /* content */ String) => Callback,
    prepend: (/* snippet */ org.scalajs.dom.Element, /* content */ String) => Callback,
    replace: (/* snippet */ org.scalajs.dom.Element, /* content */ String) => Callback
  ): Recordreplaceprependappen = {
    val __obj = js.Dynamic.literal(append = js.Any.fromFunction2((t0: /* snippet */ org.scalajs.dom.Element, t1: /* content */ String) => (append(t0, t1)).runNow()), prepend = js.Any.fromFunction2((t0: /* snippet */ org.scalajs.dom.Element, t1: /* content */ String) => (prepend(t0, t1)).runNow()), replace = js.Any.fromFunction2((t0: /* snippet */ org.scalajs.dom.Element, t1: /* content */ String) => (replace(t0, t1)).runNow()))
    __obj.asInstanceOf[Recordreplaceprependappen]
  }
  
  extension [Self <: Recordreplaceprependappen](x: Self) {
    
    inline def setAppend(value: (/* snippet */ org.scalajs.dom.Element, /* content */ String) => Callback): Self = StObject.set(x, "append", js.Any.fromFunction2((t0: /* snippet */ org.scalajs.dom.Element, t1: /* content */ String) => (value(t0, t1)).runNow()))
    
    inline def setPrepend(value: (/* snippet */ org.scalajs.dom.Element, /* content */ String) => Callback): Self = StObject.set(x, "prepend", js.Any.fromFunction2((t0: /* snippet */ org.scalajs.dom.Element, t1: /* content */ String) => (value(t0, t1)).runNow()))
    
    inline def setReplace(value: (/* snippet */ org.scalajs.dom.Element, /* content */ String) => Callback): Self = StObject.set(x, "replace", js.Any.fromFunction2((t0: /* snippet */ org.scalajs.dom.Element, t1: /* content */ String) => (value(t0, t1)).runNow()))
  }
}
