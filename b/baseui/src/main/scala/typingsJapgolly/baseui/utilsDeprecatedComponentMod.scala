package typingsJapgolly.baseui

import japgolly.scalajs.react.facade.React.ComponentClassP
import typingsJapgolly.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsDeprecatedComponentMod {
  
  @JSImport("baseui/utils/deprecated-component", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(Component: ComponentClassP[js.Object], displayName: String): ComponentClassP[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(Component.asInstanceOf[js.Any], displayName.asInstanceOf[js.Any])).asInstanceOf[ComponentClassP[js.Object]]
  inline def default(Component: FunctionComponent[js.Object], displayName: String): FunctionComponent[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(Component.asInstanceOf[js.Any], displayName.asInstanceOf[js.Any])).asInstanceOf[FunctionComponent[js.Object]]
}
