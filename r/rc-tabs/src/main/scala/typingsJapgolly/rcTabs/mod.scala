package typingsJapgolly.rcTabs

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.rcTabs.esTabsMod.TabsProps
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("rc-tabs", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[TabsProps & RefAttributes[HTMLDivElement]] = js.native
  
  type _To = ForwardRefExoticComponent[TabsProps & RefAttributes[HTMLDivElement]]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: ForwardRefExoticComponent[TabsProps & RefAttributes[HTMLDivElement]] = default
}
