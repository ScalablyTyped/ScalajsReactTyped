package typingsJapgolly.antd

import japgolly.scalajs.react.facade.React.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libConfigProviderDefaultRenderEmptyMod {
  
  @JSImport("antd/lib/config-provider/defaultRenderEmpty", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Node = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Node]
  inline def default(componentName: String): Node = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(componentName.asInstanceOf[js.Any]).asInstanceOf[Node]
  
  type RenderEmptyHandler = js.Function1[/* componentName */ js.UndefOr[String], Node]
}
