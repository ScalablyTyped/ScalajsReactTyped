package typingsJapgolly.themeUiComponents.components

import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.react.mod.PropsWithoutRef
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.themeUiComponents.distDeclarationsSrcFlexMod.FlexProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Flex {
  
  @JSImport("@theme-ui/components", "Flex")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Flex.type): Default[HTMLElement] = new Default[HTMLElement](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PropsWithoutRef[FlexProps] & RefAttributes[HTMLElement]): Default[HTMLElement] = new Default[HTMLElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}
