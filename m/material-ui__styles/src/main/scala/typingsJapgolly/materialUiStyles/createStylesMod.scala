package typingsJapgolly.materialUiStyles

import typingsJapgolly.materialUiStyles.withStylesWithStylesMod.StyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createStylesMod {
  
  @JSImport("@material-ui/styles/createStyles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[ClassKey /* <: String */, Props /* <: js.Object */](styles: StyleRules[Props, ClassKey]): StyleRules[Props, ClassKey] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(styles.asInstanceOf[js.Any]).asInstanceOf[StyleRules[Props, ClassKey]]
}
