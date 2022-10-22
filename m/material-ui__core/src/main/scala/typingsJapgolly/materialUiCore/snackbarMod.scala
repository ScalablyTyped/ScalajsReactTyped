package typingsJapgolly.materialUiCore

import typingsJapgolly.materialUiCore.snackbarSnackbarMod.SnackbarProps
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object snackbarMod {
  
  @JSImport("@material-ui/core/Snackbar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: SnackbarProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
