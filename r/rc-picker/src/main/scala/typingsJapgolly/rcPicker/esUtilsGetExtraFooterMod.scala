package typingsJapgolly.rcPicker

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.rcPicker.esInterfaceMod.PanelMode
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilsGetExtraFooterMod {
  
  @JSImport("rc-picker/es/utils/getExtraFooter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(prefixCls: String, mode: PanelMode): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Element]
  inline def default(prefixCls: String, mode: PanelMode, renderExtraFooter: js.Function1[/* mode */ PanelMode, Node]): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(prefixCls.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], renderExtraFooter.asInstanceOf[js.Any])).asInstanceOf[Element]
}
