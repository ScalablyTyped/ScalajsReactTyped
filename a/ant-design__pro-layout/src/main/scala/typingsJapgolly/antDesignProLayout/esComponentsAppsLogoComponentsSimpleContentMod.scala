package typingsJapgolly.antDesignProLayout

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.antDesignProLayout.anon.AppList
import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsAppsLogoComponentsSimpleContentMod {
  
  @JSImport("@ant-design/pro-layout/es/components/AppsLogoComponents/SimpleContent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ant-design/pro-layout/es/components/AppsLogoComponents/SimpleContent", "SimpleContent")
  @js.native
  val SimpleContent: FC[AppList] = js.native
  
  inline def renderLogo(logo: Node): Node = ^.asInstanceOf[js.Dynamic].applyDynamic("renderLogo")(logo.asInstanceOf[js.Any]).asInstanceOf[Node]
  inline def renderLogo(logo: Node, title: Node): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("renderLogo")(logo.asInstanceOf[js.Any], title.asInstanceOf[js.Any])).asInstanceOf[Node]
  inline def renderLogo(logo: js.Function0[Node]): Node = ^.asInstanceOf[js.Dynamic].applyDynamic("renderLogo")(logo.asInstanceOf[js.Any]).asInstanceOf[Node]
  inline def renderLogo(logo: js.Function0[Node], title: Node): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("renderLogo")(logo.asInstanceOf[js.Any], title.asInstanceOf[js.Any])).asInstanceOf[Node]
}
