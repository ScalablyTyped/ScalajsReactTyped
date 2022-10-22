package typingsJapgolly.wixStyleReact

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLAnchorElement
import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.react.mod.AnchorHTMLAttributes
import typingsJapgolly.react.mod.ButtonHTMLAttributes
import typingsJapgolly.react.mod.FC
import typingsJapgolly.wixStyleReact.anon.As
import typingsJapgolly.wixStyleReact.anon.DictadditionalProps
import typingsJapgolly.wixStyleReact.anon.DictadditionalPropsAs
import typingsJapgolly.wixStyleReact.anon.ItemKey
import typingsJapgolly.wixStyleReact.anon.OnClick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSidebarItemNextMod extends Shortcut {
  
  @JSImport("wix-style-react/dist/types/SidebarItemNext", JSImport.Default)
  @js.native
  val default: FC[SidebarItemNextProps] = js.native
  
  type SidebarItemNextAsAnchorProps[T] = AnchorHTMLAttributes[HTMLAnchorElement] & T & As
  
  type SidebarItemNextAsButtonProps[T] = ButtonHTMLAttributes[HTMLButtonElement] & T & OnClick
  
  type SidebarItemNextAsComponentProps[T] = T & DictadditionalProps
  
  type SidebarItemNextGenericProps[T] = T & DictadditionalPropsAs
  
  type SidebarItemNextProps = SidebarItemNextWithAsProp[ItemKey]
  
  type SidebarItemNextWithAsProp[T] = SidebarItemNextAsButtonProps[T] | SidebarItemNextAsAnchorProps[T] | SidebarItemNextGenericProps[T] | SidebarItemNextAsComponentProps[T]
  
  type _To = FC[SidebarItemNextProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesSidebarItemNextMod.foo` */
  override def _to: FC[SidebarItemNextProps] = default
}
