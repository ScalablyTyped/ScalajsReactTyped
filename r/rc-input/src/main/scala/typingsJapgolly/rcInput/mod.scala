package typingsJapgolly.rcInput

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.rcInput.esInterfaceMod.BaseInputProps
import typingsJapgolly.rcInput.esInterfaceMod.InputProps
import typingsJapgolly.rcInput.esInterfaceMod.InputRef
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("rc-input", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[InputProps & RefAttributes[InputRef]] = js.native
  
  @JSImport("rc-input", "BaseInput")
  @js.native
  val BaseInput: FC[BaseInputProps] = js.native
  
  type _To = ForwardRefExoticComponent[InputProps & RefAttributes[InputRef]]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: ForwardRefExoticComponent[InputProps & RefAttributes[InputRef]] = default
}
