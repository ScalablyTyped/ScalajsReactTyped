package typingsJapgolly.materialUiLab

import typingsJapgolly.materialUiLab.alertAlertMod.AlertProps
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object alertMod {
  
  @JSImport("@material-ui/lab/Alert", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: AlertProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
