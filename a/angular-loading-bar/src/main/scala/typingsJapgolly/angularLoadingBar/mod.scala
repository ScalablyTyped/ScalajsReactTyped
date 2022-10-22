package typingsJapgolly.angularLoadingBar

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("angular-loading-bar", JSImport.Namespace)
  @js.native
  val ^ : String = js.native
  
  type _To = String
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: String = ^
  
  /* augmented module */
  object angularAugmentingMod {
    
    trait IRequestShortcutConfig extends StObject {
      
      /**
        * Indicates that the loading bar should be hidden.
        */
      var ignoreLoadingBar: js.UndefOr[Boolean] = js.undefined
    }
    object IRequestShortcutConfig {
      
      inline def apply(): IRequestShortcutConfig = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IRequestShortcutConfig]
      }
      
      extension [Self <: IRequestShortcutConfig](x: Self) {
        
        inline def setIgnoreLoadingBar(value: Boolean): Self = StObject.set(x, "ignoreLoadingBar", value.asInstanceOf[js.Any])
        
        inline def setIgnoreLoadingBarUndefined: Self = StObject.set(x, "ignoreLoadingBar", js.undefined)
      }
    }
    
    object loadingBar {
      
      trait ILoadingBarProvider extends StObject {
        
        /**
          * Give illusion that there's always progress
          */
        var autoIncrement: js.UndefOr[Boolean] = js.undefined
        
        /**
          * Complete the loading bar
          */
        def complete(): Unit
        
        /**
          * Increment the loading bar
          */
        def inc(): Unit
        
        /**
          * Turn the loading bar on or off
          */
        var includeBar: js.UndefOr[Boolean] = js.undefined
        
        /**
          * Turn the spinner on or off
          */
        var includeSpinner: js.UndefOr[Boolean] = js.undefined
        
        /**
          * Latency Threshold
          */
        var latencyThreshold: js.UndefOr[Double] = js.undefined
        
        /**
          * Loading bar template
          */
        var loadingBarTemplate: js.UndefOr[String] = js.undefined
        
        /**
          * HTML element selector of parent
          */
        var parentSelector: js.UndefOr[String] = js.undefined
        
        /**
          * Set the percentage completed
          * @param {number} n - number between 0 and 1
          */
        def set(n: Double): Unit
        
        /**
          * HTML template
          */
        var spinnerTemplate: js.UndefOr[String] = js.undefined
        
        /**
          * Broadcast the start event
          */
        def start(): Unit
        
        /**
          * Starting size
          */
        var startSize: js.UndefOr[Double] = js.undefined
        
        /**
          * Get the percentage completed
          * @returns {number}
          */
        def status(): Double
      }
      object ILoadingBarProvider {
        
        inline def apply(
          complete: Callback,
          inc: Callback,
          set: Double => Callback,
          start: Callback,
          status: CallbackTo[Double]
        ): ILoadingBarProvider = {
          val __obj = js.Dynamic.literal(complete = complete.toJsFn, inc = inc.toJsFn, set = js.Any.fromFunction1((t0: Double) => set(t0).runNow()), start = start.toJsFn, status = status.toJsFn)
          __obj.asInstanceOf[ILoadingBarProvider]
        }
        
        extension [Self <: ILoadingBarProvider](x: Self) {
          
          inline def setAutoIncrement(value: Boolean): Self = StObject.set(x, "autoIncrement", value.asInstanceOf[js.Any])
          
          inline def setAutoIncrementUndefined: Self = StObject.set(x, "autoIncrement", js.undefined)
          
          inline def setComplete(value: Callback): Self = StObject.set(x, "complete", value.toJsFn)
          
          inline def setInc(value: Callback): Self = StObject.set(x, "inc", value.toJsFn)
          
          inline def setIncludeBar(value: Boolean): Self = StObject.set(x, "includeBar", value.asInstanceOf[js.Any])
          
          inline def setIncludeBarUndefined: Self = StObject.set(x, "includeBar", js.undefined)
          
          inline def setIncludeSpinner(value: Boolean): Self = StObject.set(x, "includeSpinner", value.asInstanceOf[js.Any])
          
          inline def setIncludeSpinnerUndefined: Self = StObject.set(x, "includeSpinner", js.undefined)
          
          inline def setLatencyThreshold(value: Double): Self = StObject.set(x, "latencyThreshold", value.asInstanceOf[js.Any])
          
          inline def setLatencyThresholdUndefined: Self = StObject.set(x, "latencyThreshold", js.undefined)
          
          inline def setLoadingBarTemplate(value: String): Self = StObject.set(x, "loadingBarTemplate", value.asInstanceOf[js.Any])
          
          inline def setLoadingBarTemplateUndefined: Self = StObject.set(x, "loadingBarTemplate", js.undefined)
          
          inline def setParentSelector(value: String): Self = StObject.set(x, "parentSelector", value.asInstanceOf[js.Any])
          
          inline def setParentSelectorUndefined: Self = StObject.set(x, "parentSelector", js.undefined)
          
          inline def setSet(value: Double => Callback): Self = StObject.set(x, "set", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
          
          inline def setSpinnerTemplate(value: String): Self = StObject.set(x, "spinnerTemplate", value.asInstanceOf[js.Any])
          
          inline def setSpinnerTemplateUndefined: Self = StObject.set(x, "spinnerTemplate", js.undefined)
          
          inline def setStart(value: Callback): Self = StObject.set(x, "start", value.toJsFn)
          
          inline def setStartSize(value: Double): Self = StObject.set(x, "startSize", value.asInstanceOf[js.Any])
          
          inline def setStartSizeUndefined: Self = StObject.set(x, "startSize", js.undefined)
          
          inline def setStatus(value: CallbackTo[Double]): Self = StObject.set(x, "status", value.toJsFn)
        }
      }
    }
  }
}
