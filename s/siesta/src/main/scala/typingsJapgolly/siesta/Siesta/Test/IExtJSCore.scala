package typingsJapgolly.siesta.Siesta.Test

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @mixin
  */
trait IExtJSCore extends StObject {
  
  def Ext(): Any
  
  def clickCQ(selector: String, root: Any, callback: js.Function): Any
  
  def clickComponentQuery(selector: String, root: Any, callback: js.Function): Any
  
  def compositeQuery(selector: String, root: Any, allowEmpty: Boolean): js.Array[HTMLElement]
  
  def cq(selector: String): Any
  
  def cq1(selector: String): Any
  
  def getExt(): Any
  
  def knownBugIn(frameworkVersion: String, fn: js.Function, reason: String): Any
  
  def requireOk(args: Any*): Unit
}
object IExtJSCore {
  
  inline def apply(
    Ext: CallbackTo[Any],
    clickCQ: (String, Any, js.Function) => Any,
    clickComponentQuery: (String, Any, js.Function) => Any,
    compositeQuery: (String, Any, Boolean) => js.Array[HTMLElement],
    cq: String => Any,
    cq1: String => Any,
    getExt: CallbackTo[Any],
    knownBugIn: (String, js.Function, String) => Any,
    requireOk: /* repeated */ Any => Callback
  ): IExtJSCore = {
    val __obj = js.Dynamic.literal(Ext = Ext.toJsFn, clickCQ = js.Any.fromFunction3(clickCQ), clickComponentQuery = js.Any.fromFunction3(clickComponentQuery), compositeQuery = js.Any.fromFunction3(compositeQuery), cq = js.Any.fromFunction1(cq), cq1 = js.Any.fromFunction1(cq1), getExt = getExt.toJsFn, knownBugIn = js.Any.fromFunction3(knownBugIn), requireOk = js.Any.fromFunction1((t0: /* repeated */ Any) => requireOk(t0).runNow()))
    __obj.asInstanceOf[IExtJSCore]
  }
  
  extension [Self <: IExtJSCore](x: Self) {
    
    inline def setClickCQ(value: (String, Any, js.Function) => Any): Self = StObject.set(x, "clickCQ", js.Any.fromFunction3(value))
    
    inline def setClickComponentQuery(value: (String, Any, js.Function) => Any): Self = StObject.set(x, "clickComponentQuery", js.Any.fromFunction3(value))
    
    inline def setCompositeQuery(value: (String, Any, Boolean) => js.Array[HTMLElement]): Self = StObject.set(x, "compositeQuery", js.Any.fromFunction3(value))
    
    inline def setCq(value: String => Any): Self = StObject.set(x, "cq", js.Any.fromFunction1(value))
    
    inline def setCq1(value: String => Any): Self = StObject.set(x, "cq1", js.Any.fromFunction1(value))
    
    inline def setExt(value: CallbackTo[Any]): Self = StObject.set(x, "Ext", value.toJsFn)
    
    inline def setGetExt(value: CallbackTo[Any]): Self = StObject.set(x, "getExt", value.toJsFn)
    
    inline def setKnownBugIn(value: (String, js.Function, String) => Any): Self = StObject.set(x, "knownBugIn", js.Any.fromFunction3(value))
    
    inline def setRequireOk(value: /* repeated */ Any => Callback): Self = StObject.set(x, "requireOk", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
  }
}
