package typingsJapgolly.rcTrigger

import org.scalajs.dom.HTMLElement
import typingsJapgolly.rcTrigger.esInterfaceMod.StretchType
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esPopupUseStretchStyleMod {
  
  @JSImport("rc-trigger/es/Popup/useStretchStyle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Tuple2[CSSProperties, js.Function1[/* element */ HTMLElement, Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Tuple2[CSSProperties, js.Function1[/* element */ HTMLElement, Unit]]]
  inline def default(stretch: StretchType): js.Tuple2[CSSProperties, js.Function1[/* element */ HTMLElement, Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(stretch.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[CSSProperties, js.Function1[/* element */ HTMLElement, Unit]]]
}
