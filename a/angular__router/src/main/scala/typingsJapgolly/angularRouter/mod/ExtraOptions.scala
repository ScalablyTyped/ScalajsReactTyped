package typingsJapgolly.angularRouter.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.angularRouter.angularRouterStrings.corrected
import typingsJapgolly.angularRouter.angularRouterStrings.legacy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtraOptions
  extends StObject
     with InMemoryScrollingOptions
     with RouterConfigOptions {
  
  /**
    * When true, log all internal navigation events to the console.
    * Use for debugging.
    */
  var enableTracing: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A custom error handler for failed navigations.
    * If the handler returns a value, the navigation Promise is resolved with this value.
    * If the handler throws an exception, the navigation Promise is rejected with the exception.
    *
    */
  var errorHandler: js.UndefOr[ErrorHandler] = js.undefined
  
  /**
    * One of `enabled`, `enabledBlocking`, `enabledNonBlocking` or `disabled`.
    * When set to `enabled` or `enabledBlocking`, the initial navigation starts before the root
    * component is created. The bootstrap is blocked until the initial navigation is complete. This
    * value is required for [server-side rendering](guide/universal) to work. When set to
    * `enabledNonBlocking`, the initial navigation starts after the root component has been created.
    * The bootstrap is not blocked on the completion of the initial navigation. When set to
    * `disabled`, the initial navigation is not performed. The location listener is set up before the
    * root component gets created. Use if there is a reason to have more control over when the router
    * starts its initial navigation due to some complex initialization logic.
    */
  var initialNavigation: js.UndefOr[InitialNavigation] = js.undefined
  
  /**
    * A custom handler for malformed URI errors. The handler is invoked when `encodedURI` contains
    * invalid character sequences.
    * The default implementation is to redirect to the root URL, dropping
    * any path or parameter information. The function takes three parameters:
    *
    * - `'URIError'` - Error thrown when parsing a bad URL.
    * - `'UrlSerializer'` - UrlSerializer that’s configured with the router.
    * - `'url'` -  The malformed URL that caused the URIError
    * */
  var malformedUriErrorHandler: js.UndefOr[
    js.Function3[/* error */ js.URIError, /* urlSerializer */ UrlSerializer, /* url */ String, UrlTree]
  ] = js.undefined
  
  /**
    * Configures a preloading strategy.
    * One of `PreloadAllModules` or `NoPreloading` (the default).
    */
  var preloadingStrategy: js.UndefOr[Any] = js.undefined
  
  /**
    * Enables a bug fix that corrects relative link resolution in components with empty paths.
    * Example:
    *
    * ```
    * const routes = [
    *   {
    *     path: '',
    *     component: ContainerComponent,
    *     children: [
    *       { path: 'a', component: AComponent },
    *       { path: 'b', component: BComponent },
    *     ]
    *   }
    * ];
    * ```
    *
    * From the `ContainerComponent`, you should be able to navigate to `AComponent` using
    * the following `routerLink`, but it will not work if `relativeLinkResolution` is set
    * to `'legacy'`:
    *
    * `<a [routerLink]="['./a']">Link to A</a>`
    *
    * However, this will work:
    *
    * `<a [routerLink]="['../a']">Link to A</a>`
    *
    * In other words, you're required to use `../` rather than `./` when the relative link
    * resolution is set to `'legacy'`.
    *
    * The default in v11 is `corrected`.
    *
    * @deprecated
    */
  var relativeLinkResolution: js.UndefOr[legacy | corrected] = js.undefined
  
  /**
    * Configures the scroll offset the router will use when scrolling to an element.
    *
    * When given a tuple with x and y position value,
    * the router uses that offset each time it scrolls.
    * When given a function, the router invokes the function every time
    * it restores scroll position.
    */
  var scrollOffset: js.UndefOr[(js.Tuple2[Double, Double]) | (js.Function0[js.Tuple2[Double, Double]])] = js.undefined
  
  /**
    * When true, enable the location strategy that uses the URL fragment
    * instead of the history API.
    */
  var useHash: js.UndefOr[Boolean] = js.undefined
}
object ExtraOptions {
  
  inline def apply(): ExtraOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtraOptions]
  }
  
  extension [Self <: ExtraOptions](x: Self) {
    
    inline def setEnableTracing(value: Boolean): Self = StObject.set(x, "enableTracing", value.asInstanceOf[js.Any])
    
    inline def setEnableTracingUndefined: Self = StObject.set(x, "enableTracing", js.undefined)
    
    inline def setErrorHandler(value: /* error */ Any => Any): Self = StObject.set(x, "errorHandler", js.Any.fromFunction1(value))
    
    inline def setErrorHandlerUndefined: Self = StObject.set(x, "errorHandler", js.undefined)
    
    inline def setInitialNavigation(value: InitialNavigation): Self = StObject.set(x, "initialNavigation", value.asInstanceOf[js.Any])
    
    inline def setInitialNavigationUndefined: Self = StObject.set(x, "initialNavigation", js.undefined)
    
    inline def setMalformedUriErrorHandler(value: (/* error */ js.URIError, /* urlSerializer */ UrlSerializer, /* url */ String) => UrlTree): Self = StObject.set(x, "malformedUriErrorHandler", js.Any.fromFunction3(value))
    
    inline def setMalformedUriErrorHandlerUndefined: Self = StObject.set(x, "malformedUriErrorHandler", js.undefined)
    
    inline def setPreloadingStrategy(value: Any): Self = StObject.set(x, "preloadingStrategy", value.asInstanceOf[js.Any])
    
    inline def setPreloadingStrategyUndefined: Self = StObject.set(x, "preloadingStrategy", js.undefined)
    
    inline def setRelativeLinkResolution(value: legacy | corrected): Self = StObject.set(x, "relativeLinkResolution", value.asInstanceOf[js.Any])
    
    inline def setRelativeLinkResolutionUndefined: Self = StObject.set(x, "relativeLinkResolution", js.undefined)
    
    inline def setScrollOffset(value: (js.Tuple2[Double, Double]) | (js.Function0[js.Tuple2[Double, Double]])): Self = StObject.set(x, "scrollOffset", value.asInstanceOf[js.Any])
    
    inline def setScrollOffsetCallbackTo(value: CallbackTo[js.Tuple2[Double, Double]]): Self = StObject.set(x, "scrollOffset", value.toJsFn)
    
    inline def setScrollOffsetUndefined: Self = StObject.set(x, "scrollOffset", js.undefined)
    
    inline def setUseHash(value: Boolean): Self = StObject.set(x, "useHash", value.asInstanceOf[js.Any])
    
    inline def setUseHashUndefined: Self = StObject.set(x, "useHash", js.undefined)
  }
}
