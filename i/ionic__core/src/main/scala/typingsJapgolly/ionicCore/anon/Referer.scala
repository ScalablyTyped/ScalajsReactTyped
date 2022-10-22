package typingsJapgolly.ionicCore.anon

import typingsJapgolly.ionicCore.ionicCoreStrings.commit
import typingsJapgolly.ionicCore.ionicCoreStrings.domcontentloaded
import typingsJapgolly.ionicCore.ionicCoreStrings.load
import typingsJapgolly.ionicCore.ionicCoreStrings.networkidle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Referer extends StObject {
  
  /**
    * Referer header value. If provided it will take preference over the referer header value set by
    * [page.setExtraHTTPHeaders(headers)](https://playwright.dev/docs/api/class-page#page-set-extra-http-headers).
    */
  var referer: js.UndefOr[String] = js.undefined
  
  /**
    * Maximum operation time in milliseconds, defaults to 30 seconds, pass `0` to disable timeout. The default value can be
    * changed by using the
    * [browserContext.setDefaultNavigationTimeout(timeout)](https://playwright.dev/docs/api/class-browsercontext#browser-context-set-default-navigation-timeout),
    * [browserContext.setDefaultTimeout(timeout)](https://playwright.dev/docs/api/class-browsercontext#browser-context-set-default-timeout),
    * [page.setDefaultNavigationTimeout(timeout)](https://playwright.dev/docs/api/class-page#page-set-default-navigation-timeout)
    * or [page.setDefaultTimeout(timeout)](https://playwright.dev/docs/api/class-page#page-set-default-timeout) methods.
    */
  var timeout: js.UndefOr[Double] = js.undefined
  
  /**
    * When to consider operation succeeded, defaults to `load`. Events can be either:
    * - `'domcontentloaded'` - consider operation to be finished when the `DOMContentLoaded` event is fired.
    * - `'load'` - consider operation to be finished when the `load` event is fired.
    * - `'networkidle'` - consider operation to be finished when there are no network connections for at least `500` ms.
    * - `'commit'` - consider operation to be finished when network response is received and the document started loading.
    */
  var waitUntil: js.UndefOr[load | domcontentloaded | networkidle | commit] = js.undefined
}
object Referer {
  
  inline def apply(): Referer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Referer]
  }
  
  extension [Self <: Referer](x: Self) {
    
    inline def setReferer(value: String): Self = StObject.set(x, "referer", value.asInstanceOf[js.Any])
    
    inline def setRefererUndefined: Self = StObject.set(x, "referer", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setWaitUntil(value: load | domcontentloaded | networkidle | commit): Self = StObject.set(x, "waitUntil", value.asInstanceOf[js.Any])
    
    inline def setWaitUntilUndefined: Self = StObject.set(x, "waitUntil", js.undefined)
  }
}
