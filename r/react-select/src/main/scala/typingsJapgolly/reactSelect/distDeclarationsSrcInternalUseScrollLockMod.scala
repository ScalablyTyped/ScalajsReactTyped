package typingsJapgolly.reactSelect

import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcInternalUseScrollLockMod {
  
  @JSImport("react-select/dist/declarations/src/internal/useScrollLock", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasIsEnabledAccountForScrollbars: Options): js.Function1[/* element */ HTMLElement | Null, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasIsEnabledAccountForScrollbars.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* element */ HTMLElement | Null, Unit]]
  
  trait Options extends StObject {
    
    val accountForScrollbars: js.UndefOr[Boolean] = js.undefined
    
    val isEnabled: Boolean
  }
  object Options {
    
    inline def apply(isEnabled: Boolean): Options = {
      val __obj = js.Dynamic.literal(isEnabled = isEnabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAccountForScrollbars(value: Boolean): Self = StObject.set(x, "accountForScrollbars", value.asInstanceOf[js.Any])
      
      inline def setAccountForScrollbarsUndefined: Self = StObject.set(x, "accountForScrollbars", js.undefined)
      
      inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    }
  }
}
