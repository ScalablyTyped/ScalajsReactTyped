package typingsJapgolly.winjs.WinJS.UI

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import typingsJapgolly.winjs.WinJS.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides methods for defining and displaying PageControl objects.
**/
object Pages {
  
  //#region Interfaces
  /**
    * Provides members for a PageControl. You implement this interface when defining a new PageControl.
    **/
  trait IPageControlMembers extends StObject {
    
    //#region Methods
    /**
      * Called if any error occurs during the processing of the page.
      * @param err The error that occurred.
      * @returns Nothing if the error was handled, or an error promise if the error was not handled.
      **/
    var error: js.UndefOr[js.Function1[/* err */ Any, Any]] = js.undefined
    
    /**
      * Initializes the control before the content of the control is set. Use the processed method for any initialization that should be done after the content of the control has been set.
      * @param element The DOM element that will contain all the content for the page.
      * @param options The options passed to the constructor of the page.
      * @returns A promise that is fulfilled when initialization is complete, if asynchronous processing is necessary. If not, returns nothing.
      **/
    var init: js.UndefOr[js.Function2[/* element */ HTMLElement, /* options */ Any, Any]] = js.undefined
    
    /**
      * Creates DOM objects from the content in the specified URI. This method is called after the PageControl is defined and before the init method is called.
      * @param uri The URI from which to create DOM objects.
      * @returns A promise whose fulfilled value is the set of unparented DOM objects.
      **/
    var load: js.UndefOr[js.Function1[/* uri */ String, Any]] = js.undefined
    
    /**
      * Initializes the control after the content of the control is set.
      * @param element The DOM element that will contain all the content for the page.
      * @param options The options that are to be passed to the constructor of the page.
      * @returns A promise that is fulfilled when initialization is complete, if asynchronous processing is necessary. If not, returns nothing.
      **/
    var processed: js.UndefOr[js.Function2[/* element */ HTMLElement, /* options */ Any, Any]] = js.undefined
    
    /**
      * Called after all initialization and rendering is complete. At this time, the element is ready for use.
      * @param element The DOM element that contains all the content for the page.
      * @param options An object that contains one or more property/value pairs to apply to the PageControl. How these property/value pairs are used (or not used) depends on the implementation of that particular PageControl.
      * @returns A promise that is fulfilled when the element is ready for use, if asynchronous processing is necessary. If not, returns nothing.
      **/
    var ready: js.UndefOr[js.Function2[/* element */ HTMLElement, /* options */ Any, Any]] = js.undefined
    
    /**
      * Takes the elements returned by the load method and attaches them to the specified element.
      * @param element The DOM element to which the loadResult elements are appended.
      * @param options An object that contains one or more property/value pairs to apply to the PageControl. How these property/value pairs are used (or not used) depends on the implementation of that particular PageControl.
      * @param loadResult A Promise that contains the elements returned from the load method.
      **/
    var render: js.UndefOr[
        js.Function3[/* element */ HTMLElement, /* options */ Any, /* loadResult */ Promise[Any], Unit]
      ] = js.undefined
  }
  object IPageControlMembers {
    
    inline def apply(): IPageControlMembers = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPageControlMembers]
    }
    
    extension [Self <: IPageControlMembers](x: Self) {
      
      inline def setError(value: /* err */ Any => Any): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setInit(value: (/* element */ HTMLElement, /* options */ Any) => Any): Self = StObject.set(x, "init", js.Any.fromFunction2(value))
      
      inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
      
      inline def setLoad(value: /* uri */ String => Any): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
      
      inline def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
      
      inline def setProcessed(value: (/* element */ HTMLElement, /* options */ Any) => Any): Self = StObject.set(x, "processed", js.Any.fromFunction2(value))
      
      inline def setProcessedUndefined: Self = StObject.set(x, "processed", js.undefined)
      
      inline def setReady(value: (/* element */ HTMLElement, /* options */ Any) => Any): Self = StObject.set(x, "ready", js.Any.fromFunction2(value))
      
      inline def setReadyUndefined: Self = StObject.set(x, "ready", js.undefined)
      
      inline def setRender(value: (/* element */ HTMLElement, /* options */ Any, /* loadResult */ Promise[Any]) => Callback): Self = StObject.set(x, "render", js.Any.fromFunction3((t0: /* element */ HTMLElement, t1: /* options */ Any, t2: /* loadResult */ Promise[Any]) => (value(t0, t1, t2)).runNow()))
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    }
  }
}
