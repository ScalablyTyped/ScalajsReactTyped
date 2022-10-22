package typingsJapgolly.reactNativeNavigation

import japgolly.scalajs.react.facade.React.ComponentClassP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactLifecyclesCompatMod {
  
  @JSImport("react-lifecycles-compat", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def polyfill(component: ComponentClassP[Any & js.Object]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("polyfill")(component.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
