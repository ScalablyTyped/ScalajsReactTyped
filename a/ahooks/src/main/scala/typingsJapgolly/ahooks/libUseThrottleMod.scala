package typingsJapgolly.ahooks

import typingsJapgolly.ahooks.libUseThrottleThrottleOptionsMod.ThrottleOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUseThrottleMod {
  
  @JSImport("ahooks/lib/useThrottle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](value: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def default[T](value: T, options: ThrottleOptions): T = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
}
