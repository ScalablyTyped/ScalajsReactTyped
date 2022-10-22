package typingsJapgolly.restartHooks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsUseDebouncedCallbackMod {
  
  @JSImport("@restart/hooks/cjs/useDebouncedCallback", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[TCallback /* <: js.Function1[/* repeated */ Any, Any] */](fn: TCallback, delay: Double): TCallback = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[TCallback]
}
