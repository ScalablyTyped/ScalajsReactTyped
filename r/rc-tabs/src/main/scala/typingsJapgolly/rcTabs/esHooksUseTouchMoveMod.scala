package typingsJapgolly.rcTabs

import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esHooksUseTouchMoveMod {
  
  @JSImport("rc-tabs/es/hooks/useTouchMove", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    ref: RefHandle[HTMLDivElement],
    onOffset: js.Function2[/* offsetX */ Double, /* offsetY */ Double, Boolean]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(ref.asInstanceOf[js.Any], onOffset.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
