package typingsJapgolly.baseui

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLElement
import typingsJapgolly.baseui.menuTypesMod.OptionProfileProps
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuOptionProfileMod extends Shortcut {
  
  @JSImport("baseui/menu/option-profile", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[OptionProfileProps & RefAttributes[HTMLElement]] = js.native
  
  type _To = ForwardRefExoticComponent[OptionProfileProps & RefAttributes[HTMLElement]]
  
  /* This means you don't have to write `default`, but can instead just say `menuOptionProfileMod.foo` */
  override def _to: ForwardRefExoticComponent[OptionProfileProps & RefAttributes[HTMLElement]] = default
}
