package typingsJapgolly.baseui

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLLIElement
import typingsJapgolly.baseui.listTypesMod.HeadingProps
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listListHeadingMod extends Shortcut {
  
  @JSImport("baseui/list/list-heading", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[HeadingProps & RefAttributes[HTMLLIElement]] = js.native
  
  type _To = ForwardRefExoticComponent[HeadingProps & RefAttributes[HTMLLIElement]]
  
  /* This means you don't have to write `default`, but can instead just say `listListHeadingMod.foo` */
  override def _to: ForwardRefExoticComponent[HeadingProps & RefAttributes[HTMLLIElement]] = default
}
