package typingsJapgolly.spacePen

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Builder extends StObject {
  
  def buildHtml(): js.Array[Any]
  
  def closeTag(name: String): Unit
  
  var document: js.Array[Any]
  
  def extractOptions(args: Any): Any
  
  def openTag(name: String, attributes: Any): Unit
  
  var postProcessingSteps: js.Array[Any]
  
  def raw(str: String): Unit
  
  def subview(outletName: Any, subview: View): Unit
  
  def tag(name: String, args: Any*): Unit
  
  def text(str: String): Unit
}
object Builder {
  
  inline def apply(
    buildHtml: CallbackTo[js.Array[Any]],
    closeTag: String => Callback,
    document: js.Array[Any],
    extractOptions: Any => Any,
    openTag: (String, Any) => Callback,
    postProcessingSteps: js.Array[Any],
    raw: String => Callback,
    subview: (Any, View) => Callback,
    tag: (String, /* repeated */ Any) => Callback,
    text: String => Callback
  ): Builder = {
    val __obj = js.Dynamic.literal(buildHtml = buildHtml.toJsFn, closeTag = js.Any.fromFunction1((t0: String) => closeTag(t0).runNow()), document = document.asInstanceOf[js.Any], extractOptions = js.Any.fromFunction1(extractOptions), openTag = js.Any.fromFunction2((t0: String, t1: Any) => (openTag(t0, t1)).runNow()), postProcessingSteps = postProcessingSteps.asInstanceOf[js.Any], raw = js.Any.fromFunction1((t0: String) => raw(t0).runNow()), subview = js.Any.fromFunction2((t0: Any, t1: View) => (subview(t0, t1)).runNow()), tag = js.Any.fromFunction2((t0: String, t1: /* repeated */ Any) => (tag(t0, t1)).runNow()), text = js.Any.fromFunction1((t0: String) => text(t0).runNow()))
    __obj.asInstanceOf[Builder]
  }
  
  extension [Self <: Builder](x: Self) {
    
    inline def setBuildHtml(value: CallbackTo[js.Array[Any]]): Self = StObject.set(x, "buildHtml", value.toJsFn)
    
    inline def setCloseTag(value: String => Callback): Self = StObject.set(x, "closeTag", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setDocument(value: js.Array[Any]): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setDocumentVarargs(value: Any*): Self = StObject.set(x, "document", js.Array(value*))
    
    inline def setExtractOptions(value: Any => Any): Self = StObject.set(x, "extractOptions", js.Any.fromFunction1(value))
    
    inline def setOpenTag(value: (String, Any) => Callback): Self = StObject.set(x, "openTag", js.Any.fromFunction2((t0: String, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setPostProcessingSteps(value: js.Array[Any]): Self = StObject.set(x, "postProcessingSteps", value.asInstanceOf[js.Any])
    
    inline def setPostProcessingStepsVarargs(value: Any*): Self = StObject.set(x, "postProcessingSteps", js.Array(value*))
    
    inline def setRaw(value: String => Callback): Self = StObject.set(x, "raw", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSubview(value: (Any, View) => Callback): Self = StObject.set(x, "subview", js.Any.fromFunction2((t0: Any, t1: View) => (value(t0, t1)).runNow()))
    
    inline def setTag(value: (String, /* repeated */ Any) => Callback): Self = StObject.set(x, "tag", js.Any.fromFunction2((t0: String, t1: /* repeated */ Any) => (value(t0, t1)).runNow()))
    
    inline def setText(value: String => Callback): Self = StObject.set(x, "text", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
