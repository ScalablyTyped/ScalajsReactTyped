package typingsJapgolly.elementResizeDetector

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import typingsJapgolly.elementResizeDetector.elementResizeDetectorStrings.`object`
import typingsJapgolly.elementResizeDetector.elementResizeDetectorStrings.scroll
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Erd = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Erd]
  inline def apply(options: ErdmOptions): Erd = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Erd]
  
  @JSImport("element-resize-detector", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Erd extends StObject {
    
    def listenTo(element: HTMLElement, callback: js.Function1[/* elem */ HTMLElement, Unit]): Unit
    
    def removeAllListeners(element: HTMLElement): Unit
    
    def removeListener(element: HTMLElement, callback: js.Function1[/* elem */ HTMLElement, Unit]): Unit
    
    def uninstall(element: HTMLElement): Unit
  }
  object Erd {
    
    inline def apply(
      listenTo: (HTMLElement, js.Function1[/* elem */ HTMLElement, Unit]) => Callback,
      removeAllListeners: HTMLElement => Callback,
      removeListener: (HTMLElement, js.Function1[/* elem */ HTMLElement, Unit]) => Callback,
      uninstall: HTMLElement => Callback
    ): Erd = {
      val __obj = js.Dynamic.literal(listenTo = js.Any.fromFunction2((t0: HTMLElement, t1: js.Function1[/* elem */ HTMLElement, Unit]) => (listenTo(t0, t1)).runNow()), removeAllListeners = js.Any.fromFunction1((t0: HTMLElement) => removeAllListeners(t0).runNow()), removeListener = js.Any.fromFunction2((t0: HTMLElement, t1: js.Function1[/* elem */ HTMLElement, Unit]) => (removeListener(t0, t1)).runNow()), uninstall = js.Any.fromFunction1((t0: HTMLElement) => uninstall(t0).runNow()))
      __obj.asInstanceOf[Erd]
    }
    
    extension [Self <: Erd](x: Self) {
      
      inline def setListenTo(value: (HTMLElement, js.Function1[/* elem */ HTMLElement, Unit]) => Callback): Self = StObject.set(x, "listenTo", js.Any.fromFunction2((t0: HTMLElement, t1: js.Function1[/* elem */ HTMLElement, Unit]) => (value(t0, t1)).runNow()))
      
      inline def setRemoveAllListeners(value: HTMLElement => Callback): Self = StObject.set(x, "removeAllListeners", js.Any.fromFunction1((t0: HTMLElement) => value(t0).runNow()))
      
      inline def setRemoveListener(value: (HTMLElement, js.Function1[/* elem */ HTMLElement, Unit]) => Callback): Self = StObject.set(x, "removeListener", js.Any.fromFunction2((t0: HTMLElement, t1: js.Function1[/* elem */ HTMLElement, Unit]) => (value(t0, t1)).runNow()))
      
      inline def setUninstall(value: HTMLElement => Callback): Self = StObject.set(x, "uninstall", js.Any.fromFunction1((t0: HTMLElement) => value(t0).runNow()))
    }
  }
  
  trait ErdmOptions extends StObject {
    
    /**
      * Determines if listeners should be called when they are getting added.
      * If true, the listener is guaranteed to be called when it has been added.
      * If false, the listener will not be guarenteed to be called when
      * it has been added (does not prevent it from being called).
      *
      * @default true
      */
    var callOnAdd: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If set to true, the the system will report debug messages as default
      * for the listenTo method.
      */
    var debug: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A custom id handler that is responsible for generating,
      * setting and retrieving id's for elements.
      * If not provided, a default id handler will be used.
      */
    var idHandler: js.UndefOr[IdHandlerProps] = js.undefined
    
    /**
      * A custom reporter that handles reporting logs, warnings and errors.
      * If not provided, a default id handler will be used.
      * If set to false, then nothing will be reported.
      */
    var reporter: js.UndefOr[ReporterProps] = js.undefined
    
    var strategy: js.UndefOr[scroll | `object`] = js.undefined
  }
  object ErdmOptions {
    
    inline def apply(): ErdmOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ErdmOptions]
    }
    
    extension [Self <: ErdmOptions](x: Self) {
      
      inline def setCallOnAdd(value: Boolean): Self = StObject.set(x, "callOnAdd", value.asInstanceOf[js.Any])
      
      inline def setCallOnAddUndefined: Self = StObject.set(x, "callOnAdd", js.undefined)
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setIdHandler(value: IdHandlerProps): Self = StObject.set(x, "idHandler", value.asInstanceOf[js.Any])
      
      inline def setIdHandlerUndefined: Self = StObject.set(x, "idHandler", js.undefined)
      
      inline def setReporter(value: ReporterProps): Self = StObject.set(x, "reporter", value.asInstanceOf[js.Any])
      
      inline def setReporterUndefined: Self = StObject.set(x, "reporter", js.undefined)
      
      inline def setStrategy(value: scroll | `object`): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
      
      inline def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
    }
  }
  
  trait IdHandlerProps extends StObject {
    
    def get(element: HTMLElement, readonly: Boolean): String
    
    def set(element: HTMLElement): String
  }
  object IdHandlerProps {
    
    inline def apply(get: (HTMLElement, Boolean) => String, set: HTMLElement => String): IdHandlerProps = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), set = js.Any.fromFunction1(set))
      __obj.asInstanceOf[IdHandlerProps]
    }
    
    extension [Self <: IdHandlerProps](x: Self) {
      
      inline def setGet(value: (HTMLElement, Boolean) => String): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
      
      inline def setSet(value: HTMLElement => String): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait ReporterProps extends StObject {
    
    def error(text: String): Unit = js.native
    
    def log(idOrText: String, textOrId: String): Unit = js.native
    def log(idOrText: String, textOrId: String, element: HTMLElement): Unit = js.native
    
    def warn(text: String): Unit = js.native
    def warn(text: String, element: HTMLElement): Unit = js.native
  }
}
