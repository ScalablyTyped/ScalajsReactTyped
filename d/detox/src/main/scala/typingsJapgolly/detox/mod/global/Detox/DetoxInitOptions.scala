package typingsJapgolly.detox.mod.global.Detox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetoxInitOptions extends StObject {
  
  /**
    * By default, Detox exports `device`, `expect`, `element`, `by` and `waitFor`
    * as global variables. If you want to control their initialization manually,
    * set this property to `false`.
    *
    * This is useful when during E2E tests you also need to run regular expectations
    * in Node.js. Jest's `expect` for instance, will not be overridden by Detox when
    * this option is used.
    */
  var initGlobals: js.UndefOr[Boolean] = js.undefined
  
  /**
    * By default, `await detox.init()` will uninstall and install the app.
    * If you wish to reuse the existing app for a faster run, set the property to
    * `false`.
    */
  var reuse: js.UndefOr[Boolean] = js.undefined
}
object DetoxInitOptions {
  
  inline def apply(): DetoxInitOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetoxInitOptions]
  }
  
  extension [Self <: DetoxInitOptions](x: Self) {
    
    inline def setInitGlobals(value: Boolean): Self = StObject.set(x, "initGlobals", value.asInstanceOf[js.Any])
    
    inline def setInitGlobalsUndefined: Self = StObject.set(x, "initGlobals", js.undefined)
    
    inline def setReuse(value: Boolean): Self = StObject.set(x, "reuse", value.asInstanceOf[js.Any])
    
    inline def setReuseUndefined: Self = StObject.set(x, "reuse", js.undefined)
  }
}
