package typingsJapgolly.jqueryEasyLoading

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object JQueryEasyLoading {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.jqueryEasyLoading.jqueryEasyLoadingStrings.resize
    - typingsJapgolly.jqueryEasyLoading.jqueryEasyLoadingStrings.start
    - typingsJapgolly.jqueryEasyLoading.jqueryEasyLoadingStrings.stop
    - typingsJapgolly.jqueryEasyLoading.jqueryEasyLoadingStrings.toggle
  */
  trait Command extends StObject
  object Command {
    
    inline def resize: typingsJapgolly.jqueryEasyLoading.jqueryEasyLoadingStrings.resize = "resize".asInstanceOf[typingsJapgolly.jqueryEasyLoading.jqueryEasyLoadingStrings.resize]
    
    inline def start: typingsJapgolly.jqueryEasyLoading.jqueryEasyLoadingStrings.start = "start".asInstanceOf[typingsJapgolly.jqueryEasyLoading.jqueryEasyLoadingStrings.start]
    
    inline def stop: typingsJapgolly.jqueryEasyLoading.jqueryEasyLoadingStrings.stop = "stop".asInstanceOf[typingsJapgolly.jqueryEasyLoading.jqueryEasyLoadingStrings.stop]
    
    inline def toggle: typingsJapgolly.jqueryEasyLoading.jqueryEasyLoadingStrings.toggle = "toggle".asInstanceOf[typingsJapgolly.jqueryEasyLoading.jqueryEasyLoadingStrings.toggle]
  }
  
  trait LoadingObject extends StObject {
    
    /**
      * Check whether the loading state is active or not
      *
      * @return {Boolean}
      */
    def active(): Boolean
    
    /**
      * Attach some internal methods to external events
      * e.g. overlay click, window resize etc
      */
    def attachMethodsToExternalEvents(): Unit
    
    /**
      * Attach the handlers defined on `options` for the respective events
      */
    def attachOptionsHandlers(): Unit
    
    /**
      * Calculate the z-index for the default overlay element
      * Return the z-index passed as setting to the plugin or calculate it
      * based on the target's z-index
      */
    def calcZIndex(): Double
    
    /**
      * Return a new default overlay
      *
      * @return {jQuery} A new overlay already appended to the page's body
      */
    def createOerlay(): JQuery
    
    /**
      * Initializes the overlay and attach handlers to the appropriate events
      */
    def init(): Unit
    
    /**
      * Reposition the overlay on the top of the target element
      * This method needs to be called if the target element changes position
      *  or dimension
      */
    def resize(): Unit
    
    /**
      * Trigger the `loading.start` event and turn on the loading state
      */
    def start(): Unit
    
    /**
      * Trigger the `loading.stop` event and turn off the loading state
      */
    def stop(): Unit
    
    /**
      * Toggle the state of the loading overlay
      */
    def toggle(): Unit
  }
  object LoadingObject {
    
    inline def apply(
      active: CallbackTo[Boolean],
      attachMethodsToExternalEvents: Callback,
      attachOptionsHandlers: Callback,
      calcZIndex: CallbackTo[Double],
      createOerlay: CallbackTo[JQuery],
      init: Callback,
      resize: Callback,
      start: Callback,
      stop: Callback,
      toggle: Callback
    ): LoadingObject = {
      val __obj = js.Dynamic.literal(active = active.toJsFn, attachMethodsToExternalEvents = attachMethodsToExternalEvents.toJsFn, attachOptionsHandlers = attachOptionsHandlers.toJsFn, calcZIndex = calcZIndex.toJsFn, createOerlay = createOerlay.toJsFn, init = init.toJsFn, resize = resize.toJsFn, start = start.toJsFn, stop = stop.toJsFn, toggle = toggle.toJsFn)
      __obj.asInstanceOf[LoadingObject]
    }
    
    extension [Self <: LoadingObject](x: Self) {
      
      inline def setActive(value: CallbackTo[Boolean]): Self = StObject.set(x, "active", value.toJsFn)
      
      inline def setAttachMethodsToExternalEvents(value: Callback): Self = StObject.set(x, "attachMethodsToExternalEvents", value.toJsFn)
      
      inline def setAttachOptionsHandlers(value: Callback): Self = StObject.set(x, "attachOptionsHandlers", value.toJsFn)
      
      inline def setCalcZIndex(value: CallbackTo[Double]): Self = StObject.set(x, "calcZIndex", value.toJsFn)
      
      inline def setCreateOerlay(value: CallbackTo[JQuery]): Self = StObject.set(x, "createOerlay", value.toJsFn)
      
      inline def setInit(value: Callback): Self = StObject.set(x, "init", value.toJsFn)
      
      inline def setResize(value: Callback): Self = StObject.set(x, "resize", value.toJsFn)
      
      inline def setStart(value: Callback): Self = StObject.set(x, "start", value.toJsFn)
      
      inline def setStop(value: Callback): Self = StObject.set(x, "stop", value.toJsFn)
      
      inline def setToggle(value: Callback): Self = StObject.set(x, "toggle", value.toJsFn)
    }
  }
  
  trait Options extends StObject {
    
    /**
      * Class(es) to be applied to the overlay element when the loading state is stopped
      */
    var hiddenClass: js.UndefOr[String] = js.undefined
    
    /**
      * Message to be rendered on the overlay content
      * Has no effect if a custom overlay is defined
      */
    var message: js.UndefOr[String] = js.undefined
    
    /**
      * Function to be executed when the overlay is clicked
      * Receives the loading object as parameter
      *
      * The function is attached to the `loading.click` event
      */
    var onClick: js.UndefOr[js.Function] = js.undefined
    
    /**
      * Function to be executed when the loading state is started
      * Receives the loading object as parameter
      *
      * The function is attached to the `loading.start` event
      */
    var onStart: js.UndefOr[js.Function1[/* loading */ LoadingObject, Unit]] = js.undefined
    
    /**
      * Function to be executed when the loading state is stopped
      * Receives the loading object as parameter
      *
      * The function is attached to the `loading.stop` event
      */
    var onStop: js.UndefOr[js.Function1[/* loading */ LoadingObject, Unit]] = js.undefined
    
    /**
      * jQuery element to be used as overlay
      * If not defined, a default overlay will be created
      */
    var overlay: js.UndefOr[JQuery] = js.undefined
    
    /**
      * Class(es) to be applied to the overlay element when the loading state is started
      */
    var shownClass: js.UndefOr[String] = js.undefined
    
    /**
      * Set to false to not start the loading state when initialized
      */
    var start: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set to true to stop the loading state if the overlay is clicked
      * This options does NOT override the onClick event
      */
    var stoppable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Theme to be applied on the loading element
      *
      * Some default themes are implemented on `jquery.loading.css`, but you can
      *  define your own. Just add a `.loading-theme-my_awesome_theme` selector
      *  somewhere with your custom styles and change this option
      *  to 'my_awesome_theme'. The class is applied to the parent overlay div
      *
      * Has no effect if a custom overlay is defined
      */
    var theme: js.UndefOr[String] = js.undefined
    
    /**
      * z-index to be used by the default overlay
      * If not defined, a z-index will be calculated based on the
      * target's z-index
      * Has no effect if a custom overlay is defined
      */
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setHiddenClass(value: String): Self = StObject.set(x, "hiddenClass", value.asInstanceOf[js.Any])
      
      inline def setHiddenClassUndefined: Self = StObject.set(x, "hiddenClass", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setOnClick(value: js.Function): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnStart(value: /* loading */ LoadingObject => Callback): Self = StObject.set(x, "onStart", js.Any.fromFunction1((t0: /* loading */ LoadingObject) => value(t0).runNow()))
      
      inline def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
      
      inline def setOnStop(value: /* loading */ LoadingObject => Callback): Self = StObject.set(x, "onStop", js.Any.fromFunction1((t0: /* loading */ LoadingObject) => value(t0).runNow()))
      
      inline def setOnStopUndefined: Self = StObject.set(x, "onStop", js.undefined)
      
      inline def setOverlay(value: JQuery): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      inline def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
      
      inline def setShownClass(value: String): Self = StObject.set(x, "shownClass", value.asInstanceOf[js.Any])
      
      inline def setShownClassUndefined: Self = StObject.set(x, "shownClass", js.undefined)
      
      inline def setStart(value: Boolean): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      inline def setStoppable(value: Boolean): Self = StObject.set(x, "stoppable", value.asInstanceOf[js.Any])
      
      inline def setStoppableUndefined: Self = StObject.set(x, "stoppable", js.undefined)
      
      inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  trait Static extends StObject {
    
    /**
      * Extend the Loading plugin default settings with the user options
      * Use it as `$.Loading.setDefaults({ ... })`
      *
      * @param {Object} options Custom options to override the plugin defaults
      */
    def setDefaults(options: Options): Unit
  }
  object Static {
    
    inline def apply(setDefaults: Options => Callback): Static = {
      val __obj = js.Dynamic.literal(setDefaults = js.Any.fromFunction1((t0: Options) => setDefaults(t0).runNow()))
      __obj.asInstanceOf[Static]
    }
    
    extension [Self <: Static](x: Self) {
      
      inline def setSetDefaults(value: Options => Callback): Self = StObject.set(x, "setDefaults", js.Any.fromFunction1((t0: Options) => value(t0).runNow()))
    }
  }
}
