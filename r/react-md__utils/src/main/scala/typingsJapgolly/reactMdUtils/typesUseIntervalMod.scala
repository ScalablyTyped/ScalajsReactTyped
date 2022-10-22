package typingsJapgolly.reactMdUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUseIntervalMod {
  
  @JSImport("@react-md/utils/types/useInterval", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useInterval(callback: js.Function1[/* stop */ js.Function0[Unit], Unit], delay: Double): ReturnValue = (^.asInstanceOf[js.Dynamic].applyDynamic("useInterval")(callback.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[ReturnValue]
  inline def useInterval(
    callback: js.Function1[/* stop */ js.Function0[Unit], Unit],
    delay: Double,
    defaultRunning: Boolean
  ): ReturnValue = (^.asInstanceOf[js.Dynamic].applyDynamic("useInterval")(callback.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], defaultRunning.asInstanceOf[js.Any])).asInstanceOf[ReturnValue]
  
  type ReturnValue = js.Tuple3[Running, StartInterval, StopInterval]
  
  type Running = Boolean
  
  type StartInterval = js.Function0[Unit]
  
  type StopInterval = js.Function0[Unit]
}
