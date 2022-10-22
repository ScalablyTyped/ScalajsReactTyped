package typingsJapgolly.themeUiComponents.components

import org.scalajs.dom.HTMLParagraphElement
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.react.mod.PropsWithoutRef
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.themeUiComponents.distDeclarationsSrcParagraphMod.ParagraphProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Paragraph {
  
  @JSImport("@theme-ui/components", "Paragraph")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Paragraph.type): Default[HTMLParagraphElement] = new Default[HTMLParagraphElement](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PropsWithoutRef[ParagraphProps] & RefAttributes[HTMLParagraphElement]): Default[HTMLParagraphElement] = new Default[HTMLParagraphElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}
