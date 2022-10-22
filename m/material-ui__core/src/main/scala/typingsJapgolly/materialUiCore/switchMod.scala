package typingsJapgolly.materialUiCore

import typingsJapgolly.materialUiCore.switchSwitchMod.SwitchProps
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object switchMod {
  
  @JSImport("@material-ui/core/Switch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: SwitchProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
