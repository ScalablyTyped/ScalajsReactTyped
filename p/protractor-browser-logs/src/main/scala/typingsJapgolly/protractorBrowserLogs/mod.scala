package typingsJapgolly.protractorBrowserLogs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.protractor.mod.ProtractorBrowser
import typingsJapgolly.seleniumWebdriver.mod.logging.Entry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(browser: ProtractorBrowser): BrowserLogs = ^.asInstanceOf[js.Dynamic].apply(browser.asInstanceOf[js.Any]).asInstanceOf[BrowserLogs]
  inline def apply(browser: ProtractorBrowser, options: BrowserLogOptions): BrowserLogs = (^.asInstanceOf[js.Dynamic].apply(browser.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[BrowserLogs]
  
  @JSImport("protractor-browser-logs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait BrowserLogOptions extends StObject {
    
    var reporters: js.UndefOr[js.Array[js.Function1[/* entries */ js.Array[Entry], Unit]]] = js.undefined
  }
  object BrowserLogOptions {
    
    inline def apply(): BrowserLogOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BrowserLogOptions]
    }
    
    extension [Self <: BrowserLogOptions](x: Self) {
      
      inline def setReporters(value: js.Array[js.Function1[/* entries */ js.Array[Entry], Unit]]): Self = StObject.set(x, "reporters", value.asInstanceOf[js.Any])
      
      inline def setReportersUndefined: Self = StObject.set(x, "reporters", js.undefined)
      
      inline def setReportersVarargs(value: (js.Function1[/* entries */ js.Array[Entry], Unit])*): Self = StObject.set(x, "reporters", js.Array(value*))
    }
  }
  
  trait BrowserLogs extends StObject {
    
    def DEBUG(entry: Entry): Boolean
    @JSName("DEBUG")
    var DEBUG_Original: matchPredicateFunction
    
    def ERROR(entry: Entry): Boolean
    @JSName("ERROR")
    var ERROR_Original: matchPredicateFunction
    
    def INFO(entry: Entry): Boolean
    @JSName("INFO")
    var INFO_Original: matchPredicateFunction
    
    def LOG(entry: Entry): Boolean
    @JSName("LOG")
    var LOG_Original: matchPredicateFunction
    
    def WARNING(entry: Entry): Boolean
    @JSName("WARNING")
    var WARNING_Original: matchPredicateFunction
    
    def and(a: matchPredicateFunction, b: matchPredicateFunction): matchPredicateFunction
    
    def expect(matches: matchPredicate*): js.Array[matchPredicateFunction]
    
    def ignore(matches: matchPredicate*): js.Array[matchPredicateFunction]
    
    def logs(): js.Array[Entry]
    
    def or(a: matchPredicateFunction, b: matchPredicateFunction): matchPredicateFunction
    
    def reset(): Unit
    
    def verify(): Unit
  }
  object BrowserLogs {
    
    inline def apply(
      DEBUG: /* entry */ Entry => Boolean,
      ERROR: /* entry */ Entry => Boolean,
      INFO: /* entry */ Entry => Boolean,
      LOG: /* entry */ Entry => Boolean,
      WARNING: /* entry */ Entry => Boolean,
      and: (matchPredicateFunction, matchPredicateFunction) => matchPredicateFunction,
      expect: /* repeated */ matchPredicate => js.Array[matchPredicateFunction],
      ignore: /* repeated */ matchPredicate => js.Array[matchPredicateFunction],
      logs: CallbackTo[js.Array[Entry]],
      or: (matchPredicateFunction, matchPredicateFunction) => matchPredicateFunction,
      reset: Callback,
      verify: Callback
    ): BrowserLogs = {
      val __obj = js.Dynamic.literal(DEBUG = js.Any.fromFunction1(DEBUG), ERROR = js.Any.fromFunction1(ERROR), INFO = js.Any.fromFunction1(INFO), LOG = js.Any.fromFunction1(LOG), WARNING = js.Any.fromFunction1(WARNING), and = js.Any.fromFunction2(and), expect = js.Any.fromFunction1(expect), ignore = js.Any.fromFunction1(ignore), logs = logs.toJsFn, or = js.Any.fromFunction2(or), reset = reset.toJsFn, verify = verify.toJsFn)
      __obj.asInstanceOf[BrowserLogs]
    }
    
    extension [Self <: BrowserLogs](x: Self) {
      
      inline def setAnd(value: (matchPredicateFunction, matchPredicateFunction) => matchPredicateFunction): Self = StObject.set(x, "and", js.Any.fromFunction2(value))
      
      inline def setDEBUG(value: /* entry */ Entry => Boolean): Self = StObject.set(x, "DEBUG", js.Any.fromFunction1(value))
      
      inline def setERROR(value: /* entry */ Entry => Boolean): Self = StObject.set(x, "ERROR", js.Any.fromFunction1(value))
      
      inline def setExpect(value: /* repeated */ matchPredicate => js.Array[matchPredicateFunction]): Self = StObject.set(x, "expect", js.Any.fromFunction1(value))
      
      inline def setINFO(value: /* entry */ Entry => Boolean): Self = StObject.set(x, "INFO", js.Any.fromFunction1(value))
      
      inline def setIgnore(value: /* repeated */ matchPredicate => js.Array[matchPredicateFunction]): Self = StObject.set(x, "ignore", js.Any.fromFunction1(value))
      
      inline def setLOG(value: /* entry */ Entry => Boolean): Self = StObject.set(x, "LOG", js.Any.fromFunction1(value))
      
      inline def setLogs(value: CallbackTo[js.Array[Entry]]): Self = StObject.set(x, "logs", value.toJsFn)
      
      inline def setOr(value: (matchPredicateFunction, matchPredicateFunction) => matchPredicateFunction): Self = StObject.set(x, "or", js.Any.fromFunction2(value))
      
      inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
      
      inline def setVerify(value: Callback): Self = StObject.set(x, "verify", value.toJsFn)
      
      inline def setWARNING(value: /* entry */ Entry => Boolean): Self = StObject.set(x, "WARNING", js.Any.fromFunction1(value))
    }
  }
  
  type matchPredicate = String | js.RegExp | matchPredicateFunction
  
  type matchPredicateFunction = js.Function1[/* entry */ Entry, Boolean]
}
