package typingsJapgolly.themeUi.components

import org.scalajs.dom.HTMLHeadingElement
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.react.mod.PropsWithoutRef
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.themeUiComponents.distDeclarationsSrcHeadingMod.HeadingProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Heading {
  
  @JSImport("theme-ui", "Heading")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Heading.type): Default[HTMLHeadingElement] = new Default[HTMLHeadingElement](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PropsWithoutRef[HeadingProps] & RefAttributes[HTMLHeadingElement]): Default[HTMLHeadingElement] = new Default[HTMLHeadingElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}
