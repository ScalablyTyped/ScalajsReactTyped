package typingsJapgolly.rcDropdown

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.rcDropdown.esDropdownMod.DropdownProps
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("rc-dropdown", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[DropdownProps & RefAttributes[Any]] = js.native
  
  type _To = ForwardRefExoticComponent[DropdownProps & RefAttributes[Any]]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: ForwardRefExoticComponent[DropdownProps & RefAttributes[Any]] = default
}
