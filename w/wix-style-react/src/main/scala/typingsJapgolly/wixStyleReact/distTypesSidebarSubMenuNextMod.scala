package typingsJapgolly.wixStyleReact

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLAnchorElement
import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.react.mod.AnchorHTMLAttributes
import typingsJapgolly.react.mod.ButtonHTMLAttributes
import typingsJapgolly.react.mod.FC
import typingsJapgolly.wixStyleReact.anon.As
import typingsJapgolly.wixStyleReact.anon.DataHookDisabled
import typingsJapgolly.wixStyleReact.anon.DictadditionalProps
import typingsJapgolly.wixStyleReact.anon.DictadditionalPropsAs
import typingsJapgolly.wixStyleReact.anon.OnClick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSidebarSubMenuNextMod extends Shortcut {
  
  @JSImport("wix-style-react/dist/types/SidebarSubMenuNext", JSImport.Default)
  @js.native
  val default: FC[SidebarSubMenuNextProps] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.click
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.select
  */
  trait ExpandCollapseTrigger extends StObject
  object ExpandCollapseTrigger {
    
    inline def click: typingsJapgolly.wixStyleReact.wixStyleReactStrings.click = "click".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.click]
    
    inline def select: typingsJapgolly.wixStyleReact.wixStyleReactStrings.select = "select".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.select]
  }
  
  type SidebarSubMenuAsAnchorProps[T] = AnchorHTMLAttributes[HTMLAnchorElement] & T & As
  
  type SidebarSubMenuAsButtonProps[T] = ButtonHTMLAttributes[HTMLButtonElement] & T & OnClick
  
  type SidebarSubMenuAsComponentProps[T] = T & DictadditionalProps
  
  type SidebarSubMenuGenericProps[T] = T & DictadditionalPropsAs
  
  type SidebarSubMenuNextProps = SidebarSubMenuWithAsProp[DataHookDisabled]
  
  type SidebarSubMenuWithAsProp[T] = SidebarSubMenuAsButtonProps[T] | SidebarSubMenuAsAnchorProps[T] | SidebarSubMenuGenericProps[T] | SidebarSubMenuAsComponentProps[T]
  
  type _To = FC[SidebarSubMenuNextProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesSidebarSubMenuNextMod.foo` */
  override def _to: FC[SidebarSubMenuNextProps] = default
}
