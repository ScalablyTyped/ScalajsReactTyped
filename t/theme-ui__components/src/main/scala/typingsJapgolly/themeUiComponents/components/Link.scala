package typingsJapgolly.themeUiComponents.components

import org.scalajs.dom.HTMLAnchorElement
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.react.mod.PropsWithoutRef
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.themeUiComponents.distDeclarationsSrcLinkMod.LinkProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Link {
  
  @JSImport("@theme-ui/components", "Link")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Link.type): Default[HTMLAnchorElement] = new Default[HTMLAnchorElement](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PropsWithoutRef[LinkProps] & RefAttributes[HTMLAnchorElement]): Default[HTMLAnchorElement] = new Default[HTMLAnchorElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}
