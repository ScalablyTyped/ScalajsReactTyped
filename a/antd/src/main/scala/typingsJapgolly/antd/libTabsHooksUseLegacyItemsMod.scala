package typingsJapgolly.antd

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.rcTabs.esInterfaceMod.Tab
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTabsHooksUseLegacyItemsMod {
  
  @JSImport("antd/lib/tabs/hooks/useLegacyItems", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Array[Tab] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Array[Tab]]
  inline def default(items: js.UndefOr[js.Array[Tab]]): js.Array[Tab] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(items.asInstanceOf[js.Any]).asInstanceOf[js.Array[Tab]]
  inline def default(items: js.UndefOr[js.Array[Tab]], children: Node): js.Array[Tab] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(items.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[js.Array[Tab]]
  inline def default(items: Unit, children: Node): js.Array[Tab] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(items.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[js.Array[Tab]]
}
