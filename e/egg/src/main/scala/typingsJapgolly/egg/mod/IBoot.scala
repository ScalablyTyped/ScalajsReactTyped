package typingsJapgolly.egg.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBoot extends StObject {
  
  /**
    * Do some thing before app close
    */
  var beforeClose: js.UndefOr[js.Function0[js.Promise[Unit]]] = js.undefined
  
  /**
    * Config, plugin files have loaded
    */
  var configDidLoad: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Ready to call configDidLoad,
    * Config, plugin files are referred,
    * this is the last chance to modify the config.
    */
  var configWillLoad: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * All files have loaded, start plugin here
    */
  var didLoad: js.UndefOr[js.Function0[js.Promise[Unit]]] = js.undefined
  
  /**
    * Worker is ready, can do some things,
    * don't need to block the app boot
    */
  var didReady: js.UndefOr[js.Function0[js.Promise[Unit]]] = js.undefined
  
  /**
    * Server is listening
    */
  var serverDidReady: js.UndefOr[js.Function0[js.Promise[Unit]]] = js.undefined
  
  /**
    * All plugins have started, can do some thing before app ready
    */
  var willReady: js.UndefOr[js.Function0[js.Promise[Unit]]] = js.undefined
}
object IBoot {
  
  inline def apply(): IBoot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBoot]
  }
  
  extension [Self <: IBoot](x: Self) {
    
    inline def setBeforeClose(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "beforeClose", value.toJsFn)
    
    inline def setBeforeCloseUndefined: Self = StObject.set(x, "beforeClose", js.undefined)
    
    inline def setConfigDidLoad(value: Callback): Self = StObject.set(x, "configDidLoad", value.toJsFn)
    
    inline def setConfigDidLoadUndefined: Self = StObject.set(x, "configDidLoad", js.undefined)
    
    inline def setConfigWillLoad(value: Callback): Self = StObject.set(x, "configWillLoad", value.toJsFn)
    
    inline def setConfigWillLoadUndefined: Self = StObject.set(x, "configWillLoad", js.undefined)
    
    inline def setDidLoad(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "didLoad", value.toJsFn)
    
    inline def setDidLoadUndefined: Self = StObject.set(x, "didLoad", js.undefined)
    
    inline def setDidReady(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "didReady", value.toJsFn)
    
    inline def setDidReadyUndefined: Self = StObject.set(x, "didReady", js.undefined)
    
    inline def setServerDidReady(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "serverDidReady", value.toJsFn)
    
    inline def setServerDidReadyUndefined: Self = StObject.set(x, "serverDidReady", js.undefined)
    
    inline def setWillReady(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "willReady", value.toJsFn)
    
    inline def setWillReadyUndefined: Self = StObject.set(x, "willReady", js.undefined)
  }
}
