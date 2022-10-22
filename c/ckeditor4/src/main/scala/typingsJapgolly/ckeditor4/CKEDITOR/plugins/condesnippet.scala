package typingsJapgolly.ckeditor4.CKEDITOR.plugins

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object condesnippet {
  
  trait highlighter extends StObject {
    
    def highlight(code: String, lang: String, callback: js.Function1[/* highlightedCode */ String, Unit]): Unit
    
    def highlighter(code: String, lang: String, callback: js.Function1[/* highlightedCode */ String, Unit]): Unit
    
    def init(ready: js.Function0[Unit]): Unit
    
    var languages: StringDictionary[String]
    
    val queue: js.Array[
        js.Function3[
          /* code */ String, 
          /* lang */ String, 
          /* callback */ js.Function1[/* highlightedCode */ String, Unit], 
          Unit
        ]
      ]
    
    val ready: Boolean
  }
  object highlighter {
    
    inline def apply(
      highlight: (String, String, js.Function1[/* highlightedCode */ String, Unit]) => Callback,
      highlighter: (String, String, js.Function1[/* highlightedCode */ String, Unit]) => Callback,
      init: js.Function0[Unit] => Callback,
      languages: StringDictionary[String],
      queue: js.Array[
          js.Function3[
            /* code */ String, 
            /* lang */ String, 
            /* callback */ js.Function1[/* highlightedCode */ String, Unit], 
            Unit
          ]
        ],
      ready: Boolean
    ): highlighter = {
      val __obj = js.Dynamic.literal(highlight = js.Any.fromFunction3((t0: String, t1: String, t2: js.Function1[/* highlightedCode */ String, Unit]) => (highlight(t0, t1, t2)).runNow()), highlighter = js.Any.fromFunction3((t0: String, t1: String, t2: js.Function1[/* highlightedCode */ String, Unit]) => (highlighter(t0, t1, t2)).runNow()), init = js.Any.fromFunction1((t0: js.Function0[Unit]) => init(t0).runNow()), languages = languages.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any], ready = ready.asInstanceOf[js.Any])
      __obj.asInstanceOf[highlighter]
    }
    
    extension [Self <: highlighter](x: Self) {
      
      inline def setHighlight(value: (String, String, js.Function1[/* highlightedCode */ String, Unit]) => Callback): Self = StObject.set(x, "highlight", js.Any.fromFunction3((t0: String, t1: String, t2: js.Function1[/* highlightedCode */ String, Unit]) => (value(t0, t1, t2)).runNow()))
      
      inline def setHighlighter(value: (String, String, js.Function1[/* highlightedCode */ String, Unit]) => Callback): Self = StObject.set(x, "highlighter", js.Any.fromFunction3((t0: String, t1: String, t2: js.Function1[/* highlightedCode */ String, Unit]) => (value(t0, t1, t2)).runNow()))
      
      inline def setInit(value: js.Function0[Unit] => Callback): Self = StObject.set(x, "init", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
      
      inline def setLanguages(value: StringDictionary[String]): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
      
      inline def setQueue(
        value: js.Array[
              js.Function3[
                /* code */ String, 
                /* lang */ String, 
                /* callback */ js.Function1[/* highlightedCode */ String, Unit], 
                Unit
              ]
            ]
      ): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
      
      inline def setQueueVarargs(
        value: (js.Function3[
              /* code */ String, 
              /* lang */ String, 
              /* callback */ js.Function1[/* highlightedCode */ String, Unit], 
              Unit
            ])*
      ): Self = StObject.set(x, "queue", js.Array(value*))
      
      inline def setReady(value: Boolean): Self = StObject.set(x, "ready", value.asInstanceOf[js.Any])
    }
  }
}
