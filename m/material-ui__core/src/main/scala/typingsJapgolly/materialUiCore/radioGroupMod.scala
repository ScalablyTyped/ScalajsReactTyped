package typingsJapgolly.materialUiCore

import typingsJapgolly.materialUiCore.radioGroupRadioGroupMod.RadioGroupProps
import typingsJapgolly.materialUiCore.radioGroupUseRadioGroupMod.RadioGroupState
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object radioGroupMod {
  
  @JSImport("@material-ui/core/RadioGroup", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: RadioGroupProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def useRadioGroup(): js.UndefOr[RadioGroupState] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRadioGroup")().asInstanceOf[js.UndefOr[RadioGroupState]]
}
