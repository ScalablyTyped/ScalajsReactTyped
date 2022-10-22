package typingsJapgolly.rcMotion

import org.scalajs.dom.HTMLElement
import typingsJapgolly.rcMotion.esInterfaceMod.MotionEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esHooksUseDomMotionEventsMod {
  
  @JSImport("rc-motion/es/hooks/useDomMotionEvents", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(callback: js.Function1[/* event */ MotionEvent, Unit]): js.Tuple2[
    js.Function1[/* element */ HTMLElement, Unit], 
    js.Function1[/* element */ HTMLElement, Unit]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[
    js.Function1[/* element */ HTMLElement, Unit], 
    js.Function1[/* element */ HTMLElement, Unit]
  ]]
}
