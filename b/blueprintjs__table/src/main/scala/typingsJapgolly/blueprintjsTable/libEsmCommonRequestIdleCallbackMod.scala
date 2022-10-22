package typingsJapgolly.blueprintjsTable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmCommonRequestIdleCallbackMod {
  
  @JSImport("@blueprintjs/table/lib/esm/common/requestIdleCallback", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def requestIdleCallback(callback: Callback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("requestIdleCallback")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type Callback = js.Function0[Unit]
}
