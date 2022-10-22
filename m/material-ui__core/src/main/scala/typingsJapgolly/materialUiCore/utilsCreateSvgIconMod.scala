package typingsJapgolly.materialUiCore

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.materialUiCore.materialUiCoreStrings.svg
import typingsJapgolly.materialUiCore.overridableComponentMod.OverridableComponent
import typingsJapgolly.materialUiCore.svgIconSvgIconMod.SvgIconTypeMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsCreateSvgIconMod {
  
  @JSImport("@material-ui/core/utils/createSvgIcon", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(path: Node, displayName: String): OverridableComponent[SvgIconTypeMap[js.Object, svg]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(path.asInstanceOf[js.Any], displayName.asInstanceOf[js.Any])).asInstanceOf[OverridableComponent[SvgIconTypeMap[js.Object, svg]]]
}
