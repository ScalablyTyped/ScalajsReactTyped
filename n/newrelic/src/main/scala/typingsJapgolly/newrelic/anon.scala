package typingsJapgolly.newrelic

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CollectPendingData extends StObject {
    
    var collectPendingData: js.UndefOr[Boolean] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var waitForIdle: js.UndefOr[Boolean] = js.undefined
  }
  object CollectPendingData {
    
    inline def apply(): CollectPendingData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CollectPendingData]
    }
    
    extension [Self <: CollectPendingData](x: Self) {
      
      inline def setCollectPendingData(value: Boolean): Self = StObject.set(x, "collectPendingData", value.asInstanceOf[js.Any])
      
      inline def setCollectPendingDataUndefined: Self = StObject.set(x, "collectPendingData", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setWaitForIdle(value: Boolean): Self = StObject.set(x, "waitForIdle", value.asInstanceOf[js.Any])
      
      inline def setWaitForIdleUndefined: Self = StObject.set(x, "waitForIdle", js.undefined)
    }
  }
  
  trait HasToRemoveScriptWrapper extends StObject {
    
    var hasToRemoveScriptWrapper: js.UndefOr[Boolean] = js.undefined
    
    var nonce: js.UndefOr[String] = js.undefined
  }
  object HasToRemoveScriptWrapper {
    
    inline def apply(): HasToRemoveScriptWrapper = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HasToRemoveScriptWrapper]
    }
    
    extension [Self <: HasToRemoveScriptWrapper](x: Self) {
      
      inline def setHasToRemoveScriptWrapper(value: Boolean): Self = StObject.set(x, "hasToRemoveScriptWrapper", value.asInstanceOf[js.Any])
      
      inline def setHasToRemoveScriptWrapperUndefined: Self = StObject.set(x, "hasToRemoveScriptWrapper", js.undefined)
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
    }
  }
  
  trait ModuleName extends StObject {
    
    var moduleName: String
    
    var onError: js.UndefOr[js.Function1[/* err */ js.Error, Unit]] = js.undefined
    
    def onRequire(): Unit
  }
  object ModuleName {
    
    inline def apply(moduleName: String, onRequire: Callback): ModuleName = {
      val __obj = js.Dynamic.literal(moduleName = moduleName.asInstanceOf[js.Any], onRequire = onRequire.toJsFn)
      __obj.asInstanceOf[ModuleName]
    }
    
    extension [Self <: ModuleName](x: Self) {
      
      inline def setModuleName(value: String): Self = StObject.set(x, "moduleName", value.asInstanceOf[js.Any])
      
      inline def setOnError(value: /* err */ js.Error => Callback): Self = StObject.set(x, "onError", js.Any.fromFunction1((t0: /* err */ js.Error) => value(t0).runNow()))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnRequire(value: Callback): Self = StObject.set(x, "onRequire", value.toJsFn)
    }
  }
}
