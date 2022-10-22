package typingsJapgolly.ahooks

import typingsJapgolly.ahooks.anon.Immediate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUseIntervalMod {
  
  @JSImport("ahooks/lib/useInterval", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(fn: js.Function0[Unit]): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  inline def default(fn: js.Function0[Unit], delay: Double): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def default(fn: js.Function0[Unit], delay: Double, options: Immediate): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def default(fn: js.Function0[Unit], delay: Unit, options: Immediate): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
}
