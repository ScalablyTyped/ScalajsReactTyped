package typingsJapgolly.reactWidgets

import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmA11yMod {
  
  @JSImport("react-widgets/esm/A11y", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def setActiveDescendant(ref: Element, activeId: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setActiveDescendant")(ref.asInstanceOf[js.Any], activeId.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setActiveDescendant(ref: Null, activeId: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setActiveDescendant")(ref.asInstanceOf[js.Any], activeId.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useActiveDescendant(ref: RefHandle[Element], id: String, visible: Boolean, deps: js.Array[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useActiveDescendant")(ref.asInstanceOf[js.Any], id.asInstanceOf[js.Any], visible.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useActiveDescendant(ref: RefHandle[Element], id: String, visible: Null, deps: js.Array[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useActiveDescendant")(ref.asInstanceOf[js.Any], id.asInstanceOf[js.Any], visible.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useActiveDescendant(ref: RefHandle[Element], id: String, visible: Unit, deps: js.Array[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useActiveDescendant")(ref.asInstanceOf[js.Any], id.asInstanceOf[js.Any], visible.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
