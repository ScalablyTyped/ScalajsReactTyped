package typingsJapgolly.puppeteerCore.anon

import org.scalajs.dom.Node
import typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonElementHandleMod.ElementHandle
import typingsJapgolly.puppeteerCore.puppeteerCoreStrings.mutation
import typingsJapgolly.puppeteerCore.puppeteerCoreStrings.raf
import typingsJapgolly.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bindings extends StObject {
  
  var bindings: js.UndefOr[Map[String, js.Function1[/* repeated */ scala.Nothing, Any]]] = js.undefined
  
  var polling: js.UndefOr[raf | mutation | Double] = js.undefined
  
  var root: js.UndefOr[ElementHandle[Node]] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
}
object Bindings {
  
  inline def apply(): Bindings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bindings]
  }
  
  extension [Self <: Bindings](x: Self) {
    
    inline def setBindings(value: Map[String, js.Function1[/* repeated */ scala.Nothing, Any]]): Self = StObject.set(x, "bindings", value.asInstanceOf[js.Any])
    
    inline def setBindingsUndefined: Self = StObject.set(x, "bindings", js.undefined)
    
    inline def setPolling(value: raf | mutation | Double): Self = StObject.set(x, "polling", value.asInstanceOf[js.Any])
    
    inline def setPollingUndefined: Self = StObject.set(x, "polling", js.undefined)
    
    inline def setRoot(value: ElementHandle[Node]): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
