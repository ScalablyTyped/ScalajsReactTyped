package typingsJapgolly.jsFixtures

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fixtures extends StObject {
  
  def appendLoad(urls: String*): Unit
  
  def appendSet(html: String): Unit
  
  def body(): String
  
  def cleanUp(): Unit
  
  def clearCache(): Unit
  
  var containerId: String
  
  def load(urls: String*): Unit
  
  var path: String
  
  def preload(urls: String*): Unit
  
  def read(urls: String*): String
  
  def set(html: String): Unit
  
  def window(): Window
}
object Fixtures {
  
  inline def apply(
    appendLoad: /* repeated */ String => Callback,
    appendSet: String => Callback,
    body: CallbackTo[String],
    cleanUp: Callback,
    clearCache: Callback,
    containerId: String,
    load: /* repeated */ String => Callback,
    path: String,
    preload: /* repeated */ String => Callback,
    read: /* repeated */ String => String,
    set: String => Callback,
    window: CallbackTo[Window]
  ): Fixtures = {
    val __obj = js.Dynamic.literal(appendLoad = js.Any.fromFunction1((t0: /* repeated */ String) => appendLoad(t0).runNow()), appendSet = js.Any.fromFunction1((t0: String) => appendSet(t0).runNow()), body = body.toJsFn, cleanUp = cleanUp.toJsFn, clearCache = clearCache.toJsFn, containerId = containerId.asInstanceOf[js.Any], load = js.Any.fromFunction1((t0: /* repeated */ String) => load(t0).runNow()), path = path.asInstanceOf[js.Any], preload = js.Any.fromFunction1((t0: /* repeated */ String) => preload(t0).runNow()), read = js.Any.fromFunction1(read), set = js.Any.fromFunction1((t0: String) => set(t0).runNow()), window = window.toJsFn)
    __obj.asInstanceOf[Fixtures]
  }
  
  extension [Self <: Fixtures](x: Self) {
    
    inline def setAppendLoad(value: /* repeated */ String => Callback): Self = StObject.set(x, "appendLoad", js.Any.fromFunction1((t0: /* repeated */ String) => value(t0).runNow()))
    
    inline def setAppendSet(value: String => Callback): Self = StObject.set(x, "appendSet", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setBody(value: CallbackTo[String]): Self = StObject.set(x, "body", value.toJsFn)
    
    inline def setCleanUp(value: Callback): Self = StObject.set(x, "cleanUp", value.toJsFn)
    
    inline def setClearCache(value: Callback): Self = StObject.set(x, "clearCache", value.toJsFn)
    
    inline def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
    
    inline def setLoad(value: /* repeated */ String => Callback): Self = StObject.set(x, "load", js.Any.fromFunction1((t0: /* repeated */ String) => value(t0).runNow()))
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPreload(value: /* repeated */ String => Callback): Self = StObject.set(x, "preload", js.Any.fromFunction1((t0: /* repeated */ String) => value(t0).runNow()))
    
    inline def setRead(value: /* repeated */ String => String): Self = StObject.set(x, "read", js.Any.fromFunction1(value))
    
    inline def setSet(value: String => Callback): Self = StObject.set(x, "set", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setWindow(value: CallbackTo[Window]): Self = StObject.set(x, "window", value.toJsFn)
  }
}
