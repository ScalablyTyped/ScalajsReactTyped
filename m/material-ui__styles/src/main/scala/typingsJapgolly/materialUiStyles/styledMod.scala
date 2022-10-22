package typingsJapgolly.materialUiStyles

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.materialUiStyles.styledStyledMod.ComponentCreator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object styledMod {
  
  @JSImport("@material-ui/styles/styled", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Component /* <: ElementType */](Component: Component): ComponentCreator[Component] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(Component.asInstanceOf[js.Any]).asInstanceOf[ComponentCreator[Component]]
}
