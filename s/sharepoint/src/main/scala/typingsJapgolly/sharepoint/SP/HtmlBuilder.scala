package typingsJapgolly.sharepoint.SP

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HtmlBuilder extends StObject {
  
  def addAttribute(name: String, value: String): Unit
  
  def addCommunitiesCssClass(cssClassName: String): Unit
  
  def addCssClass(cssClassName: String): Unit
  
  def renderBeginTag(tagName: String): Unit
  
  def renderEndTag(): Unit
  
  def write(s: String): Unit
  
  def writeEncoded(s: String): Unit
}
object HtmlBuilder {
  
  inline def apply(
    addAttribute: (String, String) => Callback,
    addCommunitiesCssClass: String => Callback,
    addCssClass: String => Callback,
    renderBeginTag: String => Callback,
    renderEndTag: Callback,
    write: String => Callback,
    writeEncoded: String => Callback
  ): HtmlBuilder = {
    val __obj = js.Dynamic.literal(addAttribute = js.Any.fromFunction2((t0: String, t1: String) => (addAttribute(t0, t1)).runNow()), addCommunitiesCssClass = js.Any.fromFunction1((t0: String) => addCommunitiesCssClass(t0).runNow()), addCssClass = js.Any.fromFunction1((t0: String) => addCssClass(t0).runNow()), renderBeginTag = js.Any.fromFunction1((t0: String) => renderBeginTag(t0).runNow()), renderEndTag = renderEndTag.toJsFn, write = js.Any.fromFunction1((t0: String) => write(t0).runNow()), writeEncoded = js.Any.fromFunction1((t0: String) => writeEncoded(t0).runNow()))
    __obj.asInstanceOf[HtmlBuilder]
  }
  
  extension [Self <: HtmlBuilder](x: Self) {
    
    inline def setAddAttribute(value: (String, String) => Callback): Self = StObject.set(x, "addAttribute", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setAddCommunitiesCssClass(value: String => Callback): Self = StObject.set(x, "addCommunitiesCssClass", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setAddCssClass(value: String => Callback): Self = StObject.set(x, "addCssClass", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setRenderBeginTag(value: String => Callback): Self = StObject.set(x, "renderBeginTag", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setRenderEndTag(value: Callback): Self = StObject.set(x, "renderEndTag", value.toJsFn)
    
    inline def setWrite(value: String => Callback): Self = StObject.set(x, "write", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setWriteEncoded(value: String => Callback): Self = StObject.set(x, "writeEncoded", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
