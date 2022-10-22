package typingsJapgolly.sanitizer

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sanitizer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def escape(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escape")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def makeSaxParser(yourHandler: ISaxHandler): js.Function1[/* repeated */ Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeSaxParser")(yourHandler.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ Any, Any]]
  
  inline def normalizeRCData(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeRCData")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def sanitize(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitize")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def unescapeEntities(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unescapeEntities")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait ISaxHandler extends StObject {
    
    def cdata(text: String, param: Any): Unit
    
    def comment(text: String, param: Any): Unit
    
    def endDoc(param: Any): Unit
    
    def endTag(name: String, param: Any): Unit
    
    def pcdata(text: String, param: Any): Unit
    
    def rcdata(text: String, param: Any): Unit
    
    def startDoc(param: Any): Unit
    
    def startTag(name: String, attribs: js.Array[String], param: Any): Unit
  }
  object ISaxHandler {
    
    inline def apply(
      cdata: (String, Any) => Callback,
      comment: (String, Any) => Callback,
      endDoc: Any => Callback,
      endTag: (String, Any) => Callback,
      pcdata: (String, Any) => Callback,
      rcdata: (String, Any) => Callback,
      startDoc: Any => Callback,
      startTag: (String, js.Array[String], Any) => Callback
    ): ISaxHandler = {
      val __obj = js.Dynamic.literal(cdata = js.Any.fromFunction2((t0: String, t1: Any) => (cdata(t0, t1)).runNow()), comment = js.Any.fromFunction2((t0: String, t1: Any) => (comment(t0, t1)).runNow()), endDoc = js.Any.fromFunction1((t0: Any) => endDoc(t0).runNow()), endTag = js.Any.fromFunction2((t0: String, t1: Any) => (endTag(t0, t1)).runNow()), pcdata = js.Any.fromFunction2((t0: String, t1: Any) => (pcdata(t0, t1)).runNow()), rcdata = js.Any.fromFunction2((t0: String, t1: Any) => (rcdata(t0, t1)).runNow()), startDoc = js.Any.fromFunction1((t0: Any) => startDoc(t0).runNow()), startTag = js.Any.fromFunction3((t0: String, t1: js.Array[String], t2: Any) => (startTag(t0, t1, t2)).runNow()))
      __obj.asInstanceOf[ISaxHandler]
    }
    
    extension [Self <: ISaxHandler](x: Self) {
      
      inline def setCdata(value: (String, Any) => Callback): Self = StObject.set(x, "cdata", js.Any.fromFunction2((t0: String, t1: Any) => (value(t0, t1)).runNow()))
      
      inline def setComment(value: (String, Any) => Callback): Self = StObject.set(x, "comment", js.Any.fromFunction2((t0: String, t1: Any) => (value(t0, t1)).runNow()))
      
      inline def setEndDoc(value: Any => Callback): Self = StObject.set(x, "endDoc", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setEndTag(value: (String, Any) => Callback): Self = StObject.set(x, "endTag", js.Any.fromFunction2((t0: String, t1: Any) => (value(t0, t1)).runNow()))
      
      inline def setPcdata(value: (String, Any) => Callback): Self = StObject.set(x, "pcdata", js.Any.fromFunction2((t0: String, t1: Any) => (value(t0, t1)).runNow()))
      
      inline def setRcdata(value: (String, Any) => Callback): Self = StObject.set(x, "rcdata", js.Any.fromFunction2((t0: String, t1: Any) => (value(t0, t1)).runNow()))
      
      inline def setStartDoc(value: Any => Callback): Self = StObject.set(x, "startDoc", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setStartTag(value: (String, js.Array[String], Any) => Callback): Self = StObject.set(x, "startTag", js.Any.fromFunction3((t0: String, t1: js.Array[String], t2: Any) => (value(t0, t1, t2)).runNow()))
    }
  }
}
