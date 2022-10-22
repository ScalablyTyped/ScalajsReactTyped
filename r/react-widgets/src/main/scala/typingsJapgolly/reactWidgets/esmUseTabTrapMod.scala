package typingsJapgolly.reactWidgets

import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.Element
import typingsJapgolly.reactWidgets.anon.Focus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmUseTabTrapMod {
  
  @JSImport("react-widgets/esm/useTabTrap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(ref: RefHandle[Element]): Focus = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(ref.asInstanceOf[js.Any]).asInstanceOf[Focus]
  inline def default(ref: RefHandle[Element], selector: String): Focus = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(ref.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Focus]
}
