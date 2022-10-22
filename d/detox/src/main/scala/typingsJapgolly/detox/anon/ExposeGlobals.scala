package typingsJapgolly.detox.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExposeGlobals extends StObject {
  
  /**
    * By default, Detox exports `device`, `expect`, `element`, `by` and `waitFor`
    * as global variables. If you want to control their initialization manually,
    * set this property to `false`.
    *
    * This is useful when during E2E tests you also need to run regular expectations
    * in Node.js. Jest's `expect` for instance, will not be overridden by Detox when
    * this option is used.
    */
  var exposeGlobals: js.UndefOr[Boolean] = js.undefined
  
  /**
    * By default, `await detox.init()` will uninstall and install the app.
    * If you wish to reuse the existing app for a faster run, set the property to
    * `false`.
    */
  var reinstallApp: js.UndefOr[Boolean] = js.undefined
}
object ExposeGlobals {
  
  inline def apply(): ExposeGlobals = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExposeGlobals]
  }
  
  extension [Self <: ExposeGlobals](x: Self) {
    
    inline def setExposeGlobals(value: Boolean): Self = StObject.set(x, "exposeGlobals", value.asInstanceOf[js.Any])
    
    inline def setExposeGlobalsUndefined: Self = StObject.set(x, "exposeGlobals", js.undefined)
    
    inline def setReinstallApp(value: Boolean): Self = StObject.set(x, "reinstallApp", value.asInstanceOf[js.Any])
    
    inline def setReinstallAppUndefined: Self = StObject.set(x, "reinstallApp", js.undefined)
  }
}
