package typingsJapgolly.baseui

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLSpanElement
import typingsJapgolly.baseui.tagTypesMod.TagProps
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tagTagMod extends Shortcut {
  
  @JSImport("baseui/tag/tag", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[TagProps & RefAttributes[HTMLSpanElement]] = js.native
  
  type _To = ForwardRefExoticComponent[TagProps & RefAttributes[HTMLSpanElement]]
  
  /* This means you don't have to write `default`, but can instead just say `tagTagMod.foo` */
  override def _to: ForwardRefExoticComponent[TagProps & RefAttributes[HTMLSpanElement]] = default
}
