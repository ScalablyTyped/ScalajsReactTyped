package typingsJapgolly.highlightJs.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Emitter extends StObject {
  
  def addKeyword(text: String, kind: String): Unit
  
  def addSublanguage(emitter: Emitter, subLanguageName: String): Unit
  
  def addText(text: String): Unit
  
  def closeAllNodes(): Unit
  
  def closeNode(): Unit
  
  def openNode(kind: String): Unit
  
  def toHTML(): String
}
object Emitter {
  
  inline def apply(
    addKeyword: (String, String) => Callback,
    addSublanguage: (Emitter, String) => Callback,
    addText: String => Callback,
    closeAllNodes: Callback,
    closeNode: Callback,
    openNode: String => Callback,
    toHTML: CallbackTo[String]
  ): Emitter = {
    val __obj = js.Dynamic.literal(addKeyword = js.Any.fromFunction2((t0: String, t1: String) => (addKeyword(t0, t1)).runNow()), addSublanguage = js.Any.fromFunction2((t0: Emitter, t1: String) => (addSublanguage(t0, t1)).runNow()), addText = js.Any.fromFunction1((t0: String) => addText(t0).runNow()), closeAllNodes = closeAllNodes.toJsFn, closeNode = closeNode.toJsFn, openNode = js.Any.fromFunction1((t0: String) => openNode(t0).runNow()), toHTML = toHTML.toJsFn)
    __obj.asInstanceOf[Emitter]
  }
  
  extension [Self <: Emitter](x: Self) {
    
    inline def setAddKeyword(value: (String, String) => Callback): Self = StObject.set(x, "addKeyword", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setAddSublanguage(value: (Emitter, String) => Callback): Self = StObject.set(x, "addSublanguage", js.Any.fromFunction2((t0: Emitter, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setAddText(value: String => Callback): Self = StObject.set(x, "addText", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setCloseAllNodes(value: Callback): Self = StObject.set(x, "closeAllNodes", value.toJsFn)
    
    inline def setCloseNode(value: Callback): Self = StObject.set(x, "closeNode", value.toJsFn)
    
    inline def setOpenNode(value: String => Callback): Self = StObject.set(x, "openNode", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setToHTML(value: CallbackTo[String]): Self = StObject.set(x, "toHTML", value.toJsFn)
  }
}
