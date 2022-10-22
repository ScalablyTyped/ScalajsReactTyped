package typingsJapgolly.domHelpers

import typingsJapgolly.std.FrameRequestCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsAnimationFrameMod {
  
  @JSImport("dom-helpers/cjs/animationFrame", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cancel(id: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cancel")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("dom-helpers/cjs/animationFrame", "request")
  @js.native
  val request: js.Function1[/* callback */ FrameRequestCallback, Double] = js.native
}
