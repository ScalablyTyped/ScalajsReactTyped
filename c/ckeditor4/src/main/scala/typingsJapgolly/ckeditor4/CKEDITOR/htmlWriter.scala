package typingsJapgolly.ckeditor4.CKEDITOR

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.ckeditor4.CKEDITOR.htmlParser.basicWriter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait htmlWriter
  extends StObject
     with basicWriter {
  
  def indentation(): Unit
  
  var indentationChars: String
  
  def lineBreak(): Unit
  
  var lineBreakChars: String
  
  var selfClosingEnd: String
  
  def setRules(tagName: String, rules: StringDictionary[Any]): Unit
}
object htmlWriter {
  
  inline def apply(
    attribute: (String, String) => Callback,
    closeTag: String => Callback,
    comment: String => Callback,
    getHtml: Boolean => String,
    indentation: Callback,
    indentationChars: String,
    lineBreak: Callback,
    lineBreakChars: String,
    openTag: (String, StringDictionary[String]) => Callback,
    openTagClose: (String, Boolean) => Callback,
    reset: Callback,
    selfClosingEnd: String,
    setRules: (String, StringDictionary[Any]) => Callback,
    text: String => Callback,
    write: String => Callback
  ): htmlWriter = {
    val __obj = js.Dynamic.literal(attribute = js.Any.fromFunction2((t0: String, t1: String) => (attribute(t0, t1)).runNow()), closeTag = js.Any.fromFunction1((t0: String) => closeTag(t0).runNow()), comment = js.Any.fromFunction1((t0: String) => comment(t0).runNow()), getHtml = js.Any.fromFunction1(getHtml), indentation = indentation.toJsFn, indentationChars = indentationChars.asInstanceOf[js.Any], lineBreak = lineBreak.toJsFn, lineBreakChars = lineBreakChars.asInstanceOf[js.Any], openTag = js.Any.fromFunction2((t0: String, t1: StringDictionary[String]) => (openTag(t0, t1)).runNow()), openTagClose = js.Any.fromFunction2((t0: String, t1: Boolean) => (openTagClose(t0, t1)).runNow()), reset = reset.toJsFn, selfClosingEnd = selfClosingEnd.asInstanceOf[js.Any], setRules = js.Any.fromFunction2((t0: String, t1: StringDictionary[Any]) => (setRules(t0, t1)).runNow()), text = js.Any.fromFunction1((t0: String) => text(t0).runNow()), write = js.Any.fromFunction1((t0: String) => write(t0).runNow()))
    __obj.asInstanceOf[htmlWriter]
  }
  
  extension [Self <: htmlWriter](x: Self) {
    
    inline def setIndentation(value: Callback): Self = StObject.set(x, "indentation", value.toJsFn)
    
    inline def setIndentationChars(value: String): Self = StObject.set(x, "indentationChars", value.asInstanceOf[js.Any])
    
    inline def setLineBreak(value: Callback): Self = StObject.set(x, "lineBreak", value.toJsFn)
    
    inline def setLineBreakChars(value: String): Self = StObject.set(x, "lineBreakChars", value.asInstanceOf[js.Any])
    
    inline def setSelfClosingEnd(value: String): Self = StObject.set(x, "selfClosingEnd", value.asInstanceOf[js.Any])
    
    inline def setSetRules(value: (String, StringDictionary[Any]) => Callback): Self = StObject.set(x, "setRules", js.Any.fromFunction2((t0: String, t1: StringDictionary[Any]) => (value(t0, t1)).runNow()))
  }
}
